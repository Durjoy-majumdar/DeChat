package cw2;

import af0.C16458b;
import af0.C16459c;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.plugin.story.api.AbsStoryGallery;
import com.tencent.p014mm.plugin.story.api.AbsStoryHeaderTipView;
import com.tencent.p014mm.plugin.story.api.AbsStoryMuteView;
import com.tencent.p014mm.plugin.story.p108ui.album.StoryAlbumUI;
import com.tencent.p014mm.plugin.story.p108ui.view.StoryMuteView;
import com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import sx3.C64197v;
import xv2.C79005m;

/* renamed from: cw2.t */
public final class C97398t implements C79005m {

    /* renamed from: a */
    public static final C97398t f285896a = new C97398t();

    /* renamed from: b */
    public static C16458b f285897b;

    /* renamed from: c */
    public static HashMap<View, C16459c> f285898c = new HashMap<>();

    /* renamed from: d */
    public static ArrayList<C16459c> f285899d = new ArrayList<>();

    /* renamed from: e */
    public static int f285900e;

    /* renamed from: f */
    public static boolean f285901f = true;

    /* renamed from: g */
    public static final List<String> f285902g = C64197v.m75537f("y83a", "v1732a", " y83", "v1732t");

    /* renamed from: P5 */
    public MMFragment mo108964P5(Context context, Bundle bundle) {
        C87412m.m108594g(context, "context");
        Fragment instantiate = Fragment.instantiate(context, StoryAlbumUI.class.getName(), bundle);
        C87412m.m108592e(instantiate, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragment");
        return (MMFragment) instantiate;
    }

    /* renamed from: a */
    public AbsStoryMuteView mo108965a(Context context) {
        if (context != null) {
            return new StoryMuteView(context);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo108966b(android.view.ViewGroup r11, android.view.View r12, int r13, int r14) {
        /*
            r10 = this;
            java.lang.String r0 = "anchor"
            gy3.C87412m.m108594g(r12, r0)
            af0.b r0 = f285897b
            r1 = 0
            r2 = 1
            java.lang.String r3 = "MicroMsg.StoryUIFactory"
            if (r0 != 0) goto L_0x00d6
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r4 = 8
            int r0 = kg3.C76577a.m92151b(r0, r4)
            f285900e = r0
            gy3.f0 r0 = new gy3.f0
            r0.<init>()
            boolean r4 = f285901f
            if (r4 == 0) goto L_0x004c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "isInCompatibleList "
            r4.append(r5)
            java.lang.String r5 = android.os.Build.BRAND
            r4.append(r5)
            java.lang.String r5 = "  config "
            r4.append(r5)
            java.lang.String r5 = com.tencent.p014mm.storage.C85796t4.m105983jo()
            r4.append(r5)
            r5 = 32
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            f285901f = r1
        L_0x004c:
            java.util.List<java.lang.String> r4 = f285902g
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0057:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x008a
            java.lang.Object r6 = r4.next()
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = p156gj.C87203t.m108275k()
            java.lang.String r9 = "getModel()"
            gy3.C87412m.m108593f(r8, r9)
            boolean r8 = z04.C112550d0.m153801u(r8, r7, r2)
            if (r8 != 0) goto L_0x0083
            java.lang.String r8 = android.os.Build.DEVICE
            java.lang.String r9 = "DEVICE"
            gy3.C87412m.m108593f(r8, r9)
            boolean r7 = z04.C112550d0.m153801u(r8, r7, r2)
            if (r7 == 0) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            r7 = 0
            goto L_0x0084
        L_0x0083:
            r7 = 1
        L_0x0084:
            if (r7 == 0) goto L_0x0057
            r5.add(r6)
            goto L_0x0057
        L_0x008a:
            java.lang.String r4 = android.os.Build.BRAND
            java.lang.String r6 = "vivo"
            boolean r4 = gy3.C87412m.m108589b(r4, r6)
            if (r4 == 0) goto L_0x00a3
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x00a3
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 27
            if (r4 != r5) goto L_0x00a3
            r4 = 1
            goto L_0x00a4
        L_0x00a3:
            r4 = 0
        L_0x00a4:
            r5 = 2131235114(0x7f08112a, float:1.8086413E38)
            if (r4 == 0) goto L_0x00bb
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r4 = r4.getResources()
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeResource(r4, r5)
            java.lang.String r5 = "decodeResource(MMApplica…ble.story_comment_bubble)"
            gy3.C87412m.m108593f(r4, r5)
            goto L_0x00cd
        L_0x00bb:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r4 = r4.getResources()
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeResource(r4, r5)
            int r5 = f285900e
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r4, r5, r5, r2)
        L_0x00cd:
            r0.f27484d = r4
            cw2.s r4 = new cw2.s
            r4.<init>(r0)
            f285897b = r4
        L_0x00d6:
            java.util.HashMap<android.view.View, af0.c> r0 = f285898c
            boolean r0 = r0.containsKey(r12)
            if (r0 != 0) goto L_0x014a
            r0 = 2
            int[] r4 = new int[r0]
            r4 = {0, 0} // fill-array
            r12.getLocationOnScreen(r4)
            r1 = r4[r1]
            int r5 = r12.getWidth()
            int r5 = r5 / r0
            int r1 = r1 + r5
            int r5 = f285900e
            int r5 = r5 / r0
            int r1 = r1 - r5
            int r1 = r1 + r13
            r13 = r4[r2]
            int r13 = r13 + r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "bindUnreadBubbleConfetti containerMiddleX="
            r14.append(r0)
            r14.append(r1)
            java.lang.String r0 = " containerMiddleY="
            r14.append(r0)
            r14.append(r13)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r14)
            af0.e r14 = new af0.e
            r14.<init>(r1, r13)
            af0.c r13 = new af0.c
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            af0.b r1 = f285897b
            r13.<init>(r0, r1, r14, r11)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13.f43939k = r0
            r11 = 1006834287(0x3c03126f, float:0.008)
            r13.f43940l = r11
            r11 = 1123680255(0x42f9ffff, float:124.99999)
            r13.f43941m = r11
            r11 = 0
            r14 = 1097859072(0x41700000, float:15.0)
            r13.mo14940f(r11, r14)
            r11 = -1032847360(0xffffffffc2700000, float:-60.0)
            r14 = 1092616192(0x41200000, float:10.0)
            r13.mo14941g(r11, r14)
            r0 = 1500(0x5dc, double:7.41E-321)
            r13.f43925D = r0
            java.util.HashMap<android.view.View, af0.c> r11 = f285898c
            r11.put(r12, r13)
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.C97398t.mo108966b(android.view.ViewGroup, android.view.View, int, int):void");
    }

    /* renamed from: c */
    public void mo108967c(View view) {
        C87412m.m108594g(view, "anchor");
        if (f285898c.containsKey(view)) {
            f285898c.remove(view);
        }
    }

    /* renamed from: d */
    public AbsStoryGallery mo108968d(Context context, C79005m.C79006a aVar, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "type");
        return new StoryGalleryView(context, aVar, 0, false, (ArrayList) null, 28, (C8480h) null);
    }

    /* renamed from: e */
    public void mo108969e(View view) {
        C87412m.m108594g(view, "anchor");
        Log.m105918d("MicroMsg.StoryUIFactory", "stopUnreadBubbleConfetti mRunningConfetti=" + f285899d);
        C16459c cVar = f285898c.get(view);
        if (cVar != null && f285899d.contains(cVar)) {
            Log.printDebugStack("MicroMsg.StoryUIFactory", "stopUnreadBubbleConfetti", new Object[0]);
            cVar.mo14942h();
            f285899d.remove(cVar);
        }
    }

    /* renamed from: f */
    public AbsStoryHeaderTipView mo108970f(Context context) {
        return null;
    }
}
