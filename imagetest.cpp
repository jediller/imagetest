#include <QtWidgets>
#include <QtCore/qmetatype.h>
#include <QtWidgets/QApplication>
#include <QtWidgets/QGraphicsScene>
#include <QtWidgets/QGraphicsView>
#include <QtWidgets/QGraphicsPixmapItem>

int main(int argc, char ** argv)
{
    QApplication a(argc, argv);
    QGraphicsScene scene;
    QGraphicsView view(&scene);
    QGraphicsPixmapItem item(QPixmap("/home/john/work/SampleTicket.png"));
    scene.addItem(&item);
    view.show();
    return a.exec();
}
