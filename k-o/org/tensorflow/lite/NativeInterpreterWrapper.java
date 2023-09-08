package org.tensorflow.lite;

import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.tensorflow.lite.C89289c;

final class NativeInterpreterWrapper implements AutoCloseable {

    /* renamed from: d */
    public long f257216d;

    /* renamed from: e */
    public long f257217e;

    /* renamed from: f */
    public long f257218f;

    /* renamed from: g */
    public ByteBuffer f257219g;

    /* renamed from: h */
    public Tensor[] f257220h;

    /* renamed from: i */
    public Tensor[] f257221i;

    /* renamed from: j */
    public boolean f257222j = false;

    /* renamed from: n */
    public final List<C89288b> f257223n = new ArrayList();

    /* renamed from: o */
    public final List<AutoCloseable> f257224o = new ArrayList();

    public NativeInterpreterWrapper(ByteBuffer byteBuffer, C89289c.C89290a aVar) {
        boolean z = false;
        TensorFlowLite.m111603a();
        if (byteBuffer == null || (!(byteBuffer instanceof MappedByteBuffer) && (!byteBuffer.isDirect() || byteBuffer.order() != ByteOrder.nativeOrder()))) {
            throw new IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
        }
        this.f257219g = byteBuffer;
        long createErrorReporter = createErrorReporter(512);
        long createModelWithBuffer = createModelWithBuffer(this.f257219g, createErrorReporter);
        aVar = aVar == null ? new C89289c.C89290a() : aVar;
        this.f257216d = createErrorReporter;
        this.f257218f = createModelWithBuffer;
        long createInterpreter = createInterpreter(createModelWithBuffer, createErrorReporter, -1);
        this.f257217e = createInterpreter;
        this.f257220h = new Tensor[getInputCount(createInterpreter)];
        this.f257221i = new Tensor[getOutputCount(this.f257217e)];
        boolean hasUnresolvedFlexOp = hasUnresolvedFlexOp(this.f257217e);
        if (hasUnresolvedFlexOp) {
            List<C89288b> list = aVar.f257239a;
            C89288b bVar = null;
            try {
                Class<?> cls = Class.forName("org.tensorflow.lite.flex.FlexDelegate");
                Iterator it = ((ArrayList) list).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (cls.isInstance((C89288b) it.next())) {
                            break;
                        }
                    } else {
                        bVar = (C89288b) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                        break;
                    }
                }
            } catch (Exception unused) {
            }
            if (bVar != null) {
                ((ArrayList) this.f257224o).add((AutoCloseable) bVar);
                applyDelegate(this.f257217e, this.f257216d, bVar.mo11577a());
            }
        }
        try {
            Iterator it4 = ((ArrayList) aVar.f257239a).iterator();
            while (it4.hasNext()) {
                C89288b bVar2 = (C89288b) it4.next();
                applyDelegate(this.f257217e, this.f257216d, bVar2.mo11577a());
                ((ArrayList) this.f257223n).add(bVar2);
            }
        } catch (IllegalArgumentException e) {
            if (hasUnresolvedFlexOp && !hasUnresolvedFlexOp(this.f257217e)) {
                z = true;
            }
            if (z) {
                PrintStream printStream = System.err;
                printStream.println("Ignoring failed delegate application: " + e);
            } else {
                throw e;
            }
        }
        allocateTensors(this.f257217e, createErrorReporter);
        this.f257222j = true;
    }

    private static native long allocateTensors(long j, long j2);

    private static native void allowBufferHandleOutput(long j, boolean z);

    private static native void allowFp16PrecisionForFp32(long j, boolean z);

    private static native void applyDelegate(long j, long j2, long j3);

    private static native long createCancellationFlag(long j);

    private static native long createErrorReporter(int i);

    private static native long createInterpreter(long j, long j2, int i);

    private static native long createModel(String str, long j);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j);

    private static native void delete(long j, long j2, long j3);

    private static native long deleteCancellationFlag(long j);

    private static native int getExecutionPlanLength(long j);

    private static native int getInputCount(long j);

    private static native String[] getInputNames(long j);

    private static native int getInputTensorIndex(long j, int i);

    private static native int getOutputCount(long j);

    private static native int getOutputDataType(long j, int i);

    private static native String[] getOutputNames(long j);

    private static native int getOutputTensorIndex(long j, int i);

    private static native boolean hasUnresolvedFlexOp(long j);

    private static native void numThreads(long j, int i);

    private static native void resetVariableTensors(long j, long j2);

    private static native boolean resizeInput(long j, long j2, int i, int[] iArr, boolean z);

    private static native void run(long j, long j2);

    private static native void setCancelled(long j, long j2, boolean z);

    private static native void useXNNPACK(long j, long j2, boolean z, int i);

    /* renamed from: a */
    public Tensor mo123609a(int i) {
        if (i >= 0) {
            Tensor[] tensorArr = this.f257220h;
            if (i < tensorArr.length) {
                Tensor tensor = tensorArr[i];
                if (tensor != null) {
                    return tensor;
                }
                long j = this.f257217e;
                Tensor g = Tensor.m111593g(j, getInputTensorIndex(j, i));
                tensorArr[i] = g;
                return g;
            }
        }
        throw new IllegalArgumentException("Invalid input Tensor index: " + i);
    }

    /* renamed from: b */
    public Tensor mo123610b(int i) {
        if (i >= 0) {
            Tensor[] tensorArr = this.f257221i;
            if (i < tensorArr.length) {
                Tensor tensor = tensorArr[i];
                if (tensor != null) {
                    return tensor;
                }
                long j = this.f257217e;
                Tensor g = Tensor.m111593g(j, getOutputTensorIndex(j, i));
                tensorArr[i] = g;
                return g;
            }
        }
        throw new IllegalArgumentException("Invalid output Tensor index: " + i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x004c A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo123611c(java.lang.Object[] r10, java.util.Map<java.lang.Integer, java.lang.Object> r11) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x00bf
            int r0 = r10.length
            if (r0 == 0) goto L_0x00bf
            if (r11 == 0) goto L_0x00b7
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x00b7
            r0 = 0
            r8 = 0
        L_0x000f:
            int r1 = r10.length
            if (r8 >= r1) goto L_0x004f
            org.tensorflow.lite.Tensor r1 = r9.mo123609a(r8)
            r2 = r10[r8]
            r3 = 0
            if (r2 != 0) goto L_0x001d
        L_0x001b:
            r6 = r3
            goto L_0x0033
        L_0x001d:
            boolean r4 = r2 instanceof java.nio.Buffer
            if (r4 == 0) goto L_0x0022
            goto L_0x001b
        L_0x0022:
            r1.mo123621l(r2)
            int[] r2 = r1.mo123615d(r2)
            int[] r1 = r1.f257227c
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L_0x0032
            goto L_0x001b
        L_0x0032:
            r6 = r2
        L_0x0033:
            if (r6 == 0) goto L_0x004c
            long r1 = r9.f257217e
            long r3 = r9.f257216d
            r7 = 0
            r5 = r8
            boolean r1 = resizeInput(r1, r3, r5, r6, r7)
            if (r1 == 0) goto L_0x004c
            r9.f257222j = r0
            org.tensorflow.lite.Tensor[] r1 = r9.f257220h
            r1 = r1[r8]
            if (r1 == 0) goto L_0x004c
            r1.mo123619j()
        L_0x004c:
            int r8 = r8 + 1
            goto L_0x000f
        L_0x004f:
            boolean r1 = r9.f257222j
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x005e
            long r3 = r9.f257217e
            long r5 = r9.f257216d
            allocateTensors(r3, r5)
            r9.f257222j = r2
        L_0x005e:
            r2 = 0
        L_0x005f:
            int r3 = r10.length
            if (r2 >= r3) goto L_0x006e
            org.tensorflow.lite.Tensor r3 = r9.mo123609a(r2)
            r4 = r10[r2]
            r3.mo123620k(r4)
            int r2 = r2 + 1
            goto L_0x005f
        L_0x006e:
            java.lang.System.nanoTime()
            long r2 = r9.f257217e
            long r4 = r9.f257216d
            run(r2, r4)
            java.lang.System.nanoTime()
            if (r1 == 0) goto L_0x008c
        L_0x007d:
            org.tensorflow.lite.Tensor[] r10 = r9.f257221i
            int r1 = r10.length
            if (r0 >= r1) goto L_0x008c
            r10 = r10[r0]
            if (r10 == 0) goto L_0x0089
            r10.mo123619j()
        L_0x0089:
            int r0 = r0 + 1
            goto L_0x007d
        L_0x008c:
            java.util.Set r10 = r11.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0094:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00b6
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r0 = r11.getKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            org.tensorflow.lite.Tensor r0 = r9.mo123610b(r0)
            java.lang.Object r11 = r11.getValue()
            r0.mo123616e(r11)
            goto L_0x0094
        L_0x00b6:
            return
        L_0x00b7:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Input error: Outputs should not be null or empty."
            r10.<init>(r11)
            throw r10
        L_0x00bf:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Input error: Inputs should not be null or empty."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tensorflow.lite.NativeInterpreterWrapper.mo123611c(java.lang.Object[], java.util.Map):void");
    }

    public void close() {
        int i = 0;
        while (true) {
            Tensor[] tensorArr = this.f257220h;
            if (i >= tensorArr.length) {
                break;
            }
            Tensor tensor = tensorArr[i];
            if (tensor != null) {
                tensor.mo123614b();
                this.f257220h[i] = null;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            Tensor[] tensorArr2 = this.f257221i;
            if (i2 >= tensorArr2.length) {
                break;
            }
            Tensor tensor2 = tensorArr2[i2];
            if (tensor2 != null) {
                tensor2.mo123614b();
                this.f257221i[i2] = null;
            }
            i2++;
        }
        delete(this.f257216d, this.f257218f, this.f257217e);
        deleteCancellationFlag(0);
        this.f257216d = 0;
        this.f257218f = 0;
        this.f257217e = 0;
        this.f257219g = null;
        this.f257222j = false;
        ((ArrayList) this.f257223n).clear();
        Iterator it = ((ArrayList) this.f257224o).iterator();
        while (it.hasNext()) {
            try {
                ((AutoCloseable) it.next()).close();
            } catch (Exception e) {
                PrintStream printStream = System.err;
                printStream.println("Failed to close flex delegate: " + e);
            }
        }
        ((ArrayList) this.f257224o).clear();
    }
}
