package com.unionpay;

/* renamed from: com.unionpay.j */
public final class C116522j implements C116515a0 {

    /* renamed from: a */
    public final /* synthetic */ UPPayWapActivity f349489a;

    public C116522j(UPPayWapActivity uPPayWapActivity) {
        this.f349489a = uPPayWapActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0022 A[SYNTHETIC, Splitter:B:14:0x0022] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x009c A[Catch:{ Exception -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo180512a(java.lang.String r13, com.unionpay.C116517b0 r14) {
        /*
            r12 = this;
            java.lang.String r0 = "1"
            java.lang.String r1 = ""
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x00a8 }
            r3.<init>(r13)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r13 = "url"
            java.lang.Object r13 = r3.get(r13)     // Catch:{ Exception -> 0x001e }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x001e }
            java.lang.String r4 = "title"
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x001c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x001c }
            r1 = r3
            goto L_0x002d
        L_0x001c:
            r3 = move-exception
            goto L_0x0020
        L_0x001e:
            r3 = move-exception
            r13 = r1
        L_0x0020:
            if (r14 == 0) goto L_0x002d
            java.lang.String r3 = r3.getMessage()     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r3 = com.unionpay.UPPayWapActivity.m164324H7(r0, r3, r2)     // Catch:{ Exception -> 0x00a8 }
            r14.mo180515a(r3)     // Catch:{ Exception -> 0x00a8 }
        L_0x002d:
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ Exception -> 0x00a8 }
            r3.<init>()     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r4 = "waptype"
            java.lang.String r5 = "new_page"
            r3.putString(r4, r5)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r4 = "magic_data"
            java.lang.String r5 = "949A1CC"
            r3.putString(r4, r5)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r4 = "wapurl"
            r3.putString(r4, r13)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r13 = "waptitle"
            r3.putString(r13, r1)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r13 = "actionType"
            com.unionpay.UPPayWapActivity r1 = r12.f349489a     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r1 = r1.f349476i     // Catch:{ Exception -> 0x00a8 }
            r3.putString(r13, r1)     // Catch:{ Exception -> 0x00a8 }
            android.content.Intent r13 = new android.content.Intent     // Catch:{ Exception -> 0x00a8 }
            r13.<init>()     // Catch:{ Exception -> 0x00a8 }
            r13.putExtras(r3)     // Catch:{ Exception -> 0x00a8 }
            com.unionpay.UPPayWapActivity r1 = r12.f349489a     // Catch:{ Exception -> 0x00a8 }
            java.lang.Class<com.unionpay.UPPayWapActivity> r3 = com.unionpay.UPPayWapActivity.class
            r13.setClass(r1, r3)     // Catch:{ Exception -> 0x00a8 }
            com.unionpay.UPPayWapActivity r1 = r12.f349489a     // Catch:{ Exception -> 0x00a8 }
            k20.a r3 = new k20.a     // Catch:{ Exception -> 0x00a8 }
            r3.<init>()     // Catch:{ Exception -> 0x00a8 }
            r3.mo10233c(r13)     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object[] r5 = r3.mo10232b()     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r6 = "com/unionpay/h"
            java.lang.String r7 = "a"
            java.lang.String r8 = "(Ljava/lang/String;Lcom/unionpay/z;)V"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            r4 = r1
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00a8 }
            r13 = 0
            java.lang.Object r13 = r3.mo10231a(r13)     // Catch:{ Exception -> 0x00a8 }
            android.content.Intent r13 = (android.content.Intent) r13     // Catch:{ Exception -> 0x00a8 }
            r1.startActivity(r13)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r5 = "com/unionpay/h"
            java.lang.String r6 = "a"
            java.lang.String r7 = "(Ljava/lang/String;Lcom/unionpay/z;)V"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            r4 = r1
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00a8 }
            if (r14 == 0) goto L_0x00a7
            java.lang.String r13 = "0"
            java.lang.String r1 = "success"
            java.lang.String r13 = com.unionpay.UPPayWapActivity.m164324H7(r13, r1, r2)     // Catch:{ Exception -> 0x00a8 }
            r14.mo180515a(r13)     // Catch:{ Exception -> 0x00a8 }
        L_0x00a7:
            return
        L_0x00a8:
            r13 = move-exception
            if (r14 == 0) goto L_0x00b6
            java.lang.String r13 = r13.getMessage()
            java.lang.String r13 = com.unionpay.UPPayWapActivity.m164324H7(r0, r13, r2)
            r14.mo180515a(r13)
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.C116522j.mo180512a(java.lang.String, com.unionpay.b0):void");
    }
}
