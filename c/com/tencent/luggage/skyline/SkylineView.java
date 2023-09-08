package com.tencent.luggage.skyline;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.skyline.SkylineRuntime;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p172io.flutter.plugin.editing.WxKeyboardAction;
import p172io.flutter.plugin.platform.PlatformPlugin;
import p176jc.C108699q;
import p176jc.C33531i0;
import p176jc.C87917b0;
import p176jc.C87918c0;
import p176jc.C87929h;
import p176jc.C87933j;
import rq0.C90087f;
import rx3.C13598b0;
import zt3.C119157j;

public final class SkylineView implements C90087f {

    /* renamed from: d */
    public int f235004d = -1;

    /* renamed from: e */
    public SkylineRuntime f235005e;

    /* renamed from: f */
    public ViewGroup f235006f;

    /* renamed from: g */
    public C87929h f235007g;

    /* renamed from: h */
    public boolean f235008h;

    /* renamed from: i */
    public final ArrayList<C32224a<C13598b0>> f235009i = new ArrayList<>();

    /* renamed from: j */
    public boolean f235010j;

    /* renamed from: n */
    public final AtomicBoolean f235011n = new AtomicBoolean(false);

    /* renamed from: o */
    public boolean f235012o;

    /* renamed from: p */
    public final SkylineView$mAttachedActivityLifecycleListener$1 f235013p = new SkylineView$mAttachedActivityLifecycleListener$1(this);

    /* renamed from: q */
    public boolean f235014q;

    /* renamed from: r */
    public Context f235015r;

    /* renamed from: s */
    public final C80282b f235016s = new C80282b(this);

    /* renamed from: t */
    public boolean f235017t;

    /* renamed from: u */
    public C80284c f235018u = new C80284c();

    /* renamed from: v */
    public PlatformPlugin f235019v;

    /* renamed from: com.tencent.luggage.skyline.SkylineView$a */
    public static final class C80281a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SkylineView f235020d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80281a(SkylineView skylineView) {
            super(0);
            this.f235020d = skylineView;
        }

