package com.tencent.p014mm.p136ui.chatting.gallery;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.PowerManager;
import android.util.SparseArray;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.OnlineVideoEvent;
import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.network.C114786m0;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.chatting.RevokeMsgListener;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoTextureView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C97621e;
import f40.C86709a0;
import gc0.C20828a;
import hc0.C20937c;
import hd0.C98398h0;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98429r0;
import j20.C117292a;
import java.util.HashMap;
import p159gw.C98250h;
import p206nj.C11171e;
import p243tn.C14050a;
import p682rz.C101487r;
import p682rz.C101488s;
import p682rz.C101489t;
import p682rz.C101491u;
import p910lj.C76701a;
import s62.C101554f;
import s62.C110762b;
import s90.C48300n;
import te3.C64598o03;
import uf0.C102022j;
import xn2.C102693c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler */
public class ImageGalleryVideoHandler extends C97052g implements C101489t.C77595a, C97621e.C97622a {

    /* renamed from: R */
    public static boolean f284562R;

    /* renamed from: A */
    public long f284563A = 0;

    /* renamed from: B */
    public long f284564B = 0;

    /* renamed from: C */
    public int f284565C = 0;

    /* renamed from: D */
    public boolean f284566D = false;

    /* renamed from: E */
    public PowerManager.WakeLock f284567E;

