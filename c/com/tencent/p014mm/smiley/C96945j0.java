package com.tencent.p014mm.smiley;

import a70.C112760b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.MMTrimMemoryEvent;
import com.tencent.p014mm.emoji.decode.MMGIFJNIFactory;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.SmileyInfo;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import p008bq.C92284l1;
import p207nl.C100134k;
import p490dl.C97487n;
import rx3.C13598b0;
import sx3.C110823p;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: com.tencent.mm.smiley.j0 */
public final class C96945j0 implements C92284l1 {

    /* renamed from: s */
    public static C96945j0 f283998s;

    /* renamed from: t */
    public static boolean f283999t;

    /* renamed from: a */
    public final String f284000a = (C112760b.m154231g() + "emoji/newemoji/");

    /* renamed from: b */
    public final String f284001b = (C112760b.m154231g() + "emoji/qqemoji/");

    /* renamed from: c */
    public final String f284002c = "assets:///newemoji/";

    /* renamed from: d */
    public final String f284003d = "assets:///emoji/qqemoji/";

    /* renamed from: e */
    public final String f284004e = "config.conf";

    /* renamed from: f */
    public final String f284005f = "newemoji-config.xml";

    /* renamed from: g */
    public final String[] f284006g;

    /* renamed from: h */
    public final String[] f284007h;

    /* renamed from: i */
    public final String[] f284008i;

    /* renamed from: j */
    public final String[] f284009j;

    /* renamed from: k */
    public final String[] f284010k;

    /* renamed from: l */
    public final String[] f284011l;

    /* renamed from: m */
    public ArrayList<SmileyInfo> f284012m = new ArrayList<>();

    /* renamed from: n */
    public final HashMap<String, SmileyInfo> f284013n = new HashMap<>();

    /* renamed from: o */
    public final HashMap<String, SmileyInfo> f284014o = new HashMap<>();

    /* renamed from: p */
    public boolean f284015p = true;

    /* renamed from: q */
    public C96936g0 f284016q = new C96936g0();

    /* renamed from: r */
    public final boolean f284017r = true;

