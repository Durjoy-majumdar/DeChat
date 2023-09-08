package com.tencent.p014mm.plugin.luckymoney.model;

import a14.C0000n0;
import a42.C39486a;
import a42.C67004b;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import b42.C67149a;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatting.component.ListScrollPAGView;
import com.tencent.p014mm.message.C68067h;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82086j;
import com.tencent.p014mm.plugin.luckymoney.story.EnvelopeStoryVideoManager;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.wallet_core.model.C75097a;
import com.tencent.p014mm.wallet_core.model.C75142u0;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f32.C75672b;
import f40.C86709a0;
import g32.C75846b;
import gc0.C20828a;
import h81.C32735h;
import hc0.C20935b;
import hc0.C20937c;
import hc0.C98334a;
import ic0.C21070h;
import j20.C117292a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import jc0.C21210b;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import l20.C21388a;
import nr3.C35015b;
import nr3.C35016g;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p1081gi.C98127h;
import p327ct.C30914c;
import p523fp.C32147e;
import te3.C51206s72;
import te3.C77993rp3;
import te3.C77994sf2;
import te3.C77999tf2;
import te3.C78007w82;
import te3.vb4;
import zt3.C119157j;

@C86522b
/* renamed from: com.tencent.mm.plugin.luckymoney.model.b0 */
public class C69160b0 extends C86301e implements C75672b {

    /* renamed from: d */
    public static C35016g<C20828a> f198984d = new C35016g<>(new C69194j());

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$a */
    public class C69161a implements C21070h {

        /* renamed from: a */
        public final /* synthetic */ String f198985a;

        /* renamed from: b */
        public final /* synthetic */ String f198986b;

        /* renamed from: c */
        public final /* synthetic */ C69193v f198987c;

        public C69161a(C69160b0 b0Var, String str, String str2, C69193v vVar) {
            this.f198985a = str;
            this.f198986b = str2;
            this.f198987c = vVar;
        }