    /* renamed from: F */
    public MMHandler f284568F = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new ImageGalleryVideoHandler$$e(this));

    /* renamed from: G */
    public int f284569G = 0;

    /* renamed from: H */
    public MTimerHandler f284570H = new MTimerHandler(new ImageGalleryVideoHandler$$i(this), true);

    /* renamed from: I */
    public MTimerHandler f284571I = new MTimerHandler(new ImageGalleryVideoHandler$$j(this), true);

    /* renamed from: J */
    public C102693c f284572J = new ImageGalleryVideoHandler$$b(this);

    /* renamed from: K */
    public IListener<OnlineVideoEvent> f284573K = new IListener<OnlineVideoEvent>(C40008f.f107254d) {
        {
            this.__eventId = -2133747774;
        }

        public boolean callback(IEvent iEvent) {
            OnlineVideoEvent onlineVideoEvent = (OnlineVideoEvent) iEvent;
            Class cls = C101487r.class;
            if (Util.isEqual(onlineVideoEvent.f264965d.f264968c, ImageGalleryVideoHandler.this.f284582o.f285000f)) {
                OnlineVideoEvent.C92538a aVar = onlineVideoEvent.f264965d;
                int i = aVar.f264967b;
                if (i == 0 || i == -21006) {
                    switch (aVar.f264966a) {
                        case 1:
                            C97132t1 t1Var = ImageGalleryVideoHandler.this.f284582o;
                            long j = (long) aVar.f264969d;
                            long j2 = aVar.f264971f;
                            boolean z = aVar.f264972g;
                            t1Var.getClass();
                            Log.m105925i("MicroMsg.OnlineVideoUIHelper", "deal moov ready moovPos[%d] needSeekTime[%d] timeDuration[%d] startDownload[%d %d]", Long.valueOf(j), Integer.valueOf(t1Var.f285004j), Integer.valueOf(t1Var.f285003i), Long.valueOf(j2), Long.valueOf(t1Var.f285010p));
                            if (t1Var.f285003i != 0) {
                                Log.m105928w("MicroMsg.OnlineVideoUIHelper", "moov had callback, do nothing.");
                            } else {
                                long j3 = t1Var.f285010p;
                                if (j2 <= j3) {
                                    j2 = j3;
                                }
                                t1Var.f285010p = j2;
                                C115669n nVar = C115669n.INSTANCE;
                                nVar.idkeyStat(354, 5, 1, false);
                                t1Var.f285011q = Util.nowMilliSecond();
                                String q = ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137728q(t1Var.f284999e);
                                try {
                                    C102022j jVar = t1Var.f284997c;
                                    if (jVar == null) {
                                        Log.m105928w("MicroMsg.OnlineVideoUIHelper", "parser is null, thread is error.");
                                    } else if (jVar.mo89446a(q, j)) {
                                        int i2 = t1Var.f284997c.f300429f;
                                        t1Var.f285003i = i2;
                                        Log.m105925i("MicroMsg.OnlineVideoUIHelper", "mp4 parse moov success. duration %d filename %s isFastStart %b", Integer.valueOf(i2), t1Var.f284999e, Boolean.valueOf(z));
                                        if (!z) {
                                            MMHandlerThread.postToMainThread(new C97125s1(t1Var));
                                        }
                                        if (t1Var.f285004j == -1) {
                                            t1Var.f284996b = 1;
                                        } else {
                                            t1Var.f284996b = 2;
                                        }
                                        nVar.idkeyStat(354, 7, 1, false);
                                    } else {
                                        Log.m105928w("MicroMsg.OnlineVideoUIHelper", "mp4 parse moov error.");
                                        ((C92755e0) ((C101487r) C86312j.m106911c(cls)).mo140795W6()).mo126990n(t1Var.f285000f, 0, -1, 0);
                                        C98429r0.m127802H(t1Var.f284999e, 15);
                                        t1Var.mo136041k();
                                    }
                                } catch (Exception e) {
                                    Log.printErrStackTrace("MicroMsg.OnlineVideoUIHelper", e, "", new Object[0]);
                                    Log.m105920e("MicroMsg.OnlineVideoUIHelper", "deal moov ready error: " + e.toString());
                                }
                            }
                            ImageGalleryVideoHandler.this.f284584q = true;
                            break;
                        case 2:
                            C97132t1 t1Var2 = ImageGalleryVideoHandler.this.f284582o;
                            String str = aVar.f264968c;
                            int i3 = aVar.f264969d;
                            int i4 = aVar.f264970e;
                            t1Var2.f285016v = false;
                            if (i3 <= -1 || i4 <= -1) {
                                Log.m105929w("MicroMsg.OnlineVideoUIHelper", "deal data available error offset[%d], length[%d]", Integer.valueOf(i3), Integer.valueOf(i4));
                            } else if (Util.isEqual(str, t1Var2.f285000f)) {
                                Integer num = t1Var2.f285008n.get(t1Var2.f285000f + i3 + "_" + i4);
                                if (num == null || num.intValue() <= 0) {
                                    try {
                                        t1Var2.f285006l = t1Var2.f284997c.mo89448c(i3, i4);
                                    } catch (Exception e2) {
                                        Log.printErrStackTrace("MicroMsg.OnlineVideoUIHelper", e2, "", new Object[0]);
                                        Log.m105920e("MicroMsg.OnlineVideoUIHelper", "deal data available file pos to video time error: " + e2.toString());
                                    }
                                } else {
                                    t1Var2.f285006l = num.intValue();
                                }
                                Log.m105925i("MicroMsg.OnlineVideoUIHelper", "deal data available. offset[%d] length[%d] cachePlayTime[%d]", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(t1Var2.f285006l));
                            }
                            if (onlineVideoEvent.f264965d.f264970e > 0) {
                                ImageGalleryVideoHandler.this.mo135840Q(true);
                                break;
                            }
                            break;
                        case 3:
                            ImageGalleryVideoHandler.this.mo135840Q(true);
                            break;
                        case 4:
                            C97132t1 t1Var3 = ImageGalleryVideoHandler.this.f284582o;
                            Log.m105925i("MicroMsg.OnlineVideoUIHelper", "deal stream finish. playStatus %d ", Integer.valueOf(t1Var3.f284996b));
                            t1Var3.f285016v = false;
                            t1Var3.f284995a = 3;
                            int i5 = t1Var3.f284996b;
                            if (i5 == 0) {
                                Log.m105928w("MicroMsg.OnlineVideoUIHelper", "it had not moov callback and download finish start to play video.");
                                t1Var3.mo136037g();
                                C115669n.INSTANCE.idkeyStat(354, 6, 1, false);
                            } else if (i5 == 5) {
                                Log.m105928w("MicroMsg.OnlineVideoUIHelper", "it had play error, it request all video data finish, start to play." + t1Var3.f285000f);
                                t1Var3.mo136037g();
                            }
                            t1Var3.mo136033c();
                            C115669n.INSTANCE.idkeyStat(354, 26, 1, false);
                            ImageGalleryVideoHandler.this.mo135840Q(true);
                            break;
                        case 5:
                            C97132t1 t1Var4 = ImageGalleryVideoHandler.this.f284582o;
                            String str2 = aVar.f264968c;
                            int i6 = aVar.f264969d;
                            if (Util.isEqual(str2, t1Var4.f285000f)) {
                                int i7 = t1Var4.f285001g;
                                if (i7 != 0) {
                                    t1Var4.f285002h = (i6 * 100) / i7;
                                }
                                Log.m105924i("MicroMsg.OnlineVideoUIHelper", "deal progress callback. downloadedPercent : " + t1Var4.f285002h);
                            }
                            if (t1Var4.f285002h >= 100) {
                                t1Var4.f284995a = 3;
                                break;
                            }
                            break;
                        case 6:
                            C97132t1 t1Var5 = ImageGalleryVideoHandler.this.f284582o;
                            t1Var5.getClass();
                            Log.m105924i("MicroMsg.OnlineVideoUIHelper", "deal had dup video.");
                            t1Var5.mo136033c();
                            t1Var5.mo136037g();
                            break;
                        default:
                            Log.m105928w("MicroMsg.Imagegallery.handler.video", "unknown event opcode " + onlineVideoEvent.f264965d.f264966a);
                            break;
                    }
                } else {
                    Log.m105928w("MicroMsg.Imagegallery.handler.video", "stream download online video error. retCode: " + onlineVideoEvent.f264965d.f264967b);
                    ImageGalleryVideoHandler imageGalleryVideoHandler = ImageGalleryVideoHandler.this;
                    OnlineVideoEvent.C92538a aVar2 = onlineVideoEvent.f264965d;
                    String str3 = aVar2.f264968c;
                    int i8 = aVar2.f264967b;
                    imageGalleryVideoHandler.getClass();
                    Log.m105924i("MicroMsg.Imagegallery.handler.video", "download online video error. mediaId: " + str3);
                    imageGalleryVideoHandler.mo135830G();
                    C97132t1 t1Var6 = imageGalleryVideoHandler.f284582o;
                    t1Var6.getClass();
                    Log.m105924i("MicroMsg.OnlineVideoUIHelper", "deal stream error.");
                    if (Util.isEqual(str3, t1Var6.f285000f)) {
                        t1Var6.f284995a = 2;
                        ((C92755e0) ((C101487r) C86312j.m106911c(cls)).mo140795W6()).mo126983g(t1Var6.f285000f, t1Var6.mo136035e());
                    }
                    C115669n.INSTANCE.idkeyStat(354, 9, 1, false);
                    if (i8 == -10012) {
                        Log.m105928w("MicroMsg.Imagegallery.handler.video", "download online video time out, quit imageGalleryUI.");
                        MMHandlerThread.postToMainThread(new C97131t0(imageGalleryVideoHandler));
                    } else {
                        MMHandlerThread.postToMainThread(new C97104o0(imageGalleryVideoHandler, i8));
                    }
                }
            }
            return false;
        }
    };

    /* renamed from: L */
    public boolean f284574L = false;

    /* renamed from: M */
    public long f284575M;

    /* renamed from: N */
    public int f284576N;

    /* renamed from: P */
    public C96875r0.C96879e f284577P = new ImageGalleryVideoHandler$$c(this);

    /* renamed from: Q */
    public C110762b f284578Q = new ImageGalleryVideoHandler$$d(this);

    /* renamed from: i */
    public HashMap<String, ImageGalleryVideoHandler$$k> f284579i = new HashMap<>();

    /* renamed from: j */
    public IListener f284580j;

    /* renamed from: n */
    public final SparseArray<C98408n0> f284581n = new SparseArray<>();

    /* renamed from: o */
    public C97132t1 f284582o = new C97132t1(this);

    /* renamed from: p */
    public C97621e f284583p;

    /* renamed from: q */
    public boolean f284584q;

    /* renamed from: r */
    public boolean f284585r = false;

    /* renamed from: s */
    public boolean f284586s = false;

    /* renamed from: t */
    public boolean f284587t = false;

    /* renamed from: u */
    public int f284588u = 0;

    /* renamed from: v */
    public long f284589v = 0;

    /* renamed from: w */
    public long f284590w = 0;

    /* renamed from: x */
    public int f284591x = 0;

    /* renamed from: y */
    public int f284592y = 0;

    /* renamed from: z */
    public String f284593z;

    public ImageGalleryVideoHandler(C97056h hVar) {
        super(hVar);
        RevokeMsgListener revokeMsgListener = new RevokeMsgListener(RevokeMsgListener.C73288a.VIDEO_GALLERY, hVar.f284714g);
        this.f284580j = revokeMsgListener;
        revokeMsgListener.alive();
        this.f284573K.alive();
        this.f284583p = new C97621e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x028b  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo135824A(com.tencent.p014mm.storage.C72963f4 r19, int r20) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            java.lang.Class<rz.s> r0 = p682rz.C101488s.class
            java.lang.String r10 = "MicroMsg.Imagegallery.handler.video"
            java.lang.String r1 = "toggle video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            if (r8 != 0) goto L_0x0013
            return
        L_0x0013:
            boolean r1 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124955K(r19)
            if (r1 != 0) goto L_0x0020
            boolean r1 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124954I(r19)
            if (r1 != 0) goto L_0x0020
            return
        L_0x0020:
            hd0.n0 r11 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124928p(r19)
            hd0.x0$a r1 = hd0.C98442x0.f288734i
            java.lang.String r2 = r11.mo137705i()
            hd0.x0 r1 = r1.mo137781b(r2)
            r12 = 8
            r13 = 1
            r14 = 0
            if (r1 == 0) goto L_0x0088
            boolean r1 = r1.f288738b
            if (r1 == 0) goto L_0x0088
            com.tencent.mm.ui.chatting.gallery.m1 r1 = r7.mo135877h(r9)
            if (r1 == 0) goto L_0x0043
            android.widget.ImageView r2 = r1.f284848o
            r1.mo135972h(r2, r12)
        L_0x0043:
            long r1 = eb0.C31543z5.m39451a()
            long r3 = r19.getCreateTime()
            long r1 = r1 - r3
            r3 = 432000000(0x19bfcc00, double:2.13436359E-315)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0062
            com.tencent.mm.ui.chatting.gallery.h r1 = r7.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r1 = r1.f284714g
            r2 = 2131833881(0x7f113419, float:1.9300857E38)
            java.lang.String r2 = r1.getString(r2)
            r1.mo135755Y8(r2)
            goto L_0x0086
        L_0x0062:
            zt3.t r1 = zt3.C119157j.f356862d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler$$a r2 = new com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler$$a
            r2.<init>(r7)
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183895z(r2)
            di3.d r1 = di3.C86312j.m106911c(r0)
            rz.s r1 = (p682rz.C101488s) r1
            rz.t r1 = r1.Kj0()
            com.tencent.mm.ui.chatting.gallery.n0 r2 = new com.tencent.mm.ui.chatting.gallery.n0
            r2.<init>(r7, r11, r8, r9)
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            hd0.o0 r1 = (hd0.C98410o0) r1
            r1.mo137716b(r2, r3)
        L_0x0086:
            r1 = 1
            goto L_0x0089
        L_0x0088:
            r1 = 0
        L_0x0089:
            if (r1 == 0) goto L_0x008c
            return
        L_0x008c:
            java.lang.String r1 = r11.mo137700d()
            r7.f284593z = r1
            int r1 = r11.f288562i
            r15 = 199(0xc7, float:2.79E-43)
            r6 = 123(0x7b, float:1.72E-43)
            if (r1 == r15) goto L_0x009f
            if (r1 != r6) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            r1 = 0
            goto L_0x00a0
        L_0x009f:
            r1 = 1
        L_0x00a0:
            boolean r2 = r19.mo100983V3()
            r5 = 111(0x6f, float:1.56E-43)
            if (r2 == 0) goto L_0x00ec
            java.lang.Object[] r2 = new java.lang.Object[r13]
            int r3 = r11.f288562i
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r14] = r3
            java.lang.String r3 = "MP_VIDEO toggle mp video,status : %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r2)
            di3.d r2 = di3.C86312j.m106911c(r0)
            rz.s r2 = (p682rz.C101488s) r2
            rz.t r2 = r2.Kj0()
            java.lang.String r3 = r19.mo108765s2()
            hd0.o0 r2 = (hd0.C98410o0) r2
            java.lang.String r2 = r2.mo137728q(r3)
            if (r1 == 0) goto L_0x00ec
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r2 != 0) goto L_0x00ec
            r11.f288562i = r5
            di3.d r1 = di3.C86312j.m106911c(r0)
            rz.s r1 = (p682rz.C101488s) r1
            rz.t r1 = r1.Kj0()
            hd0.o0 r1 = (hd0.C98410o0) r1
            r1.mo137733w(r11)
            java.lang.String r1 = "MP_VIDEO_WARN user delete local file,reset video info status"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            r16 = 0
            goto L_0x00ee
        L_0x00ec:
            r16 = r1
        L_0x00ee:
            boolean r1 = r19.mo100983V3()
            r4 = 2
            if (r1 == 0) goto L_0x01b7
            s90.n r2 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124926n(r19)
            if (r2 != 0) goto L_0x0101
            java.lang.String r0 = "MP_VIDEO_ERROR mpShareVideoInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            return
        L_0x0101:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r16)
            r1[r14] = r3
            java.lang.String r3 = r19.mo108765s2()
            java.lang.String r3 = r2.mo73008d(r3)
            r1[r13] = r3
            java.lang.String r3 = "mpVideo videoDownload %b, playKey %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r1)
            com.tencent.mm.ui.chatting.gallery.q1 r1 = com.tencent.p014mm.p136ui.chatting.gallery.C85820q1.f249947a
            java.lang.String r3 = r19.mo108765s2()
            java.lang.String r3 = r2.mo73008d(r3)
            java.lang.String r3 = r1.mo119746a(r3)
            java.lang.String r5 = r19.mo108765s2()
            java.lang.String r5 = r2.mo73008d(r5)
            te3.o03 r1 = r1.mo119747b(r5)
            int r5 = r1.f184602e
            if (r5 != r13) goto L_0x0146
            java.lang.String r0 = "MP_VIDEO block video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.mm.ui.chatting.gallery.m1 r0 = r7.mo135877h(r9)
            java.lang.String r1 = r1.f184603f
            r7.mo135911x(r0, r1)
            return
        L_0x0146:
            com.tencent.mm.ui.chatting.gallery.m1 r5 = r7.mo135877h(r9)
            r7.mo135910q(r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r5 != 0) goto L_0x0189
            int r5 = r11.f288559f
            if (r5 <= 0) goto L_0x0161
            te3.tc4 r5 = r11.f288535C
            java.lang.String r5 = r5.f299537d
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0189
        L_0x0161:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r14] = r3
            int r4 = r1.f184604g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r13] = r4
            java.lang.String r4 = "MP_VIDEO  update video info. playUrl:%s, length:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r5)
            te3.tc4 r4 = r11.f288535C
            r4.f299537d = r3
            int r1 = r1.f184604g
            r11.f288559f = r1
            di3.d r0 = di3.C86312j.m106911c(r0)
            rz.s r0 = (p682rz.C101488s) r0
            rz.t r0 = r0.Kj0()
            hd0.o0 r0 = (hd0.C98410o0) r0
            r0.mo137733w(r11)
        L_0x0189:
            r1 = r11
            r3 = r19
            r0 = 2
            r4 = r20
            r0 = 111(0x6f, float:1.56E-43)
            r5 = r16
            r6 = r18
            boolean r1 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124924l(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x01c0
            if (r16 != 0) goto L_0x01c0
            com.tencent.mm.ui.chatting.gallery.m1 r0 = r7.mo135877h(r9)
            if (r0 == 0) goto L_0x01b6
            r0.mo135970f()
            r0.mo135970f()
            android.widget.ImageView r1 = r0.f284848o
            r1.setVisibility(r12)
            r0.mo135970f()
            android.widget.ProgressBar r0 = r0.f284858y
            r0.setVisibility(r14)
        L_0x01b6:
            return
        L_0x01b7:
            r0 = 111(0x6f, float:1.56E-43)
            com.tencent.mm.ui.chatting.gallery.m1 r1 = r7.mo135877h(r9)
            r7.mo135910q(r1)
        L_0x01c0:
            boolean r1 = r7.f284584q
            if (r1 == 0) goto L_0x01de
            com.tencent.mm.ui.chatting.gallery.t1 r1 = r7.f284582o
            if (r1 == 0) goto L_0x01de
            boolean r1 = r1.f285005k
            if (r1 == 0) goto L_0x01de
            java.lang.Object[] r0 = new java.lang.Object[r13]
            int r1 = r18.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r14] = r1
            java.lang.String r1 = "%d it loading video data, do not response button click."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            return
        L_0x01de:
            com.tencent.mm.ui.chatting.gallery.h r1 = r7.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r1 = r1.f284714g
            r1.mo135781o8()
            com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar r1 = r1.f284400U0
            boolean r1 = r1.f283824z
            if (r1 == 0) goto L_0x022c
            com.tencent.mm.ui.chatting.gallery.m1 r0 = r7.mo135877h(r9)
            if (r0 == 0) goto L_0x0207
            r0.mo135970f()
            r0.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r1 = r0.f284849p
            boolean r1 = r1.isPlaying()
            if (r1 == 0) goto L_0x0207
            r0.mo135970f()
            android.widget.ImageView r1 = r0.f284848o
            r0.mo135972h(r1, r14)
        L_0x0207:
            com.tencent.mm.ui.chatting.gallery.m1 r0 = r7.mo135877h(r9)
            r7.mo135832I(r0)
            com.tencent.mm.ui.chatting.gallery.h r0 = r7.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284714g
            r0.mo135741R8(r13)
            com.tencent.mm.ui.chatting.gallery.h r0 = r7.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284714g
            r0.mo135767e9()
            eb0.e r0 = r7.f284583p
            r0.mo136889a()
            r18.mo135835L()
            java.lang.String r0 = "toggle pause video."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x0362
        L_0x022c:
            eb0.c r1 = eb0.C97625j3.m125812b()
            boolean r1 = r1.mo105883I()
            if (r1 != 0) goto L_0x0243
            com.tencent.mm.ui.chatting.gallery.h r0 = r7.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284714g
            androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
            r1 = 0
            nj3.C76912y0.m92771j(r0, r1)
            return
        L_0x0243:
            boolean r1 = r7.f284584q
            if (r1 == 0) goto L_0x029e
            com.tencent.mm.ui.chatting.gallery.h r0 = r7.f284638d     // Catch:{ Exception -> 0x0260 }
            com.tencent.mm.ui.chatting.gallery.m1 r0 = r0.mo135934v()     // Catch:{ Exception -> 0x0260 }
            com.tencent.mm.pluginsdk.ui.tools.r0 r0 = r0.f284849p     // Catch:{ Exception -> 0x0260 }
            if (r0 == 0) goto L_0x0268
            com.tencent.mm.ui.chatting.gallery.h r0 = r7.f284638d     // Catch:{ Exception -> 0x0260 }
            com.tencent.mm.ui.chatting.gallery.m1 r0 = r0.mo135934v()     // Catch:{ Exception -> 0x0260 }
            com.tencent.mm.pluginsdk.ui.tools.r0 r0 = r0.f284849p     // Catch:{ Exception -> 0x0260 }
            int r0 = r0.getCurrentPosition()     // Catch:{ Exception -> 0x0260 }
            int r0 = r0 / 1000
            goto L_0x0269
        L_0x0260:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.String r2 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r2, r1)
        L_0x0268:
            r0 = 0
        L_0x0269:
            com.tencent.mm.ui.chatting.gallery.t1 r1 = r7.f284582o
            if (r1 == 0) goto L_0x028b
            boolean r0 = r1.mo136032b(r0)
            if (r0 == 0) goto L_0x0280
            java.lang.String r0 = "toggle play video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            boolean r0 = r7.f284584q
            r7.mo135834K(r8, r11, r9, r0)
            goto L_0x030c
        L_0x0280:
            java.lang.String r0 = "toggle start timer."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            r7.mo135840Q(r14)
            goto L_0x030c
        L_0x028b:
            java.lang.Object[] r0 = new java.lang.Object[r13]
            int r1 = r18.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r14] = r1
            java.lang.String r1 = "%d toggle video but online video helper is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r1, r0)
            goto L_0x030c
        L_0x029e:
            int r1 = r19.mo108769t2()
            r2 = 122(0x7a, float:1.71E-43)
            r3 = 121(0x79, float:1.7E-43)
            r4 = 112(0x70, float:1.57E-43)
            r5 = 113(0x71, float:1.58E-43)
            if (r1 != 0) goto L_0x02de
            int r1 = r11.f288562i
            if (r1 == r5) goto L_0x02db
            r6 = 198(0xc6, float:2.77E-43)
            if (r1 != r6) goto L_0x02b5
            goto L_0x02db
        L_0x02b5:
            if (r1 != r15) goto L_0x02ba
            r7.mo135834K(r8, r11, r9, r14)
        L_0x02ba:
            int r1 = r11.f288562i
            if (r1 != r0) goto L_0x02c1
            r7.mo135828E(r8, r11)
        L_0x02c1:
            int r1 = r11.f288562i
            if (r1 != r4) goto L_0x02c8
            r7.mo135828E(r8, r11)
        L_0x02c8:
            int r1 = r11.f288562i
            if (r1 == r3) goto L_0x02ce
            if (r1 != r2) goto L_0x02d1
        L_0x02ce:
            r7.mo135828E(r8, r11)
        L_0x02d1:
            int r1 = r11.f288562i
            r6 = 123(0x7b, float:1.72E-43)
            if (r1 != r6) goto L_0x02de
            r7.mo135834K(r8, r11, r9, r14)
            goto L_0x02de
        L_0x02db:
            r7.mo135828E(r8, r11)
        L_0x02de:
            int r1 = r19.mo108769t2()
            if (r1 != r13) goto L_0x030c
            int r1 = r11.f288562i
            if (r1 == r0) goto L_0x02f5
            if (r1 == r5) goto L_0x02f5
            if (r1 == r4) goto L_0x02f5
            if (r1 == r3) goto L_0x02f5
            if (r1 != r2) goto L_0x02f1
            goto L_0x02f5
        L_0x02f1:
            r7.mo135834K(r8, r11, r9, r14)
            goto L_0x030c
        L_0x02f5:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r19.mo108768t()
            r0[r14] = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r13] = r1
            java.lang.String r1 = "download video. msg talker[%s], info status[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            r7.mo135828E(r8, r11)
        L_0x030c:
            com.tencent.mm.ui.chatting.gallery.h r0 = r7.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284714g
            boolean r1 = r0.f284370K2
            if (r1 == 0) goto L_0x0317
            r0.mo135763c9()
        L_0x0317:
            com.tencent.mm.ui.chatting.gallery.h r0 = r7.f284638d     // Catch:{ Exception -> 0x0325 }
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284714g     // Catch:{ Exception -> 0x0325 }
            r0.mo135781o8()     // Catch:{ Exception -> 0x0325 }
            com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar r0 = r0.f284400U0     // Catch:{ Exception -> 0x0325 }
            xn2.c r1 = r7.f284572J     // Catch:{ Exception -> 0x0325 }
            r0.setIplaySeekCallback(r1)     // Catch:{ Exception -> 0x0325 }
        L_0x0325:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            r1 = 536870922(0x2000000a, float:1.0842035E-19)
            android.os.PowerManager$WakeLock r0 = r0.newWakeLock(r1, r10)
            r7.f284567E = r0
            java.lang.String r12 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryVideoHandler"
            java.lang.String r13 = "acuquireWakeLock"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r16 = "acquire"
            java.lang.String r17 = "()V"
            r11 = r0
            j20.C117292a.m165357c(r11, r12, r13, r14, r15, r16, r17)
            r0.acquire()
            java.lang.String r12 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryVideoHandler"
            java.lang.String r13 = "acuquireWakeLock"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r16 = "acquire"
            java.lang.String r17 = "()V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r0 = "acquire wakelock"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
        L_0x0362:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryVideoHandler.mo135824A(com.tencent.mm.storage.f4, int):void");
    }

    /* renamed from: B */
    public void mo135825B(C72963f4 f4Var, int i) {
        Log.m105924i("MicroMsg.Imagegallery.handler.video", "toggleVideoMenu pos ");
        C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(f4Var.mo108765s2());
        if (Zd != null && !Zd.mo137710n()) {
            mo135832I(mo135877h(i));
            this.f284638d.f284714g.mo135741R8(true);
            if (this.f284584q) {
                this.f284582o.mo136043m();
                this.f284582o.mo136040j();
            }
            mo135828E(f4Var, Zd);
            if (this.f284638d.f284714g.mo135773i8(f4Var.getMsgId()) == 2) {
                C86709a0.m107525e().postToWorker(new C97124s0(this, f4Var.mo108765s2(), 8));
                return;
            }
            C86709a0.m107525e().postToWorker(new C97124s0(this, f4Var.mo108765s2(), 5));
        }
    }

    /* renamed from: C */
    public final void mo135826C() {
        ImageGalleryUI imageGalleryUI;
        C97056h hVar = this.f284638d;
        if (hVar != null && (imageGalleryUI = hVar.f284714g) != null && imageGalleryUI.getWindow() != null) {
            this.f284638d.f284714g.getWindow().clearFlags(128);
        }
    }

    /* renamed from: D */
    public final void mo135827D() {
        Log.m105924i("MicroMsg.Imagegallery.handler.video", "clear timer");
        this.f284570H.stopTimer();
        this.f284571I.stopTimer();
    }

    /* renamed from: E */
    public final void mo135828E(C72963f4 f4Var, C98408n0 n0Var) {
        if (C114786m0.m161568a(this.f284638d.f284714g.getContext()) || f284562R) {
            mo135839P(f4Var, n0Var);
            return;
        }
        f284562R = true;
        mo135839P(f4Var, n0Var);
    }

    /* renamed from: F */
    public final boolean mo135829F(ImageGalleryVideoHandler$$k imageGalleryVideoHandler$$k) {
        if (imageGalleryVideoHandler$$k == null) {
            return false;
        }
        ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137731u(this);
        int f8 = this.f284638d.f284714g.mo135768f8();
        int i = imageGalleryVideoHandler$$k.f284607b;
        if (f8 == i) {
            C97087m1 h = mo135877h(i);
            if (h != null) {
                h.mo135970f();
                h.f284858y.setVisibility(8);
                h.mo135970f();
                h.f284850q.setVisibility(8);
                h.mo135970f();
                h.f284848o.setVisibility(8);
            }
            this.f284574L = true;
            this.f284638d.f284714g.mo135753X8(false);
            return true;
        }
        this.f284638d.f284720p.mo135878i(i);
        return false;
    }

    /* renamed from: G */
    public final void mo135830G() {
        ImageGalleryUI imageGalleryUI;
        int i;
        if (this.f284575M > 0) {
            this.f284576N = (int) (((long) this.f284576N) + ((Util.nowMilliSecond() - this.f284575M) / 1000));
        }
        Log.m105925i("MicroMsg.Imagegallery.handler.video", "notePauseVideo filename %s playVideoDuration %d ", this.f284593z, Integer.valueOf(this.f284576N));
        this.f284575M = 0;
        C97056h hVar = this.f284638d;
        if (hVar != null && (imageGalleryUI = hVar.f284714g) != null) {
            C97123s sVar = imageGalleryUI.f284478w;
            C72963f4 w = hVar.mo135935w();
            sVar.getClass();
            if (w != null && w.mo100983V3() && (i = sVar.f119454i) != 4) {
                if (i != 3) {
                    sVar.mo136024c(w, 8);
                }
                sVar.f119454i = 3;
            }
        }
    }

    /* renamed from: H */
    public final void mo135831H() {
        ImageGalleryUI imageGalleryUI;
        long nowMilliSecond = Util.nowMilliSecond();
        this.f284575M = nowMilliSecond;
        Log.m105919d("MicroMsg.Imagegallery.handler.video", "notePlayVideo filename %s notePlayVideo %d ", this.f284593z, Long.valueOf(nowMilliSecond));
        C97056h hVar = this.f284638d;
        if (hVar != null && (imageGalleryUI = hVar.f284714g) != null) {
            C97123s sVar = imageGalleryUI.f284478w;
            C72963f4 w = hVar.mo135935w();
            sVar.getClass();
            if (w != null && w.mo100983V3() && sVar.f119454i != 2) {
                sVar.mo136024c(w, sVar.mo68720a());
                sVar.f119454i = 2;
            }
        }
    }

    /* renamed from: I */
    public final void mo135832I(C97087m1 m1Var) {
        if (m1Var != null) {
            mo135835L();
            mo135827D();
            Log.m105918d("MicroMsg.Imagegallery.handler.video", "pause video.");
            m1Var.mo135970f();
            if (m1Var.f284849p.isPlaying()) {
                m1Var.mo135970f();
                m1Var.f284849p.pause();
                mo135830G();
            }
        }
    }

    /* renamed from: I2 */
    public void mo23179I2() {
    }

    /* renamed from: J */
    public void mo135833J() {
        C97087m1 v = this.f284638d.mo135934v();
        if (v != null) {
            Log.m105924i("MicroMsg.Imagegallery.handler.video", "start to pause");
            this.f284638d.f284714g.mo135741R8(true);
            v.mo135970f();
            v.f284858y.setVisibility(0);
            v.mo135970f();
            v.f284849p.pause();
            mo135830G();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c3, code lost:
        if (r9 != false) goto L_0x00d6;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo135834K(com.tencent.p014mm.storage.C72963f4 r18, hd0.C98408n0 r19, int r20, boolean r21) {
        /*
            r17 = this;
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.Class<rz.s> r5 = p682rz.C101488s.class
            java.lang.String r0 = "/"
            if (r18 == 0) goto L_0x031d
            if (r2 != 0) goto L_0x0012
            goto L_0x031d
        L_0x0012:
            boolean r6 = r18.mo100983V3()
            r7 = 2131838363(0x7f11459b, float:1.9309947E38)
            r8 = 0
            if (r6 != 0) goto L_0x002e
            boolean r6 = r18.mo100972K3()
            if (r6 == 0) goto L_0x002e
            com.tencent.mm.ui.chatting.gallery.h r0 = r1.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284714g
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (int) r7, (int) r8)
            r0.show()
            return
        L_0x002e:
            int r6 = r2.f288576w
            r9 = -1
            r10 = 2
            java.lang.String r11 = "MicroMsg.Imagegallery.handler.video"
            r12 = 1
            if (r6 != r9) goto L_0x0057
            java.lang.String r0 = r19.mo137702f()
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r6 != 0) goto L_0x00d6
            di3.d r0 = di3.C86312j.m106911c(r5)
            rz.s r0 = (p682rz.C101488s) r0
            rz.t r0 = r0.Kj0()
            java.lang.String r6 = r18.mo108765s2()
            hd0.o0 r0 = (hd0.C98410o0) r0
            java.lang.String r0 = r0.mo137728q(r6)
            goto L_0x00d6
        L_0x0057:
            di3.d r6 = di3.C86312j.m106911c(r5)
            rz.s r6 = (p682rz.C101488s) r6
            rz.t r6 = r6.Kj0()
            java.lang.String r9 = r18.mo108765s2()
            hd0.o0 r6 = (hd0.C98410o0) r6
            java.lang.String r6 = r6.mo137728q(r9)
            int r9 = r18.mo108769t2()
            if (r9 != r12) goto L_0x00d5
            te3.gu2 r9 = r2.f288538F
            if (r9 == 0) goto L_0x00d5
            boolean r9 = r9.f298309e
            if (r9 == 0) goto L_0x00d5
            java.lang.String r9 = com.tencent.p014mm.vfs.C86013q1.m106458s(r6)     // Catch:{ Exception -> 0x00c6 }
            boolean r13 = r9.endsWith(r0)     // Catch:{ Exception -> 0x00c6 }
            if (r13 != 0) goto L_0x0092
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c6 }
            r13.<init>()     // Catch:{ Exception -> 0x00c6 }
            r13.append(r9)     // Catch:{ Exception -> 0x00c6 }
            r13.append(r0)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r9 = r13.toString()     // Catch:{ Exception -> 0x00c6 }
        L_0x0092:
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106457r(r6)     // Catch:{ Exception -> 0x00c6 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c6 }
            r13.<init>()     // Catch:{ Exception -> 0x00c6 }
            r13.append(r9)     // Catch:{ Exception -> 0x00c6 }
            r13.append(r0)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = "_hd"
            r13.append(r0)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = ".mp4"
            r13.append(r0)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x00c6 }
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r13 = "local capture video, hdFilePath: %s, exist: %s"
            java.lang.Object[] r14 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x00c6 }
            r14[r8] = r0     // Catch:{ Exception -> 0x00c6 }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x00c6 }
            r14[r12] = r15     // Catch:{ Exception -> 0x00c6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r13, r14)     // Catch:{ Exception -> 0x00c6 }
            if (r9 == 0) goto L_0x00d5
            goto L_0x00d6
        L_0x00c6:
            r0 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r12]
            java.lang.String r0 = r0.getMessage()
            r9[r8] = r0
            java.lang.String r0 = "try to get hd filePath error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r9)
        L_0x00d5:
            r0 = r6
        L_0x00d6:
            if (r0 == 0) goto L_0x0312
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r6 != 0) goto L_0x00e0
            goto L_0x0312
        L_0x00e0:
            com.tencent.mm.ui.chatting.gallery.m1 r6 = r1.mo135877h(r3)
            if (r6 != 0) goto L_0x00e7
            return
        L_0x00e7:
            java.lang.String r7 = r19.mo137707k()
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85820U5(r7)
            if (r7 == 0) goto L_0x0102
            java.lang.Class<wo.b> r7 = p740wo.C53193b.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            wo.b r7 = (p740wo.C53193b) r7
            java.lang.String r9 = r19.mo137707k()
            int r7 = r7.mo73729p1(r9)
            goto L_0x0103
        L_0x0102:
            r7 = 0
        L_0x0103:
            boolean r9 = hd0.C98403m0.m127703c(r0)
            com.tencent.mm.ui.chatting.gallery.h r13 = r1.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r13 = r13.f284714g
            long r14 = r18.getMsgId()
            int r13 = r13.mo135773i8(r14)
            r14 = 4
            java.lang.Object[] r15 = new java.lang.Object[r14]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r20)
            r15[r8] = r16
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r21)
            r15[r12] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r13)
            r15[r10] = r16
            boolean r14 = r1.f284566D
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r10 = 3
            r15[r10] = r14
            java.lang.String r14 = "play video pos[%d], isOnlinePlay[%b] opcode[%d] resetByCompletion[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r14, r15)
            if (r9 != 0) goto L_0x0292
            gj.m r14 = p156gj.C107835h0.f322856m
            int r14 = r14.f322916w
            if (r14 != r12) goto L_0x0162
            java.lang.String r14 = r19.mo137700d()
            com.tencent.mm.ui.chatting.gallery.h r15 = r1.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r15 = r15.f284714g
            androidx.appcompat.app.AppCompatActivity r15 = r15.getContext()
            di3.d r5 = di3.C86312j.m106911c(r5)
            rz.s r5 = (p682rz.C101488s) r5
            rz.t r5 = r5.Kj0()
            hd0.o0 r5 = (hd0.C98410o0) r5
            java.lang.String r5 = r5.mo137728q(r14)
            boolean r5 = td3.C13875a.m13189a(r5, r15, r9)
            if (r5 == 0) goto L_0x0162
            return
        L_0x0162:
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r5 = r5.mo105906u()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            java.lang.Object r5 = r5.mo119685f(r9, r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 != r12) goto L_0x0194
            android.widget.TextView r5 = r6.f284851r
            if (r5 == 0) goto L_0x0194
            r5.setVisibility(r8)
            android.widget.TextView r5 = r6.f284851r
            java.lang.Class<dy.f> r9 = p500dy.C97560f.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            dy.f r9 = (p500dy.C97560f) r9
            java.lang.String r9 = r9.mo136825un(r0)
            r5.setText(r9)
        L_0x0194:
            int r5 = r2.f288566m
            int r9 = r2.f288559f
            java.lang.String r14 = r19.mo137707k()
            java.lang.String r15 = r19.mo137705i()
            java.lang.String r15 = hd0.C98408n0.m127710c(r15)
            long r10 = r2.f288563j
            r6.f284828K = r5
            r6.f284829L = r9
            r6.f284830M = r7
            r6.f284831N = r14
            r6.f284833P = r15
            r6.f284832O = r10
            r1.f284584q = r4
            r1.f284585r = r12
            java.lang.String r5 = r19.mo137700d()
            r1.f284593z = r5
            r5 = 3
            if (r13 != r5) goto L_0x01c8
            r6.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r5 = r6.f284849p
            r5.setMute(r12)
            goto L_0x01d0
        L_0x01c8:
            r6.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r5 = r6.f284849p
            r5.setMute(r8)
        L_0x01d0:
            r6.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r5 = r6.f284849p
            java.lang.String r5 = r5.getVideoPath()
            if (r5 == 0) goto L_0x0222
            r6.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r5 = r6.f284849p
            java.lang.String r5 = r5.getVideoPath()
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0222
            r6.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r5 = r6.f284849p
            boolean r5 = r5.isPlaying()
            if (r5 != 0) goto L_0x0222
            boolean r5 = r1.f284566D
            if (r5 != 0) goto L_0x0222
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.mo135973i(r12, r0)
            r6.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r0 = r6.f284849p
            r0.start()
            r17.mo135831H()
            if (r4 != 0) goto L_0x0210
            java.lang.String r0 = r1.f284593z
            r1.mo135838O(r0)
        L_0x0210:
            r6.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r0 = r6.f284849p
            int r0 = r0.getCurrentPosition()
            int r0 = r0 / 1000
            r1.mo135841R(r0)
            r1.mo135840Q(r8)
            goto L_0x026f
        L_0x0222:
            r1.f284587t = r8
            r1.f284566D = r8
            r6.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r5 = r6.f284849p
            r5.setVideoPath(r0)
            r6.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r0 = r6.f284849p
            boolean r0 = r0 instanceof com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView
            if (r0 == 0) goto L_0x026b
            r6.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r0 = r6.f284849p
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r0 = (com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView) r0
            s62.b r5 = r1.f284578Q
            r0.setIOnlineCache(r5)
            r6.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r0 = r6.f284849p
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r0 = (com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView) r0
            boolean r5 = r1.f284584q
            if (r5 != 0) goto L_0x0250
            r5 = 0
            goto L_0x025e
        L_0x0250:
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r5 = r5.mo105906u()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN
            boolean r5 = r5.mo119686g(r7, r8)
        L_0x025e:
            r0.setNeedResetExtractor(r5)
            r6.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r0 = r6.f284849p
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r0 = (com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView) r0
            r0.setIsOnlineVideoType(r4)
        L_0x026b:
            r0 = 0
            r6.mo135973i(r12, r0)
        L_0x026f:
            android.util.SparseArray<hd0.n0> r0 = r1.f284581n
            r0.put(r3, r2)
            com.tencent.mm.ui.chatting.gallery.h r0 = r1.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284714g
            r0.mo135741R8(r8)
            com.tencent.mm.ui.chatting.gallery.h r0 = r1.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284714g
            androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
            android.view.Window r0 = r0.getWindow()
            r2 = 128(0x80, float:1.794E-43)
            r0.addFlags(r2)
            eb0.e r0 = r1.f284583p
            r0.mo136891c(r1)
            goto L_0x0307
        L_0x0292:
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 12084(0x2f34, float:1.6933E-41)
            r5 = 8
            java.lang.Object[] r10 = new java.lang.Object[r5]
            int r5 = r2.f288559f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r10[r8] = r5
            int r5 = r2.f288566m
            int r5 = r5 * 1000
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r10[r12] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r11 = 2
            r10[r11] = r5
            r5 = 3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            r10[r5] = r11
            java.lang.String r5 = r19.mo137707k()
            r11 = 4
            r10[r11] = r5
            r5 = 5
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10[r5] = r7
            r5 = 6
            java.lang.String r7 = r19.mo137705i()
            java.lang.String r7 = hd0.C98408n0.m127710c(r7)
            r10[r5] = r7
            r5 = 7
            long r11 = r2.f288563j
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r10[r5] = r2
            r3.mo160131h(r4, r10)
            com.tencent.mm.ui.chatting.gallery.h r2 = r1.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r2 = r2.f284714g
            androidx.appcompat.app.AppCompatActivity r2 = r2.getContext()
            boolean r0 = td3.C13875a.m13189a(r0, r2, r9)
            if (r0 != 0) goto L_0x0307
            com.tencent.mm.ui.chatting.gallery.h r0 = r1.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284714g
            androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
            com.tencent.mm.ui.chatting.gallery.h r2 = r1.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r2 = r2.f284714g
            r3 = 2131838392(0x7f1145b8, float:1.9310006E38)
            java.lang.String r2 = r2.getString(r3)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r8)
            r0.show()
        L_0x0307:
            r6.mo135970f()
            com.tencent.mm.ui.widget.MMPinProgressBtn r0 = r6.f284850q
            r2 = 8
            r0.setVisibility(r2)
            return
        L_0x0312:
            com.tencent.mm.ui.chatting.gallery.h r0 = r1.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284714g
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (int) r7, (int) r8)
            r0.show()
        L_0x031d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryVideoHandler.mo135834K(com.tencent.mm.storage.f4, hd0.n0, int, boolean):void");
    }

    /* renamed from: L */
    public final void mo135835L() {
        PowerManager.WakeLock wakeLock = this.f284567E;
        if (wakeLock != null && wakeLock.isHeld()) {
            Log.m105924i("MicroMsg.Imagegallery.handler.video", "release waklock");
            PowerManager.WakeLock wakeLock2 = this.f284567E;
            PowerManager.WakeLock wakeLock3 = wakeLock2;
            C117292a.m165357c(wakeLock3, "com/tencent/mm/ui/chatting/gallery/ImageGalleryVideoHandler", "releaseWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock2.release();
            C117292a.m165359e(wakeLock3, "com/tencent/mm/ui/chatting/gallery/ImageGalleryVideoHandler", "releaseWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }

    /* renamed from: M */
    public boolean mo135836M() {
        C97087m1 v = this.f284638d.mo135934v();
        if (v == null) {
            return false;
        }
        boolean z = true;
        v.mo135970f();
        if (!v.f284849p.isPlaying()) {
            Log.m105924i("MicroMsg.Imagegallery.handler.video", "start to play");
            this.f284638d.f284714g.mo135741R8(false);
            v.mo135970f();
            v.f284858y.setVisibility(8);
            v.mo135970f();
            z = v.f284849p.start();
            mo135831H();
        }
        v.mo135970f();
        if (v.f284858y.getVisibility() != 8) {
            v.mo135970f();
            v.f284858y.setVisibility(8);
        }
        return z;
    }

    /* renamed from: N */
    public void mo135837N(int i, boolean z) {
        C97087m1 v = this.f284638d.mo135934v();
        if (v != null) {
            mo135831H();
            v.mo135970f();
            v.f284858y.setVisibility(8);
            v.mo135970f();
            v.f284849p.mo24787a((double) (i * 1000), z);
            this.f284638d.f284714g.mo135741R8(false);
            mo135840Q(false);
        }
    }

    /* renamed from: N3 */
    public void mo23180N3() {
    }

    /* renamed from: O */
    public void mo135838O(String str) {
        if (!this.f284574L && !mo135829F(this.f284579i.get(str))) {
            Log.m105928w("MicroMsg.Imagegallery.handler.video", "show tool bar error.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x01f8  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo135839P(com.tencent.p014mm.storage.C72963f4 r30, hd0.C98408n0 r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            java.lang.Class<rz.r> r3 = p682rz.C101487r.class
            java.lang.Class<rz.s> r4 = p682rz.C101488s.class
            java.lang.Class<rz.u> r5 = p682rz.C101491u.class
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            int r8 = r29.hashCode()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 0
            r7[r9] = r8
            java.lang.String r8 = "MicroMsg.Imagegallery.handler.video"
            java.lang.String r10 = "startDownloading [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r7)
            if (r1 == 0) goto L_0x0316
            if (r2 != 0) goto L_0x0028
            goto L_0x0316
        L_0x0028:
            com.tencent.mm.ui.chatting.gallery.h r7 = r0.f284638d
            com.tencent.mm.ui.chatting.gallery.m1 r7 = r7.mo135934v()
            if (r7 != 0) goto L_0x0031
            return
        L_0x0031:
            java.lang.Class<fy.j> r10 = p154fy.C87121j.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            fy.j r10 = (p154fy.C87121j) r10
            r10.j90(r1)
            com.tencent.mm.ui.chatting.gallery.h r10 = r0.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r10 = r10.f284714g
            long r11 = r30.getMsgId()
            int r10 = r10.mo135773i8(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "enterVideoOpCode : "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r11)
            r11 = 4
            r12 = 2
            r13 = 8
            r14 = 3
            if (r10 == 0) goto L_0x0120
            if (r10 == r6) goto L_0x0093
            if (r10 == r12) goto L_0x0093
            if (r10 == r14) goto L_0x007a
            if (r10 == r11) goto L_0x0093
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r1[r9] = r2
            java.lang.String r2 = "enterVideoOpCode[%d] is error"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r2, r1)
            goto L_0x0316
        L_0x007a:
            java.lang.Object[] r15 = new java.lang.Object[r12]
            int r16 = r29.hashCode()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            r15[r9] = r16
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r15[r6] = r10
            java.lang.String r10 = "%d mute play video [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r15)
            goto L_0x0120
        L_0x0093:
            boolean r3 = r31.mo137711o()
            if (r3 == 0) goto L_0x00ad
            java.lang.String r3 = "start complete online video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            di3.d r3 = di3.C86312j.m106911c(r5)
            rz.u r3 = (p682rz.C101491u) r3
            java.lang.String r1 = r30.mo108765s2()
            r3.mo140797FT(r1)
            goto L_0x00d2
        L_0x00ad:
            java.lang.String r3 = "start complete offline video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            java.lang.String r3 = r30.mo108765s2()
            r6 = 10
            com.tencent.mm.sdk.platformtools.MMHandlerThread r8 = f40.C86709a0.m107525e()
            com.tencent.mm.ui.chatting.gallery.s0 r11 = new com.tencent.mm.ui.chatting.gallery.s0
            r11.<init>(r0, r3, r6)
            r8.postToWorker(r11)
            di3.d r3 = di3.C86312j.m106911c(r5)
            rz.u r3 = (p682rz.C101491u) r3
            java.lang.String r1 = r30.mo108765s2()
            r3.M00(r1)
        L_0x00d2:
            di3.d r1 = di3.C86312j.m106911c(r4)
            rz.s r1 = (p682rz.C101488s) r1
            rz.t r1 = r1.Kj0()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            hd0.o0 r1 = (hd0.C98410o0) r1
            r1.mo137716b(r0, r3)
            r7.mo135970f()
            android.widget.ImageView r1 = r7.f284848o
            r1.setVisibility(r13)
            r7.mo135970f()
            com.tencent.mm.ui.widget.MMPinProgressBtn r1 = r7.f284850q
            r1.setVisibility(r9)
            r7.mo135970f()
            com.tencent.mm.ui.widget.MMPinProgressBtn r1 = r7.f284850q
            int r2 = hd0.C98429r0.m127817h(r31)
            r1.setProgress(r2)
            if (r10 != r12) goto L_0x0112
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r14 = 354(0x162, double:1.75E-321)
            r16 = 14
            r18 = 1
            r20 = 0
            r13.idkeyStat(r14, r16, r18, r20)
            goto L_0x0316
        L_0x0112:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 354(0x162, double:1.75E-321)
            r4 = 11
            r6 = 1
            r8 = 0
            r1.idkeyStat(r2, r4, r6, r8)
            goto L_0x0316
        L_0x0120:
            com.tencent.mm.ui.chatting.gallery.t1 r10 = r0.f284582o
            java.lang.String r15 = r30.mo108765s2()
            r10.getClass()
            boolean r16 = hd0.C98429r0.m127810a()
            java.lang.String r13 = "download online video.[%s, %s] start time[%d]"
            java.lang.String r11 = "MicroMsg.OnlineVideoUIHelper"
            if (r16 != 0) goto L_0x0137
        L_0x0133:
            r9 = r13
            r10 = 0
            goto L_0x01f6
        L_0x0137:
            r10.mo136040j()
            di3.d r16 = di3.C86312j.m106911c(r5)
            r14 = r16
            rz.u r14 = (p682rz.C101491u) r14
            hd0.n0 r14 = r14.mo140806Zd(r15)
            if (r14 == 0) goto L_0x0184
            int r6 = r14.f288559f
            com.tencent.mm.ui.chatting.gallery.t1$b r9 = r10.f285017w
            int r9 = r9.f285022d
            if (r6 >= r9) goto L_0x0184
            java.lang.Object[] r9 = new java.lang.Object[r12]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r15 = 0
            r9[r15] = r6
            com.tencent.mm.ui.chatting.gallery.t1$b r6 = r10.f285017w
            int r6 = r6.f285022d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10 = 1
            r9[r10] = r6
            java.lang.String r6 = "video size[%d] less than config size[%d], do not stream video"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r6, r9)
            di3.d r6 = di3.C86312j.m106911c(r5)
            rz.u r6 = (p682rz.C101491u) r6
            r9 = 9
            r6.mo140799IH(r14, r9)
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 354(0x162, double:1.75E-321)
            r24 = 17
            r26 = 1
            r28 = 0
            r21.idkeyStat(r22, r24, r26, r28)
            r9 = 1
            goto L_0x01a3
        L_0x0184:
            di3.d r6 = di3.C86312j.m106911c(r5)
            rz.u r6 = (p682rz.C101491u) r6
            r9 = 1
            r6.Tk0(r15, r9)
            hd0.C98394e0.vx0()
            di3.d r6 = di3.C86312j.m106911c(r3)
            rz.r r6 = (p682rz.C101487r) r6
            rz.n r6 = r6.mo140795W6()
            com.tencent.mm.modelcdntran.e0 r6 = (com.tencent.p014mm.modelcdntran.C92755e0) r6
            gi.h r6 = r6.mo126986j(r15, r9)
            if (r6 != 0) goto L_0x01a4
        L_0x01a3:
            goto L_0x0133
        L_0x01a4:
            java.lang.String r14 = r6.field_mediaId
            r10.f285000f = r14
            int r14 = r6.f287687U
            r10.f285001g = r14
            r10.f284999e = r15
            r10.f284995a = r9
            r9 = 0
            r10.f285003i = r9
            hd0.z0 r9 = hd0.C98398h0.Dx0()
            boolean r9 = r9.mo137786c()
            di3.d r14 = di3.C86312j.m106911c(r3)
            rz.r r14 = (p682rz.C101487r) r14
            rz.n r14 = r14.mo140795W6()
            com.tencent.mm.modelcdntran.e0 r14 = (com.tencent.p014mm.modelcdntran.C92755e0) r14
            r14.mo126981e(r6, r9)
            r9 = r13
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r10.f285010p = r12
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 354(0x162, double:1.75E-321)
            r24 = 1
            r26 = 1
            r28 = 0
            r21.idkeyStat(r22, r24, r26, r28)
            r12 = 3
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.String r12 = r10.f285000f
            r14 = 0
            r13[r14] = r12
            r12 = 1
            r13[r12] = r15
            long r14 = r10.f285010p
            java.lang.Long r10 = java.lang.Long.valueOf(r14)
            r6 = 2
            r13[r6] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r9, r13)
            r10 = 1
        L_0x01f6:
            if (r10 != 0) goto L_0x02e3
            com.tencent.mm.ui.chatting.gallery.t1 r10 = r0.f284582o
            r10.getClass()
            boolean r12 = r30.mo100983V3()
            if (r12 == 0) goto L_0x0296
            gi.h r12 = new gi.h
            r12.<init>()
            java.lang.String r13 = "task_OnlineVideoUIHelper"
            r12.f287660d = r13
            long r13 = r2.f288563j
            java.lang.String r15 = r31.mo137707k()
            java.lang.String r6 = r31.mo137700d()
            java.lang.String r1 = "downvideo"
            java.lang.String r1 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r1, r13, r15, r6)
            r12.field_mediaId = r1
            te3.tc4 r1 = r2.f288535C
            java.lang.String r1 = r1.f299537d
            r12.f287705p0 = r1
            r1 = 1
            r12.f287689V = r1
            r1 = 7
            r12.f287655L = r1
            r1 = 4
            r12.f287696Y0 = r1
            java.lang.String r1 = r31.mo137700d()
            r12.f287683S = r1
            di3.d r1 = di3.C86312j.m106911c(r4)
            rz.s r1 = (p682rz.C101488s) r1
            rz.t r1 = r1.Kj0()
            java.lang.String r6 = r31.mo137700d()
            hd0.o0 r1 = (hd0.C98410o0) r1
            java.lang.String r1 = r1.mo137728q(r6)
            r12.field_fullpath = r1
            int r1 = r2.f288559f
            r12.f287687U = r1
            java.lang.String r6 = r12.field_mediaId
            r10.f285000f = r6
            r10.f285001g = r1
            java.lang.String r1 = r31.mo137700d()
            r10.f284999e = r1
            r1 = 1
            r10.f284995a = r1
            r1 = 0
            r10.f285003i = r1
            hd0.z0 r1 = hd0.C98398h0.Dx0()
            boolean r1 = r1.mo137786c()
            di3.d r3 = di3.C86312j.m106911c(r3)
            rz.r r3 = (p682rz.C101487r) r3
            rz.n r3 = r3.mo140795W6()
            com.tencent.mm.modelcdntran.e0 r3 = (com.tencent.p014mm.modelcdntran.C92755e0) r3
            r3.mo126981e(r12, r1)
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r10.f285010p = r12
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r10.f285000f
            r6 = 0
            r1[r6] = r3
            java.lang.String r3 = r10.f284999e
            r6 = 1
            r1[r6] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            r6 = 2
            r1[r6] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r9, r1)
            r1 = 1
            goto L_0x0297
        L_0x0296:
            r1 = 0
        L_0x0297:
            if (r1 == 0) goto L_0x029a
            goto L_0x02e3
        L_0x029a:
            java.lang.String r1 = "start offline play video."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            r1 = 0
            r0.f284584q = r1
            di3.d r1 = di3.C86312j.m106911c(r4)
            rz.s r1 = (p682rz.C101488s) r1
            rz.t r1 = r1.Kj0()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            hd0.o0 r1 = (hd0.C98410o0) r1
            r1.mo137716b(r0, r3)
            di3.d r1 = di3.C86312j.m106911c(r5)
            rz.u r1 = (p682rz.C101491u) r1
            java.lang.String r3 = r30.mo108765s2()
            r1.M00(r3)
            r7.mo135970f()
            android.widget.ImageView r1 = r7.f284848o
            r3 = 8
            r1.setVisibility(r3)
            r7.mo135970f()
            com.tencent.mm.ui.widget.MMPinProgressBtn r1 = r7.f284850q
            r3 = 0
            r1.setVisibility(r3)
            r7.mo135970f()
            com.tencent.mm.ui.widget.MMPinProgressBtn r1 = r7.f284850q
            int r2 = hd0.C98429r0.m127817h(r31)
            r1.setProgress(r2)
            goto L_0x0316
        L_0x02e3:
            java.lang.String r1 = "start online play video."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            r1 = 1
            r0.f284584q = r1
            di3.d r1 = di3.C86312j.m106911c(r4)
            rz.s r1 = (p682rz.C101488s) r1
            rz.t r1 = r1.Kj0()
            hd0.o0 r1 = (hd0.C98410o0) r1
            r1.mo137731u(r0)
            r7.mo135970f()
            android.widget.ImageView r1 = r7.f284848o
            r2 = 8
            r1.setVisibility(r2)
            r7.mo135970f()
            com.tencent.mm.ui.widget.MMPinProgressBtn r1 = r7.f284850q
            r1.setVisibility(r2)
            r7.mo135970f()
            android.widget.ProgressBar r1 = r7.f284858y
            r2 = 0
            r1.setVisibility(r2)
        L_0x0316:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryVideoHandler.mo135839P(com.tencent.mm.storage.f4, hd0.n0):void");
    }

    /* renamed from: Q */
    public void mo135840Q(boolean z) {
        if (this.f284586s) {
            return;
        }
        if (!this.f284584q) {
            this.f284571I.startTimer(500);
        } else if (z) {
            MMHandlerThread.postToMainThread(new ImageGalleryVideoHandler$$h(this));
        } else {
            this.f284570H.startTimer(500);
        }
    }

    /* renamed from: R */
    public void mo135841R(int i) {
        int max = Math.max(0, i);
        ImageGalleryUI imageGalleryUI = this.f284638d.f284714g;
        imageGalleryUI.mo135781o8();
        imageGalleryUI.f284400U0.seek(max);
        C97132t1 t1Var = this.f284582o;
        if (t1Var != null && ((long) t1Var.f285006l) > 0) {
            ImageGalleryUI imageGalleryUI2 = this.f284638d.f284714g;
            imageGalleryUI2.mo135781o8();
            imageGalleryUI2.f284400U0.mo135174v((int) ((long) this.f284582o.f285006l));
        }
    }

    /* renamed from: R0 */
    public void mo23181R0() {
    }

    /* renamed from: d5 */
    public void mo102579d5(C101489t.C77595a.C77596a aVar) {
        HashMap<String, ImageGalleryVideoHandler$$k> hashMap;
        ImageGalleryVideoHandler$$k imageGalleryVideoHandler$$k;
        C72963f4 f4Var;
        C98408n0 o;
        C72963f4 f4Var2;
        String str = aVar.f226215a;
        if (!Util.isNullOrNil(str) && (hashMap = this.f284579i) != null && (imageGalleryVideoHandler$$k = hashMap.get(str)) != null && (f4Var = imageGalleryVideoHandler$$k.f284606a) != null && f4Var.mo108765s2() != null && f4Var.mo108765s2().equals(str) && (o = C97052g.m124927o(f4Var)) != null) {
            if ((f4Var.mo100983V3() || !f4Var.mo100972K3()) && o.f288562i != 198) {
                int h = C98429r0.m127817h(o);
                C97087m1 h2 = mo135877h(imageGalleryVideoHandler$$k.f284607b);
                if (this.f284638d.f284714g.mo135768f8() == imageGalleryVideoHandler$$k.f284607b && h2 != null) {
                    h2.mo135970f();
                    h2.f284850q.setVisibility(0);
                    h2.mo135970f();
                    h2.f284850q.setProgress(h);
                } else if (h2 == null) {
                    return;
                }
                h2.mo135970f();
                if (h >= h2.f284850q.getMax()) {
                    Log.m105919d("MicroMsg.Imagegallery.handler.video", "onNotifyChange, status:%d", Integer.valueOf(o.f288562i));
                    int i = o.f288562i;
                    if ((i == 199 || i == 199) && mo135829F(imageGalleryVideoHandler$$k)) {
                        int i8 = this.f284638d.f284714g.mo135773i8(f4Var.getMsgId());
                        if (i8 != 0) {
                            if (i8 == 1) {
                                Log.m105918d("MicroMsg.Imagegallery.handler.video", "do restransmit video");
                                C115669n.INSTANCE.idkeyStat(354, 15, 1, false);
                                this.f284638d.mo135929p(f4Var);
                                this.f284638d.f284714g.mo135733N8(-1);
                                if (this.f284584q) {
                                    C98429r0.m127832w(this.f284593z, this.f284638d.mo135934v().f284849p.getCurrentPosition(), this.f284584q);
                                    this.f284566D = true;
                                }
                                this.f284584q = false;
                                return;
                            } else if (i8 == 2) {
                                C115669n.INSTANCE.idkeyStat(354, 16, 1, false);
                                ImageGalleryUI imageGalleryUI = this.f284638d.f284714g;
                                if (imageGalleryUI != null) {
                                    ((C98250h) C86312j.m106911c(C98250h.class)).Rj0(imageGalleryUI, new C97071i(imageGalleryUI, f4Var, true), new C97074j(true, imageGalleryUI));
                                }
                                this.f284638d.f284714g.mo135733N8(-1);
                                if (this.f284584q) {
                                    C98429r0.m127832w(this.f284593z, this.f284638d.mo135934v().f284849p.getCurrentPosition(), this.f284584q);
                                    this.f284566D = true;
                                }
                                this.f284584q = false;
                                return;
                            } else if (i8 != 3) {
                                if (i8 != 4) {
                                    Log.m105929w("MicroMsg.Imagegallery.handler.video", "enterVideoOpCode[%d] is error", Integer.valueOf(i8));
                                    return;
                                }
                                this.f284638d.f284714g.mo135733N8(-1);
                                ImageGalleryUI imageGalleryUI2 = this.f284638d.f284714g;
                                imageGalleryUI2.getClass();
                                Log.m105924i("MicroMsg.ImageGalleryUI", "launchAppBrandIfNeed");
                                ImageGalleryUI$$y0 imageGalleryUI$$y0 = imageGalleryUI2.f284477v2;
                                if (imageGalleryUI$$y0 != null) {
                                    Log.m105924i("MicroMsg.ImageGalleryUI", "executePendingLaunchAppBrandTaskIfNeed");
                                    ImageGalleryUI imageGalleryUI3 = imageGalleryUI$$y0.f284558b.get();
                                    if (imageGalleryUI3 == null) {
                                        Log.m105924i("MicroMsg.ImageGalleryUI", "executePendingLaunchAppBrandTaskIfNeed, ui is null");
                                        return;
                                    }
                                    if (!(imageGalleryUI$$y0.f284559c == null || (f4Var2 = imageGalleryUI$$y0.f284560d) == null || !f4Var2.equals(imageGalleryUI3.f284432g.mo135935w()))) {
                                        Log.m105924i("MicroMsg.ImageGalleryUI", "executePendingLaunchAppBrandTask");
                                        Runnable runnable = imageGalleryUI$$y0.f284559c;
                                        if (Looper.getMainLooper() == Looper.myLooper()) {
                                            runnable.run();
                                        } else {
                                            ((C119157j) C119157j.f356862d).mo183895z(runnable);
                                        }
                                    }
                                    imageGalleryUI$$y0.f284559c = null;
                                    imageGalleryUI$$y0.f284560d = null;
                                    return;
                                }
                                return;
                            }
                        }
                        mo135834K(f4Var, o, this.f284638d.f284714g.mo135768f8(), false);
                    }
                }
            } else if (mo135829F(imageGalleryVideoHandler$$k)) {
                C76701a.makeText((Context) this.f284638d.f284714g, (int) C0966R.string.kab, 0).show();
            }
        }
    }

    /* renamed from: f2 */
    public void mo23185f2() {
    }

    /* renamed from: g */
    public boolean mo135842g(C97087m1 m1Var, C72963f4 f4Var, int i) {
        C97052g.m124928p(f4Var);
        if (f4Var == null) {
            Log.m105920e("MicroMsg.Imagegallery.handler.video", "msg is null!!");
            return false;
        }
        HashMap<String, ImageGalleryVideoHandler$$k> hashMap = this.f284579i;
        if (hashMap != null) {
            hashMap.put(f4Var.mo108765s2(), new ImageGalleryVideoHandler$$k(f4Var, i));
        } else {
            Log.m105920e("MicroMsg.Imagegallery.handler.video", "mCacheMap is null!");
        }
        if (f4Var.mo100983V3()) {
            C48300n n = C97052g.m124926n(f4Var);
            if (n != null) {
                String b = C14050a.m13405b(n.f133370h);
                C20828a b2 = C20828a.m22825b();
                String str = n.f133370h;
                m1Var.mo135970f();
                ImageView imageView = m1Var.f284847n;
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59350f = b;
                bVar.f59346b = true;
                b2.mo32519h(str, imageView, bVar.mo32666a());
                C64598o03 b3 = C85820q1.f249947a.mo119747b(n.mo73008d(f4Var.mo108765s2()));
                if (b3.f184602e == 1) {
                    mo135911x(m1Var, b3.f184603f);
                } else {
                    mo135910q(m1Var);
                }
            }
        } else {
            m1Var.mo135970f();
            ImageView imageView2 = m1Var.f284847n;
            Log.m105924i("MicroMsg.Imagegallery.handler.video", "[+] [tomys] Easy crash pos, bitmap will be down sample to reduce mem cost.");
            String r = ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137729r(f4Var.mo108765s2());
            Bitmap decodeFileWithMemLimit = BackwardSupportUtil.BitmapFactory.decodeFileWithMemLimit(r, 4194304);
            if (decodeFileWithMemLimit != null) {
                Log.m105925i("MicroMsg.Imagegallery.handler.video", "[+] [tomys] Bitmap decoded, file: %s, w: %s, h: %s", r, Integer.valueOf(decodeFileWithMemLimit.getWidth()), Integer.valueOf(decodeFileWithMemLimit.getHeight()));
            } else {
                Log.m105921e("MicroMsg.Imagegallery.handler.video", "[-] [tomys] Fail to decode file: %s", r);
            }
            imageView2.setImageBitmap(decodeFileWithMemLimit);
            mo135910q(m1Var);
        }
        m1Var.mo135970f();
        if (m1Var.f284849p.isPlaying()) {
            m1Var.mo135970f();
            m1Var.f284849p.stop();
        }
        m1Var.mo135970f();
        if (m1Var.f284849p instanceof VideoPlayerTextureView) {
            if (C85875k4.m106208w() || C85875k4.m106157N()) {
                m1Var.mo135970f();
                ((VideoPlayerTextureView) m1Var.f284849p).setScaleType(C96814a.C96817e.CONTAIN);
            } else {
                m1Var.mo135970f();
                ((VideoPlayerTextureView) m1Var.f284849p).setScaleType(C96814a.C96817e.DEFAULT);
            }
        }
        m1Var.f284851r.setVisibility(8);
        m1Var.mo135970f();
        m1Var.f284850q.setVisibility(8);
        m1Var.mo135970f();
        m1Var.f284858y.setVisibility(8);
        m1Var.mo135973i(false, 0.0f);
        this.f284591x = 0;
        this.f284563A = Util.nowMilliSecond();
        return true;
    }

    /* renamed from: j */
    public void mo135843j() {
        this.f284568F.sendEmptyMessageDelayed(1, 200);
    }

    /* renamed from: k */
    public void mo135844k() {
        boolean z = true;
        Log.m105925i("MicroMsg.Imagegallery.handler.video", "detach.[%d]", Integer.valueOf(hashCode()));
        this.f284564B = Util.nowMilliSecond();
        this.f284568F.removeMessages(1);
        mo135827D();
        this.f284580j.dead();
        this.f284573K.dead();
        mo135852z();
        this.f284638d.f284714g.getContext().getWindow().clearFlags(128);
        ImageGalleryUI imageGalleryUI = this.f284638d.f284714g;
        imageGalleryUI.mo135781o8();
        imageGalleryUI.f284400U0.setIplaySeekCallback((C102693c) null);
        super.mo135844k();
        this.f284579i.clear();
        this.f284579i = null;
        ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137731u(this);
        this.f284581n.clear();
        C97132t1 t1Var = this.f284582o;
        t1Var.mo136040j();
        t1Var.f284997c = null;
        t1Var.f284998d = null;
        t1Var.f285017w = null;
        if (Util.milliSecondsToNow(C101554f.f297300a) <= 86400000) {
            z = false;
        }
        if (z) {
            C86709a0.m107525e().postToWorker(new C97121r0(this));
        }
        C98398h0.Dx0().mo137786c();
        C98398h0.Dx0().mo137787d();
    }

    /* renamed from: r */
    public void mo135845r() {
        C97087m1 v;
        C96875r0 r0Var;
        Log.m105924i("MicroMsg.Imagegallery.handler.video", "ui on resume, add online video event.");
        this.f284568F.removeMessages(1);
        this.f284573K.alive();
        if (this.f284638d != null && C11171e.m11046c(21) && (v = this.f284638d.mo135934v()) != null && (r0Var = v.f284849p) != null) {
            if (r0Var instanceof VideoPlayerTextureView) {
                ((VideoPlayerTextureView) r0Var).mo153302E();
            } else if (r0Var instanceof VideoTextureView) {
                ((VideoTextureView) r0Var).mo25359F();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0079 A[SYNTHETIC, Splitter:B:14:0x0079] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo135846s() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "notify video completion. isOnlinePlay : "
            r0.append(r1)
            boolean r1 = r7.f284584q
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.Imagegallery.handler.video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r7.mo135827D()
            r7.mo135826C()
            r7.mo135835L()
            r7.mo135830G()
            boolean r0 = r7.f284584q
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x006d
            com.tencent.mm.ui.chatting.gallery.h r0 = r7.f284638d
            if (r0 == 0) goto L_0x006d
            com.tencent.mm.ui.chatting.gallery.m1 r0 = r0.mo135934v()
            if (r0 == 0) goto L_0x006d
            com.tencent.mm.ui.chatting.gallery.h r0 = r7.f284638d
            com.tencent.mm.ui.chatting.gallery.m1 r0 = r0.mo135934v()
            r0.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r0 = r0.f284849p
            if (r0 == 0) goto L_0x006d
            int r4 = r0.getCurrentPosition()
            int r4 = r4 + 2000
            int r5 = r0.getDuration()
            if (r4 >= r5) goto L_0x006d
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r0.getCurrentPosition()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            int r0 = r0.getDuration()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r3] = r0
            java.lang.String r0 = "notify video completion, but cur pos[%d] is less than duration[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r4)
            r0 = 0
            goto L_0x006e
        L_0x006d:
            r0 = 1
        L_0x006e:
            if (r0 == 0) goto L_0x0079
            com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler$$f r0 = new com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler$$f
            r0.<init>(r7)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x00d3
        L_0x0079:
            com.tencent.mm.ui.chatting.gallery.h r0 = r7.f284638d     // Catch:{ Exception -> 0x00c4 }
            com.tencent.mm.ui.chatting.gallery.m1 r0 = r0.mo135934v()     // Catch:{ Exception -> 0x00c4 }
            com.tencent.mm.pluginsdk.ui.tools.r0 r0 = r0.f284849p     // Catch:{ Exception -> 0x00c4 }
            int r0 = r0.getCurrentPosition()     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r4 = r7.f284593z     // Catch:{ Exception -> 0x00c4 }
            boolean r5 = r7.f284584q     // Catch:{ Exception -> 0x00c4 }
            hd0.C98429r0.m127832w(r4, r0, r5)     // Catch:{ Exception -> 0x00c4 }
            com.tencent.mm.ui.chatting.gallery.h r0 = r7.f284638d     // Catch:{ Exception -> 0x00c4 }
            com.tencent.mm.ui.chatting.gallery.m1 r0 = r0.mo135934v()     // Catch:{ Exception -> 0x00c4 }
            com.tencent.mm.pluginsdk.ui.tools.r0 r0 = r0.f284849p     // Catch:{ Exception -> 0x00c4 }
            r0.stop()     // Catch:{ Exception -> 0x00c4 }
            com.tencent.mm.ui.chatting.gallery.t1 r0 = r7.f284582o     // Catch:{ Exception -> 0x00c4 }
            r0.mo136038h()     // Catch:{ Exception -> 0x00c4 }
            int r0 = r7.f284569G     // Catch:{ Exception -> 0x00c4 }
            int r0 = r0 + r3
            r7.f284569G = r0     // Catch:{ Exception -> 0x00c4 }
            r4 = 3
            if (r0 > r4) goto L_0x00d3
            java.util.HashMap<java.lang.String, com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler$$k> r0 = r7.f284579i     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r4 = r7.f284593z     // Catch:{ Exception -> 0x00c4 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x00c4 }
            com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler$$k r0 = (com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryVideoHandler$$k) r0     // Catch:{ Exception -> 0x00c4 }
            if (r0 == 0) goto L_0x00c3
            com.tencent.mm.storage.f4 r4 = r0.f284606a     // Catch:{ Exception -> 0x00c4 }
            if (r4 != 0) goto L_0x00b5
            goto L_0x00c3
        L_0x00b5:
            hd0.n0 r4 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124927o(r4)     // Catch:{ Exception -> 0x00c4 }
            com.tencent.mm.storage.f4 r5 = r0.f284606a     // Catch:{ Exception -> 0x00c4 }
            int r0 = r0.f284607b     // Catch:{ Exception -> 0x00c4 }
            boolean r6 = r7.f284584q     // Catch:{ Exception -> 0x00c4 }
            r7.mo135834K(r5, r4, r0, r6)     // Catch:{ Exception -> 0x00c4 }
            goto L_0x00d3
        L_0x00c3:
            return
        L_0x00c4:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r0.toString()
            r3[r2] = r4
            java.lang.String r2 = "notify video completion error[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r3)
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryVideoHandler.mo135846s():void");
    }

    /* renamed from: t */
    public void mo135847t(int i, int i2) {
        String str;
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Boolean.valueOf(this.f284584q);
        C97132t1 t1Var = this.f284582o;
        objArr[3] = Boolean.valueOf(!Util.isNullOrNil(t1Var.f285000f) && t1Var.f284995a == 1);
        Log.m105921e("MicroMsg.Imagegallery.handler.video", "notify video error, what %d, extras %d isOnlinePlay %b isLoading %b ", objArr);
        mo135826C();
        this.f284586s = true;
        this.f284565C = i2;
        if (this.f284584q) {
            if (i == -1) {
                mo135827D();
                this.f284638d.mo135934v().f284849p.stop();
                this.f284582o.mo136038h();
            } else if (i == -2) {
                mo135827D();
                C98429r0.m127832w(this.f284593z, this.f284638d.mo135934v().f284849p.getCurrentPosition(), this.f284584q);
                this.f284638d.mo135934v().f284849p.stop();
                this.f284582o.mo136038h();
            } else if (i == -3) {
                this.f284586s = false;
                this.f284582o.mo136038h();
                return;
            }
            this.f284574L = false;
            this.f284638d.f284714g.mo135741R8(true);
            C97087m1 v = this.f284638d.mo135934v();
            v.mo135970f();
            v.f284858y.setVisibility(0);
            mo135830G();
            C115669n.INSTANCE.idkeyStat(354, 18, 1, false);
            return;
        }
        C98429r0.m127816g(this.f284593z);
        mo135830G();
        C97056h hVar = this.f284638d;
        if (hVar == null || hVar.mo135934v() == null || this.f284638d.mo135934v().f284849p == null) {
            str = "";
        } else {
            str = this.f284638d.mo135934v().f284849p.getVideoPath();
            this.f284638d.mo135934v().f284849p.stop();
        }
        if (this.f284587t) {
            Log.m105925i("MicroMsg.Imagegallery.handler.video", "%d had play completion don't show error tips", Integer.valueOf(hashCode()));
            return;
        }
        MMHandlerThread.postToMainThread(new ImageGalleryVideoHandler$$g(this, str));
        C115669n.INSTANCE.idkeyStat(354, 25, 1, false);
    }

    /* renamed from: u */
    public void mo135848u() {
        this.f284586s = false;
        this.f284565C = 0;
        C97056h hVar = this.f284638d;
        C97087m1 v = hVar != null ? hVar.mo135934v() : null;
        if (v == null) {
            Log.m105928w("MicroMsg.Imagegallery.handler.video", "notify video prepared, but holder is null.");
            return;
        }
        v.mo135970f();
        int videoMsToSec = Util.videoMsToSec((long) v.f284849p.getDuration());
        ImageGalleryUI imageGalleryUI = this.f284638d.f284714g;
        imageGalleryUI.mo135781o8();
        int videoTotalTime = imageGalleryUI.f284400U0.getVideoTotalTime();
        Log.m105925i("MicroMsg.Imagegallery.handler.video", "%d videoDuration %d hadSetTotalTime %d", Integer.valueOf(hashCode()), Integer.valueOf(videoMsToSec), Integer.valueOf(videoTotalTime));
        if (videoTotalTime <= 0 || Math.abs(videoTotalTime - videoMsToSec) >= 2) {
            ImageGalleryUI imageGalleryUI2 = this.f284638d.f284714g;
            imageGalleryUI2.mo135781o8();
            imageGalleryUI2.f284400U0.setVideoTotalTime(videoMsToSec);
        }
        try {
            ImageGalleryUI imageGalleryUI3 = this.f284638d.f284714g;
            imageGalleryUI3.mo135781o8();
            imageGalleryUI3.f284400U0.setIplaySeekCallback(this.f284572J);
        } catch (Exception unused) {
        }
        if (videoMsToSec == 0 || videoMsToSec >= 1800) {
            Log.m105929w("MicroMsg.Imagegallery.handler.video", "%d repair video duration[%d] error. filename[%s]", Integer.valueOf(hashCode()), Integer.valueOf(videoMsToSec), this.f284593z);
        } else {
            C86709a0.m107525e().postToWorker(new C97118q0(this, videoMsToSec));
        }
        int b = C98429r0.m127811b(videoMsToSec, this.f284593z);
        Log.m105925i("MicroMsg.Imagegallery.handler.video", "notify video prepared. isOnlinePlay[%b] playDuration[%d] playVideoWhenNotify[%b] hadPlayError[%b].", Boolean.valueOf(this.f284584q), Integer.valueOf(b), Boolean.valueOf(this.f284585r), Boolean.valueOf(this.f284586s));
        v.mo135970f();
        v.f284849p.setOneTimeVideoTextureUpdateCallback(this.f284577P);
        if (this.f284585r) {
            if (!this.f284584q) {
                this.f284582o.mo136040j();
                mo135831H();
                mo135837N(b, true);
            } else {
                C97132t1 t1Var = this.f284582o;
                t1Var.getClass();
                if (b > 0) {
                    Log.m105924i("MicroMsg.OnlineVideoUIHelper", "seek to last duration : " + b);
                    t1Var.f285004j = b;
                    t1Var.f285005k = true;
                    t1Var.f284996b = 2;
                }
                this.f284582o.mo136034d(0);
            }
            mo135840Q(false);
            return;
        }
        if (!this.f284584q) {
            mo135837N(b, false);
        } else {
            this.f284582o.mo136042l(b, false);
        }
        mo135841R(b);
        this.f284638d.f284714g.mo135741R8(true);
        mo135827D();
    }

    /* renamed from: v */
    public void mo135849v(int i) {
        mo135832I(mo135877h(i));
        this.f284583p.mo136889a();
        this.f284638d.f284714g.mo135741R8(true);
    }

    /* renamed from: w */
    public void mo135850w(int i) {
        this.f284581n.remove(i);
    }

    /* renamed from: y */
    public void mo135851y(C97087m1 m1Var) {
        Log.m105924i("MicroMsg.Imagegallery.handler.video", "stop");
        mo135827D();
        if (m1Var != null) {
            mo135830G();
            if (this.f284584q) {
                this.f284582o.mo136043m();
            }
            if (!this.f284586s) {
                C98429r0.m127832w(this.f284593z, this.f284588u - 1000, this.f284584q);
            }
            m1Var.mo135970f();
            m1Var.f284850q.setVisibility(8);
            m1Var.mo135970f();
            m1Var.f284858y.setVisibility(8);
            m1Var.mo135970f();
            m1Var.f284849p.stop();
            mo135841R(0);
            m1Var.mo135973i(false, 0.0f);
            this.f284584q = false;
            this.f284574L = false;
            this.f284566D = false;
            this.f284593z = null;
            this.f284576N = 0;
            this.f284575M = (long) 0;
            this.f284569G = 0;
            this.f284592y = 0;
            this.f284591x = 0;
            this.f284589v = 0;
            this.f284590w = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008d, code lost:
        r5 = r5.f284995a;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo135852z() {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "stopAll. video handler hash code : "
            r0.append(r1)
            int r1 = r8.hashCode()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.Imagegallery.handler.video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r8.f284564B = r0
            com.tencent.mm.ui.chatting.gallery.h r0 = r8.f284638d
            android.util.SparseArray<java.lang.Object> r0 = r0.f293276f
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0028:
            int r4 = r0.size()
            if (r2 >= r4) goto L_0x00a0
            int r4 = r0.keyAt(r2)
            java.lang.Object r5 = r0.get(r4)
            r6 = 1
            if (r5 == 0) goto L_0x009d
            java.lang.Object r5 = r0.get(r4)
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r5 = r5.getTag()
            if (r5 != 0) goto L_0x0046
            goto L_0x009d
        L_0x0046:
            java.lang.Object r4 = r0.get(r4)
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r4 = r4.getTag()
            com.tencent.mm.ui.chatting.gallery.m1 r4 = (com.tencent.p014mm.p136ui.chatting.gallery.C97087m1) r4
            android.widget.RelativeLayout r5 = r4.f284845l
            if (r5 != 0) goto L_0x0057
            goto L_0x009d
        L_0x0057:
            r4.mo135970f()
            android.widget.RelativeLayout r5 = r4.f284845l
            int r5 = r5.getVisibility()
            if (r5 == 0) goto L_0x0063
            goto L_0x009d
        L_0x0063:
            r4.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r5 = r4.f284849p
            android.view.View r5 = (android.view.View) r5
            int r5 = r5.getVisibility()
            if (r5 == 0) goto L_0x0099
            r4.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r5 = r4.f284849p
            java.lang.String r5 = r5.getVideoPath()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x0099
            boolean r5 = r8.f284584q
            if (r5 == 0) goto L_0x009d
            com.tencent.mm.ui.chatting.gallery.t1 r5 = r8.f284582o
            java.lang.String r7 = r5.f285000f
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0096
            int r5 = r5.f284995a
            if (r5 == r6) goto L_0x0094
            r7 = 3
            if (r5 != r7) goto L_0x0096
        L_0x0094:
            r5 = 1
            goto L_0x0097
        L_0x0096:
            r5 = 0
        L_0x0097:
            if (r5 == 0) goto L_0x009d
        L_0x0099:
            r8.mo135851y(r4)
            r3 = 1
        L_0x009d:
            int r2 = r2 + 1
            goto L_0x0028
        L_0x00a0:
            eb0.e r0 = r8.f284583p
            r0.mo136889a()
            if (r3 != 0) goto L_0x00b2
            boolean r0 = r8.f284584q
            if (r0 == 0) goto L_0x00b2
            com.tencent.mm.ui.chatting.gallery.t1 r0 = r8.f284582o
            r0.mo136043m()
            r8.f284584q = r1
        L_0x00b2:
            r8.mo135827D()
            android.util.SparseArray<hd0.n0> r0 = r8.f284581n
            r0.clear()
            r8.mo135835L()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryVideoHandler.mo135852z():void");
    }
}
