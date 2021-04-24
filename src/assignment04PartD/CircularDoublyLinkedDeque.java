package assignment04PartD;public class CircularDoublyLinkedDeque<T> implements DequeInterface<T> {    private DoublyLinkedNode firstNode;    /**     * Adds a new entry to the front/back of this dequeue.     *     * @param newEntry An object to be added.     */    @Override    public void addToFront(T newEntry) {    }    @Override    public void addToBack(T newEntry) {    }    /**     * Removes and returns the front/back entry of this dequeue.     *     * @return The object at the front/back of the dequeue.     * @throws EmptyQueueException if the dequeue is empty before the operation.     */    @Override    public T removeFront() {        return null;    }    @Override    public T removeBack() {        return null;    }    /**     * Retrieves the front/back entry of this dequeue.     *     * @return The object at the front/back of the dequeue.     * @throws EmptyQueueException if the dequeue is empty before the operation.     */    @Override    public T getFront() {        return null;    }    @Override    public T getBack() {        return null;    }    /**     * Detects whether this dequeue is empty.     *     * @return True if the queue is empty, or false otherwise.     */    @Override    public boolean isEmpty() {        return false;    }    /**     * Removes all entries from this dequeue.     */    @Override    public void clear() {    }    private class DoublyLinkedNode {        private T data;        private DoublyLinkedNode next;        private DoublyLinkedNode previous;        private DoublyLinkedNode(T data) {            this.data = data;            this.next = this.previous = null;        }        private DoublyLinkedNode(DoublyLinkedNode previous, T data, DoublyLinkedNode next) {            this.previous = previous;            this.data = data;            this.next = next;        }        public T getData() {            return data;        }        public void setData(T data) {            this.data = data;        }        public DoublyLinkedNode getNext() {            return next;        }        public void setNext(DoublyLinkedNode next) {            this.next = next;        }        public DoublyLinkedNode getPrevious() {            return previous;        }        public void setPrevious(DoublyLinkedNode previous) {            this.previous = previous;        }    }}