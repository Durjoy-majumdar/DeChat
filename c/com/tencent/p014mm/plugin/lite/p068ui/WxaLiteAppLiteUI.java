package com.tencent.p014mm.plugin.lite.p068ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.liteapp.p877ui.WxaLiteAppUI;
import com.tencent.p014mm.autogen.events.LiteAppCloseWindowEvent;
import com.tencent.p014mm.autogen.events.LiteAppOnSystemBackEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import di3.C86312j;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONObject;
import p172io.flutter.plugin.editing.WxKeyboardAction;
import p22.C110107c;
import p22.C110108d;
import p22.C110109e;
import p22.C110117g;
import p22.C110120h;
import p22.C110123i;
import p244tt.C14088e;
import tw3.C118552d;

/* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI */
public class WxaLiteAppLiteUI extends WxaLiteAppUI {

    /* renamed from: Y */
    public JSONObject f313520Y;

    /* renamed from: Z */
    public C110120h.C110121a f313521Z = new C110120h.C110121a();

    /* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI$a */
    public class C105447a extends C110108d {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f313522a;

        public C105447a(WxaLiteAppLiteUI wxaLiteAppLiteUI, WeakReference weakReference) {
            this.f313522a = weakReference;
        }

        /* renamed from: a */
        public Context mo150201a() {
            return (Context) this.f313522a.get();
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI$b */
    public class C105448b implements WxKeyboardAction {
        public C105448b(WxaLiteAppLiteUI wxaLiteAppLiteUI) {
        }

        public boolean hideKeyboard() {
            C110120h.f329457a.mo161516a();
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean showKeyboard(android.view.View r7, p172io.flutter.embedding.engine.systemchannels.TextInputChannel.WxInputConfiguration r8) {
            /*
                r6 = this;
                p22.h r0 = p22.C110120h.f329457a
                r0 = 1
                r1 = 0
                if (r8 == 0) goto L_0x00d9
                p22.e r2 = p22.C110120h.f329458b
                if (r2 != 0) goto L_0x000c
                goto L_0x00d9
            L_0x000c:
                io.flutter.embedding.engine.systemchannels.TextInputChannel$WxKeyboardType r2 = r8.keyboardType
                io.flutter.embedding.engine.systemchannels.TextInputChannel$WxKeyboardType r3 = p172io.flutter.embedding.engine.systemchannels.TextInputChannel.WxKeyboardType.CUSTOM
                if (r2 == r3) goto L_0x0014
                goto L_0x00d9
            L_0x0014:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x001c }
                java.lang.String r3 = r8.keyboardData     // Catch:{ Exception -> 0x001c }
                r2.<init>(r3)     // Catch:{ Exception -> 0x001c }
                goto L_0x0028
            L_0x001c:
                java.lang.String r2 = "Luggage.LiteAppKeyboardLogic"
                java.lang.String r3 = "showKeyboard convert to json error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
            L_0x0028:
                p22.e r3 = p22.C110120h.f329458b
                gy3.C87412m.m108591d(r3)
                java.lang.String r4 = "type"
                java.lang.String r4 = r2.optString(r4)
                if (r4 == 0) goto L_0x003c
                java.lang.String r5 = "LiteAppKeyboardType."
                boolean r5 = z04.C112551y.m153819s(r4, r5, r1)
                goto L_0x003d
            L_0x003c:
                r5 = 0
            L_0x003d:
                if (r5 == 0) goto L_0x005f
                java.lang.String r5 = "keyboardType"
                gy3.C87412m.m108593f(r4, r5)
                r5 = 20
                java.lang.String r4 = r4.substring(r5)
                java.lang.String r5 = "this as java.lang.String).substring(startIndex)"
                gy3.C87412m.m108593f(r4, r5)
                boolean r5 = r3.mo161511g(r4)
                if (r5 != 0) goto L_0x005d
                java.lang.String r3 = r3.f329430n
                boolean r3 = gy3.C87412m.m108589b(r4, r3)
                if (r3 == 0) goto L_0x005f
            L_0x005d:
                r3 = 1
                goto L_0x0060
            L_0x005f:
                r3 = 0
            L_0x0060:
                if (r3 != 0) goto L_0x0064
                goto L_0x00d9
            L_0x0064:
                java.lang.String r3 = p22.C110120h.f329461e
                java.lang.String r4 = r8.keyboardData
                boolean r3 = gy3.C87412m.m108589b(r3, r4)
                r4 = 0
                if (r3 != 0) goto L_0x0076
                p22.e r3 = p22.C110120h.f329458b
                if (r3 == 0) goto L_0x0076
                r3.mo161508d(r4, r4)
            L_0x0076:
                java.lang.String r8 = r8.keyboardData
                p22.C110120h.f329461e = r8
                if (r7 == 0) goto L_0x0083
                java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
                r8.<init>(r7)
                p22.C110120h.f329460d = r8
            L_0x0083:
                if (r7 == 0) goto L_0x008c
                android.view.inputmethod.EditorInfo r8 = p22.C110120h.f329462f
                android.view.inputmethod.InputConnection r7 = r7.onCreateInputConnection(r8)
                goto L_0x008d
            L_0x008c:
                r7 = r4
            L_0x008d:
                p22.C110120h.f329459c = r7
                p22.e r8 = p22.C110120h.f329458b
                if (r8 == 0) goto L_0x00da
                r8.f329421e = r0
                p22.d r3 = r8.f329419c
                if (r3 == 0) goto L_0x009d
                android.view.View r4 = r3.mo161505b()
            L_0x009d:
                if (r4 != 0) goto L_0x00a0
                goto L_0x00da
            L_0x00a0:
                p22.e$a r3 = new p22.e$a
                r3.<init>(r2)
                java.lang.String r2 = r3.f329434a
                r8.f329423g = r2
                java.lang.String r4 = r3.f329435b
                r8.f329424h = r4
                java.util.Map<java.lang.String, java.lang.Integer> r4 = r8.f329431o
                java.lang.Object r2 = r4.get(r2)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r2, (int) r1)
                r8.f329426j = r1
                p22.d r1 = r8.f329419c
                if (r1 != 0) goto L_0x00c0
                goto L_0x00da
            L_0x00c0:
                java.lang.String r1 = r8.f329423g
                boolean r1 = r8.mo161511g(r1)
                if (r1 != 0) goto L_0x00cf
                java.lang.String r1 = r8.f329423g
                java.lang.String r2 = r8.f329430n
                gy3.C87412m.m108589b(r1, r2)
            L_0x00cf:
                p22.c r7 = r8.mo161506b(r7, r3)
                if (r7 == 0) goto L_0x00da
                r7.mo123655a()
                goto L_0x00da
            L_0x00d9:
                r0 = 0
            L_0x00da:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppLiteUI.C105448b.showKeyboard(android.view.View, io.flutter.embedding.engine.systemchannels.TextInputChannel$WxInputConfiguration):boolean");
        }
    }

    /* renamed from: J7 */
    public boolean mo150199J7() {
        return C85875k4.m106211z();
    }

    public void closeWindow(Intent intent) {
        if (intent.hasExtra("extraData")) {
            try {
                this.f313520Y = new JSONObject(intent.getStringExtra("extraData"));
            } catch (Exception unused) {
            }
        }
        super.closeWindow(intent);
    }

    public void hideKeyboard() {
        C110120h.f329457a.mo161516a();
        super.hideKeyboard();
    }

    /* renamed from: m2 */
    public void mo95223m2(boolean z) {
        C110107c cVar;
        C110109e eVar = C110120h.f329458b;
        if (eVar != null && (cVar = eVar.f329420d) != null && (cVar instanceof C110117g)) {
            ((C110117g) cVar).f329453f.f329477f.f313512r.setEnabled(z);
        }
    }

    public void onCreate(Bundle bundle) {
        WeakReference weakReference = new WeakReference(this);
        C110120h.C110121a aVar = this.f313521Z;
        C105447a aVar2 = new C105447a(this, weakReference);
        aVar.getClass();
        aVar.f329466b = aVar2;
        C110120h.C110121a aVar3 = this.f313521Z;
        boolean z = true;
        aVar3.f329465a = true;
        if (C110120h.f329458b == null) {
            C110109e eVar = new C110109e();
            eVar.f329419c = new C110123i();
            C110120h.f329458b = eVar;
        }
        ((ArrayList) C110120h.f329464h).add(aVar3);
        ((C14088e) C86312j.m106911c(C14088e.class)).mo13514aF(Boolean.TRUE);
        if (C118552d.m167207g().f354797a == null) {
            z = false;
        }
        if (!z) {
            C115669n.INSTANCE.mo175913w(1293, 112, 1);
        }
        super.onCreate(bundle);
        this.f339314g.f349461d.setWxKeyboardAction(new C105448b(this));
    }

    public void onDestroy() {
        super.onDestroy();
        C110120h hVar = C110120h.f329457a;
        C110120h.C110121a aVar = this.f313521Z;
        C87412m.m108594g(aVar, "handler");
        ((ArrayList) C110120h.f329464h).remove(aVar);
        LiteAppCloseWindowEvent liteAppCloseWindowEvent = new LiteAppCloseWindowEvent();
        LiteAppCloseWindowEvent.C104592a aVar2 = liteAppCloseWindowEvent.f309997d;
        aVar2.f309999b = this.f339443y;
        aVar2.f310000c = Long.valueOf(this.f339444z);
        JSONObject jSONObject = this.f313520Y;
        if (jSONObject != null) {
            liteAppCloseWindowEvent.f309997d.f309998a = jSONObject;
        }
        liteAppCloseWindowEvent.publish();
        ((C14088e) C86312j.m106911c(C14088e.class)).mo13514aF(Boolean.FALSE);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f339316i || !this.f339426L) {
            return super.onKeyDown(i, keyEvent);
        }
        LiteAppOnSystemBackEvent liteAppOnSystemBackEvent = new LiteAppOnSystemBackEvent();
        liteAppOnSystemBackEvent.f310001d.f310002a = this;
        liteAppOnSystemBackEvent.publish();
        return true;
    }
}