        /* renamed from: a */
        public void mo6676a(String str, View view) {
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "load finish url: %s, %s, %s", str, Integer.valueOf(bVar.f59985a), Integer.valueOf(bVar.f59986b));
            int i = bVar.f59985a;
            if (i == 0) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175911u(991, 6);
                nVar.mo160131h(18888, 1, this.f198985a, str);
                byte[] bArr = bVar.f59987c;
                if (bArr != null) {
                    String mD5String = MD5Util.getMD5String(bArr);
                    if (!Util.isNullOrNil(this.f198986b) && !mD5String.equals(this.f198986b)) {
                        Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "md5 not match: %s, %s", mD5String, this.f198986b);
                        nVar.mo175911u(991, 8);
                        nVar.mo160131h(16543, str, this.f198986b, mD5String);
                    }
                }
            } else if (i == 1) {
                C115669n nVar2 = C115669n.INSTANCE;
                nVar2.mo175911u(991, 7);
                nVar2.mo160131h(18888, 2, this.f198985a, str);
            } else if (i == 2) {
                C115669n nVar3 = C115669n.INSTANCE;
                nVar3.mo175911u(991, 8);
                nVar3.mo160131h(18888, 2, this.f198985a, str);
            } else {
                Bitmap bitmap = bVar.f59988d;
                if (bitmap == null || bitmap.isRecycled()) {
                    C115669n nVar4 = C115669n.INSTANCE;
                    nVar4.mo175911u(991, 9);
                    nVar4.mo160131h(18888, 2, this.f198985a, str);
                }
            }
            C69193v vVar = this.f198987c;
            if (vVar != null) {
                vVar.mo95336a(bVar.f59988d, bVar.f59986b, str);
            }
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$b */
    public class C69162b implements C69193v {

        /* renamed from: a */
        public final /* synthetic */ ImageView f198988a;

        /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$b$a */
        public class C69163a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f198989d;

            public C69163a(Bitmap bitmap) {
                this.f198989d = bitmap;
            }

            public void run() {
                C69162b.this.f198988a.setImageBitmap(this.f198989d);
            }
        }

        public C69162b(C69160b0 b0Var, ImageView imageView) {
            this.f198988a = imageView;
        }

        /* renamed from: a */
        public void mo95336a(Bitmap bitmap, int i, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                Log.m105929w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", Integer.valueOf(i), str);
                return;
            }
            C69160b0.Ex0(new C69163a(bitmap));
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$c */
    public class C69164c implements C69193v {

        /* renamed from: a */
        public final /* synthetic */ C75672b.C75673a f198991a;

        /* renamed from: b */
        public final /* synthetic */ int f198992b;

        /* renamed from: c */
        public final /* synthetic */ int f198993c;

        /* renamed from: d */
        public final /* synthetic */ int f198994d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f198995e;

        /* renamed from: f */
        public final /* synthetic */ long f198996f;

        /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$c$a */
        public class C69165a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f198998d;

            /* renamed from: e */
            public final /* synthetic */ int f198999e;

            /* renamed from: f */
            public final /* synthetic */ String f199000f;

            /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$c$a$a */
            public class C69166a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ Bitmap f199002d;

                public C69166a(Bitmap bitmap) {
                    this.f199002d = bitmap;
                }

                /* JADX WARNING: Removed duplicated region for block: B:13:0x0082  */
                /* JADX WARNING: Removed duplicated region for block: B:17:0x00ab  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r13 = this;
                        com.tencent.mm.plugin.luckymoney.model.b0$c$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.C69165a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$c r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.this
                        android.widget.ImageView r0 = r0.f198995e
                        r1 = 2131308573(0x7f09301d, float:1.8235405E38)
                        java.lang.Object r0 = r0.getTag(r1)
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        int r0 = r0.intValue()
                        r1 = 0
                        r2 = 2
                        java.lang.String r3 = "MicroMsg.LuckyMoneyEnvelopeLogic"
                        r4 = 1
                        if (r0 <= 0) goto L_0x0047
                        com.tencent.mm.plugin.luckymoney.model.b0$c$a r5 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.C69165a.this
                        int r6 = r5.f198999e
                        if (r0 != r6) goto L_0x0047
                        com.tencent.mm.plugin.luckymoney.model.b0$c r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.this
                        android.widget.ImageView r0 = r0.f198995e
                        android.graphics.Bitmap r5 = r13.f199002d
                        r0.setImageBitmap(r5)
                        com.tencent.mm.plugin.luckymoney.model.b0$c$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.C69165a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$c r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.this
                        f32.b$a r0 = r0.f198991a
                        if (r0 == 0) goto L_0x0034
                        r0.onComplete(r4)
                    L_0x0034:
                        com.tencent.mm.plugin.luckymoney.model.b0$c$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.C69165a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$c r5 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.this
                        com.tencent.mm.plugin.luckymoney.model.b0 r6 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.this
                        android.widget.ImageView r7 = r5.f198995e
                        java.lang.String r8 = r0.f199000f
                        r9 = 2
                        int r10 = r0.f198999e
                        long r11 = r5.f198996f
                        com.tencent.p014mm.plugin.luckymoney.model.C69160b0.vx0(r6, r7, r8, r9, r10, r11)
                        goto L_0x005f
                    L_0x0047:
                        java.lang.Object[] r5 = new java.lang.Object[r2]
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        r5[r1] = r0
                        com.tencent.mm.plugin.luckymoney.model.b0$c$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.C69165a.this
                        int r0 = r0.f198999e
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        r5[r4] = r0
                        java.lang.String r0 = "subtype，local：%s、callback：%s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r0, r5)
                    L_0x005f:
                        com.tencent.mm.plugin.luckymoney.model.b0$c$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.C69165a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$c r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.this
                        android.widget.ImageView r0 = r0.f198995e
                        r5 = 2131308577(0x7f093021, float:1.8235413E38)
                        java.lang.Object r0 = r0.getTag(r5)
                        java.lang.String r0 = (java.lang.String) r0
                        com.tencent.mm.plugin.luckymoney.model.b0$c$a r5 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.C69165a.this
                        java.lang.String r5 = r5.f199000f
                        boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                        if (r5 != 0) goto L_0x00ab
                        com.tencent.mm.plugin.luckymoney.model.b0$c$a r5 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.C69165a.this
                        java.lang.String r5 = r5.f199000f
                        boolean r5 = r5.equals(r0)
                        if (r5 == 0) goto L_0x00ab
                        com.tencent.mm.plugin.luckymoney.model.b0$c$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.C69165a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$c r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.this
                        android.widget.ImageView r0 = r0.f198995e
                        android.graphics.Bitmap r1 = r13.f199002d
                        r0.setImageBitmap(r1)
                        com.tencent.mm.plugin.luckymoney.model.b0$c$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.C69165a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$c r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.this
                        f32.b$a r0 = r0.f198991a
                        if (r0 == 0) goto L_0x0098
                        r0.onComplete(r4)
                    L_0x0098:
                        com.tencent.mm.plugin.luckymoney.model.b0$c$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.C69165a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$c r1 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.this
                        com.tencent.mm.plugin.luckymoney.model.b0 r2 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.this
                        android.widget.ImageView r3 = r1.f198995e
                        java.lang.String r4 = r0.f199000f
                        r5 = 2
                        int r6 = r0.f198999e
                        long r7 = r1.f198996f
                        com.tencent.p014mm.plugin.luckymoney.model.C69160b0.vx0(r2, r3, r4, r5, r6, r7)
                        goto L_0x00bb
                    L_0x00ab:
                        java.lang.Object[] r2 = new java.lang.Object[r2]
                        r2[r1] = r0
                        com.tencent.mm.plugin.luckymoney.model.b0$c$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.C69165a.this
                        java.lang.String r0 = r0.f199000f
                        r2[r4] = r0
                        java.lang.String r0 = "url, local：%s,  callback：%s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r0, r2)
                    L_0x00bb:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.C69165a.C69166a.run():void");
                }
            }

            public C69165a(Bitmap bitmap, int i, String str) {
                this.f198998d = bitmap;
                this.f198999e = i;
                this.f199000f = str;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
                r0 = r0.f198993c;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r7 = this;
                    com.tencent.mm.plugin.luckymoney.model.b0$c r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.this
                    int r1 = r0.f198992b
                    r2 = 1
                    if (r1 <= 0) goto L_0x0012
                    int r0 = r0.f198993c
                    if (r0 <= 0) goto L_0x0012
                    android.graphics.Bitmap r3 = r7.f198998d
                    android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r3, r1, r0, r2)
                    goto L_0x0014
                L_0x0012:
                    android.graphics.Bitmap r0 = r7.f198998d
                L_0x0014:
                    com.tencent.mm.plugin.luckymoney.model.b0$c r1 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.this
                    int r1 = r1.f198994d
                    r3 = 0
                    if (r1 <= 0) goto L_0x0021
                    float r1 = (float) r1
                    android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r0, r3, r1)
                    goto L_0x0030
                L_0x0021:
                    android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    r4 = 8
                    int r1 = kg3.C76577a.m92151b(r1, r4)
                    float r1 = (float) r1
                    android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r0, r3, r1)
                L_0x0030:
                    r1 = 2
                    java.lang.Object[] r4 = new java.lang.Object[r1]
                    com.tencent.mm.plugin.luckymoney.model.b0$c r5 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.this
                    int r5 = r5.f198992b
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    r4[r3] = r5
                    com.tencent.mm.plugin.luckymoney.model.b0$c r5 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.this
                    int r5 = r5.f198993c
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    r4[r2] = r5
                    java.lang.String r5 = "MicroMsg.LuckyMoneyEnvelopeLogic"
                    java.lang.String r6 = "loadCoverView：targetSize %s, %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r4)
                    java.lang.Object[] r4 = new java.lang.Object[r1]
                    android.graphics.Bitmap r6 = r7.f198998d
                    int r6 = r6.getWidth()
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    r4[r3] = r6
                    android.graphics.Bitmap r6 = r7.f198998d
                    int r6 = r6.getHeight()
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    r4[r2] = r6
                    java.lang.String r6 = "loadCoverView：bitmapSample size %s, %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r4)
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    int r4 = r0.getWidth()
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r1[r3] = r4
                    int r3 = r0.getHeight()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r1[r2] = r3
                    java.lang.String r2 = "loadCoverView：bitmapFinal size %s, %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r2, r1)
                    zt3.t r1 = zt3.C119157j.f356862d
                    com.tencent.mm.plugin.luckymoney.model.b0$c$a$a r2 = new com.tencent.mm.plugin.luckymoney.model.b0$c$a$a
                    r2.<init>(r0)
                    zt3.j r1 = (zt3.C119157j) r1
                    r1.mo183895z(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69164c.C69165a.run():void");
            }
        }

        public C69164c(C75672b.C75673a aVar, int i, int i2, int i3, ImageView imageView, long j) {
            this.f198991a = aVar;
            this.f198992b = i;
            this.f198993c = i2;
            this.f198994d = i3;
            this.f198995e = imageView;
            this.f198996f = j;
        }

        /* renamed from: a */
        public void mo95336a(Bitmap bitmap, int i, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                Log.m105929w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", Integer.valueOf(i), str);
                C75672b.C75673a aVar = this.f198991a;
                if (aVar != null) {
                    aVar.onComplete(false);
                    return;
                }
                return;
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C69165a(bitmap, i, str));
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$d */
    public class C69167d implements C69193v {

        /* renamed from: a */
        public final /* synthetic */ C75672b.C75673a f199004a;

        /* renamed from: b */
        public final /* synthetic */ int f199005b;

        /* renamed from: c */
        public final /* synthetic */ int f199006c;

        /* renamed from: d */
        public final /* synthetic */ ImageView f199007d;

        /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$d$a */
        public class C69168a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f199008d;

            /* renamed from: e */
            public final /* synthetic */ int f199009e;

            /* renamed from: f */
            public final /* synthetic */ String f199010f;

            /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$d$a$a */
            public class C69169a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ Bitmap f199012d;

                public C69169a(Bitmap bitmap) {
                    this.f199012d = bitmap;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x006f  */
                /* JADX WARNING: Removed duplicated region for block: B:15:0x0086  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r7 = this;
                        com.tencent.mm.plugin.luckymoney.model.b0$d$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.C69168a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$d r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.this
                        android.widget.ImageView r0 = r0.f199007d
                        r1 = 2131308573(0x7f09301d, float:1.8235405E38)
                        java.lang.Object r0 = r0.getTag(r1)
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        int r0 = r0.intValue()
                        r1 = 0
                        r2 = 2
                        java.lang.String r3 = "MicroMsg.LuckyMoneyEnvelopeLogic"
                        r4 = 1
                        if (r0 <= 0) goto L_0x0035
                        com.tencent.mm.plugin.luckymoney.model.b0$d$a r5 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.C69168a.this
                        int r6 = r5.f199009e
                        if (r0 != r6) goto L_0x0035
                        com.tencent.mm.plugin.luckymoney.model.b0$d r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.this
                        android.widget.ImageView r0 = r0.f199007d
                        android.graphics.Bitmap r5 = r7.f199012d
                        r0.setImageBitmap(r5)
                        com.tencent.mm.plugin.luckymoney.model.b0$d$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.C69168a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$d r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.this
                        f32.b$a r0 = r0.f199004a
                        if (r0 == 0) goto L_0x004c
                        r0.onComplete(r4)
                        goto L_0x004c
                    L_0x0035:
                        java.lang.Object[] r5 = new java.lang.Object[r2]
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        r5[r1] = r0
                        com.tencent.mm.plugin.luckymoney.model.b0$d$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.C69168a.this
                        int r0 = r0.f199009e
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        r5[r4] = r0
                        java.lang.String r0 = "pss subtype: %s, %s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r0, r5)
                    L_0x004c:
                        com.tencent.mm.plugin.luckymoney.model.b0$d$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.C69168a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$d r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.this
                        android.widget.ImageView r0 = r0.f199007d
                        r5 = 2131308577(0x7f093021, float:1.8235413E38)
                        java.lang.Object r0 = r0.getTag(r5)
                        java.lang.String r0 = (java.lang.String) r0
                        com.tencent.mm.plugin.luckymoney.model.b0$d$a r5 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.C69168a.this
                        java.lang.String r5 = r5.f199010f
                        boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                        if (r5 != 0) goto L_0x0086
                        com.tencent.mm.plugin.luckymoney.model.b0$d$a r5 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.C69168a.this
                        java.lang.String r5 = r5.f199010f
                        boolean r5 = r5.equals(r0)
                        if (r5 == 0) goto L_0x0086
                        com.tencent.mm.plugin.luckymoney.model.b0$d$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.C69168a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$d r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.this
                        android.widget.ImageView r0 = r0.f199007d
                        android.graphics.Bitmap r1 = r7.f199012d
                        r0.setImageBitmap(r1)
                        com.tencent.mm.plugin.luckymoney.model.b0$d$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.C69168a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$d r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.this
                        f32.b$a r0 = r0.f199004a
                        if (r0 == 0) goto L_0x0095
                        r0.onComplete(r4)
                        goto L_0x0095
                    L_0x0086:
                        java.lang.Object[] r2 = new java.lang.Object[r2]
                        r2[r1] = r0
                        com.tencent.mm.plugin.luckymoney.model.b0$d$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.C69168a.this
                        java.lang.String r0 = r0.f199010f
                        r2[r4] = r0
                        java.lang.String r0 = "pss url: %s, %s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r0, r2)
                    L_0x0095:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.C69168a.C69169a.run():void");
                }
            }

            public C69168a(Bitmap bitmap, int i, String str) {
                this.f199008d = bitmap;
                this.f199009e = i;
                this.f199010f = str;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
                r0 = r0.f199006c;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r7 = this;
                    com.tencent.mm.plugin.luckymoney.model.b0$d r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.this
                    int r1 = r0.f199005b
                    r2 = 1
                    if (r1 <= 0) goto L_0x0012
                    int r0 = r0.f199006c
                    if (r0 <= 0) goto L_0x0012
                    android.graphics.Bitmap r3 = r7.f199008d
                    android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r3, r1, r0, r2)
                    goto L_0x0014
                L_0x0012:
                    android.graphics.Bitmap r0 = r7.f199008d
                L_0x0014:
                    r1 = 2
                    java.lang.Object[] r3 = new java.lang.Object[r1]
                    com.tencent.mm.plugin.luckymoney.model.b0$d r4 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.this
                    int r4 = r4.f199005b
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r5 = 0
                    r3[r5] = r4
                    com.tencent.mm.plugin.luckymoney.model.b0$d r4 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.this
                    int r4 = r4.f199006c
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r3[r2] = r4
                    java.lang.String r4 = "MicroMsg.LuckyMoneyEnvelopeLogic"
                    java.lang.String r6 = "loadCoverWidgetView：targetSize: %s, %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r6, r3)
                    java.lang.Object[] r3 = new java.lang.Object[r1]
                    android.graphics.Bitmap r6 = r7.f199008d
                    int r6 = r6.getWidth()
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    r3[r5] = r6
                    android.graphics.Bitmap r6 = r7.f199008d
                    int r6 = r6.getHeight()
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    r3[r2] = r6
                    java.lang.String r6 = "loadCoverWidgetView：bitmapSample: %s, %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r6, r3)
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    int r3 = r0.getWidth()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r1[r5] = r3
                    int r3 = r0.getHeight()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r1[r2] = r3
                    java.lang.String r2 = "loadCoverWidgetView：bitmapFinal size %s, %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r2, r1)
                    zt3.t r1 = zt3.C119157j.f356862d
                    com.tencent.mm.plugin.luckymoney.model.b0$d$a$a r2 = new com.tencent.mm.plugin.luckymoney.model.b0$d$a$a
                    r2.<init>(r0)
                    zt3.j r1 = (zt3.C119157j) r1
                    r1.mo183895z(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69167d.C69168a.run():void");
            }
        }

        public C69167d(C69160b0 b0Var, C75672b.C75673a aVar, int i, int i2, ImageView imageView) {
            this.f199004a = aVar;
            this.f199005b = i;
            this.f199006c = i2;
            this.f199007d = imageView;
        }

        /* renamed from: a */
        public void mo95336a(Bitmap bitmap, int i, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                Log.m105929w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", Integer.valueOf(i), str);
                C75672b.C75673a aVar = this.f199004a;
                if (aVar != null) {
                    aVar.onComplete(false);
                    return;
                }
                return;
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C69168a(bitmap, i, str));
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$e */
    public class C69170e implements C69193v {

        /* renamed from: a */
        public final /* synthetic */ int f199014a;

        /* renamed from: b */
        public final /* synthetic */ int f199015b;

        /* renamed from: c */
        public final /* synthetic */ boolean f199016c;

        /* renamed from: d */
        public final /* synthetic */ ImageView f199017d;

        /* renamed from: e */
        public final /* synthetic */ long f199018e;

        /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$e$a */
        public class C69171a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f199020d;

            /* renamed from: e */
            public final /* synthetic */ int f199021e;

            /* renamed from: f */
            public final /* synthetic */ String f199022f;

            /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$e$a$a */
            public class C69172a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ Bitmap f199024d;

                public C69172a(Bitmap bitmap) {
                    this.f199024d = bitmap;
                }

                /* JADX WARNING: Removed duplicated region for block: B:10:0x0077  */
                /* JADX WARNING: Removed duplicated region for block: B:11:0x0095  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r13 = this;
                        com.tencent.mm.plugin.luckymoney.model.b0$e$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69170e.C69171a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$e r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69170e.this
                        android.widget.ImageView r0 = r0.f199017d
                        r1 = 2131308573(0x7f09301d, float:1.8235405E38)
                        java.lang.Object r0 = r0.getTag(r1)
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        int r0 = r0.intValue()
                        r1 = 1
                        r2 = 0
                        r3 = 2
                        java.lang.String r4 = "MicroMsg.LuckyMoneyEnvelopeLogic"
                        if (r0 <= 0) goto L_0x003c
                        com.tencent.mm.plugin.luckymoney.model.b0$e$a r5 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69170e.C69171a.this
                        int r6 = r5.f199021e
                        if (r0 != r6) goto L_0x003c
                        com.tencent.mm.plugin.luckymoney.model.b0$e r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69170e.this
                        android.widget.ImageView r0 = r0.f199017d
                        android.graphics.Bitmap r5 = r13.f199024d
                        r0.setImageBitmap(r5)
                        com.tencent.mm.plugin.luckymoney.model.b0$e$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69170e.C69171a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$e r5 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69170e.this
                        com.tencent.mm.plugin.luckymoney.model.b0 r6 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.this
                        android.widget.ImageView r7 = r5.f199017d
                        java.lang.String r8 = r0.f199022f
                        r9 = 1
                        int r10 = r0.f199021e
                        long r11 = r5.f199018e
                        com.tencent.p014mm.plugin.luckymoney.model.C69160b0.vx0(r6, r7, r8, r9, r10, r11)
                        goto L_0x0054
                    L_0x003c:
                        java.lang.Object[] r5 = new java.lang.Object[r3]
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        r5[r2] = r0
                        com.tencent.mm.plugin.luckymoney.model.b0$e$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69170e.C69171a.this
                        int r0 = r0.f199021e
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        r5[r1] = r0
                        java.lang.String r0 = "subtype，local：%s、callback：%s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r0, r5)
                    L_0x0054:
                        com.tencent.mm.plugin.luckymoney.model.b0$e$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69170e.C69171a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$e r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69170e.this
                        android.widget.ImageView r0 = r0.f199017d
                        r5 = 2131308577(0x7f093021, float:1.8235413E38)
                        java.lang.Object r0 = r0.getTag(r5)
                        java.lang.String r0 = (java.lang.String) r0
                        com.tencent.mm.plugin.luckymoney.model.b0$e$a r5 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69170e.C69171a.this
                        java.lang.String r5 = r5.f199022f
                        boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                        if (r5 != 0) goto L_0x0095
                        com.tencent.mm.plugin.luckymoney.model.b0$e$a r5 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69170e.C69171a.this
                        java.lang.String r5 = r5.f199022f
                        boolean r5 = r5.equals(r0)
                        if (r5 == 0) goto L_0x0095
                        com.tencent.mm.plugin.luckymoney.model.b0$e$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69170e.C69171a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$e r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69170e.this
                        android.widget.ImageView r0 = r0.f199017d
                        android.graphics.Bitmap r1 = r13.f199024d
                        r0.setImageBitmap(r1)
                        com.tencent.mm.plugin.luckymoney.model.b0$e$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69170e.C69171a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$e r1 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69170e.this
                        com.tencent.mm.plugin.luckymoney.model.b0 r2 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.this
                        android.widget.ImageView r3 = r1.f199017d
                        java.lang.String r4 = r0.f199022f
                        r5 = 1
                        int r6 = r0.f199021e
                        long r7 = r1.f199018e
                        com.tencent.p014mm.plugin.luckymoney.model.C69160b0.vx0(r2, r3, r4, r5, r6, r7)
                        goto L_0x00a5
                    L_0x0095:
                        java.lang.Object[] r3 = new java.lang.Object[r3]
                        r3[r2] = r0
                        com.tencent.mm.plugin.luckymoney.model.b0$e$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69170e.C69171a.this
                        java.lang.String r0 = r0.f199022f
                        r3[r1] = r0
                        java.lang.String r0 = "url, local：%s,  callback：%s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r0, r3)
                    L_0x00a5:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69170e.C69171a.C69172a.run():void");
                }
            }

            public C69171a(Bitmap bitmap, int i, String str) {
                this.f199020d = bitmap;
                this.f199021e = i;
                this.f199022f = str;
            }

            public void run() {
                Bitmap bitmap;
                C69170e eVar = C69170e.this;
                C69160b0 b0Var = C69160b0.this;
                Bitmap bitmap2 = this.f199020d;
                int i = eVar.f199014a;
                int i2 = eVar.f199015b;
                boolean z = eVar.f199016c;
                C35016g<C20828a> gVar = C69160b0.f198984d;
                b0Var.getClass();
                int b = i2 - C76577a.m92151b(MMApplicationContext.getContext(), 24);
                int ceil = (int) Math.ceil((double) (((float) bitmap2.getWidth()) * (((float) i) / ((float) bitmap2.getHeight()))));
                Log.m105919d("MicroMsg.LuckyMoneyEnvelopeLogic", "wantedBitmapWidth:%s, th: %s, tw: %s, sw:%s, sh:%s", Integer.valueOf(ceil), Integer.valueOf(i), Integer.valueOf(b), Integer.valueOf(bitmap2.getWidth()), Integer.valueOf(bitmap2.getHeight()));
                if (ceil <= 0 || i <= 0) {
                    Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "createChattingBubble error，wantedBitmapWidth：%s，targetHeight：%s", Integer.valueOf(ceil), Integer.valueOf(i));
                    bitmap = null;
                } else {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, ceil, i, true);
                    int i3 = ceil - b;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    bitmap = BitmapUtil.createChattingImage(BitmapUtil.getBitmapFromRectFixed(createScaledBitmap, new Rect(i3, 0, ceil, i), false), z ? C0966R.C0969drawable.by7 : C0966R.C0969drawable.byc);
                }
                ((C119157j) C119157j.f356862d).mo183895z(new C69172a(bitmap));
            }
        }

        public C69170e(int i, int i2, boolean z, ImageView imageView, long j) {
            this.f199014a = i;
            this.f199015b = i2;
            this.f199016c = z;
            this.f199017d = imageView;
            this.f199018e = j;
        }

        /* renamed from: a */
        public void mo95336a(Bitmap bitmap, int i, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                Log.m105929w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", Integer.valueOf(i), str);
                return;
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C69171a(bitmap, i, str));
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$f */
    public class C69173f implements C69193v {

        /* renamed from: a */
        public final /* synthetic */ int f199026a;

        /* renamed from: b */
        public final /* synthetic */ int f199027b;

        /* renamed from: c */
        public final /* synthetic */ boolean f199028c;

        /* renamed from: d */
        public final /* synthetic */ ImageView f199029d;

        /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$f$a */
        public class C69174a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f199031d;

            /* renamed from: e */
            public final /* synthetic */ int f199032e;

            /* renamed from: f */
            public final /* synthetic */ String f199033f;

            /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$f$a$a */
            public class C69175a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ Bitmap f199035d;

                public C69175a(Bitmap bitmap) {
                    this.f199035d = bitmap;
                }

                /* JADX WARNING: Removed duplicated region for block: B:10:0x0065  */
                /* JADX WARNING: Removed duplicated region for block: B:11:0x0071  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r7 = this;
                        com.tencent.mm.plugin.luckymoney.model.b0$f$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69173f.C69174a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$f r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69173f.this
                        android.widget.ImageView r0 = r0.f199029d
                        r1 = 2131308573(0x7f09301d, float:1.8235405E38)
                        java.lang.Object r0 = r0.getTag(r1)
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        int r0 = r0.intValue()
                        r1 = 1
                        r2 = 0
                        r3 = 2
                        java.lang.String r4 = "MicroMsg.LuckyMoneyEnvelopeLogic"
                        if (r0 <= 0) goto L_0x002a
                        com.tencent.mm.plugin.luckymoney.model.b0$f$a r5 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69173f.C69174a.this
                        int r6 = r5.f199032e
                        if (r0 != r6) goto L_0x002a
                        com.tencent.mm.plugin.luckymoney.model.b0$f r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69173f.this
                        android.widget.ImageView r0 = r0.f199029d
                        android.graphics.Bitmap r5 = r7.f199035d
                        r0.setImageBitmap(r5)
                        goto L_0x0042
                    L_0x002a:
                        java.lang.Object[] r5 = new java.lang.Object[r3]
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        r5[r2] = r0
                        com.tencent.mm.plugin.luckymoney.model.b0$f$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69173f.C69174a.this
                        int r0 = r0.f199032e
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        r5[r1] = r0
                        java.lang.String r0 = "subtype，local：%s、callback：%s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r0, r5)
                    L_0x0042:
                        com.tencent.mm.plugin.luckymoney.model.b0$f$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69173f.C69174a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$f r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69173f.this
                        android.widget.ImageView r0 = r0.f199029d
                        r5 = 2131308577(0x7f093021, float:1.8235413E38)
                        java.lang.Object r0 = r0.getTag(r5)
                        java.lang.String r0 = (java.lang.String) r0
                        com.tencent.mm.plugin.luckymoney.model.b0$f$a r5 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69173f.C69174a.this
                        java.lang.String r5 = r5.f199033f
                        boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                        if (r5 != 0) goto L_0x0071
                        com.tencent.mm.plugin.luckymoney.model.b0$f$a r5 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69173f.C69174a.this
                        java.lang.String r5 = r5.f199033f
                        boolean r5 = r5.equals(r0)
                        if (r5 == 0) goto L_0x0071
                        com.tencent.mm.plugin.luckymoney.model.b0$f$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69173f.C69174a.this
                        com.tencent.mm.plugin.luckymoney.model.b0$f r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69173f.this
                        android.widget.ImageView r0 = r0.f199029d
                        android.graphics.Bitmap r1 = r7.f199035d
                        r0.setImageBitmap(r1)
                        goto L_0x0081
                    L_0x0071:
                        java.lang.Object[] r3 = new java.lang.Object[r3]
                        r3[r2] = r0
                        com.tencent.mm.plugin.luckymoney.model.b0$f$a r0 = com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69173f.C69174a.this
                        java.lang.String r0 = r0.f199033f
                        r3[r1] = r0
                        java.lang.String r0 = "url, local：%s,  callback：%s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r0, r3)
                    L_0x0081:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69173f.C69174a.C69175a.run():void");
                }
            }

            public C69174a(Bitmap bitmap, int i, String str) {
                this.f199031d = bitmap;
                this.f199032e = i;
                this.f199033f = str;
            }

            public void run() {
                Bitmap bitmap;
                C69173f fVar = C69173f.this;
                C69160b0 b0Var = C69160b0.this;
                Bitmap bitmap2 = this.f199031d;
                int i = fVar.f199026a;
                int i2 = fVar.f199027b;
                boolean z = fVar.f199028c;
                C35016g<C20828a> gVar = C69160b0.f198984d;
                b0Var.getClass();
                Log.m105919d("MicroMsg.LuckyMoneyEnvelopeLogic", "th: %s, tw: %s", Integer.valueOf(i), Integer.valueOf(i2));
                if (z) {
                    C76577a.m92151b(MMApplicationContext.getContext(), 6);
                }
                int ceil = (int) Math.ceil((double) (((float) bitmap2.getWidth()) * (((float) i) / ((float) bitmap2.getHeight()))));
                if (ceil <= 0 || i <= 0) {
                    Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "createChattingWidgtBubble error，wantedBitmapWidth：%s，targetHeight：%s", Integer.valueOf(ceil), Integer.valueOf(i));
                    bitmap = null;
                } else {
                    bitmap = Bitmap.createScaledBitmap(bitmap2, ceil, i, true);
                }
                ((C119157j) C119157j.f356862d).mo183895z(new C69175a(bitmap));
            }
        }

        public C69173f(int i, int i2, boolean z, ImageView imageView) {
            this.f199026a = i;
            this.f199027b = i2;
            this.f199028c = z;
            this.f199029d = imageView;
        }

        /* renamed from: a */
        public void mo95336a(Bitmap bitmap, int i, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                Log.m105929w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", Integer.valueOf(i), str);
                return;
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C69174a(bitmap, i, str));
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$g */
    public class C69176g implements C75142u0.C75149e {

        /* renamed from: a */
        public final /* synthetic */ ListScrollPAGView f199037a;

        /* renamed from: b */
        public final /* synthetic */ long f199038b;

        /* renamed from: c */
        public final /* synthetic */ HashSet f199039c;

        /* renamed from: d */
        public final /* synthetic */ View f199040d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f199041e;

        /* renamed from: f */
        public final /* synthetic */ C77994sf2 f199042f;

        public C69176g(C69160b0 b0Var, ListScrollPAGView listScrollPAGView, long j, HashSet hashSet, View view, ImageView imageView, C77994sf2 sf22) {
            this.f199037a = listScrollPAGView;
            this.f199038b = j;
            this.f199039c = hashSet;
            this.f199040d = view;
            this.f199041e = imageView;
            this.f199042f = sf22;
        }

        /* renamed from: a */
        public void mo95346a(C75142u0.C75143a aVar) {
            C75142u0.C75143a aVar2 = aVar;
            if (aVar2 instanceof C75142u0.C75143a.C75145b) {
                String str = ((C75142u0.C75143a.C75145b) aVar2).f221112a;
                int intValue = ((Integer) this.f199037a.getTag(C0966R.C0970id.o9g)).intValue();
                Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "loadBubblePagView downloadComplete success，id: %s，file path: %s, status：%s，hasplay：%s", Long.valueOf(this.f199038b), str, Integer.valueOf(intValue), Boolean.valueOf(this.f199039c.contains(Long.valueOf(this.f199038b))));
                if (intValue == 1) {
                    C69198d0.f199107a.mo95355e(0, str, this.f199037a);
                    View view = this.f199040d;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$17", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$17", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f199041e.setVisibility(8);
                    C77999tf2 tf22 = this.f199042f.f228203g;
                    if (tf22 != null) {
                        C115669n.INSTANCE.mo160131h(28153, tf22.f228259w, 1, 1);
                    }
                }
            } else {
                Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "downloadComplete failed，errorCode: %s", Integer.valueOf(((C75142u0.C75143a.C75144a) aVar2).f221111a));
                View view3 = this.f199040d;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$17", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$17", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f199041e.setVisibility(8);
                C77999tf2 tf23 = this.f199042f.f228203g;
                if (tf23 != null) {
                    C115669n.INSTANCE.mo160131h(28153, tf23.f228259w, 2, 1);
                }
            }
            this.f199037a.setTag(C0966R.C0970id.o9g, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$h */
    public class C69177h implements C75142u0.C75149e {

        /* renamed from: a */
        public final /* synthetic */ ListScrollPAGView f199043a;

        /* renamed from: b */
        public final /* synthetic */ boolean f199044b;

        /* renamed from: c */
        public final /* synthetic */ long f199045c;

        /* renamed from: d */
        public final /* synthetic */ View f199046d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f199047e;

        /* renamed from: f */
        public final /* synthetic */ C77994sf2 f199048f;

        /* renamed from: g */
        public final /* synthetic */ HashSet f199049g;

        public C69177h(C69160b0 b0Var, ListScrollPAGView listScrollPAGView, boolean z, long j, View view, ImageView imageView, C77994sf2 sf22, HashSet hashSet) {
            this.f199043a = listScrollPAGView;
            this.f199044b = z;
            this.f199045c = j;
            this.f199046d = view;
            this.f199047e = imageView;
            this.f199048f = sf22;
            this.f199049g = hashSet;
        }

        /* renamed from: a */
        public void mo95346a(C75142u0.C75143a aVar) {
            C75142u0.C75143a aVar2 = aVar;
            if (aVar2 instanceof C75142u0.C75143a.C75145b) {
                String str = ((C75142u0.C75143a.C75145b) aVar2).f221112a;
                int intValue = ((Integer) this.f199043a.getTag(C0966R.C0970id.o9f)).intValue();
                Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "setBubblePagView downloadComplete success，file path: %s, needPlay：%s，status: %s，id:%s", str, Boolean.valueOf(this.f199044b), Integer.valueOf(intValue), Long.valueOf(this.f199045c));
                if (intValue == 1) {
                    if (this.f199044b) {
                        C69198d0.f199107a.mo95355e(0, str, this.f199043a);
                        View view = this.f199046d;
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar3.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$18", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$18", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f199047e.setVisibility(8);
                        C77999tf2 tf22 = this.f199048f.f228203g;
                        if (tf22 != null) {
                            C115669n.INSTANCE.mo160131h(28153, tf22.f228259w, 1, 1);
                        }
                    } else if (!this.f199049g.contains(Long.valueOf(this.f199045c))) {
                        this.f199043a.mo21226m();
                        this.f199043a.mo21224k(str);
                        this.f199043a.setProgress(0.0d);
                        View view3 = this.f199046d;
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar4.mo10233c(0);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$18", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$18", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f199047e.setVisibility(8);
                    }
                }
            } else {
                Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "downloadComplete failed，errorCode: %s", Integer.valueOf(((C75142u0.C75143a.C75144a) aVar2).f221111a));
                View view5 = this.f199046d;
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar5.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$18", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogic$18", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f199047e.setVisibility(8);
            }
            this.f199043a.setTag(C0966R.C0970id.o9f, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$i */
    public class C69178i implements C69193v {

        /* renamed from: a */
        public final /* synthetic */ C75672b.C75673a f199050a;

        public C69178i(C69160b0 b0Var, C75672b.C75673a aVar) {
            this.f199050a = aVar;
        }

        /* renamed from: a */
        public void mo95336a(Bitmap bitmap, int i, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                this.f199050a.onComplete(false);
            } else {
                this.f199050a.onComplete(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$k */
    public class C69179k implements Runnable {

        /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$k$a */
        public class C69180a implements C75097a.C75099b<C78007w82> {
            public C69180a() {
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo67542a(Object obj) {
                C78007w82 w822 = (C78007w82) obj;
            }

            /* renamed from: b */
            public void mo67543b(Object obj, int i, int i2) {
                LinkedList<C77994sf2> linkedList;
                C78007w82 w822 = (C78007w82) obj;
                Log.m105924i("MicroMsg.LuckyMoneyEnvelopeLogic", "do get show source net callback");
                if (w822 != null) {
                    Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "retcode: %s", Integer.valueOf(w822.f228340d));
                    if (w822.f228340d == 0 && (linkedList = w822.f228342f) != null) {
                        Iterator<C77994sf2> it = linkedList.iterator();
                        while (it.hasNext()) {
                            C77994sf2 next = it.next();
                            Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "load resource: %s, %s", next.f228200d, next.f228202f);
                            if (next.f228201e <= 0) {
                                C69160b0.this.mo95325nE(next);
                            }
                        }
                    }
                }
            }
        }

        public C69179k() {
        }

        public void run() {
            C42519p g = C42519p.m46167g();
            g.f221004c = new C42516e("", 1);
            g.mo104792c(new C69180a(), true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$l */
    public class C69181l implements C69193v {

        /* renamed from: a */
        public final /* synthetic */ ImageView f199053a;

        /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$l$a */
        public class C69182a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f199054d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f199055e;

            public C69182a(String str, Bitmap bitmap) {
                this.f199054d = str;
                this.f199055e = bitmap;
            }

            public void run() {
                String str = (String) C69181l.this.f199053a.getTag(C0966R.C0970id.gep);
                if (Util.isNullOrNil(this.f199054d) || !this.f199054d.equals(str)) {
                    Log.m105929w("MicroMsg.LuckyMoneyEnvelopeLogic", "pss url: %s, %s", str, this.f199054d);
                    return;
                }
                C69181l.this.f199053a.setImageBitmap(this.f199055e);
            }
        }

        public C69181l(C69160b0 b0Var, ImageView imageView) {
            this.f199053a = imageView;
        }

        /* renamed from: a */
        public void mo95336a(Bitmap bitmap, int i, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                Log.m105929w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", Integer.valueOf(i), str);
                return;
            }
            C69160b0.Ex0(new C69182a(str, bitmap));
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$m */
    public class C69183m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f199057d;

        /* renamed from: e */
        public final /* synthetic */ int f199058e;

        /* renamed from: f */
        public final /* synthetic */ String f199059f;

        /* renamed from: g */
        public final /* synthetic */ C75672b.C75673a f199060g;

        /* renamed from: h */
        public final /* synthetic */ ImageView f199061h;

        /* renamed from: i */
        public final /* synthetic */ long f199062i;

        public C69183m(Bitmap bitmap, int i, String str, C75672b.C75673a aVar, ImageView imageView, long j) {
            this.f199057d = bitmap;
            this.f199058e = i;
            this.f199059f = str;
            this.f199060g = aVar;
            this.f199061h = imageView;
            this.f199062i = j;
        }

        public void run() {
            Bitmap bitmap = this.f199057d;
            if (bitmap == null || bitmap.isRecycled()) {
                Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", Integer.valueOf(this.f199058e), this.f199059f);
                C75672b.C75673a aVar = this.f199060g;
                if (aVar != null) {
                    aVar.onComplete(false);
                    return;
                }
                return;
            }
            int intValue = ((Integer) this.f199061h.getTag(C0966R.C0970id.gel)).intValue();
            if (intValue <= 0 || intValue != this.f199058e) {
                Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "pss subType: %s, %s", Integer.valueOf(intValue), Integer.valueOf(this.f199058e));
            } else {
                this.f199061h.setImageBitmap(this.f199057d);
            }
            C75672b.C75673a aVar2 = this.f199060g;
            if (aVar2 != null) {
                aVar2.onComplete(true);
            }
            if (this.f199061h.getId() == C0966R.C0970id.k6o) {
                C69160b0.vx0(C69160b0.this, this.f199061h, this.f199059f, 3, this.f199058e, this.f199062i);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$n */
    public class C69184n implements C69193v {

        /* renamed from: a */
        public final /* synthetic */ C75672b.C75673a f199064a;

        /* renamed from: b */
        public final /* synthetic */ ImageView f199065b;

        /* renamed from: c */
        public final /* synthetic */ long f199066c;

        /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$n$a */
        public class C69185a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f199068d;

            /* renamed from: e */
            public final /* synthetic */ int f199069e;

            /* renamed from: f */
            public final /* synthetic */ String f199070f;

            public C69185a(Bitmap bitmap, int i, String str) {
                this.f199068d = bitmap;
                this.f199069e = i;
                this.f199070f = str;
            }

            public void run() {
                Bitmap bitmap = this.f199068d;
                if (bitmap == null || bitmap.isRecycled()) {
                    Log.m105929w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", Integer.valueOf(this.f199069e), this.f199070f);
                    C75672b.C75673a aVar = C69184n.this.f199064a;
                    if (aVar != null) {
                        aVar.onComplete(false);
                        return;
                    }
                    return;
                }
                String str = (String) C69184n.this.f199065b.getTag(C0966R.C0970id.gep);
                if (Util.isNullOrNil(this.f199070f) || !this.f199070f.equals(str)) {
                    Log.m105929w("MicroMsg.LuckyMoneyEnvelopeLogic", "pss url: %s, %s", str, this.f199070f);
                } else {
                    C69184n.this.f199065b.setImageBitmap(this.f199068d);
                }
                C75672b.C75673a aVar2 = C69184n.this.f199064a;
                if (aVar2 != null) {
                    aVar2.onComplete(true);
                }
                if (C69184n.this.f199065b.getId() == C0966R.C0970id.k6o) {
                    C69184n nVar = C69184n.this;
                    C69160b0.vx0(C69160b0.this, nVar.f199065b, this.f199070f, 3, this.f199069e, nVar.f199066c);
                }
            }
        }

        public C69184n(C75672b.C75673a aVar, ImageView imageView, long j) {
            this.f199064a = aVar;
            this.f199065b = imageView;
            this.f199066c = j;
        }

        /* renamed from: a */
        public void mo95336a(Bitmap bitmap, int i, String str) {
            C69160b0.Ex0(new C69185a(bitmap, i, str));
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$o */
    public class C69186o implements C75097a.C75099b<C51206s72> {
        public C69186o() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo67542a(Object obj) {
            C51206s72 s722 = (C51206s72) obj;
        }

        /* renamed from: b */
        public void mo67543b(Object obj, int i, int i2) {
            C51206s72 s722 = (C51206s72) obj;
            if (s722 != null) {
                C77993rp3 rp32 = s722.f141354d;
                if (rp32 != null) {
                    rp32.f228175C = s722.f141355e;
                }
                C69160b0.this.mo95318Ng(rp32, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$p */
    public class C69187p implements C69193v {

        /* renamed from: a */
        public final /* synthetic */ long f199073a;

        public C69187p(long j) {
            this.f199073a = j;
        }

        /* renamed from: a */
        public void mo95336a(Bitmap bitmap, int i, String str) {
            C69160b0.vx0(C69160b0.this, (ImageView) null, str, 4, i, this.f199073a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$q */
    public class C69188q implements C69193v {

        /* renamed from: a */
        public final /* synthetic */ long f199075a;

        public C69188q(long j) {
            this.f199075a = j;
        }

        /* renamed from: a */
        public void mo95336a(Bitmap bitmap, int i, String str) {
            C69160b0.vx0(C69160b0.this, (ImageView) null, str, 4, i, this.f199075a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$r */
    public class C69189r implements C98127h.C98128a {
        public C69189r(C69160b0 b0Var) {
        }

        /* renamed from: e */
        public void mo17917e(String str, long j, long j2) {
        }

        /* renamed from: g */
        public void mo17918g(String str, int i, C98121d dVar) {
        }

        public void onDataAvailable(String str, long j, long j2) {
        }

        public void onM3U8Ready(String str, String str2) {
        }

        public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$s */
    public class C69190s implements C69193v {

        /* renamed from: a */
        public final /* synthetic */ long f199077a;

        public C69190s(long j) {
            this.f199077a = j;
        }

        /* renamed from: a */
        public void mo95336a(Bitmap bitmap, int i, String str) {
            C69160b0.vx0(C69160b0.this, (ImageView) null, str, 1, i, this.f199077a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$t */
    public class C69191t implements C69193v {

        /* renamed from: a */
        public final /* synthetic */ long f199079a;

        public C69191t(long j) {
            this.f199079a = j;
        }

        /* renamed from: a */
        public void mo95336a(Bitmap bitmap, int i, String str) {
            C69160b0.vx0(C69160b0.this, (ImageView) null, str, 3, i, this.f199079a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$u */
    public class C69192u implements C69193v {

        /* renamed from: a */
        public final /* synthetic */ long f199081a;

        public C69192u(long j) {
            this.f199081a = j;
        }

        /* renamed from: a */
        public void mo95336a(Bitmap bitmap, int i, String str) {
            C69160b0.vx0(C69160b0.this, (ImageView) null, str, 2, i, this.f199081a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$v */
    public interface C69193v {
        /* renamed from: a */
        void mo95336a(Bitmap bitmap, int i, String str);
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.b0$j */
    public class C69194j implements C35015b<C20828a> {
        public Object get() {
            C20935b.C20936a aVar = new C20935b.C20936a(MMApplicationContext.getContext());
            aVar.f59312m = C98334a.m127117a(C20935b.f59285o, 5);
            return new C20828a(aVar.mo32665a());
        }
    }

    public static void Ex0(Runnable runnable) {
        if (MMHandlerThread.isMainThread()) {
            runnable.run();
        } else {
            MMHandlerThread.postToMainThread(runnable);
        }
    }

    public static void vx0(C69160b0 b0Var, ImageView imageView, String str, int i, int i2, long j) {
        b0Var.getClass();
        int i3 = imageView == null ? 2 : 1;
        C115669n.INSTANCE.mo160131h(19232, Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2 + 1), Long.valueOf(SystemClock.elapsedRealtime() - j), str);
    }

    public final void Ax0(String str, String str2, String str3) {
        Cx0(str, str2, str3, 0, 0, false, false, 0, (C69193v) null);
    }

    public final void Bx0(String str, String str2, String str3, int i, int i2, boolean z, C69193v vVar) {
        Cx0(str, str2, str3, 0, 0, z, false, 0, vVar);
    }

    public final void Cx0(String str, String str2, String str3, int i, int i2, boolean z, boolean z2, int i3, C69193v vVar) {
        Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "load image: %s, %s,width :%s , height :%s", str, str2, Integer.valueOf(i), Integer.valueOf(i2));
        if (!Util.isNullOrNil(str)) {
            C20828a a = f198984d.mo59825a();
            if (i2 <= 0) {
                i2 = C76577a.m92159j(MMApplicationContext.getContext());
            }
            if (i <= 0) {
                i = C76577a.m92145A(MMApplicationContext.getContext());
            }
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59351g = C75846b.zx0().Dx0();
            bVar.f59354j = i;
            bVar.f59355k = i2;
            bVar.f59364t = z;
            bVar.f59357m = z2;
            bVar.f59358n = i3;
            bVar.f59346b = true;
            a.mo32520i(str, (ImageView) null, bVar.mo32666a(), new C69161a(this, str3, str2, vVar));
        } else if (vVar != null) {
            vVar.mo95336a((Bitmap) null, 0, str);
        }
    }

    public final void Dx0(String str, String str2, String str3, C69193v vVar) {
        Cx0(str, str2, str3, 0, 0, false, false, 0, vVar);
    }

    /* renamed from: Jk */
    public void mo95317Jk(ImageView imageView, C77994sf2 sf22) {
        Log.m105918d("MicroMsg.LuckyMoneyEnvelopeLogic", "load crop view");
        if (imageView != null && sf22 != null) {
            yx0(sf22, 3, new C69162b(this, imageView), 0, 0);
        }
    }

    /* renamed from: Ng */
    public void mo95318Ng(C77993rp3 rp32, boolean z) {
        C77993rp3 rp33 = rp32;
        if (rp33 != null) {
            Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "do preload red packet: %s", rp33.f228186q);
            if (!Util.isNullOrNil(rp33.f228177e)) {
                Ax0(rp33.f228177e, rp33.f228178f, rp33.f228186q);
            }
            if (!rp33.f228181i.isEmpty()) {
                for (int i = 0; i < rp33.f228181i.size(); i++) {
                    vb4 vb4 = rp33.f228181i.get(i);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (vb4.f228306d == 1) {
                        Dx0(vb4.f228307e, vb4.f228308f, rp33.f228186q, new C69187p(elapsedRealtime));
                    } else {
                        Dx0(vb4.f228311i, vb4.f228312j, rp33.f228186q, new C69188q(elapsedRealtime));
                        if (z && (NetStatusUtil.isWifi(MMApplicationContext.getContext()) || NetStatusUtil.is4G(MMApplicationContext.getContext()))) {
                            String str = vb4.f228307e;
                            Set<String> set = EnvelopeStoryVideoManager.f272049j;
                            String str2 = "MMVideo_" + str.hashCode();
                            String a = EnvelopeStoryVideoManager.m119067a(vb4.f228307e);
                            boolean z2 = EnvelopeStoryVideoManager.m119068b().getInt(str2, 0) == 1;
                            boolean k = C86013q1.m106450k(a);
                            Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "do story video preload: %s, %s", Boolean.valueOf(z2), Boolean.valueOf(k));
                            if (!k && !z2) {
                                if (EnvelopeStoryVideoManager.m119069c(rp33.f228175C, C69266u0.m81634B(rp33.f228175C, i))) {
                                    Log.m105924i("MicroMsg.LuckyMoneyEnvelopeLogic", "[static luckymoney resource] has local video，do not preload");
                                    return;
                                }
                                EnvelopeStoryVideoManager.m119070f(str2, a, vb4.f228307e, vb4.f228308f, true, (C98124g.C98125a) null, new C69189r(this));
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: Oy */
    public void mo95319Oy(View view, View view2, C77994sf2 sf22, C0000n0 n0Var, boolean z, long j, HashSet<Long> hashSet, boolean z2, ImageView imageView) {
        View view3 = view2;
        C77994sf2 sf23 = sf22;
        Log.m105918d("MicroMsg.LuckyMoneyEnvelopeLogic", "setBubblePagView");
        if (view3 != null && sf23 != null && (view3 instanceof ListScrollPAGView)) {
            ListScrollPAGView listScrollPAGView = (ListScrollPAGView) view3;
            listScrollPAGView.setTag(C0966R.C0970id.o9f, 1);
            C69198d0.f199107a.mo95352b(sf23, 0, n0Var, new C69177h(this, listScrollPAGView, z2, j, view, imageView, sf22, hashSet));
        }
    }

    public void P30(ImageView imageView, C77994sf2 sf22, C75672b.C75673a aVar, int i, int i2) {
        if (imageView != null && sf22 != null) {
            Log.m105919d("MicroMsg.LuckyMoneyEnvelopeLogic", "loadCoverWidgetView： %s，%s,%s", sf22.f228202f, Integer.valueOf(i), Integer.valueOf(i2));
            imageView.setTag(C0966R.C0970id.gep, sf22.f228203g.f228251o);
            imageView.setTag(C0966R.C0970id.gel, Integer.valueOf(sf22.f228201e));
            yx0(sf22, 7, new C69167d(this, aVar, i, i2, imageView), i, i2);
        }
    }

    /* renamed from: Ug */
    public void mo95321Ug(ImageView imageView, String str, String str2, String str3, int i, int i2, boolean z, int i3, C75672b.C75673a aVar, int i4, int i5, int i6) {
        Bitmap bitmap;
        ImageView imageView2 = imageView;
        int i7 = i;
        int i8 = i2;
        int i9 = i5;
        int i15 = i6;
        Log.m105924i("MicroMsg.LuckyMoneyEnvelopeLogic", "load story view");
        if (imageView2 != null && !Util.isNullOrNil(str)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            imageView2.setTag(C0966R.C0970id.gep, str);
            imageView2.setTag(C0966R.C0970id.gel, Integer.valueOf(i4));
            Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "subTypeID：%s，envelopeType：%s,index:%s", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
            if (i4 > 0) {
                boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_lucky_money_envelope_load_local_photo_res_config, true);
                Log.m105919d("MicroMsg.LuckyMoneyEnvelopeLogic", " [static luckymoney resource switch]canGetLuckyMoneyEnvelopeLocalPhotoRes ：%s", Boolean.valueOf(wf));
                if (wf) {
                    Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "[static luckymoney resource] use local：LuckyMoneyEnvelopeLocalPhotoRes - subTypeID：%s，envelopeType：%s,index:%s ", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
                    Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "get StoryBitmap subtype: %s, %s", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
                    if (i9 == 4) {
                        String q = C69266u0.m81636q(i4);
                        bitmap = zx0(new C86009m1(q, "detail_image_" + i15 + ".png"), "", i7, i8);
                    } else if (i9 == 5) {
                        String q2 = C69266u0.m81636q(i4);
                        bitmap = zx0(new C86009m1(q2, "detail_video_thumb_" + i15 + ".png"), "", i7, i8);
                    } else if (i9 == 2) {
                        bitmap = zx0(new C86009m1(C69266u0.m81635d(i4), "detail.png"), "", i7, i8);
                    } else {
                        String str4 = C69266u0.f199336d;
                        ((C32147e) C86312j.m106911c(C32147e.class)).Yi0(58);
                        Log.m105929w("MicroMsg.LuckyMoneyEnvelopeLogic", "can't find subtype res: %s", Integer.valueOf(i4));
                        bitmap = null;
                    }
                    if (bitmap == null) {
                        Log.m105920e("MicroMsg.LuckyMoneyEnvelopeLogic", "[static luckymoney resource] use local：LuckyMoneyEnvelopeLocalPhotoRes fail");
                        C115669n.INSTANCE.mo175911u(991, 5);
                    }
                    if (bitmap != null) {
                        Ex0(new C69183m(bitmap, i4, str, aVar, imageView, elapsedRealtime));
                        return;
                    }
                }
            }
            Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "[static luckymoney resource] use net：LuckyMoneyEnvelopeLocalPhotoRes - subTypeID：%s，envelopeType：%s,index:%s ", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
            Cx0(str, str2, str3, i2, i, false, z, i3, new C69184n(aVar, imageView, elapsedRealtime));
        }
    }

    /* renamed from: b6 */
    public void mo95322b6(ImageView imageView, String str, String str2, String str3, int i, int i2) {
        Log.m105918d("MicroMsg.LuckyMoneyEnvelopeLogic", "load logo view");
        if (imageView != null && !Util.isNullOrNil(str)) {
            imageView.setTag(C0966R.C0970id.gep, str);
            Bx0(str, str2, str3, i2, i, true, new C69181l(this, imageView));
        }
    }

    public void ba0(ImageView imageView, int i, int i2, C77994sf2 sf22, boolean z, int i3) {
        ImageView imageView2 = imageView;
        C77994sf2 sf23 = sf22;
        Log.m105919d("MicroMsg.LuckyMoneyEnvelopeLogic", "load chatting view: %s", Boolean.valueOf(z));
        if (imageView2 != null && sf23 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            imageView.setTag(C0966R.C0970id.gep, sf23.f228203g.f228244e);
            imageView.setTag(C0966R.C0970id.gel, Integer.valueOf(sf23.f228201e));
            yx0(sf22, i3, new C69170e(i, i2, z, imageView, elapsedRealtime), 0, 0);
        }
    }

    public void lw0(View view, View view2, C77994sf2 sf22, C0000n0 n0Var, boolean z, long j, HashSet<Long> hashSet, ImageView imageView) {
        View view3 = view2;
        C77994sf2 sf23 = sf22;
        Log.m105918d("MicroMsg.LuckyMoneyEnvelopeLogic", "loadBubblePagView");
        if (view3 != null && sf23 != null && (view3 instanceof ListScrollPAGView)) {
            ListScrollPAGView listScrollPAGView = (ListScrollPAGView) view3;
            listScrollPAGView.setTag(C0966R.C0970id.o9g, 1);
            C69198d0.f199107a.mo95352b(sf23, 0, n0Var, new C69176g(this, listScrollPAGView, j, hashSet, view, imageView, sf22));
        }
    }

    /* renamed from: nE */
    public void mo95325nE(C77994sf2 sf22) {
        Log.m105924i("MicroMsg.LuckyMoneyEnvelopeLogic", "trigger load envelope resources");
        if (sf22 != null && sf22.f228203g != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C77999tf2 tf22 = sf22.f228203g;
            if (!Util.isNullOrNil(tf22.f228244e) && !Util.isNullOrNil(tf22.f228247h)) {
                Dx0(tf22.f228244e, tf22.f228247h, sf22.f228202f, new C69190s(elapsedRealtime));
            }
            if (!Util.isNullOrNil(tf22.f228246g) && !Util.isNullOrNil(tf22.f228249j)) {
                Dx0(tf22.f228246g, tf22.f228249j, sf22.f228202f, new C69191t(elapsedRealtime));
            }
            if (!Util.isNullOrNil(tf22.f228243d) && !Util.isNullOrNil(tf22.f228250n)) {
                Ax0(tf22.f228243d, tf22.f228250n, sf22.f228202f);
            }
            if (!Util.isNullOrNil(tf22.f228245f) && !Util.isNullOrNil(tf22.f228248i)) {
                Dx0(tf22.f228245f, tf22.f228248i, sf22.f228202f, new C69192u(elapsedRealtime));
            }
            if (!Util.isNullOrNil(tf22.f228253q) && !Util.isNullOrNil(tf22.f228254r)) {
                Ax0(tf22.f228253q, tf22.f228254r, sf22.f228202f);
            }
            if (!Util.isNullOrNil(tf22.f228251o) && !Util.isNullOrNil(tf22.f228252p)) {
                Ax0(tf22.f228251o, tf22.f228252p, sf22.f228202f);
            }
            C0000n0 a = C75142u0.f221103a.mo104865a();
            if (!Util.isNullOrNil(tf22.f228258v)) {
                C69198d0 d0Var = C69198d0.f199107a;
                String str = tf22.f228258v;
                d0Var.mo95351a(str, d0Var.mo95353c(str, C69198d0.f199110d), a, (C75142u0.C75149e) null);
            }
            if (!Util.isNullOrNil(tf22.f228259w)) {
                C69198d0 d0Var2 = C69198d0.f199107a;
                String str2 = tf22.f228259w;
                d0Var2.mo95351a(str2, d0Var2.mo95353c(str2, C69198d0.f199109c), a, (C75142u0.C75149e) null);
            }
            if (!Util.isNullOrNil(tf22.f228260x)) {
                C69198d0 d0Var3 = C69198d0.f199107a;
                String str3 = tf22.f228260x;
                d0Var3.mo95351a(str3, d0Var3.mo95353c(str3, C69198d0.f199111e), a, (C75142u0.C75149e) null);
            }
            if (!Util.isNullOrNil(tf22.f228261y)) {
                C69198d0 d0Var4 = C69198d0.f199107a;
                String str4 = tf22.f228261y;
                d0Var4.mo95351a(str4, d0Var4.mo95353c(str4, C69198d0.f199112f), a, (C75142u0.C75149e) null);
            }
            if (!Util.isNullOrNil(tf22.f228239A)) {
                String str5 = tf22.f228239A;
                Ax0(str5, MD5Util.getMD5String(str5), sf22.f228202f);
            }
        }
    }

    public void ng0(ImageView imageView, C77994sf2 sf22, C75672b.C75673a aVar, int i, int i2, int i3) {
        C77994sf2 sf23 = sf22;
        if (imageView != null && sf23 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Log.m105919d("MicroMsg.LuckyMoneyEnvelopeLogic", "loadCoverView: %s, %s, %s", sf23.f228202f, Integer.valueOf(i), Integer.valueOf(i2));
            imageView.setTag(C0966R.C0970id.gep, sf23.f228203g.f228245f);
            imageView.setTag(C0966R.C0970id.gel, Integer.valueOf(sf23.f228201e));
            yx0(sf22, 1, new C69164c(aVar, i, i2, i3, imageView, elapsedRealtime), i, i2);
        }
    }

    /* renamed from: sy */
    public void mo95327sy(ImageView imageView, int i, int i2, C77994sf2 sf22, boolean z) {
        if (imageView != null && sf22 != null) {
            imageView.setTag(C0966R.C0970id.gep, sf22.f228203g.f228253q);
            imageView.setTag(C0966R.C0970id.gel, Integer.valueOf(sf22.f228201e));
            yx0(sf22, 6, new C69173f(i, i2, z, imageView), 0, 0);
        }
    }

    public void vi0(ImageView imageView, String str, String str2, String str3, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        mo95321Ug(imageView, str, str2, str3, i, i2, z, i3, (C75672b.C75673a) null, i4, i5, i6);
    }

    /* renamed from: wA */
    public void mo95329wA(boolean z, boolean z2) {
        Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "trigger laod envelope after receive: %s, %s", Boolean.valueOf(z), Boolean.valueOf(z2));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC, 1);
        if (z) {
            ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33510s(C72994y1.C72995a.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_STRING_SYNC, true);
        }
        C86709a0.m107524d().mo123460f(new C69271w1(0, "v1.0", 1));
        if (z2) {
            MMHandlerThread.postToMainThread(new C69179k());
        }
    }

    public void wx0(C77994sf2 sf22, int i, C69193v vVar, int i2, int i3) {
        C77999tf2 tf22;
        C77994sf2 sf23 = sf22;
        int i4 = i;
        C69193v vVar2 = vVar;
        Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "get bitmap by url: %s", Integer.valueOf(i));
        if (sf23 != null && (tf22 = sf23.f228203g) != null) {
            if (i4 != 0) {
                if (i4 == 1) {
                    int b = C76577a.m92151b(MMApplicationContext.getContext(), C82086j.CTRL_INDEX);
                    int b2 = C76577a.m92151b(MMApplicationContext.getContext(), 480);
                    if (i2 <= 0 || i3 <= 0) {
                        Bx0(tf22.f228245f, tf22.f228248i, sf23.f228202f, b, b2, false, vVar);
                        return;
                    }
                    Cx0(tf22.f228245f, tf22.f228248i, sf23.f228202f, i2, i3, false, false, 0, vVar);
                    return;
                } else if (i4 == 2) {
                    Dx0(tf22.f228246g, tf22.f228249j, sf23.f228202f, vVar);
                    return;
                } else if (i4 == 3) {
                    int dimensionPixelSize = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.aej);
                    String str = tf22.f228243d;
                    String str2 = tf22.f228250n;
                    String str3 = sf23.f228202f;
                    Bx0(str, str2, str3, (int) (((float) dimensionPixelSize) / 0.2194f), dimensionPixelSize, false, vVar);
                    return;
                } else if (i4 == 6) {
                    Dx0(tf22.f228253q, tf22.f228254r, sf23.f228202f, vVar);
                    return;
                } else if (i4 == 7) {
                    int b3 = (int) (((float) C76577a.m92151b(MMApplicationContext.getContext(), C82086j.CTRL_INDEX)) * 1.1f);
                    int i5 = (int) (((float) b3) * 1.72f);
                    if (i2 <= 0 || i3 <= 0) {
                        Bx0(tf22.f228251o, tf22.f228252p, sf23.f228202f, b3, i5, false, vVar);
                        return;
                    }
                    Cx0(tf22.f228251o, tf22.f228252p, sf23.f228202f, i2, i3, false, false, 0, vVar);
                    return;
                } else if (i4 != 8) {
                    return;
                }
            }
            Dx0(tf22.f228244e, tf22.f228247h, sf23.f228202f, vVar);
        }
    }

    /* renamed from: xk */
    public void mo95331xk(String str, String str2, String str3, C75672b.C75673a aVar) {
        Dx0(str, str2, str3, new C69178i(this, aVar));
    }

    public final Bitmap xx0(C86009m1 m1Var, String str) {
        boolean g = m1Var.mo119967g();
        boolean p = m1Var.mo119978p();
        String q = C86013q1.m106456q(m1Var.mo119976n());
        if (Util.isNullOrNil(q)) {
            return null;
        }
        boolean equals = q.equals(str);
        Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "get from file: %s, %s, %s", Boolean.valueOf(g), Boolean.valueOf(p), Boolean.valueOf(equals));
        if (g && p && equals) {
            return BitmapUtil.decodeFile(m1Var.mo119971i());
        }
        if (!equals) {
            C115669n.INSTANCE.mo175911u(991, 3);
        }
        if (!g) {
            C115669n.INSTANCE.mo175911u(991, 4);
        }
        return null;
    }

    /* renamed from: yT */
    public void mo95333yT(C68067h hVar, String str) {
        Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "do trigger load red packet story: %s, %s", hVar.f195445k, Boolean.valueOf(hVar.f195449o));
        Ax0(hVar.f195447m, hVar.f195448n, hVar.f195445k);
        if (!Util.isNullOrNil(hVar.f195445k) && hVar.f195449o) {
            C67149a aVar = new C67149a();
            aVar.field_packet_id = hVar.f195445k;
            boolean z = C75846b.zx0().Cx0().get(aVar, new String[0]);
            if (System.currentTimeMillis() - aVar.field_update_time > 86400000) {
                Log.m105928w("MicroMsg.LuckyMoneyEnvelopeLogic", "need refetch story data");
                z = false;
            }
            Log.m105925i("MicroMsg.LuckyMoneyEnvelopeLogic", "trigger load red packet story resource: %s", Boolean.valueOf(z));
            if (!z) {
                C67004b bVar = new C67004b();
                bVar.f221004c = new C39486a(hVar.f195445k, false, str);
                bVar.mo104793d(new C69186o(), true, 50);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void yx0(te3.C77994sf2 r10, int r11, com.tencent.p014mm.plugin.luckymoney.model.C69160b0.C69193v r12, int r13, int r14) {
        /*
            r9 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.LuckyMoneyEnvelopeLogic"
            java.lang.String r4 = "get envelope: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            if (r10 != 0) goto L_0x0014
            return
        L_0x0014:
            int r1 = r10.f228201e
            r4 = 2
            if (r1 <= 0) goto L_0x0149
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_android_lucky_money_load_local_photo_res_config
            boolean r1 = r1.mo58784wf(r5, r0)
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            r5[r3] = r6
            java.lang.String r6 = " [static luckymoney resource switch]canGetLuckyMoneyLocalPhotoRes ：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r6, r5)
            if (r1 == 0) goto L_0x0149
            java.lang.Object[] r1 = new java.lang.Object[r4]
            int r5 = r10.f228201e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r3] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r1[r0] = r5
            java.lang.String r5 = "[static luckymoney resource] use local：LuckyMoneyLocalPhotoRes：%s,type：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r1)
            int r1 = r10.f228201e
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r5[r3] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r5[r0] = r6
            java.lang.String r6 = "get bitmap subtype: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r5)
            java.lang.String r5 = com.tencent.p014mm.plugin.luckymoney.model.C69266u0.m81635d(r1)
            com.tencent.mm.plugin.luckymoney.model.w0 r6 = new com.tencent.mm.plugin.luckymoney.model.w0
            r6.<init>()
            r6.field_subtype = r1
            g32.b r7 = g32.C75846b.zx0()
            nr3.g<com.tencent.mm.plugin.luckymoney.model.x0> r7 = r7.f222492j
            java.lang.Object r7 = r7.mo59825a()
            com.tencent.mm.plugin.luckymoney.model.x0 r7 = (com.tencent.p014mm.plugin.luckymoney.model.C30170x0) r7
            java.lang.String[] r8 = new java.lang.String[r3]
            boolean r7 = r7.get(r6, (java.lang.String[]) r8)
            if (r7 == 0) goto L_0x00f6
            if (r11 != 0) goto L_0x0090
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.String r4 = "bubble.png"
            r1.<init>((java.lang.String) r5, (java.lang.String) r4)
            java.lang.String r4 = r6.field_bubbleMd5
            android.graphics.Bitmap r1 = r9.xx0(r1, r4)
            goto L_0x0111
        L_0x0090:
            if (r11 != r0) goto L_0x00a1
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.String r4 = "cover.png"
            r1.<init>((java.lang.String) r5, (java.lang.String) r4)
            java.lang.String r4 = r6.field_coverMd5
            android.graphics.Bitmap r1 = r9.xx0(r1, r4)
            goto L_0x0111
        L_0x00a1:
            r1 = 3
            if (r11 != r1) goto L_0x00b2
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.String r4 = "minilogo.png"
            r1.<init>((java.lang.String) r5, (java.lang.String) r4)
            java.lang.String r4 = r6.field_minilogoMd5
            android.graphics.Bitmap r1 = r9.xx0(r1, r4)
            goto L_0x0111
        L_0x00b2:
            if (r11 != r4) goto L_0x00c2
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.String r4 = "detail.png"
            r1.<init>((java.lang.String) r5, (java.lang.String) r4)
            java.lang.String r4 = r6.field_detailMd5
            android.graphics.Bitmap r1 = r9.xx0(r1, r4)
            goto L_0x0111
        L_0x00c2:
            r1 = 6
            if (r11 != r1) goto L_0x00d3
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.String r4 = "bubblwidget.png"
            r1.<init>((java.lang.String) r5, (java.lang.String) r4)
            java.lang.String r4 = r6.field_bubblewidgetMd5
            android.graphics.Bitmap r1 = r9.xx0(r1, r4)
            goto L_0x0111
        L_0x00d3:
            r1 = 7
            if (r11 != r1) goto L_0x00e4
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.String r4 = "coverwidget.png"
            r1.<init>((java.lang.String) r5, (java.lang.String) r4)
            java.lang.String r4 = r6.field_coverwidgetMd5
            android.graphics.Bitmap r1 = r9.xx0(r1, r4)
            goto L_0x0111
        L_0x00e4:
            r1 = 8
            if (r11 != r1) goto L_0x0110
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.String r4 = "bubbledynamic.png"
            r1.<init>((java.lang.String) r5, (java.lang.String) r4)
            java.lang.String r4 = r6.field_bubbledynamicMd5
            android.graphics.Bitmap r1 = r9.xx0(r1, r4)
            goto L_0x0111
        L_0x00f6:
            java.lang.Class<fp.e> r4 = p523fp.C32147e.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            fp.e r4 = (p523fp.C32147e) r4
            r5 = 58
            r4.Yi0(r5)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r3] = r1
            java.lang.String r1 = "can't find subtype res: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r1, r4)
        L_0x0110:
            r1 = 0
        L_0x0111:
            if (r1 != 0) goto L_0x0120
            java.lang.String r4 = "[static luckymoney resource] use local：LuckyMoneyLocalPhotoRes fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 991(0x3df, float:1.389E-42)
            r6 = 5
            r4.mo175911u(r5, r6)
        L_0x0120:
            if (r1 != 0) goto L_0x0139
            te3.tf2 r4 = r10.f228203g
            if (r4 == 0) goto L_0x0139
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r10.f228201e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r3] = r1
            java.lang.String r1 = "load subtype fail, try load from url: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r0)
            r9.wx0(r10, r11, r12, r13, r14)
            goto L_0x016c
        L_0x0139:
            java.lang.String r11 = ""
            if (r1 == 0) goto L_0x0143
            int r10 = r10.f228201e
            r12.mo95336a(r1, r10, r11)
            goto L_0x016c
        L_0x0143:
            int r10 = r10.f228201e
            r12.mo95336a(r1, r10, r11)
            goto L_0x016c
        L_0x0149:
            te3.tf2 r1 = r10.f228203g
            if (r1 == 0) goto L_0x0166
            java.lang.Object[] r1 = new java.lang.Object[r4]
            int r4 = r10.f228201e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r3] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r1[r0] = r3
            java.lang.String r0 = "[static luckymoney resource] use net: LuckyMoneyLocalPhotoRes：%s,type：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r1)
            r9.wx0(r10, r11, r12, r13, r14)
            goto L_0x016c
        L_0x0166:
            java.lang.String r10 = "source object is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r10)
        L_0x016c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.model.C69160b0.yx0(te3.sf2, int, com.tencent.mm.plugin.luckymoney.model.b0$v, int, int):void");
    }

    public final Bitmap zx0(C86009m1 m1Var, String str, int i, int i2) {
        boolean g = m1Var.mo119967g();
        boolean p = m1Var.mo119978p();
        Log.m105919d("MicroMsg.LuckyMoneyEnvelopeLogic", "get from file: %s, %s", Boolean.valueOf(g), Boolean.valueOf(p));
        if (!g || !p) {
            return null;
        }
        return BitmapUtil.getBitmapNative(m1Var.mo119971i(), i2, i);
    }
}
