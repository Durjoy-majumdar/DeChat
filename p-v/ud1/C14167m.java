package ud1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC;

/* renamed from: ud1.m */
public final class C14167m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderMusicTopicHeaderUIC f39607d;

    public C14167m(FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC) {
        this.f39607d = finderMusicTopicHeaderUIC;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b A[Catch:{ all -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r12) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r12)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initPost$2"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r11
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC r12 = r11.f39607d
            r12.getClass()
            java.lang.String r0 = "FinderMusicTopicHeaderUIC"
            java.lang.String r1 = "handleClickPost: "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            T r1 = r12.f33564d
            te3.sn1 r1 = (te3.C51270sn1) r1
            if (r1 == 0) goto L_0x012f
            te3.xd1 r1 = r1.f141636z
            if (r1 == 0) goto L_0x012f
            te3.td1 r1 = r1.f144603g
            if (r1 != 0) goto L_0x0037
            goto L_0x012f
        L_0x0037:
            r2 = 0
            r3 = 1
            kotlin.Result$Companion r4 = kotlin.Result.Companion     // Catch:{ all -> 0x0058 }
            java.lang.String r4 = r1.f185546s     // Catch:{ all -> 0x0058 }
            if (r4 == 0) goto L_0x0048
            int r4 = r4.length()     // Catch:{ all -> 0x0058 }
            if (r4 != 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r4 = 0
            goto L_0x0049
        L_0x0048:
            r4 = 1
        L_0x0049:
            if (r4 != 0) goto L_0x004f
            java.lang.String r4 = r1.f185546s     // Catch:{ all -> 0x0058 }
            r1.f185534d = r4     // Catch:{ all -> 0x0058 }
        L_0x004f:
            byte[] r4 = r1.toByteArray()     // Catch:{ all -> 0x0058 }
            java.lang.Object r4 = kotlin.Result.m168114constructorimpl(r4)     // Catch:{ all -> 0x0058 }
            goto L_0x0063
        L_0x0058:
            r4 = move-exception
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r4 = kotlin.Result.m168114constructorimpl(r4)
        L_0x0063:
            boolean r5 = kotlin.Result.m168120isFailureimpl(r4)
            r6 = 0
            if (r5 == 0) goto L_0x006b
            r4 = r6
        L_0x006b:
            byte[] r4 = (byte[]) r4
            if (r4 != 0) goto L_0x0076
            java.lang.String r12 = "handleClickPost: to pb error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r12)
            goto L_0x0134
        L_0x0076:
            dp1.t0 r5 = dp1.C58408t0.f167336a
            r7 = 17
            r5.mo83266l(r7, r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            f40.e r8 = f40.C86709a0.m107523b()
            java.lang.String r8 = r8.mo121111i()
            r7.append(r8)
            r8 = 95
            r7.append(r8)
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r5.mo83264j(r7)
            r12.mo2209G3(r3)
            java.lang.Class<er1.b> r5 = er1.C58684b.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            er1.b r5 = (er1.C58684b) r5
            android.app.Activity r7 = r12.getContext()
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            r9 = 18
            java.lang.String r10 = "key_finder_post_from"
            r8.putExtra(r10, r9)
            r9 = 16
            java.lang.String r10 = "key_finder_post_router"
            r8.putExtra(r10, r9)
            T r9 = r12.f33564d
            te3.sn1 r9 = (te3.C51270sn1) r9
            if (r9 == 0) goto L_0x00ef
            te3.xd1 r9 = r9.f141636z
            if (r9 == 0) goto L_0x00ef
            te3.td1 r9 = r9.f144603g
            if (r9 == 0) goto L_0x00ef
            java.lang.String r10 = r9.f185539i
            if (r10 == 0) goto L_0x00dd
            int r10 = r10.length()
            if (r10 != 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            r10 = 0
            goto L_0x00de
        L_0x00dd:
            r10 = 1
        L_0x00de:
            if (r10 != 0) goto L_0x00e6
            int r10 = r9.f185547t
            if (r10 == r3) goto L_0x00e6
            r10 = 1
            goto L_0x00e7
        L_0x00e6:
            r10 = 0
        L_0x00e7:
            if (r10 == 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            r9 = r6
        L_0x00eb:
            if (r9 == 0) goto L_0x00ef
            java.lang.String r6 = r9.f185546s
        L_0x00ef:
            if (r6 == 0) goto L_0x00f7
            int r6 = r6.length()
            if (r6 != 0) goto L_0x00f8
        L_0x00f7:
            r2 = 1
        L_0x00f8:
            if (r2 == 0) goto L_0x0117
            java.lang.String r12 = r12.mo2212l3()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "handleClickPost: post by feed music id "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.lang.String r0 = "KEY_FINDER_POST_MUSIC_FEEDID"
            r8.putExtra(r0, r12)
        L_0x0117:
            java.lang.String r12 = "KEY_FINDER_POST_MUSIC_INFO"
            r8.putExtra(r12, r4)
            java.lang.String r12 = r1.f185546s
            java.lang.String r0 = "KEY_FINDER_POST_ORIGIN_MUSIC_ID"
            r8.putExtra(r0, r12)
            r12 = 7
            java.lang.String r0 = "key_maas_entrance"
            r8.putExtra(r0, r12)
            rx3.b0 r12 = rx3.C13598b0.f38549a
            r5.mo83582c0(r7, r8)
            goto L_0x0134
        L_0x012f:
            java.lang.String r12 = "handleClickPost: music info null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r12)
        L_0x0134:
            java.lang.String r12 = "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initPost$2"
            java.lang.String r0 = "android/view/View$OnClickListener"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r11, r12, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ud1.C14167m.onClick(android.view.View):void");
    }
}
