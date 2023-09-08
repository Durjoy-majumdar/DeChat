package ts0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import ts0.C90577a;
import us0.C90729a;
import vs0.C90866a;
import vs0.C90869b;
import vs0.C90871c;
import vs0.C90872d;
import ws0.C91102b;
import ws0.C91105e;
import xs0.C91337a;
import xs0.C91338b;
import xs0.C91340d;
import xs0.C91342e;
import ys0.C91578a;
import zs0.C91934b;

/* renamed from: ts0.c */
public class C90581c implements C90577a {

    /* renamed from: s */
    public static final List<C90866a> f260244s;

    /* renamed from: d */
    public final BlockingQueue<ByteBuffer> f260245d;

    /* renamed from: e */
    public volatile boolean f260246e = false;

    /* renamed from: f */
    public C90577a.C90578a f260247f = C90577a.C90578a.NOT_YET_CONNECTED;

    /* renamed from: g */
    public final C90582d f260248g;

    /* renamed from: h */
    public C90866a f260249h = null;

    /* renamed from: i */
    public C90577a.C90579b f260250i;

    /* renamed from: j */
    public C91340d.C91341a f260251j = null;

    /* renamed from: n */
    public ByteBuffer f260252n = ByteBuffer.allocate(0);

    /* renamed from: o */
    public C91578a f260253o = null;

    /* renamed from: p */
    public String f260254p = null;

    /* renamed from: q */
    public Integer f260255q = null;

    /* renamed from: r */
    public Boolean f260256r = null;

    static {
        ArrayList arrayList = new ArrayList(4);
        f260244s = arrayList;
        arrayList.add(new C90871c());
        arrayList.add(new C90869b());
        arrayList.add(new C90872d());
    }

    public C90581c(C90582d dVar, C90866a aVar) {
        if (dVar == null || (aVar == null && this.f260250i == C90577a.C90579b.SERVER)) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.f260245d = new LinkedBlockingQueue();
        new LinkedBlockingQueue();
        this.f260248g = dVar;
        this.f260250i = C90577a.C90579b.CLIENT;
        if (aVar != null) {
            this.f260249h = aVar.mo124966c();
        }
    }

    /* renamed from: a */
    public final void mo124713a(int i, String str, boolean z) {
        C90577a.C90578a aVar = C90577a.C90578a.CLOSING;
        C90577a.C90578a aVar2 = this.f260247f;
        if (aVar2 != aVar && aVar2 != C90577a.C90578a.CLOSED) {
            if (aVar2 == C90577a.C90578a.OPEN) {
                if (i == 1006) {
                    this.f260247f = aVar;
                    mo124718f(i, str, false);
                    return;
                }
                if (this.f260249h.mo124970g() != C90866a.C90867a.NONE) {
                    if (!z) {
                        try {
                            this.f260248g.getClass();
                        } catch (RuntimeException e) {
                            try {
                                Log.m105920e("MicroMsg.AppBrandNetWork.WebSocketImpl", "close: " + e.toString());
                                ((C90729a) this.f260248g).mo114103l(e);
                            } catch (C91102b e2) {
                                Log.m105920e("MicroMsg.AppBrandNetWork.WebSocketImpl", "close: " + e2.toString());
                                ((C90729a) this.f260248g).mo114103l(e2);
                                mo124718f(1006, "generated frame is invalid", false);
                            }
                        }
                    }
                    this.f260245d.add(this.f260249h.mo124967d(new C91338b(i, str)));
                    this.f260248g.getClass();
                }
                mo124718f(i, str, z);
            } else if (i == -3) {
                mo124718f(-3, str, true);
            } else {
                mo124718f(-1, str, false);
            }
            if (i == 1002) {
                mo124718f(i, str, z);
            }
            this.f260247f = aVar;
            this.f260252n = null;
        }
    }

