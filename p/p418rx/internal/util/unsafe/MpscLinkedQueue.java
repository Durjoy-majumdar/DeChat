package p418rx.internal.util.unsafe;

import p1167z8.C119079b;
import r34.C26113b;

/* renamed from: rx.internal.util.unsafe.MpscLinkedQueue */
public final class MpscLinkedQueue<E> extends BaseLinkedQueue<E> {
    public MpscLinkedQueue() {
        C26113b<E> bVar = new C26113b<>();
        this.consumerNode = bVar;
        xchgProducerNode(bVar);
    }

    public boolean offer(E e) {
        if (e != null) {
            C26113b bVar = new C26113b(e);
            xchgProducerNode(bVar).lazySet(bVar);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    public E peek() {
        C26113b<E> a;
        C26113b<E> bVar = this.consumerNode;
        C26113b<E> a2 = bVar.mo52988a();
        if (a2 != null) {
            return a2.f73038d;
        }
        if (bVar == lvProducerNode()) {
            return null;
        }
        do {
            a = bVar.mo52988a();
        } while (a == null);
        return a.f73038d;
    }

    public E poll() {
        C26113b<E> a;
        C26113b lpConsumerNode = lpConsumerNode();
        C26113b a2 = lpConsumerNode.mo52988a();
        if (a2 != null) {
            E e = a2.f73038d;
            a2.f73038d = null;
            spConsumerNode(a2);
            return e;
        } else if (lpConsumerNode == lvProducerNode()) {
            return null;
        } else {
            do {
                a = lpConsumerNode.mo52988a();
            } while (a == null);
            E e2 = a.f73038d;
            a.f73038d = null;
            this.consumerNode = a;
            return e2;
        }
    }

    public C26113b<E> xchgProducerNode(C26113b<E> bVar) {
        C26113b<E> bVar2;
        do {
            bVar2 = this.producerNode;
        } while (!C119079b.m167872a(UnsafeAccess.UNSAFE, this, BaseLinkedQueueProducerNodeRef.P_NODE_OFFSET, bVar2, bVar));
        return bVar2;
    }
}