        public Object invoke() {
            Log.m105924i("SkylineView", "id:" + this.f235020d.f235004d + " detachFromActivity platformPlugin:" + this.f235020d.f235019v);
            PlatformPlugin platformPlugin = this.f235020d.f235019v;
            if (platformPlugin != null) {
                platformPlugin.destroy();
            }
            this.f235020d.f235019v = null;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.luggage.skyline.SkylineView$b */
    public static final class C80282b implements C108699q.C87936b {

        /* renamed from: a */
        public final /* synthetic */ SkylineView f235021a;

        public C80282b(SkylineView skylineView) {
            this.f235021a = skylineView;
        }

        /* renamed from: a */
        public void mo111448a(int i, int i2) {
            SkylineView skylineView = this.f235021a;
            SkylineRuntime skylineRuntime = skylineView.f235005e;
            if (skylineRuntime != null) {
                skylineRuntime.updateKeyboardStatus(skylineView.f235004d, i, ((double) i2) * 1.0d);
            } else {
                C87412m.m108603p("mSkylineRuntime");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.luggage.skyline.SkylineView$d */
    public static final class C80283d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f235022d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80283d(SkylineView skylineView, C32224a<C13598b0> aVar) {
            super(0);
            this.f235022d = aVar;
        }

        public Object invoke() {
            C32224a<C13598b0> aVar = this.f235022d;
            if (MMHandlerThread.isMainThread()) {
                aVar.invoke();
            } else {
                ((C119157j) C119157j.f356862d).mo183895z(new C33531i0(aVar));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.luggage.skyline.SkylineView$c */
    public static final class C80284c implements WxKeyboardAction {
        public boolean hideKeyboard() {
            C108699q.f325532a.mo159717a();
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if ((r1 != null ? r1.keyboardType : null) != r3) goto L_0x001f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
            r2 = p176jc.C108699q.f325533b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            if (r2 == null) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            r2.mo160117c((java.lang.String) null, (android.view.inputmethod.InputConnection) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
            if ((r1 != null ? r1.keyboardType : null) != r3) goto L_0x0013;
         */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x019b A[Catch:{ JSONException -> 0x01a4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x01b1 A[Catch:{ JSONException -> 0x01b5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x01c0 A[Catch:{ JSONException -> 0x01ca }] */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x01d7 A[Catch:{ JSONException -> 0x01e8, NumberFormatException -> 0x01e4, Exception -> 0x01e0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x01f3 A[Catch:{ JSONException -> 0x0202, Exception -> 0x01fe }] */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x020c A[Catch:{ JSONException -> 0x0219, Exception -> 0x0215 }] */
        /* JADX WARNING: Removed duplicated region for block: B:154:0x0222 A[Catch:{ JSONException -> 0x0230, Exception -> 0x022c }] */
        /* JADX WARNING: Removed duplicated region for block: B:163:0x023a A[Catch:{ JSONException -> 0x024a, Exception -> 0x0244 }] */
        /* JADX WARNING: Removed duplicated region for block: B:173:0x0258 A[Catch:{ JSONException -> 0x0267, Exception -> 0x0261 }] */
        /* JADX WARNING: Removed duplicated region for block: B:180:0x02b4  */
        /* JADX WARNING: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x008e  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00a5  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x00b4  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x00c3  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x00ca  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x00d2  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x00d9  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x00e1  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x00f0  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x00f7  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0116  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean showKeyboard(android.view.View r24, p172io.flutter.embedding.engine.systemchannels.TextInputChannel.WxInputConfiguration r25) {
            /*
                r23 = this;
                r0 = r24
                r1 = r25
                io.flutter.embedding.engine.systemchannels.TextInputChannel$WxKeyboardType r2 = p176jc.C108699q.f325536e
                io.flutter.embedding.engine.systemchannels.TextInputChannel$WxKeyboardType r3 = p172io.flutter.embedding.engine.systemchannels.TextInputChannel.WxKeyboardType.TEXT
                r4 = 0
                if (r2 == r3) goto L_0x0013
                if (r1 == 0) goto L_0x0010
                io.flutter.embedding.engine.systemchannels.TextInputChannel$WxKeyboardType r2 = r1.keyboardType
                goto L_0x0011
            L_0x0010:
                r2 = r4
            L_0x0011:
                if (r2 == r3) goto L_0x001f
            L_0x0013:
                io.flutter.embedding.engine.systemchannels.TextInputChannel$WxKeyboardType r2 = p176jc.C108699q.f325536e
                if (r2 != r3) goto L_0x0026
                if (r1 == 0) goto L_0x001c
                io.flutter.embedding.engine.systemchannels.TextInputChannel$WxKeyboardType r2 = r1.keyboardType
                goto L_0x001d
            L_0x001c:
                r2 = r4
            L_0x001d:
                if (r2 == r3) goto L_0x0026
            L_0x001f:
                kc.e r2 = p176jc.C108699q.f325533b
                if (r2 == 0) goto L_0x0026
                r2.mo160117c(r4, r4)
            L_0x0026:
                if (r1 == 0) goto L_0x002b
                io.flutter.embedding.engine.systemchannels.TextInputChannel$WxKeyboardType r2 = r1.keyboardType
                goto L_0x002c
            L_0x002b:
                r2 = r4
            L_0x002c:
                if (r2 != 0) goto L_0x002f
                goto L_0x0030
            L_0x002f:
                r3 = r2
            L_0x0030:
                p176jc.C108699q.f325536e = r3
                if (r0 == 0) goto L_0x003b
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r0)
                p176jc.C108699q.f325535d = r2
            L_0x003b:
                if (r0 == 0) goto L_0x0044
                android.view.inputmethod.EditorInfo r2 = p176jc.C108699q.f325537f
                android.view.inputmethod.InputConnection r0 = r0.onCreateInputConnection(r2)
                goto L_0x0045
            L_0x0044:
                r0 = r4
            L_0x0045:
                p176jc.C108699q.f325534c = r0
                kc.e r0 = p176jc.C108699q.f325533b
                r2 = 1
                if (r0 == 0) goto L_0x02de
                c30.g r3 = new c30.g
                r3.<init>()
                if (r1 == 0) goto L_0x0056
                io.flutter.embedding.engine.systemchannels.TextInputChannel$WxKeyboardType r5 = r1.keyboardType
                goto L_0x0057
            L_0x0056:
                r5 = r4
            L_0x0057:
                java.lang.String r6 = "safe-password"
                if (r5 != 0) goto L_0x005c
                goto L_0x007e
            L_0x005c:
                int[] r7 = p176jc.C108699q.C108700c.f325540a
                int r5 = r5.ordinal()
                r5 = r7[r5]
                if (r5 == r2) goto L_0x007e
                r7 = 2
                if (r5 == r7) goto L_0x007b
                r7 = 3
                if (r5 == r7) goto L_0x0078
                r7 = 4
                if (r5 == r7) goto L_0x0075
                r7 = 5
                if (r5 == r7) goto L_0x0073
                goto L_0x007e
            L_0x0073:
                r5 = r6
                goto L_0x0080
            L_0x0075:
                java.lang.String r5 = "idcard"
                goto L_0x0080
            L_0x0078:
                java.lang.String r5 = "digit"
                goto L_0x0080
            L_0x007b:
                java.lang.String r5 = "number"
                goto L_0x0080
            L_0x007e:
                java.lang.String r5 = "text"
            L_0x0080:
                java.lang.String r7 = "keyboard-type"
                r3.put(r7, r5)
                if (r1 == 0) goto L_0x008e
                int r5 = r1.inputId
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L_0x008f
            L_0x008e:
                r5 = r4
            L_0x008f:
                java.lang.String r8 = "input-id"
                r3.put(r8, r5)
                if (r1 == 0) goto L_0x009d
                int r5 = r1.dartWidgetId
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L_0x009e
            L_0x009d:
                r5 = r4
            L_0x009e:
                java.lang.String r9 = "dart-widget-id"
                r3.put(r9, r5)
                if (r1 == 0) goto L_0x00ac
                int r5 = r1.cursorSpacing
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L_0x00ad
            L_0x00ac:
                r5 = r4
            L_0x00ad:
                java.lang.String r10 = "cursor-spacing"
                r3.put(r10, r5)
                if (r1 == 0) goto L_0x00bb
                boolean r5 = r1.showConfirmBar
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                goto L_0x00bc
            L_0x00bb:
                r5 = r4
            L_0x00bc:
                java.lang.String r11 = "show-confirm-bar"
                r3.put(r11, r5)
                if (r1 == 0) goto L_0x00ca
                boolean r5 = r1.usePasswordMode
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                goto L_0x00cb
            L_0x00ca:
                r5 = r4
            L_0x00cb:
                java.lang.String r12 = "password"
                r3.put(r12, r5)
                if (r1 == 0) goto L_0x00d9
                boolean r5 = r1.showKeyBoardCoverView
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                goto L_0x00da
            L_0x00d9:
                r5 = r4
            L_0x00da:
                java.lang.String r13 = "show-cover-view"
                r3.put(r13, r5)
                if (r1 == 0) goto L_0x00e8
                boolean r5 = r1.confirmHold
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                goto L_0x00e9
            L_0x00e8:
                r5 = r4
            L_0x00e9:
                java.lang.String r14 = "confirm-hold"
                r3.put(r14, r5)
                if (r1 == 0) goto L_0x00f7
                boolean r1 = r1.adjustPosition
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                goto L_0x00f8
            L_0x00f7:
                r1 = r4
            L_0x00f8:
                java.lang.String r5 = "adjust-position"
                r3.put(r5, r1)
                java.lang.String r1 = r3.toString()
                java.lang.String r3 = "info.toString()"
                gy3.C87412m.m108593f(r1, r3)
                android.view.inputmethod.InputConnection r3 = p176jc.C108699q.f325534c
                r0.f326470h = r2
                kc.b r15 = r0.f326465c
                if (r15 == 0) goto L_0x0112
                android.view.View r4 = r15.mo122406a()
            L_0x0112:
                if (r4 != 0) goto L_0x0116
                goto L_0x02de
            L_0x0116:
                com.tencent.mm.plugin.appbrand.widget.input.l0 r4 = r0.f326466d
                if (r4 != 0) goto L_0x012a
                kc.b r4 = r0.f326465c
                gy3.C87412m.m108591d(r4)
                android.view.View r4 = r4.mo122406a()
                gy3.C87412m.m108591d(r4)
                com.tencent.mm.plugin.appbrand.widget.input.l0 r4 = com.tencent.p014mm.plugin.appbrand.widget.input.C85004y.m104826e(r4)
            L_0x012a:
                r0.f326466d = r4
                if (r4 == 0) goto L_0x0133
                com.tencent.mm.plugin.appbrand.widget.input.l0$c r15 = r0.f326483u
                r4.mo117844a(r15)
            L_0x0133:
                java.lang.String r4 = "TextAreaInfo get adjust-position error"
                java.lang.String r15 = "TextAreaInfo get confirm-hold error"
                java.lang.String r2 = "TextAreaInfo get show-cover-view error"
                r25 = r3
                java.lang.String r3 = "TextAreaInfo get password error"
                r16 = r6
                java.lang.String r6 = "TextAreaInfo get show-confirm-bar error"
                r17 = r0
                java.lang.String r0 = "TextAreaInfo get cursor-spacing parseInt error"
                r18 = r4
                java.lang.String r4 = "element-tag"
                r19 = r5
                r5 = 0
                java.lang.Integer r20 = java.lang.Integer.valueOf(r5)
                rt0.f r5 = new rt0.f
                r5.<init>()
                r21 = r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r22 = r15
                java.lang.String r15 = "totalInfo:"
                r5.append(r15)
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                java.lang.String r15 = "TextAreaInfo"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r5)
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0175 }
                r5.<init>(r1)     // Catch:{ Exception -> 0x0175 }
                goto L_0x017f
            L_0x0175:
                java.lang.String r1 = "TextAreaInfo convert to json error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r1)
                org.json.JSONObject r5 = new org.json.JSONObject
                r5.<init>()
            L_0x017f:
                boolean r1 = r5.has(r8)     // Catch:{ JSONException -> 0x018e }
                if (r1 == 0) goto L_0x0193
                int r1 = r5.getInt(r8)     // Catch:{ JSONException -> 0x018e }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ JSONException -> 0x018e }
                goto L_0x0195
            L_0x018e:
                java.lang.String r1 = "TextAreaInfo add inputId error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r1)
            L_0x0193:
                r1 = r20
            L_0x0195:
                boolean r8 = r5.has(r9)     // Catch:{ JSONException -> 0x01a4 }
                if (r8 == 0) goto L_0x01a9
                int r8 = r5.getInt(r9)     // Catch:{ JSONException -> 0x01a4 }
                java.lang.Integer r20 = java.lang.Integer.valueOf(r8)     // Catch:{ JSONException -> 0x01a4 }
                goto L_0x01a9
            L_0x01a4:
                java.lang.String r8 = "TextAreaInfo add dartWidgetId error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r8)
            L_0x01a9:
                r8 = r20
                boolean r9 = r5.has(r4)     // Catch:{ JSONException -> 0x01b5 }
                if (r9 == 0) goto L_0x01ba
                r5.getString(r4)     // Catch:{ JSONException -> 0x01b5 }
                goto L_0x01ba
            L_0x01b5:
                java.lang.String r4 = "TextAreaInfo add elementTag error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r4)
            L_0x01ba:
                boolean r4 = r5.has(r7)     // Catch:{ JSONException -> 0x01ca }
                if (r4 == 0) goto L_0x01cf
                java.lang.String r4 = r5.getString(r7)     // Catch:{ JSONException -> 0x01ca }
                java.lang.String r7 = "jsonObject.getString(\"keyboard-type\")"
                gy3.C87412m.m108593f(r4, r7)     // Catch:{ JSONException -> 0x01ca }
                goto L_0x01d1
            L_0x01ca:
                java.lang.String r4 = "TextAreaInfo add keyboardType error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r4)
            L_0x01cf:
                java.lang.String r4 = ""
            L_0x01d1:
                boolean r7 = r5.has(r10)     // Catch:{ JSONException -> 0x01e8, NumberFormatException -> 0x01e4, Exception -> 0x01e0 }
                if (r7 == 0) goto L_0x01ed
                java.lang.String r7 = r5.getString(r10)     // Catch:{ JSONException -> 0x01e8, NumberFormatException -> 0x01e4, Exception -> 0x01e0 }
                r9 = 0
                com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r9)     // Catch:{ JSONException -> 0x01e8, NumberFormatException -> 0x01e4, Exception -> 0x01e0 }
                goto L_0x01ed
            L_0x01e0:
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
                goto L_0x01ed
            L_0x01e4:
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
                goto L_0x01ed
            L_0x01e8:
                java.lang.String r0 = "TextAreaInfo get cursor-spacing error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            L_0x01ed:
                boolean r0 = r5.has(r11)     // Catch:{ JSONException -> 0x0202, Exception -> 0x01fe }
                if (r0 == 0) goto L_0x0205
                java.lang.String r0 = r5.getString(r11)     // Catch:{ JSONException -> 0x0202, Exception -> 0x01fe }
                r7 = 0
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r0, r7)     // Catch:{ JSONException -> 0x0202, Exception -> 0x01fe }
                r9 = r0
                goto L_0x0206
            L_0x01fe:
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r6)
                goto L_0x0205
            L_0x0202:
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r6)
            L_0x0205:
                r9 = 0
            L_0x0206:
                boolean r0 = r5.has(r12)     // Catch:{ JSONException -> 0x0219, Exception -> 0x0215 }
                if (r0 == 0) goto L_0x021c
                java.lang.String r0 = r5.getString(r12)     // Catch:{ JSONException -> 0x0219, Exception -> 0x0215 }
                r6 = 0
                com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r0, r6)     // Catch:{ JSONException -> 0x0219, Exception -> 0x0215 }
                goto L_0x021c
            L_0x0215:
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r3)
                goto L_0x021c
            L_0x0219:
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r3)
            L_0x021c:
                boolean r0 = r5.has(r13)     // Catch:{ JSONException -> 0x0230, Exception -> 0x022c }
                if (r0 == 0) goto L_0x0233
                java.lang.String r0 = r5.getString(r13)     // Catch:{ JSONException -> 0x0230, Exception -> 0x022c }
                r3 = 0
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r0, r3)     // Catch:{ JSONException -> 0x0230, Exception -> 0x022c }
                goto L_0x0234
            L_0x022c:
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r2)
                goto L_0x0233
            L_0x0230:
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r2)
            L_0x0233:
                r0 = 0
            L_0x0234:
                boolean r2 = r5.has(r14)     // Catch:{ JSONException -> 0x024a, Exception -> 0x0244 }
                if (r2 == 0) goto L_0x024f
                java.lang.String r2 = r5.getString(r14)     // Catch:{ JSONException -> 0x024a, Exception -> 0x0244 }
                r3 = 0
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r2, r3)     // Catch:{ JSONException -> 0x024a, Exception -> 0x0244 }
                goto L_0x0250
            L_0x0244:
                r2 = r22
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r2)
                goto L_0x024f
            L_0x024a:
                r2 = r22
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r2)
            L_0x024f:
                r2 = 0
            L_0x0250:
                r3 = r19
                boolean r6 = r5.has(r3)     // Catch:{ JSONException -> 0x0267, Exception -> 0x0261 }
                if (r6 == 0) goto L_0x026c
                java.lang.String r3 = r5.getString(r3)     // Catch:{ JSONException -> 0x0267, Exception -> 0x0261 }
                r6 = 1
                com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r3, r6)     // Catch:{ JSONException -> 0x0267, Exception -> 0x0261 }
                goto L_0x026c
            L_0x0261:
                r3 = r18
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r3)
                goto L_0x026c
            L_0x0267:
                r3 = r18
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r3)
            L_0x026c:
                r3 = r21
                com.tencent.p014mm.plugin.appbrand.widget.input.C68711c2.m80984d(r5, r3)
                com.tencent.p014mm.plugin.appbrand.widget.input.C68709b1.m80982d(r5, r3)
                r5 = r17
                r5.f326473k = r2
                r5.f326476n = r4
                r5.f326474l = r1
                r5.f326475m = r8
                java.util.Map<java.lang.String, java.lang.Integer> r1 = com.tencent.p014mm.plugin.appbrand.widget.input.C84947c0.f247596d
                java.lang.Object r1 = r1.get(r4)
                java.lang.Integer r1 = (java.lang.Integer) r1
                r2 = 0
                int r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r1, (int) r2)
                r5.f326478p = r1
                java.lang.String r1 = r5.f326463a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "inputId = "
                r2.append(r4)
                java.lang.Integer r4 = r5.f326474l
                r2.append(r4)
                java.lang.String r4 = ", dartWidgetId = "
                r2.append(r4)
                java.lang.Integer r4 = r5.f326475m
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                kc.b r1 = r5.f326465c
                if (r1 != 0) goto L_0x02b4
                goto L_0x02de
            L_0x02b4:
                java.lang.String r1 = r5.f326476n
                boolean r1 = com.tencent.p014mm.plugin.appbrand.widget.input.C84947c0.m104717f(r1)
                if (r1 != 0) goto L_0x02c3
                java.lang.String r1 = r5.f326476n
                r2 = r16
                gy3.C87412m.m108589b(r1, r2)
            L_0x02c3:
                r1 = r25
                kc.d r1 = r5.mo160115a(r1)
                if (r1 == 0) goto L_0x02de
                if (r9 == 0) goto L_0x02d8
                r1.mo122535h(r0)
                kc.f r0 = new kc.f
                r0.<init>(r5)
                r1.mo122533g(r0)
            L_0x02d8:
                r1.mo122537i(r3)
                r1.mo122527a()
            L_0x02de:
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.luggage.skyline.SkylineView.C80284c.showKeyboard(android.view.View, io.flutter.embedding.engine.systemchannels.TextInputChannel$WxInputConfiguration):boolean");
        }
    }

    /* renamed from: V0 */
    public void mo63305V0() {
        Log.m105924i("SkylineView", "SkylineView(" + this.f235004d + ") pauseRendering");
        C87929h hVar = this.f235007g;
        if (hVar != null) {
            hVar.mo122398d(false);
        } else {
            C87412m.m108603p("mFlutterViewWrapper");
            throw null;
        }
    }

    /* renamed from: f */
    public final void mo111443f(Context context) {
        C39623j lifecycle;
        C39623j lifecycle2;
        C87412m.m108594g(context, "context");
        Context context2 = this.f235015r;
        C0125s sVar = null;
        if (context2 == null) {
            context2 = null;
        } else if (context2 == null) {
            C87412m.m108603p("context");
            throw null;
        }
        this.f235015r = context;
        C87929h hVar = this.f235007g;
        if (hVar != null) {
            if (hVar != null) {
                hVar.mo122400f(context);
            } else {
                C87412m.m108603p("mFlutterViewWrapper");
                throw null;
            }
        }
        if (!C87412m.m108589b(context2, context)) {
            C0125s sVar2 = context2 instanceof C0125s ? (C0125s) context2 : null;
            if (!(sVar2 == null || (lifecycle2 = sVar2.getLifecycle()) == null)) {
                lifecycle2.removeObserver(this.f235013p);
            }
            if (context instanceof C0125s) {
                sVar = (C0125s) context;
            }
            if (sVar != null && (lifecycle = sVar.getLifecycle()) != null) {
                lifecycle.addObserver(this.f235013p);
            }
        }
    }

    /* renamed from: f0 */
    public void mo63313f0() {
        Log.m105924i("SkylineView", "SkylineView(" + this.f235004d + ") restoreRendering");
        C87929h hVar = this.f235007g;
        if (hVar != null) {
            hVar.mo122398d(true);
        } else {
            C87412m.m108603p("mFlutterViewWrapper");
            throw null;
        }
    }

    /* renamed from: i */
    public final void mo111444i() {
        mo111447u(new C80281a(this));
        C87929h hVar = this.f235007g;
        if (hVar == null) {
            return;
        }
        if (hVar == null) {
            C87412m.m108603p("mFlutterViewWrapper");
            throw null;
        } else if (hVar.getMode() != C87933j.Legacy) {
            C87929h hVar2 = this.f235007g;
            if (hVar2 != null) {
                hVar2.mo122399e(true);
            } else {
                C87412m.m108603p("mFlutterViewWrapper");
                throw null;
            }
        }
    }

    /* renamed from: l */
    public final void mo111445l(boolean z) {
        this.f235017t = z;
        Log.m105924i("SkylineView", "SkylineView(" + this.f235004d + ") change isAnimating:" + this.f235017t + ", isResumed:" + this.f235010j);
        C87929h hVar = this.f235007g;
        if (hVar == null) {
            C87412m.m108603p("mFlutterViewWrapper");
            throw null;
        } else if (hVar.getMode() == C87933j.Legacy) {
            if (this.f235010j) {
                C87929h hVar2 = this.f235007g;
                if (hVar2 != null) {
                    hVar2.mo122395a(false);
                } else {
                    C87412m.m108603p("mFlutterViewWrapper");
                    throw null;
                }
            } else {
                C87929h hVar3 = this.f235007g;
                if (hVar3 != null) {
                    C87929h.C87930a.m109438a(hVar3, false, 1, (Object) null);
                } else {
                    C87412m.m108603p("mFlutterViewWrapper");
                    throw null;
                }
            }
        } else if (!this.f235010j) {
        } else {
            if (this.f235017t) {
                C87929h hVar4 = this.f235007g;
                if (hVar4 != null) {
                    C87929h.C87930a.m109438a(hVar4, false, 1, (Object) null);
                } else {
                    C87412m.m108603p("mFlutterViewWrapper");
                    throw null;
                }
            } else {
                C87929h hVar5 = this.f235007g;
                if (hVar5 != null) {
                    hVar5.mo122395a(false);
                } else {
                    C87412m.m108603p("mFlutterViewWrapper");
                    throw null;
                }
            }
        }
    }

    public final void resume() {
        if (!this.f235010j) {
            this.f235010j = true;
            Log.m105924i("SkylineView", "id:" + this.f235004d + " resume");
            mo111447u(new C87917b0(this));
            mo111447u(new C87918c0(this));
            mo111445l(this.f235017t);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        return;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111447u(fy3.C32224a<rx3.C13598b0> r3) {
        /*
            r2 = this;
            boolean r0 = r2.f235008h
            if (r0 == 0) goto L_0x001b
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMHandlerThread.isMainThread()
            if (r0 == 0) goto L_0x000e
            r3.invoke()
            goto L_0x001a
        L_0x000e:
            zt3.t r0 = zt3.C119157j.f356862d
            jc.i0 r1 = new jc.i0
            r1.<init>(r3)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183895z(r1)
        L_0x001a:
            return
        L_0x001b:
            monitor-enter(r2)
            boolean r0 = r2.f235008h     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0038
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMHandlerThread.isMainThread()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x002a
            r3.invoke()     // Catch:{ all -> 0x0044 }
            goto L_0x0036
        L_0x002a:
            zt3.t r0 = zt3.C119157j.f356862d     // Catch:{ all -> 0x0044 }
            jc.i0 r1 = new jc.i0     // Catch:{ all -> 0x0044 }
            r1.<init>(r3)     // Catch:{ all -> 0x0044 }
            zt3.j r0 = (zt3.C119157j) r0     // Catch:{ all -> 0x0044 }
            r0.mo183895z(r1)     // Catch:{ all -> 0x0044 }
        L_0x0036:
            monitor-exit(r2)
            return
        L_0x0038:
            java.util.ArrayList<fy3.a<rx3.b0>> r0 = r2.f235009i     // Catch:{ all -> 0x0044 }
            com.tencent.luggage.skyline.SkylineView$d r1 = new com.tencent.luggage.skyline.SkylineView$d     // Catch:{ all -> 0x0044 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0044 }
            r0.add(r1)     // Catch:{ all -> 0x0044 }
            monitor-exit(r2)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.luggage.skyline.SkylineView.mo111447u(fy3.a):void");
    }
}