    /* renamed from: b */
    public synchronized void mo124714b(int i, String str, boolean z) {
        C90577a.C90578a aVar = C90577a.C90578a.CLOSED;
        synchronized (this) {
            if (this.f260247f != aVar) {
                try {
                    ((C90729a) this.f260248g).mo124861q(this, i, str, z);
                } catch (RuntimeException e) {
                    ((C90729a) this.f260248g).mo114103l(e);
                }
                C90866a aVar2 = this.f260249h;
                if (aVar2 != null) {
                    aVar2.mo124972j();
                }
                this.f260253o = null;
                this.f260247f = aVar;
                ((LinkedBlockingQueue) this.f260245d).clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        ((us0.C90729a) r11.f260248g).mo114103l(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00db, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        ((us0.C90729a) r11.f260248g).mo114103l(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.AppBrandNetWork.WebSocketImpl", "decodeHandshake: " + r0.toString());
        mo124713a(r0.f261290d, r0.getMessage(), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0175, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.AppBrandNetWork.WebSocketImpl", "decodeHandshake: " + r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0191, code lost:
        if (r11.f260252n.capacity() == 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0193, code lost:
        r4.reset();
        r0 = r0.f261289d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0198, code lost:
        if (r0 == 0) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019a, code lost:
        r0 = r4.capacity() + 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a0, code lost:
        r0 = java.nio.ByteBuffer.allocate(r0);
        r11.f260252n = r0;
        r0.put(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01aa, code lost:
        r0 = r11.f260252n;
        r0.position(r0.limit());
        r0 = r11.f260252n;
        r0.limit(r0.capacity());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f A[ExcHandler: d (r0v5 'e' ws0.d A[CUSTOM_DECLARE]), Splitter:B:12:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo124715c(java.nio.ByteBuffer r12) {
        /*
            r11 = this;
            ts0.a$a r0 = ts0.C90577a.C90578a.OPEN
            ts0.a$a r1 = r11.f260247f
            ts0.a$a r2 = ts0.C90577a.C90578a.NOT_YET_CONNECTED
            if (r1 == r2) goto L_0x000f
            if (r1 != r0) goto L_0x01e9
            r11.mo124716d(r12)
            goto L_0x01e9
        L_0x000f:
            vs0.a$b r1 = vs0.C90866a.C90868b.MATCHED
            java.lang.String r2 = "decodeHandshake: "
            java.lang.String r3 = "MicroMsg.AppBrandNetWork.WebSocketImpl"
            java.nio.ByteBuffer r4 = r11.f260252n
            int r4 = r4.capacity()
            if (r4 != 0) goto L_0x001f
            r4 = r12
            goto L_0x0052
        L_0x001f:
            java.nio.ByteBuffer r4 = r11.f260252n
            int r4 = r4.remaining()
            int r5 = r12.remaining()
            if (r4 >= r5) goto L_0x0046
            java.nio.ByteBuffer r4 = r11.f260252n
            int r4 = r4.capacity()
            int r5 = r12.remaining()
            int r4 = r4 + r5
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            java.nio.ByteBuffer r5 = r11.f260252n
            r5.flip()
            java.nio.ByteBuffer r5 = r11.f260252n
            r4.put(r5)
            r11.f260252n = r4
        L_0x0046:
            java.nio.ByteBuffer r4 = r11.f260252n
            r4.put(r12)
            java.nio.ByteBuffer r4 = r11.f260252n
            r4.flip()
            java.nio.ByteBuffer r4 = r11.f260252n
        L_0x0052:
            r4.mark()
            r5 = 1
            r6 = 0
            ts0.a$b r7 = r11.f260250i     // Catch:{ d -> 0x008f }
            ts0.a$b r8 = ts0.C90577a.C90579b.SERVER     // Catch:{ d -> 0x008f }
            java.lang.String r9 = "wrong http function"
            r10 = 1002(0x3ea, float:1.404E-42)
            if (r7 != r8) goto L_0x00a6
            vs0.a r7 = r11.f260249h     // Catch:{ d -> 0x008f }
            r7.getClass()
            ys0.e r7 = r7.mo124974l(r4)     // Catch:{ d -> 0x008f }
            boolean r8 = r7 instanceof ys0.C91578a     // Catch:{ d -> 0x008f }
            if (r8 != 0) goto L_0x0074
            r11.mo124718f(r10, r9, r6)     // Catch:{ d -> 0x008f }
            goto L_0x01bc
        L_0x0074:
            ys0.a r7 = (ys0.C91578a) r7     // Catch:{ d -> 0x008f }
            vs0.a r8 = r11.f260249h     // Catch:{ d -> 0x008f }
            vs0.a$b r8 = r8.mo124965b(r7)     // Catch:{ d -> 0x008f }
            if (r8 != r1) goto L_0x009e
            r11.f260247f = r0     // Catch:{ d -> 0x008f }
            ts0.d r0 = r11.f260248g     // Catch:{ RuntimeException -> 0x0092, d -> 0x008f }
            us0.a r0 = (us0.C90729a) r0     // Catch:{ RuntimeException -> 0x0092, d -> 0x008f }
            java.util.concurrent.CountDownLatch r1 = r0.f260598p     // Catch:{ RuntimeException -> 0x0092, d -> 0x008f }
            r1.countDown()     // Catch:{ RuntimeException -> 0x0092, d -> 0x008f }
            ys0.g r7 = (ys0.C91584g) r7     // Catch:{ RuntimeException -> 0x0092, d -> 0x008f }
            r0.mo114107p(r7)     // Catch:{ RuntimeException -> 0x0092, d -> 0x008f }
            goto L_0x00e3
        L_0x008f:
            r0 = move-exception
            goto L_0x0155
        L_0x0092:
            r0 = move-exception
            ts0.d r1 = r11.f260248g     // Catch:{ d -> 0x008f }
            us0.a r1 = (us0.C90729a) r1     // Catch:{ d -> 0x008f }
            r1.mo114103l(r0)     // Catch:{ d -> 0x008f }
            goto L_0x00e3
        L_0x009b:
            r0 = move-exception
            goto L_0x0175
        L_0x009e:
            java.lang.String r0 = "the handshake did finaly not match"
            r11.mo124713a(r10, r0, r6)     // Catch:{ d -> 0x008f }
            goto L_0x01bc
        L_0x00a6:
            ts0.a$b r8 = ts0.C90577a.C90579b.CLIENT     // Catch:{ d -> 0x008f }
            if (r7 != r8) goto L_0x01bc
            vs0.a r8 = r11.f260249h     // Catch:{ d -> 0x008f }
            r8.f260844a = r7     // Catch:{ d -> 0x008f }
            ys0.e r7 = r8.mo124974l(r4)     // Catch:{ d -> 0x008f }
            boolean r8 = r7 instanceof ys0.C91584g     // Catch:{ d -> 0x008f }
            if (r8 != 0) goto L_0x00bb
            r11.mo124718f(r10, r9, r6)     // Catch:{ d -> 0x008f }
            goto L_0x01bc
        L_0x00bb:
            ys0.g r7 = (ys0.C91584g) r7     // Catch:{ d -> 0x008f }
            vs0.a r8 = r11.f260249h     // Catch:{ d -> 0x008f }
            ys0.a r9 = r11.f260253o     // Catch:{ d -> 0x008f }
            vs0.a$b r8 = r8.mo124964a(r9, r7)     // Catch:{ d -> 0x008f }
            if (r8 != r1) goto L_0x0130
            ts0.d r1 = r11.f260248g     // Catch:{ b -> 0x010e, RuntimeException -> 0x00e6 }
            r1.getClass()     // Catch:{ b -> 0x010e, RuntimeException -> 0x00e6 }
            r11.f260247f = r0     // Catch:{ d -> 0x008f }
            ts0.d r0 = r11.f260248g     // Catch:{ RuntimeException -> 0x00db, d -> 0x008f }
            us0.a r0 = (us0.C90729a) r0     // Catch:{ RuntimeException -> 0x00db, d -> 0x008f }
            java.util.concurrent.CountDownLatch r1 = r0.f260598p     // Catch:{ RuntimeException -> 0x00db, d -> 0x008f }
            r1.countDown()     // Catch:{ RuntimeException -> 0x00db, d -> 0x008f }
            r0.mo114107p(r7)     // Catch:{ RuntimeException -> 0x00db, d -> 0x008f }
            goto L_0x00e3
        L_0x00db:
            r0 = move-exception
            ts0.d r1 = r11.f260248g     // Catch:{ d -> 0x008f }
            us0.a r1 = (us0.C90729a) r1     // Catch:{ d -> 0x008f }
            r1.mo114103l(r0)     // Catch:{ d -> 0x008f }
        L_0x00e3:
            r0 = 1
            goto L_0x01bd
        L_0x00e6:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ d -> 0x008f }
            r1.<init>()     // Catch:{ d -> 0x008f }
            r1.append(r2)     // Catch:{ d -> 0x008f }
            java.lang.String r7 = r0.toString()     // Catch:{ d -> 0x008f }
            r1.append(r7)     // Catch:{ d -> 0x008f }
            java.lang.String r1 = r1.toString()     // Catch:{ d -> 0x008f }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)     // Catch:{ d -> 0x008f }
            ts0.d r1 = r11.f260248g     // Catch:{ d -> 0x008f }
            us0.a r1 = (us0.C90729a) r1     // Catch:{ d -> 0x008f }
            r1.mo114103l(r0)     // Catch:{ d -> 0x008f }
            r1 = -1
            java.lang.String r0 = r0.getMessage()     // Catch:{ d -> 0x008f }
            r11.mo124718f(r1, r0, r6)     // Catch:{ d -> 0x008f }
            goto L_0x01bc
        L_0x010e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ d -> 0x008f }
            r1.<init>()     // Catch:{ d -> 0x008f }
            r1.append(r2)     // Catch:{ d -> 0x008f }
            java.lang.String r7 = r0.toString()     // Catch:{ d -> 0x008f }
            r1.append(r7)     // Catch:{ d -> 0x008f }
            java.lang.String r1 = r1.toString()     // Catch:{ d -> 0x008f }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)     // Catch:{ d -> 0x008f }
            int r1 = r0.f261290d     // Catch:{ d -> 0x008f }
            java.lang.String r0 = r0.getMessage()     // Catch:{ d -> 0x008f }
            r11.mo124718f(r1, r0, r6)     // Catch:{ d -> 0x008f }
            goto L_0x01bc
        L_0x0130:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ d -> 0x008f }
            r0.<init>()     // Catch:{ d -> 0x008f }
            java.lang.String r1 = "draft refuses handshake "
            r0.append(r1)     // Catch:{ d -> 0x008f }
            short r1 = r7.mo125459d()     // Catch:{ d -> 0x008f }
            r0.append(r1)     // Catch:{ d -> 0x008f }
            java.lang.String r1 = " "
            r0.append(r1)     // Catch:{ d -> 0x008f }
            java.lang.String r1 = r7.mo125458b()     // Catch:{ d -> 0x008f }
            r0.append(r1)     // Catch:{ d -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ d -> 0x008f }
            r11.mo124713a(r10, r0, r6)     // Catch:{ d -> 0x008f }
            goto L_0x01bc
        L_0x0155:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ a -> 0x009b }
            r1.<init>()     // Catch:{ a -> 0x009b }
            r1.append(r2)     // Catch:{ a -> 0x009b }
            java.lang.String r7 = r0.toString()     // Catch:{ a -> 0x009b }
            r1.append(r7)     // Catch:{ a -> 0x009b }
            java.lang.String r1 = r1.toString()     // Catch:{ a -> 0x009b }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)     // Catch:{ a -> 0x009b }
            int r1 = r0.f261290d     // Catch:{ a -> 0x009b }
            java.lang.String r0 = r0.getMessage()     // Catch:{ a -> 0x009b }
            r11.mo124713a(r1, r0, r6)     // Catch:{ a -> 0x009b }
            goto L_0x01bc
        L_0x0175:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = r0.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
            java.nio.ByteBuffer r1 = r11.f260252n
            int r1 = r1.capacity()
            if (r1 != 0) goto L_0x01aa
            r4.reset()
            int r0 = r0.f261289d
            if (r0 != 0) goto L_0x01a0
            int r0 = r4.capacity()
            int r0 = r0 + 16
        L_0x01a0:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r11.f260252n = r0
            r0.put(r12)
            goto L_0x01bc
        L_0x01aa:
            java.nio.ByteBuffer r0 = r11.f260252n
            int r1 = r0.limit()
            r0.position(r1)
            java.nio.ByteBuffer r0 = r11.f260252n
            int r1 = r0.capacity()
            r0.limit(r1)
        L_0x01bc:
            r0 = 0
        L_0x01bd:
            if (r0 == 0) goto L_0x01e9
            ts0.a$a r0 = r11.f260247f
            ts0.a$a r1 = ts0.C90577a.C90578a.CLOSING
            if (r0 != r1) goto L_0x01c7
            r1 = 1
            goto L_0x01c8
        L_0x01c7:
            r1 = 0
        L_0x01c8:
            if (r1 != 0) goto L_0x01e9
            ts0.a$a r1 = ts0.C90577a.C90578a.CLOSED
            if (r0 != r1) goto L_0x01cf
            goto L_0x01d0
        L_0x01cf:
            r5 = 0
        L_0x01d0:
            if (r5 != 0) goto L_0x01e9
            boolean r0 = r12.hasRemaining()
            if (r0 == 0) goto L_0x01dc
            r11.mo124716d(r12)
            goto L_0x01e9
        L_0x01dc:
            java.nio.ByteBuffer r12 = r11.f260252n
            boolean r12 = r12.hasRemaining()
            if (r12 == 0) goto L_0x01e9
            java.nio.ByteBuffer r12 = r11.f260252n
            r11.mo124716d(r12)
        L_0x01e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ts0.C90581c.mo124715c(java.nio.ByteBuffer):void");
    }

    /* renamed from: d */
    public final void mo124716d(ByteBuffer byteBuffer) {
        C91340d.C91341a aVar = C91340d.C91341a.CONTINUOUS;
        C91340d.C91341a aVar2 = C91340d.C91341a.PONG;
        try {
            for (C91340d next : this.f260249h.mo124973k(byteBuffer)) {
                C91340d.C91341a d = next.mo125327d();
                boolean e = next.mo125328e();
                if (d == C91340d.C91341a.CLOSING) {
                    int i = 1005;
                    String str = "";
                    if (next instanceof C91337a) {
                        C91337a aVar3 = (C91337a) next;
                        i = aVar3.mo125320b();
                        str = aVar3.getMessage();
                    }
                    if (this.f260247f == C90577a.C90578a.CLOSING) {
                        mo124714b(i, str, true);
                    } else if (this.f260249h.mo124970g() == C90866a.C90867a.TWOWAY) {
                        mo124713a(i, str, true);
                    } else {
                        mo124718f(i, str, false);
                    }
                } else if (d == C91340d.C91341a.PING) {
                    ((C90580b) this.f260248g).getClass();
                    C91342e eVar = new C91342e(next);
                    eVar.f261982b = aVar2;
                    this.f260245d.add(this.f260249h.mo124967d(eVar));
                    this.f260248g.getClass();
                } else if (d == aVar2) {
                    this.f260248g.getClass();
                } else {
                    if (e) {
                        if (d != aVar) {
                            if (this.f260251j != null) {
                                throw new C91102b(1002, "Continuous frame sequence not completed.");
                            } else if (d == C91340d.C91341a.TEXT) {
                                try {
                                    ((C90729a) this.f260248g).mo114105n(C91934b.m115449a(next.mo125322f()));
                                } catch (RuntimeException e2) {
                                    ((C90729a) this.f260248g).mo114103l(e2);
                                }
                            } else if (d == C91340d.C91341a.BINARY) {
                                try {
                                    ((C90729a) this.f260248g).mo114106o(next.mo125322f());
                                } catch (RuntimeException e3) {
                                    ((C90729a) this.f260248g).mo114103l(e3);
                                }
                            } else {
                                throw new C91102b(1002, "non control or continious frame expected");
                            }
                        }
                    }
                    if (d != aVar) {
                        if (this.f260251j == null) {
                            this.f260251j = d;
                        } else {
                            throw new C91102b(1002, "Previous continuous frame sequence not completed.");
                        }
                    } else if (e) {
                        if (this.f260251j != null) {
                            this.f260251j = null;
                        } else {
                            throw new C91102b(1002, "Continuous frame sequence was not started.");
                        }
                    } else if (this.f260251j == null) {
                        throw new C91102b(1002, "Continuous frame sequence was not started.");
                    }
                    try {
                        ((C90729a) this.f260248g).mo114104m(next);
                    } catch (RuntimeException e4) {
                        ((C90729a) this.f260248g).mo114103l(e4);
                    }
                }
            }
        } catch (C91102b e5) {
            Log.m105920e("MicroMsg.AppBrandNetWork.WebSocketImpl", "decodeFrames: " + e5.toString());
            ((C90729a) this.f260248g).mo114103l(e5);
            mo124713a(e5.f261290d, e5.getMessage(), false);
        }
    }

    /* renamed from: e */
    public void mo124717e() {
        if (this.f260247f == C90577a.C90578a.NOT_YET_CONNECTED) {
            mo124714b(-1, "", true);
        } else if (this.f260246e) {
            mo124714b(this.f260255q.intValue(), this.f260254p, this.f260256r.booleanValue());
        } else if (this.f260249h.mo124970g() == C90866a.C90867a.NONE) {
            mo124714b(1000, "", true);
        } else if (this.f260249h.mo124970g() != C90866a.C90867a.ONEWAY) {
            mo124714b(1006, "", true);
        } else if (this.f260250i == C90577a.C90579b.SERVER) {
            mo124714b(1006, "", true);
        } else {
            mo124714b(1000, "", true);
        }
    }

    /* renamed from: f */
    public synchronized void mo124718f(int i, String str, boolean z) {
        if (!this.f260246e) {
            this.f260255q = Integer.valueOf(i);
            this.f260254p = str;
            this.f260256r = Boolean.valueOf(z);
            this.f260246e = true;
            this.f260248g.getClass();
            try {
                this.f260248g.getClass();
            } catch (RuntimeException e) {
                ((C90729a) this.f260248g).mo114103l(e);
            }
            C90866a aVar = this.f260249h;
            if (aVar != null) {
                aVar.mo124972j();
            }
            this.f260253o = null;
        }
    }

    /* renamed from: g */
    public final void mo124719g(Collection<C91340d> collection) {
        if (this.f260247f == C90577a.C90578a.OPEN) {
            for (C91340d d : collection) {
                this.f260245d.add(this.f260249h.mo124967d(d));
                this.f260248g.getClass();
            }
            return;
        }
        throw new C91105e();
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
