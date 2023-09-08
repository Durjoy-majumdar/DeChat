package p148ei;

import al3.C0086a;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import cp3.C7122b;
import nj3.C11181k;
import nj3.C76879j;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C77426q;

/* renamed from: ei.a */
public class C7660a {

    /* renamed from: a */
    public String f26000a;

    /* renamed from: b */
    public String f26001b;

    /* renamed from: c */
    public int f26002c;

    /* renamed from: d */
    public String f26003d;

    /* renamed from: e */
    public C7662f f26004e;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x011f, code lost:
        if (r5 != false) goto L_0x012b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0145 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p148ei.C7660a m7782a(java.lang.String r16) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r16)
            r1 = 0
            if (r0 == 0) goto L_0x0009
            goto L_0x012a
        L_0x0009:
            ei.f r0 = new ei.f
            r0.<init>()
            java.lang.String r2 = "e"
            r3 = r16
            java.util.Map r2 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3, r2, r1)
            java.lang.String r3 = "MicroMsg.BroadcastEntity"
            if (r2 != 0) goto L_0x0022
            java.lang.String r0 = "this is not errmsg"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
            goto L_0x012a
        L_0x0022:
            java.lang.String r4 = ".e.Content"
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r0.f26010b = r4
            java.lang.String r4 = ".e.Url"
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r0.f26009a = r4
            java.lang.String r4 = ".e.Title"
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r0.f26013e = r4
            java.lang.String r4 = ".e.Action"
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)
            r0.f26012d = r4
            java.lang.String r4 = ".e.ShowType"
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r5)
            r0.f26011c = r4
            java.lang.String r4 = ".e.DispSec"
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r6 = 30
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r6)
            java.lang.String r4 = ".e.Ok"
            java.lang.Object r7 = r2.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            r0.f26014f = r7
            java.lang.String r7 = ".e.Cancel"
            java.lang.Object r8 = r2.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            r0.f26015g = r8
            java.lang.String r8 = "e.Countdown"
            java.lang.Object r9 = r2.get(r8)
            java.lang.String r9 = (java.lang.String) r9
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r5)
            int r9 = r0.f26011c
            r10 = 9
            r11 = 8
            r12 = 3
            r13 = 5
            r14 = 4
            r15 = 1
            if (r9 != r14) goto L_0x0097
        L_0x0095:
            r9 = 1
            goto L_0x00a7
        L_0x0097:
            if (r9 != r15) goto L_0x009a
            goto L_0x0095
        L_0x009a:
            if (r9 != r13) goto L_0x009d
            goto L_0x0095
        L_0x009d:
            if (r9 != r12) goto L_0x00a0
            goto L_0x0095
        L_0x00a0:
            if (r9 != r11) goto L_0x00a3
            goto L_0x0095
        L_0x00a3:
            if (r9 != r10) goto L_0x00a6
            goto L_0x0095
        L_0x00a6:
            r9 = 0
        L_0x00a7:
            if (r9 == 0) goto L_0x00ab
            goto L_0x012b
        L_0x00ab:
            java.lang.String r9 = ".e"
            java.lang.Object r9 = r2.get(r9)     // Catch:{ Exception -> 0x0122 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0122 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0122 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x0122 }
            java.lang.String r9 = "Content"
            java.lang.String r9 = r1.getString(r9)     // Catch:{ Exception -> 0x0122 }
            r0.f26010b = r9     // Catch:{ Exception -> 0x0122 }
            java.lang.String r9 = "Url"
            java.lang.String r9 = r1.getString(r9)     // Catch:{ Exception -> 0x0122 }
            r0.f26009a = r9     // Catch:{ Exception -> 0x0122 }
            java.lang.String r9 = "Title"
            java.lang.String r9 = r1.getString(r9)     // Catch:{ Exception -> 0x0122 }
            r0.f26013e = r9     // Catch:{ Exception -> 0x0122 }
            java.lang.String r9 = "Action"
            java.lang.String r9 = r1.getString(r9)     // Catch:{ Exception -> 0x0122 }
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r5)     // Catch:{ Exception -> 0x0122 }
            r0.f26012d = r9     // Catch:{ Exception -> 0x0122 }
            java.lang.String r9 = "ShowType"
            java.lang.String r9 = r1.getString(r9)     // Catch:{ Exception -> 0x0122 }
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r5)     // Catch:{ Exception -> 0x0122 }
            r0.f26011c = r9     // Catch:{ Exception -> 0x0122 }
            java.lang.String r9 = "DispSec"
            java.lang.String r1 = r1.getString(r9)     // Catch:{ Exception -> 0x0122 }
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r6)     // Catch:{ Exception -> 0x0122 }
            java.lang.Object r1 = r2.get(r4)     // Catch:{ Exception -> 0x0122 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0122 }
            r0.f26014f = r1     // Catch:{ Exception -> 0x0122 }
            java.lang.Object r1 = r2.get(r7)     // Catch:{ Exception -> 0x0122 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0122 }
            r0.f26015g = r1     // Catch:{ Exception -> 0x0122 }
            java.lang.Object r1 = r2.get(r8)     // Catch:{ Exception -> 0x0122 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0122 }
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r5)     // Catch:{ Exception -> 0x0122 }
            int r1 = r0.f26011c     // Catch:{ Exception -> 0x0122 }
            if (r1 != r14) goto L_0x0110
        L_0x010e:
            r5 = 1
            goto L_0x011f
        L_0x0110:
            if (r1 != r15) goto L_0x0113
            goto L_0x010e
        L_0x0113:
            if (r1 != r13) goto L_0x0116
            goto L_0x010e
        L_0x0116:
            if (r1 != r12) goto L_0x0119
            goto L_0x010e
        L_0x0119:
            if (r1 != r11) goto L_0x011c
            goto L_0x010e
        L_0x011c:
            if (r1 != r10) goto L_0x011f
            goto L_0x010e
        L_0x011f:
            if (r5 == 0) goto L_0x012a
            goto L_0x012b
        L_0x0122:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r1)
        L_0x012a:
            r0 = 0
        L_0x012b:
            if (r0 == 0) goto L_0x0145
            ei.a r1 = new ei.a
            r1.<init>()
            r1.f26004e = r0
            java.lang.String r2 = r0.f26009a
            r1.f26000a = r2
            java.lang.String r2 = r0.f26010b
            r1.f26001b = r2
            int r2 = r0.f26011c
            r1.f26002c = r2
            java.lang.String r0 = r0.f26013e
            r1.f26003d = r0
            return r1
        L_0x0145:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p148ei.C7660a.m7782a(java.lang.String):ei.a");
    }

    /* renamed from: b */
    public boolean mo8792b(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        int i = this.f26002c;
        int i2 = C0966R.string.a18;
        if (i == 3 || i == 4) {
            C7662f fVar = this.f26004e;
            String str = fVar.f26014f;
            String str2 = fVar.f26015g;
            if (Util.isNullOrNil(str) && Util.isNullOrNil(str2)) {
                if (this.f26002c == 3) {
                    i2 = C0966R.string.a4h;
                }
                str = context.getString(i2);
                str2 = context.getString(this.f26002c == 3 ? C0966R.string.f360090a14 : C0966R.string.f7926wf);
            }
            String str3 = str2;
            String str4 = str;
            if (Util.isNullOrNil(str4) || Util.isNullOrNil(str3)) {
                String str5 = this.f26001b;
                String str6 = this.f26003d;
                if (!Util.isNullOrNil(str4)) {
                    str3 = str4;
                }
                if (Util.isNullOrNil(str4)) {
                    onClickListener = onClickListener2;
                }
                C76879j.m92754y(context, str5, str6, str3, onClickListener);
                return true;
            } else if (this.f26004e.f26012d == 1) {
                String str7 = this.f26003d;
                String str8 = this.f26001b;
                String str9 = this.f26000a;
                if (context == null) {
                    return true;
                }
                C77426q qVar = new C77426q(context);
                if (str7 == null) {
                    str7 = "";
                }
                qVar.mo107606r(str7);
                if (str8 == null) {
                    str8 = "";
                }
                qVar.mo107595g(str8);
                if (str4 == null) {
                    str4 = "";
                }
                qVar.mo107602n(str4);
                qVar.mo107589a(true);
                qVar.mo107590b(new C7122b(context, str9));
                qVar.mo107603o();
                return true;
            } else {
                C76879j.m92707A(context, this.f26001b, this.f26003d, str4, str3, onClickListener, onClickListener2);
                return true;
            }
        } else if (i == 1) {
            C76879j.m92711E(context, this.f26001b, this.f26003d, context.getString(C0966R.string.a18), true, onClickListener);
            return true;
        } else if (i != 5) {
            return false;
        } else {
            C76879j.m92748s(context, this.f26001b, this.f26003d);
            return true;
        }
    }

    /* renamed from: c */
    public boolean mo8793c(Context context, DialogInterface.OnDismissListener onDismissListener) {
        String str = this.f26001b;
        String str2 = this.f26003d;
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return true;
        }
        C77389a aVar = new C77389a();
        aVar.f225644a = str2;
        aVar.f225660q = str;
        aVar.f225623F = onDismissListener;
        aVar.f225668y = false;
        aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.a18);
        aVar.f225620C = new C11181k();
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        C76879j.m92730a(context, gVar);
        return true;
    }
}
