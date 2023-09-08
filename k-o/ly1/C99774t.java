package ly1;

import yt0.C53568b;

/* renamed from: ly1.t */
public class C99774t implements C53568b {

    /* renamed from: a */
    public final /* synthetic */ C99776u f292419a;

    public C99774t(C99776u uVar) {
        this.f292419a = uVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        r3 = r3.f147980e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63442a(android.view.View r18, int r19, long r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            java.lang.Class<sw1.s> r2 = sw1.C101703s.class
            ly1.u r3 = r0.f292419a
            ly1.p r3 = r3.f292424h
            ly1.p$a r3 = r3.f292389B1
            if (r1 < 0) goto L_0x0020
            java.util.LinkedList<vw1.l> r4 = r3.f292400i
            int r4 = r4.size()
            if (r1 < r4) goto L_0x0017
            goto L_0x0023
        L_0x0017:
            java.util.LinkedList<vw1.l> r3 = r3.f292400i
            java.lang.Object r1 = r3.get(r1)
            vw1.l r1 = (vw1.C102299l) r1
            goto L_0x0024
        L_0x0020:
            r3.getClass()
        L_0x0023:
            r1 = 0
        L_0x0024:
            boolean r3 = r1.f301296e
            if (r3 != 0) goto L_0x0112
            boolean r3 = r1.f301297f
            if (r3 == 0) goto L_0x002e
            goto L_0x0112
        L_0x002e:
            ly1.u r3 = r0.f292419a
            r3.f292434u = r1
            vw1.g0 r3 = r1.f301314z
            r4 = 1
            if (r3 == 0) goto L_0x0044
            vw1.s r3 = r3.f147980e
            if (r3 != 0) goto L_0x003c
            goto L_0x0044
        L_0x003c:
            java.lang.String r3 = r3.f148023d
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            r3 = r3 ^ r4
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            if (r3 == 0) goto L_0x00b1
            boolean r3 = r1.f301295d
            if (r3 != 0) goto L_0x00b1
            java.lang.String r2 = r1.f301307s
            java.lang.String r3 = r1.f301308t
            vw1.g0 r1 = r1.f301314z
            vw1.s r1 = r1.f147980e
            ly1.u r5 = r0.f292419a
            android.content.Context r5 = r5.getContext()
            android.app.Activity r5 = (android.app.Activity) r5
            if (r1 == 0) goto L_0x00b0
            if (r5 != 0) goto L_0x0060
            goto L_0x00b0
        L_0x0060:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            java.lang.String r7 = "key_game_video_appid"
            r6.putExtra(r7, r2)
            java.lang.String r2 = "key_game_video_appname"
            r6.putExtra(r2, r3)
            java.lang.String r2 = "key_game_video_page_type"
            r6.putExtra(r2, r4)
            java.lang.String r2 = "key_game_video_encode_json_array"
            r6.putExtra(r2, r4)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            int r3 = r1.f148024e
            java.lang.String r4 = "jumpType"
            r2.put(r4, r3)
            java.lang.String r1 = r1.f148023d
            java.lang.String r3 = "jumpUrl"
            r2.put(r3, r1)
            c30.e r1 = new c30.e
            r1.<init>()
            r1.mo53846q(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "JSONArray().apply {\n    …son)\n        }.toString()"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r2 = "key_video_info"
            r6.putExtra(r2, r1)
            r1 = -1
            r5.setResult(r1, r6)
            r5.finish()
        L_0x00b0:
            return
        L_0x00b1:
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            ly1.u r3 = r0.f292419a
            boolean r3 = r3.f292432s
            java.lang.String r4 = "game_straight_to_publish"
            r15.putBoolean(r4, r3)
            boolean r3 = r1.f301295d
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r3 == 0) goto L_0x00ec
            di3.d r2 = di3.C86312j.m106911c(r2)
            r7 = r2
            sw1.s r7 = (sw1.C101703s) r7
            ly1.u r2 = r0.f292419a
            android.content.Context r8 = r2.getContext()
            r9 = 7
            java.lang.String r10 = r1.f301307s
            java.lang.String r11 = r1.f301300i
            r12 = 0
            r13 = 0
            ly1.u r1 = r0.f292419a
            int r1 = r1.hashCode()
            r14 = r1 & r4
            ly1.u r1 = r0.f292419a
            int r1 = r1.f292433t
            r16 = r1
            r7.mo10937Qd(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0112
        L_0x00ec:
            di3.d r2 = di3.C86312j.m106911c(r2)
            r7 = r2
            sw1.s r7 = (sw1.C101703s) r7
            ly1.u r2 = r0.f292419a
            android.content.Context r8 = r2.getContext()
            r9 = 7
            java.lang.String r10 = r1.f301307s
            r11 = 0
            java.lang.String r12 = r1.f301300i
            java.lang.String r13 = r1.f301299h
            ly1.u r1 = r0.f292419a
            int r1 = r1.hashCode()
            r14 = r1 & r4
            ly1.u r1 = r0.f292419a
            int r1 = r1.f292433t
            r16 = r1
            r7.mo10937Qd(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ly1.C99774t.mo63442a(android.view.View, int, long):void");
    }
}
