package p418rx.internal.util.unsafe;

import r34.C26113b;

/* renamed from: rx.internal.util.unsafe.BaseLinkedQueueProducerNodeRef */
abstract class BaseLinkedQueueProducerNodeRef<E> extends BaseLinkedQueuePad0<E> {
    public static final long P_NODE_OFFSET = UnsafeAccess.addressOf(BaseLinkedQueueProducerNodeRef.class, "producerNode");
    public C26113b<E> producerNode;

    public final C26113b<E> lpProducerNode() {
        return this.producerNode;
    }

    public final C26113b<E> lvProducerNode() {
        return (C26113b) UnsafeAccess.UNSAFE.getObjectVolatile(this, P_NODE_OFFSET);
    }

    public final void spProducerNode(C26113b<E> bVar) {
        this.producerNode = bVar;
    }
}
