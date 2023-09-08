package rn3;

import android.widget.ImageView;
import com.tencent.p014mm.p136ui.transmit.SelectConversationUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import lb0.C88394b;

/* renamed from: rn3.c0 */
public class C77543c0 implements C88394b.C88411m {

    /* renamed from: d */
    public final /* synthetic */ ImageView f226071d;

    /* renamed from: e */
    public final /* synthetic */ String f226072e;

    /* renamed from: f */
    public final /* synthetic */ SelectConversationUI f226073f;

    public C77543c0(SelectConversationUI selectConversationUI, ImageView imageView, String str) {
        this.f226073f = selectConversationUI;
        this.f226071d = imageView;
        this.f226072e = str;
    }

    /* renamed from: b */
    public void mo1907b() {
        Log.m105925i("Weishi", "dealRetransmitFromWeishiVideoMiniProgram, image load fail:%", this.f226072e);
    }

    /* renamed from: d */
    public void mo1908d() {
    }

    public String key() {
        return "SelectConversationUI#WEISHITHUMB";
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBitmapLoaded(android.graphics.Bitmap r12) {
        /*
            r11 = this;
            com.tencent.mm.ui.transmit.SelectConversationUI r0 = r11.f226073f
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x009b
            if (r12 == 0) goto L_0x009b
            boolean r0 = r12.isRecycled()
            if (r0 != 0) goto L_0x009b
            android.widget.ImageView r0 = r11.f226071d
            if (r0 == 0) goto L_0x009b
            com.tencent.mm.ui.transmit.SelectConversationUI r1 = r11.f226073f
            int r2 = r12.getWidth()
            int r3 = r12.getHeight()
            int r4 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.f220137K1
            float r3 = (float) r3
            float r2 = (float) r2
            float r3 = r3 / r2
            r2 = 2131165264(0x7f070050, float:1.794474E38)
            int r2 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r1, r2)
            r4 = 2131165263(0x7f07004f, float:1.7944738E38)
            int r1 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r1, r4)
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r6 = 0
            r7 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0042
            double r8 = (double) r3
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0042
            float r4 = (float) r2
            float r4 = r4 / r3
            int r3 = (int) r4
            goto L_0x0052
        L_0x0042:
            double r8 = (double) r3
            r6 = 1065353216(0x3f800000, float:1.0)
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 < 0) goto L_0x0055
            int r4 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0055
            float r2 = (float) r1
            float r2 = r2 * r3
            int r2 = (int) r2
            r3 = r1
        L_0x0052:
            r4 = r1
            r1 = r2
            goto L_0x0077
        L_0x0055:
            r4 = 1073741824(0x40000000, float:2.0)
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0066
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x0066
            float r2 = (float) r1
            float r2 = r2 / r3
            int r2 = (int) r2
            r3 = r2
            r4 = r3
            r2 = r1
            goto L_0x0077
        L_0x0066:
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x0073
            float r4 = (float) r2
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = r2
            r2 = r1
            r1 = r3
            r3 = r4
            goto L_0x0077
        L_0x0073:
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0077:
            r5 = 1
            if (r1 <= 0) goto L_0x0089
            if (r3 <= 0) goto L_0x0089
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createScaledBitmap(r12, r3, r1, r5)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r4, r2)
            r0.setLayoutParams(r1)
            goto L_0x008a
        L_0x0089:
            r12 = 0
        L_0x008a:
            com.tencent.mm.ui.transmit.SelectConversationUI r0 = r11.f226073f
            r1 = 3
            int r0 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r0, r1)
            float r0 = (float) r0
            android.graphics.Bitmap r12 = com.tencent.p014mm.p136ui.C74821t4.m89550a(r12, r5, r0, r7)
            android.widget.ImageView r0 = r11.f226071d
            r0.setImageBitmap(r12)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rn3.C77543c0.onBitmapLoaded(android.graphics.Bitmap):void");
    }
}
