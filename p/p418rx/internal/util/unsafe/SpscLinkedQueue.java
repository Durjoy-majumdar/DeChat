package p418rx.internal.util.unsafe;

import r34.C26113b;

/* renamed from: rx.internal.util.unsafe.SpscLinkedQueue */
public final class SpscLinkedQueue<E> extends BaseLinkedQueue<E> {
    public SpscLinkedQueue() {
        spProducerNode(new C26113b());
        spConsumerNode(this.producerNode);
        this.consumerNode.lazySet((Object) null);
    }

    public boolean offer(E e) {
        if (e != null) {
            C26113b<E> bVar = new C26113b<>(e);
            this.producerNode.lazySet(bVar);
            this.producerNode = bVar;
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    public E peek() {
        C26113b<E> a = this.consumerNode.mo52988a();
        if (a != null) {
            return a.f73038d;
        }
        return null;
    }

    public E poll() {
        C26113b<E> a = this.consumerNode.mo52988a();
        if (a == null) {
            return null;
        }
        E e = a.f73038d;
        a.f73038d = null;
        this.consumerNode = a;
        return e;
    }
}
