I lost track of which installs for qt5 were necessary,
but it is likely that they were included in this list

I am also running on Ubuntu 19

sudo apt install -y build-essential
sudo apt install -y qtcreator
sudo apt install -y qt5-default
sudo apt install -y qt5-doc qt5-doc-html qtbase5-doc-html qtbase5-examples
sudo apt-get install libpng-dev
sudo apt-get install zlib1g-dev
sudo apt-get install -y freeglut5-dev
sudo apt install -y geany
sudo apt-get install -y qtbase5-dev
sudo apt install -y git

The following are guesses only. Your mileage may vary

qmake -project will create a scratchwork.pro file
you probably need a main.cpp file to do this,
if you have another cpp file, it will likely also show up in your list of
sources.

I suggest removing your main.cpp after creating the scratchwork.pro,
but be sure to edit your scratchwork.pro to remove main.cpp as one of your
sources. This would also be a good time to change the TARGET to imagetest
or whatever you wish your executable named, in case of a good compile

qmake
(pretty sure this updates the Makefile, best I think to have your
scratchwork.pro looking the way you want it first, especially TARGET and
SOURCES. You may wish to add the QT += widgets line as well from the sample
in the directory

make
this should then build the contents from the Makefile


Note: I did many searches today, for namespace, names not in scope before
stumbling onto these tips, by a lot of trial and error. Hope these help.
One final tip, some of these errors seemed to generate extra cpp, hpp or
other files in the local directory. Remove these. I suspect, they will 
be reflagged as errors, even if one fixes the source correctly.

Good Luck
