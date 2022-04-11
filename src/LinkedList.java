import java.util.AbstractList;

public class LinkedList<E> extends AbstractList<E> {
    private class Element{
        private E value;
        private Element next;
        public E getValue() {
            return value;}
        public void setValue(E value) {
            this.value = value;}
        public Element getNext() {
            return next;}
        public void setNext(Element next) {
            this.next = next;}
        Element(E data){
            this.value=data;}
    }
    Element head=null;
    public LinkedList(){}

    @Override
    public int size() {
        int pos=0;
        Element actElem=head;
        while(actElem!=null)
        {
            pos++;
            actElem=actElem.getNext();
        }
        return pos;
    }

    @Override
    public E get(int index) {
        return null;
    }

    public boolean isEmpty(){
        return head==null;}

    @Override
    public void clear() {
        head=null;
    }
    private Element getElement(int index){
        if(index<0) throw new IndexOutOfBoundsException();
        Element actElem=head;
        while(index>0 && actElem!=null){
            index--;
            actElem=actElem.getNext();
        }
        if (actElem==null)
            throw new IndexOutOfBoundsException();
        return actElem;
    }
    @Override
    public boolean add(E e) {
        Element newElem=new Element(e);
        if(head==null){
            head=newElem;
            return true;
        }
        Element tail=head;
        while(tail.getNext()!=null)
            tail=tail.getNext();
        tail.setNext(newElem);
        return true;
    }


}
