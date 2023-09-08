package nk1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import ke3.C88144b;
import org.json.JSONObject;
import tf0.C13883o1;

/* renamed from: nk1.g */
public final class C61779g {

    /* renamed from: a */
    public static final C61779g f175628a = new C61779g();

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034 A[Catch:{ Exception -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036 A[Catch:{ Exception -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039 A[Catch:{ Exception -> 0x003e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86698a(android.content.Context r9, org.json.JSONObject r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "safeGetString"
            java.lang.String r2 = "context"
            gy3.C87412m.m108594g(r9, r2)
            java.lang.String r2 = "necessaryParams"
            gy3.C87412m.m108594g(r10, r2)
            java.lang.String r2 = "bizUsername"
            r3 = 0
            r4 = 0
            r5 = 1
            boolean r6 = r10.has(r2)     // Catch:{ Exception -> 0x0023 }
            if (r6 != r5) goto L_0x001b
            r6 = 1
            goto L_0x001c
        L_0x001b:
            r6 = 0
        L_0x001c:
            if (r6 == 0) goto L_0x002b
            java.lang.String r2 = r10.getString(r2)     // Catch:{ Exception -> 0x0023 }
            goto L_0x002c
        L_0x0023:
            r2 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r4] = r2
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r0, r6)
        L_0x002b:
            r2 = r3
        L_0x002c:
            java.lang.String r6 = "nickname"
            boolean r7 = r10.has(r6)     // Catch:{ Exception -> 0x003e }
            if (r7 != r5) goto L_0x0036
            r7 = 1
            goto L_0x0037
        L_0x0036:
            r7 = 0
        L_0x0037:
            if (r7 == 0) goto L_0x0046
            java.lang.String r10 = r10.getString(r6)     // Catch:{ Exception -> 0x003e }
            goto L_0x0047
        L_0x003e:
            r10 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r4] = r10
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r0, r6)
        L_0x0046:
            r10 = r3
        L_0x0047:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "Contact_User"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "Contact_Nick"
            r0.putExtra(r1, r10)
            java.lang.String r10 = "force_get_contact"
            r0.putExtra(r10, r5)
            java.lang.String r10 = "key_use_new_contact_profile"
            r0.putExtra(r10, r5)
            java.lang.String r10 = "profile"
            java.lang.String r1 = ".ui.ContactInfoUI"
            ke3.C88144b.m109791i(r9, r10, r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nk1.C61779g.mo86698a(android.content.Context, org.json.JSONObject):void");
    }

    /* renamed from: b */
    public final void mo86699b(Context context, JSONObject jSONObject) {
        String str;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(jSONObject, "necessaryParams");
        try {
            if (jSONObject.has("cardId")) {
                str = jSONObject.getString("cardId");
                Intent intent = new Intent(context, C74928u.C30866c.class);
                intent.putExtra("key_card_id", str);
                intent.putExtra("key_card_ext", "");
                C88144b.m109791i(context, "card", ".ui.CardDetailUI", intent, (Bundle) null);
            }
        } catch (Exception e) {
            Log.printDebugStack("safeGetString", "", e);
        }
        str = null;
        Intent intent2 = new Intent(context, C74928u.C30866c.class);
        intent2.putExtra("key_card_id", str);
        intent2.putExtra("key_card_ext", "");
        C88144b.m109791i(context, "card", ".ui.CardDetailUI", intent2, (Bundle) null);
    }

    /* renamed from: c */
    public final void mo86700c(Context context, JSONObject jSONObject) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(jSONObject, "necessaryParams");
        String str = null;
        try {
            if (jSONObject.has("topic")) {
                str = jSONObject.getString("topic");
            }
        } catch (Exception e) {
            Log.printDebugStack("safeGetString", "", e);
        }
        Intent intent = new Intent();
        intent.putExtra("key_topic_type", 1);
        intent.putExtra("key_topic_title", str);
        ((C13883o1) C86312j.m106911c(C13883o1.class)).F50(context, intent);
    }
}