    /* renamed from: com.tencent.mm.smiley.j0$a */
    public static final class C96946a {
        public C96946a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.smiley.j0$b */
    public static final class C96947b extends IStaticListener<MMTrimMemoryEvent> {
        public boolean callback(IEvent iEvent) {
            C87412m.m108594g((MMTrimMemoryEvent) iEvent, "event");
            C97487n nVar = C97487n.C97488a.f286127a;
            Log.m105921e("MicroMsg.QQSmileyManager", "received MMTrimMemoryEvent: clear cache size: %s", Integer.valueOf(nVar.mo136757b(true)));
            nVar.mo136756a(true);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.smiley.j0$c */
    public static final class C96948c implements C96975y {

        /* renamed from: a */
        public final /* synthetic */ int f284018a;

        /* renamed from: b */
        public final /* synthetic */ C8479f0<C96932e0> f284019b;

        public C96948c(int i, C8479f0<C96932e0> f0Var) {
            this.f284018a = i;
            this.f284019b = f0Var;
        }

        /* renamed from: a */
        public boolean mo135526a(C96974x xVar, int i, int i2) {
            C87412m.m108594g(xVar, "item");
            if (i != this.f284018a || !(xVar instanceof C96932e0)) {
                return true;
            }
            this.f284019b.f27484d = xVar;
            return true;
        }
    }

    static {
        new C96946a((C8480h) null);
    }

    public C96945j0(Context context, C8480h hVar) {
        long currentTimeMillis = System.currentTimeMillis();
        String[] stringArray = context.getResources().getStringArray(C0966R.array.f2595aj);
        C87412m.m108593f(stringArray, "context.resources.getStr…ay(R.array.smiley_values)");
        this.f284006g = stringArray;
        String[] stringArray2 = context.getResources().getStringArray(C0966R.array.f2598am);
        C87412m.m108593f(stringArray2, "context.resources.getStr….array.smiley_values_old)");
        this.f284007h = stringArray2;
        String[] stringArray3 = context.getResources().getStringArray(C0966R.array.f2596ak);
        C87412m.m108593f(stringArray3, "context.resources.getStr…R.array.smiley_values_ch)");
        this.f284008i = stringArray3;
        String[] stringArray4 = context.getResources().getStringArray(C0966R.array.f2600ao);
        C87412m.m108593f(stringArray4, "context.resources.getStr…R.array.smiley_values_tw)");
        this.f284009j = stringArray4;
        String[] stringArray5 = context.getResources().getStringArray(C0966R.array.f2597al);
        C87412m.m108593f(stringArray5, "context.resources.getStr…R.array.smiley_values_en)");
        this.f284010k = stringArray5;
        String[] stringArray6 = context.getResources().getStringArray(C0966R.array.f2599an);
        C87412m.m108593f(stringArray6, "context.resources.getStr…R.array.smiley_values_th)");
        this.f284011l = stringArray6;
        if (stringArray.length == stringArray3.length) {
            int length = stringArray.length;
            int i = 0;
            while (i < length) {
                String str = this.f284006g[i];
                String str2 = this.f284008i[i];
                String[] strArr = this.f284007h;
                String str3 = (i < 0 || i > C110823p.m150979E(strArr)) ? "" : strArr[i];
                String[] strArr2 = this.f284009j;
                String str4 = (i < 0 || i > C110823p.m150979E(strArr2)) ? "" : strArr2[i];
                String[] strArr3 = this.f284010k;
                String str5 = (i < 0 || i > C110823p.m150979E(strArr3)) ? "" : strArr3[i];
                String[] strArr4 = this.f284011l;
                String str6 = (i < 0 || i > C110823p.m150979E(strArr4)) ? "" : strArr4[i];
                String str7 = (C87412m.m108589b(str3, "/OK") || C87412m.m108589b(str3, "/NO")) ? "" : str3;
                SmileyInfo smileyInfo = r9;
                HashMap<String, SmileyInfo> hashMap = this.f284013n;
                SmileyInfo smileyInfo2 = new SmileyInfo(str, str7, str2, str4, str5, str6, i);
                hashMap.put(str, smileyInfo2);
                i++;
            }
        } else {
            Log.m105924i("MicroMsg.QQSmileyManager", "read smiley array failed.");
        }
        Log.m105925i("MicroMsg.QQSmileyManager", "QQSmileyManager use time:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        mo135536h();
        ((C119157j) C119157j.f356862d).mo183884o(new C96958m0(this, new ArrayList(this.f284012m)));
    }

    /* renamed from: b */
    public static final C96945j0 m124519b() {
        if (f283998s == null) {
            synchronized (C96945j0.class) {
                if (f283998s == null) {
                    Context context = MMApplicationContext.getContext();
                    C87412m.m108593f(context, "getContext()");
                    f283998s = new C96945j0(context, (C8480h) null);
                    if (MMApplicationContext.isMainProcess()) {
                        Log.m105924i("MicroMsg.QQSmileyManager", "checkNewEmoji");
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        C96945j0 j0Var = f283998s;
        C87412m.m108591d(j0Var);
        return j0Var;
    }

    /* renamed from: a */
    public Spannable mo126269a(Spannable spannable) {
        this.f284016q.mo135529b(spannable, 0, -1, new C96950k0(this, spannable));
        return spannable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01aa, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        cy3.C58003b.m67160a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01ae, code lost:
        throw r4;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo135531c(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = zb0.C53767d.f150916b
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = a70.C112760b.m154231g()
            zb0.C53767d.f150916b = r2
        L_0x0018:
            java.lang.String r2 = zb0.C53767d.f150916b
            r1.append(r2)
            java.lang.String r2 = "emoji/newemoji/"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            dl.n r2 = p490dl.C97487n.C97488a.f286127a
            android.graphics.Bitmap r2 = r2.mo136758c(r12)
            if (r2 != 0) goto L_0x01c0
            boolean r2 = r11.f284015p
            java.lang.String r3 = "MicroMsg.QQSmileyManager"
            r4 = -1
            r5 = 0
            if (r2 == 0) goto L_0x0092
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = r11.f284002c
            r2.append(r6)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            byte[] r2 = com.tencent.p014mm.vfs.C86013q1.m106433O(r2, r5, r4)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r2)
            if (r6 == 0) goto L_0x00de
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r11.f284000a
            r6.append(r7)
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r6 == 0) goto L_0x00de
            java.lang.String r2 = "getQQSmileyDrawable: fallback use local"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = r11.f284000a
            r2.append(r6)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            byte[] r2 = com.tencent.p014mm.vfs.C86013q1.m106433O(r2, r5, r4)
            goto L_0x00de
        L_0x0092:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = r11.f284000a
            r2.append(r6)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            byte[] r2 = com.tencent.p014mm.vfs.C86013q1.m106433O(r2, r5, r4)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r2)
            if (r6 == 0) goto L_0x00de
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r11.f284002c
            r6.append(r7)
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r6 == 0) goto L_0x00de
            java.lang.String r2 = "getQQSmileyDrawable: fallback use asset"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = r11.f284002c
            r2.append(r6)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            byte[] r2 = com.tencent.p014mm.vfs.C86013q1.m106433O(r2, r5, r4)
        L_0x00de:
            com.tencent.mm.emoji.decode.MMGIFJNIFactory$Companion r6 = com.tencent.p014mm.emoji.decode.MMGIFJNIFactory.Companion
            android.graphics.Bitmap r2 = r6.decodeThumb((byte[]) r2)
            if (r2 != 0) goto L_0x01b7
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r5] = r0
            r0 = 1
            r6[r0] = r12
            java.lang.String r7 = "[getQQSmileyDrawable] not exist! path:%s name:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r7, r6)
            java.lang.Class<fp.e> r6 = p523fp.C32147e.class
            boolean r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r7 != 0) goto L_0x0102
            java.lang.String r0 = "checkUpdateRes not mm process, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            goto L_0x017f
        L_0x0102:
            boolean r7 = f40.C86709a0.m107522a()
            if (r7 != 0) goto L_0x010e
            java.lang.String r0 = "account not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            goto L_0x017f
        L_0x010e:
            java.lang.Object[] r7 = new java.lang.Object[r0]
            boolean r8 = f283999t
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r7[r5] = r8
            java.lang.String r8 = "checkUpdateRes: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r8, r7)
            boolean r7 = f283999t
            if (r7 == 0) goto L_0x0122
            goto L_0x017f
        L_0x0122:
            f283999t = r0
            di3.d r7 = di3.C86312j.m106911c(r6)
            fp.e r7 = (p523fp.C32147e) r7
            r8 = 37
            java.lang.String r7 = r7.mo58507AD(r8, r0)
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r7 == 0) goto L_0x016d
            java.lang.Class<z51.g> r7 = z51.C39315g.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            z51.g r7 = (z51.C39315g) r7
            zc3.a r7 = r7.mo58035cm()
            i61.h r7 = (i61.C98602h) r7
            r7.getClass()
            i61.i r7 = i61.C98603i.m128193d()
            r7.getClass()
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent r9 = new com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent
            r9.<init>()
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r10 = r9.f78743d
            di3.d r6 = di3.C86312j.m106911c(r6)
            fp.e r6 = (p523fp.C32147e) r6
            java.lang.String r6 = r6.mo58507AD(r8, r0)
            r10.f78746c = r6
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r6 = r9.f78743d
            r6.f78744a = r8
            r6.f78745b = r0
            r6.f78747d = r4
            r7.mo138046g(r9, r5)
            goto L_0x017f
        L_0x016d:
            di3.d r7 = di3.C86312j.m106911c(r6)
            fp.e r7 = (p523fp.C32147e) r7
            r7.b70(r8, r0, r4, r5)
            di3.d r0 = di3.C86312j.m106911c(r6)
            fp.e r0 = (p523fp.C32147e) r0
            r0.Yi0(r8)
        L_0x017f:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x01af }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ Exception -> 0x01af }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01af }
            r4.<init>()     // Catch:{ Exception -> 0x01af }
            java.lang.String r6 = "newemoji/"
            r4.append(r6)     // Catch:{ Exception -> 0x01af }
            r4.append(r12)     // Catch:{ Exception -> 0x01af }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x01af }
            java.io.InputStream r0 = r0.open(r4)     // Catch:{ Exception -> 0x01af }
            r4 = 0
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r0, r4, r1)     // Catch:{ all -> 0x01a8 }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x01a8 }
            cy3.C58003b.m67160a(r0, r4)     // Catch:{ Exception -> 0x01af }
            goto L_0x01b7
        L_0x01a8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01aa }
        L_0x01aa:
            r4 = move-exception
            cy3.C58003b.m67160a(r0, r1)     // Catch:{ Exception -> 0x01af }
            throw r4     // Catch:{ Exception -> 0x01af }
        L_0x01af:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r4 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r1)
        L_0x01b7:
            if (r2 == 0) goto L_0x01c0
            dl.n r0 = p490dl.C97487n.C97488a.f286127a
            boolean r1 = r11.f284017r
            r0.mo136759d(r12, r1, r2)
        L_0x01c0:
            android.graphics.drawable.BitmapDrawable r12 = new android.graphics.drawable.BitmapDrawable
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r12.<init>(r0, r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.smiley.C96945j0.mo135531c(java.lang.String):android.graphics.drawable.Drawable");
    }

    /* renamed from: d */
    public final Drawable mo135532d(int i) {
        String str = i + ".wxam";
        C97487n nVar = C97487n.C97488a.f286127a;
        Bitmap c = nVar.mo136758c(str);
        if (c == null) {
            c = MMGIFJNIFactory.Companion.decodeThumb(C86013q1.m106433O("assets:///emoji/qqemoji/" + str, 0, -1), str, this.f284017r);
            if (c == null) {
                Log.m105920e("MicroMsg.QQSmileyManager", "qqemoji decoder error");
            } else {
                nVar.mo136759d(str, this.f284017r, c);
            }
        }
        return new BitmapDrawable(MMApplicationContext.getContext().getResources(), c);
    }

    /* renamed from: e */
    public final C96932e0 mo135533e(CharSequence charSequence, int i) {
        if (Util.isNullOrNil(charSequence)) {
            return null;
        }
        C8479f0 f0Var = new C8479f0();
        this.f284016q.mo135529b(charSequence, i, -1, new C96948c(i, f0Var));
        return (C96932e0) f0Var.f27484d;
    }

    /* renamed from: f */
    public final Drawable mo135534f(C96932e0 e0Var) {
        C87412m.m108594g(e0Var, "item");
        int i = e0Var.f283965a;
        return i >= 0 ? mo135532d(i) : mo135531c(e0Var.f283968d);
    }

    /* renamed from: g */
    public final SmileyInfo mo135535g(String str) {
        C87412m.m108594g(str, "key");
        SmileyInfo smileyInfo = this.f284013n.get(str);
        if (smileyInfo == null) {
            smileyInfo = this.f284014o.get(str);
        }
        if (smileyInfo != null) {
            return smileyInfo;
        }
        Log.m105925i("MicroMsg.QQSmileyManager", "getSmileyInfo failed. smiley map no contains key:%s", C112551y.m153814n(str, "\\", "\\\\", false));
        return null;
    }

    /* renamed from: h */
    public final synchronized void mo135536h() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f284016q = new C96936g0();
        Collection<SmileyInfo> values = this.f284013n.values();
        C87412m.m108593f(values, "qqEmojiMap.values");
        for (SmileyInfo smileyInfo : values) {
            C96936g0 g0Var = this.f284016q;
            int i = smileyInfo.field_position;
            String str = smileyInfo.field_key;
            C87412m.m108593f(str, "it.field_key");
            String str2 = smileyInfo.field_key;
            C87412m.m108593f(str2, "it.field_key");
            g0Var.mo135528a(new C96932e0(i, str, str2, smileyInfo.field_fileName));
            C96936g0 g0Var2 = this.f284016q;
            int i2 = smileyInfo.field_position;
            String str3 = smileyInfo.field_key;
            C87412m.m108593f(str3, "it.field_key");
            String str4 = smileyInfo.field_qqValue;
            C87412m.m108593f(str4, "it.field_qqValue");
            g0Var2.mo135528a(new C96932e0(i2, str3, str4, smileyInfo.field_fileName));
            C96936g0 g0Var3 = this.f284016q;
            int i3 = smileyInfo.field_position;
            String str5 = smileyInfo.field_key;
            C87412m.m108593f(str5, "it.field_key");
            String str6 = smileyInfo.field_cnValue;
            C87412m.m108593f(str6, "it.field_cnValue");
            g0Var3.mo135528a(new C96932e0(i3, str5, str6, smileyInfo.field_fileName));
            C96936g0 g0Var4 = this.f284016q;
            int i4 = smileyInfo.field_position;
            String str7 = smileyInfo.field_key;
            C87412m.m108593f(str7, "it.field_key");
            String str8 = smileyInfo.field_twValue;
            C87412m.m108593f(str8, "it.field_twValue");
            g0Var4.mo135528a(new C96932e0(i4, str7, str8, smileyInfo.field_fileName));
            C96936g0 g0Var5 = this.f284016q;
            int i5 = smileyInfo.field_position;
            String str9 = smileyInfo.field_key;
            C87412m.m108593f(str9, "it.field_key");
            String str10 = smileyInfo.field_enValue;
            C87412m.m108593f(str10, "it.field_enValue");
            g0Var5.mo135528a(new C96932e0(i5, str9, str10, smileyInfo.field_fileName));
            C96936g0 g0Var6 = this.f284016q;
            int i6 = smileyInfo.field_position;
            String str11 = smileyInfo.field_key;
            C87412m.m108593f(str11, "it.field_key");
            String str12 = smileyInfo.field_thValue;
            C87412m.m108593f(str12, "it.field_thValue");
            g0Var6.mo135528a(new C96932e0(i6, str11, str12, smileyInfo.field_fileName));
        }
        this.f284014o.clear();
        C97487n.C97488a.f286127a.mo136756a(this.f284017r);
        int d = C100134k.m130830d(this.f284000a + this.f284004e);
        int d2 = C100134k.m130830d(this.f284002c + this.f284004e);
        String str13 = this.f284000a + this.f284005f;
        String str14 = this.f284002c + this.f284005f;
        Log.m105925i("MicroMsg.QQSmileyManager", "updateSmiley: local:%s, asset:%s", Integer.valueOf(d), Integer.valueOf(d2));
        if (d <= 0 || d < d2 || !C86013q1.m106450k(str13)) {
            this.f284012m = new ArrayList<>();
        } else {
            this.f284015p = false;
            ArrayList<SmileyInfo> c = C100134k.m130829c(new C86009m1(str13));
            this.f284012m = c;
            Log.m105925i("MicroMsg.QQSmileyManager", "updateSmiley: local size: %s", Integer.valueOf(c.size()));
        }
        if (this.f284012m.size() <= 0) {
            this.f284015p = true;
            ArrayList<SmileyInfo> c2 = C100134k.m130829c(new C86009m1(str14));
            this.f284012m = c2;
            Log.m105925i("MicroMsg.QQSmileyManager", "updateSmiley: asset size: %s", Integer.valueOf(c2.size()));
        }
        for (SmileyInfo smileyInfo2 : this.f284012m) {
            HashMap<String, SmileyInfo> hashMap = this.f284014o;
            String str15 = smileyInfo2.field_key;
            C87412m.m108593f(str15, "it.field_key");
            hashMap.put(str15, smileyInfo2);
            C96936g0 g0Var7 = this.f284016q;
            int i7 = smileyInfo2.field_position;
            String str16 = smileyInfo2.field_key;
            C87412m.m108593f(str16, "it.field_key");
            String str17 = smileyInfo2.field_key;
            C87412m.m108593f(str17, "it.field_key");
            g0Var7.mo135528a(new C96932e0(i7, str16, str17, smileyInfo2.field_fileName));
            C96936g0 g0Var8 = this.f284016q;
            int i8 = smileyInfo2.field_position;
            String str18 = smileyInfo2.field_key;
            C87412m.m108593f(str18, "it.field_key");
            String str19 = smileyInfo2.field_qqValue;
            C87412m.m108593f(str19, "it.field_qqValue");
            g0Var8.mo135528a(new C96932e0(i8, str18, str19, smileyInfo2.field_fileName));
            C96936g0 g0Var9 = this.f284016q;
            int i9 = smileyInfo2.field_position;
            String str20 = smileyInfo2.field_key;
            C87412m.m108593f(str20, "it.field_key");
            String str21 = smileyInfo2.field_cnValue;
            C87412m.m108593f(str21, "it.field_cnValue");
            g0Var9.mo135528a(new C96932e0(i9, str20, str21, smileyInfo2.field_fileName));
            C96936g0 g0Var10 = this.f284016q;
            int i15 = smileyInfo2.field_position;
            String str22 = smileyInfo2.field_key;
            C87412m.m108593f(str22, "it.field_key");
            String str23 = smileyInfo2.field_twValue;
            C87412m.m108593f(str23, "it.field_twValue");
            g0Var10.mo135528a(new C96932e0(i15, str22, str23, smileyInfo2.field_fileName));
            C96936g0 g0Var11 = this.f284016q;
            int i16 = smileyInfo2.field_position;
            String str24 = smileyInfo2.field_key;
            C87412m.m108593f(str24, "it.field_key");
            String str25 = smileyInfo2.field_enValue;
            C87412m.m108593f(str25, "it.field_enValue");
            g0Var11.mo135528a(new C96932e0(i16, str24, str25, smileyInfo2.field_fileName));
            C96936g0 g0Var12 = this.f284016q;
            int i17 = smileyInfo2.field_position;
            String str26 = smileyInfo2.field_key;
            C87412m.m108593f(str26, "it.field_key");
            String str27 = smileyInfo2.field_thValue;
            C87412m.m108593f(str27, "it.field_thValue");
            g0Var12.mo135528a(new C96932e0(i17, str26, str27, smileyInfo2.field_fileName));
        }
        Log.m105925i("MicroMsg.QQSmileyManager", "updateSmiley end use time:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
