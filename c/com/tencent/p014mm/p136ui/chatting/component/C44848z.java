package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import eb0.C97625j3;
import java.util.HashMap;
import p270xi.C91212b;
import uc0.C52515a;
import uc0.C52517f0;
import vd3.C78404m;
import zj3.C79345d;

@C91212b(exportInterface = C79345d.class)
/* renamed from: com.tencent.mm.ui.chatting.component.z */
public class C44848z extends C73412a implements C79345d {

    /* renamed from: n */
    public static HashMap<String, C78404m> f121680n = new HashMap<>();

    /* renamed from: e */
    public Bitmap f121681e;

    /* renamed from: f */
    public ImageView f121682f;

    /* renamed from: g */
    public ImageView f121683g;

    /* renamed from: h */
    public boolean f121684h = true;

    /* renamed from: i */
    public final MStorage.IOnStorageChange f121685i = new C44849a();

    /* renamed from: j */
    public C78404m f121686j = null;

    /* renamed from: com.tencent.mm.ui.chatting.component.z$a */
    public class C44849a implements MStorage.IOnStorageChange {
        public C44849a() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105919d("MicroMsg.ChattingUI.ChattingBackgroundComponent", "onBGChange event:%s", str);
            if (str == null) {
                return;
            }
            if (str.equals(C44848z.this.f215752d.mo91577r()) || str.equals("*")) {
                C44848z.this.mo70148Z5();
            }
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
    }

    /* renamed from: G4 */
    public void mo26160G4() {
    }

    /* renamed from: G5 */
    public boolean mo70144G5() {
        C52515a jo = C52517f0.vx0().mo73451jo(this.f215752d.mo91577r());
        return (jo == null || jo.f146672b == -2) ? false : true;
    }

    /* renamed from: O1 */
    public C78404m mo70145O1() {
        return this.f121686j;
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        Log.m105924i("MicroMsg.ChattingUI.ChattingBackgroundComponent", "[onChattingEnterAnimStart]");
        mo70148Z5();
    }

    /* renamed from: R5 */
    public void mo70146R5(Configuration configuration) {
        int i = configuration.orientation;
        if (i == 1 && !this.f121684h) {
            mo70148Z5();
        } else if (i == 2 && this.f121684h) {
            mo70148Z5();
        }
    }

    /* renamed from: Y5 */
    public final void mo70147Y5() {
        Bitmap bitmap = this.f121681e;
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105925i("MicroMsg.ChattingUI.ChattingBackgroundComponent", "recycle bitmap:%s", this.f121681e.toString());
            this.f121681e.recycle();
        }
        ImageView imageView = this.f121682f;
        if (imageView != null) {
            imageView.setImageBitmap((Bitmap) null);
        }
        ImageView imageView2 = this.f121683g;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:98:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0277  */
    /* renamed from: Z5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo70148Z5() {
        /*
            r16 = this;
            r1 = r16
            java.lang.Class<op.f> r0 = p216op.C47389f.class
            ck3.b r2 = r1.f215752d
            java.lang.Class<zj3.p0> r3 = zj3.C79376p0.class
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r2 = r2.mo102812a(r3)
            zj3.p0 r2 = (zj3.C79376p0) r2
            boolean r2 = r2.mo102698q2()
            if (r2 == 0) goto L_0x0018
            r2 = 0
            goto L_0x0026
        L_0x0018:
            uc0.b r2 = uc0.C52517f0.vx0()
            ck3.b r4 = r1.f215752d
            java.lang.String r4 = r4.mo91577r()
            uc0.a r2 = r2.mo73451jo(r4)
        L_0x0026:
            r4 = -2
            if (r2 != 0) goto L_0x0042
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r5 = r5.mo105906u()
            r6 = 12311(0x3017, float:1.7251E-41)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.mo119684e(r6, r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L_0x0044
        L_0x0042:
            int r5 = r2.f146672b
        L_0x0044:
            r6 = 2131100376(0x7f0602d8, float:1.7813132E38)
            if (r5 != r4) goto L_0x0062
            ck3.b r0 = r1.f215752d
            android.content.res.Resources r0 = r0.mo91572m()
            int r0 = r0.getColor(r6)
            r1.mo70149a6(r0)
            ck3.b r0 = r1.f215752d
            android.app.Activity r0 = r0.mo91565f()
            java.lang.String r2 = "chatting/purecolor_chat.xml"
            r1.mo70150b6(r0, r2)
            return
        L_0x0062:
            di3.d r4 = di3.C86312j.m106911c(r0)
            op.f r4 = (p216op.C47389f) r4
            op.i r4 = r4.mo72331SU()
            ck3.b r7 = r1.f215752d
            android.app.Activity r7 = r7.mo91565f()
            uc0.x r4 = (uc0.C52524x) r4
            r4.getClass()
            android.util.DisplayMetrics r4 = new android.util.DisplayMetrics
            r4.<init>()
            java.lang.String r8 = "window"
            java.lang.Object r7 = r7.getSystemService(r8)
            android.view.WindowManager r7 = (android.view.WindowManager) r7
            android.view.Display r7 = r7.getDefaultDisplay()
            r7.getMetrics(r4)
            int r7 = r4.heightPixels
            int r8 = r4.widthPixels
            r9 = 0
            r10 = 1
            if (r7 <= r8) goto L_0x0095
            r7 = 1
            goto L_0x0096
        L_0x0095:
            r7 = 0
        L_0x0096:
            float r4 = r4.density
            r8 = 1065353216(0x3f800000, float:1.0)
            r11 = 2
            r12 = 3
            r13 = 4
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x00a7
            if (r7 == 0) goto L_0x00a5
            r4 = 4
            goto L_0x00ac
        L_0x00a5:
            r4 = 2
            goto L_0x00ac
        L_0x00a7:
            if (r7 == 0) goto L_0x00ab
            r4 = 3
            goto L_0x00ac
        L_0x00ab:
            r4 = 1
        L_0x00ac:
            if (r4 == r10) goto L_0x00b3
            if (r4 == r11) goto L_0x00b3
            r1.f121684h = r10
            goto L_0x00b5
        L_0x00b3:
            r1.f121684h = r9
        L_0x00b5:
            r7 = 2131297738(0x7f0905ca, float:1.821343E38)
            r8 = 2131299176(0x7f090b68, float:1.8216346E38)
            java.lang.String r14 = "MicroMsg.ChattingUI.ChattingBackgroundComponent"
            r15 = 8
            if (r5 != 0) goto L_0x0163
            r0 = -1
            if (r4 == r10) goto L_0x00cc
            if (r4 == r11) goto L_0x00cc
            if (r4 == r12) goto L_0x00cc
            if (r4 == r13) goto L_0x00cc
            r2 = -1
            goto L_0x00cf
        L_0x00cc:
            r2 = 2131231644(0x7f08039c, float:1.8079375E38)
        L_0x00cf:
            if (r2 == r0) goto L_0x0162
            r16.mo70147Y5()
            ck3.b r0 = r1.f215752d     // Catch:{ IncompatibleClassChangeError -> 0x014c, all -> 0x00e1 }
            android.content.res.Resources r0 = r0.mo91572m()     // Catch:{ IncompatibleClassChangeError -> 0x014c, all -> 0x00e1 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r2)     // Catch:{ IncompatibleClassChangeError -> 0x014c, all -> 0x00e1 }
            r1.f121681e = r0     // Catch:{ IncompatibleClassChangeError -> 0x014c, all -> 0x00e1 }
            goto L_0x00e2
        L_0x00e1:
        L_0x00e2:
            android.graphics.Bitmap r0 = r1.f121681e
            if (r0 != 0) goto L_0x010b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "setBackground decodeFile fail, bm is null, resId = "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            ck3.b r0 = r1.f215752d
            android.content.res.Resources r0 = r0.mo91572m()
            r2 = 2131100304(0x7f060290, float:1.7812986E38)
            int r0 = r0.getColor(r2)
            r1.mo70149a6(r0)
            goto L_0x0140
        L_0x010b:
            android.widget.ImageView r0 = r1.f121682f
            if (r0 != 0) goto L_0x0119
            ck3.b r0 = r1.f215752d
            android.view.View r0 = r0.mo91562c(r8)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.f121682f = r0
        L_0x0119:
            android.widget.ImageView r0 = r1.f121683g
            if (r0 != 0) goto L_0x0127
            ck3.b r0 = r1.f215752d
            android.view.View r0 = r0.mo91562c(r7)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.f121683g = r0
        L_0x0127:
            android.widget.ImageView r0 = r1.f121682f
            if (r0 == 0) goto L_0x0130
            android.graphics.Bitmap r2 = r1.f121681e
            r0.setImageBitmap(r2)
        L_0x0130:
            android.widget.ImageView r0 = r1.f121683g
            if (r0 == 0) goto L_0x0140
            boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r2 == 0) goto L_0x013b
            goto L_0x013d
        L_0x013b:
            r9 = 8
        L_0x013d:
            r0.setVisibility(r9)
        L_0x0140:
            ck3.b r0 = r1.f215752d
            android.app.Activity r0 = r0.mo91565f()
            java.lang.String r2 = "chatting/reserved_chat.xml"
            r1.mo70150b6(r0, r2)
            goto L_0x0162
        L_0x014c:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r3 = "May cause dvmFindCatchBlock crash!"
            java.lang.String r4 = "MicroMsg.Crash"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r3, r2)
            java.lang.IncompatibleClassChangeError r2 = new java.lang.IncompatibleClassChangeError
            r2.<init>(r3)
            java.lang.Throwable r0 = r2.initCause(r0)
            java.lang.IncompatibleClassChangeError r0 = (java.lang.IncompatibleClassChangeError) r0
            throw r0
        L_0x0162:
            return
        L_0x0163:
            uc0.C52517f0.xx0()
            java.lang.String r3 = "chatting/default_chat.xml"
            if (r5 <= 0) goto L_0x01e8
            ck3.b r2 = r1.f215752d
            android.app.Activity r2 = r2.mo91565f()
            r1.mo70150b6(r2, r3)
            di3.d r0 = di3.C86312j.m106911c(r0)
            op.f r0 = (p216op.C47389f) r0
            op.i r0 = r0.mo72331SU()
            uc0.x r0 = (uc0.C52524x) r0
            if (r4 == r10) goto L_0x01d2
            if (r4 == r11) goto L_0x01bb
            if (r4 == r12) goto L_0x01a4
            if (r4 == r13) goto L_0x018d
            r0.getClass()
        L_0x018a:
            r3 = 0
            goto L_0x0242
        L_0x018d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r0.mo73464Yt(r5, r10)
            r2.append(r0)
            java.lang.String r0 = "vertical_ldpi.jpg"
            r2.append(r0)
            java.lang.String r3 = r2.toString()
            goto L_0x0242
        L_0x01a4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r0.mo73464Yt(r5, r10)
            r2.append(r0)
            java.lang.String r0 = "vertical_hdpi.jpg"
            r2.append(r0)
            java.lang.String r3 = r2.toString()
            goto L_0x0242
        L_0x01bb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r0.mo73464Yt(r5, r10)
            r2.append(r0)
            java.lang.String r0 = "horizontal_ldpi.jpg"
            r2.append(r0)
            java.lang.String r3 = r2.toString()
            goto L_0x0242
        L_0x01d2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r0.mo73464Yt(r5, r10)
            r2.append(r0)
            java.lang.String r0 = "horizontal_hdpi.jpg"
            r2.append(r0)
            java.lang.String r3 = r2.toString()
            goto L_0x0242
        L_0x01e8:
            ck3.b r5 = r1.f215752d
            android.app.Activity r5 = r5.mo91565f()
            r1.mo70150b6(r5, r3)
            if (r2 != 0) goto L_0x0219
            di3.d r0 = di3.C86312j.m106911c(r0)
            op.f r0 = (p216op.C47389f) r0
            op.i r0 = r0.mo72331SU()
            uc0.x r0 = (uc0.C52524x) r0
            java.lang.String r2 = "default"
            if (r4 == r10) goto L_0x0213
            if (r4 == r11) goto L_0x0213
            if (r4 == r12) goto L_0x020e
            if (r4 == r13) goto L_0x020e
            r0.getClass()
            goto L_0x018a
        L_0x020e:
            java.lang.String r0 = r0.mo73469qq(r2, r10)
            goto L_0x0217
        L_0x0213:
            java.lang.String r0 = r0.mo73469qq(r2, r9)
        L_0x0217:
            r3 = r0
            goto L_0x0242
        L_0x0219:
            di3.d r0 = di3.C86312j.m106911c(r0)
            op.f r0 = (p216op.C47389f) r0
            op.i r0 = r0.mo72331SU()
            ck3.b r2 = r1.f215752d
            java.lang.String r2 = r2.mo91577r()
            uc0.x r0 = (uc0.C52524x) r0
            if (r4 == r10) goto L_0x023d
            if (r4 == r11) goto L_0x023d
            if (r4 == r12) goto L_0x0238
            if (r4 == r13) goto L_0x0238
            r0.getClass()
            goto L_0x018a
        L_0x0238:
            java.lang.String r0 = r0.mo73469qq(r2, r10)
            goto L_0x0217
        L_0x023d:
            java.lang.String r0 = r0.mo73469qq(r2, r9)
            goto L_0x0217
        L_0x0242:
            r16.mo70147Y5()
            java.lang.Class<xs.b> r0 = p755xs.C102720b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            xs.b r0 = (p755xs.C102720b) r0
            android.graphics.Bitmap r0 = r0.mo142105Ou(r3)
            r1.f121681e = r0
            if (r0 != 0) goto L_0x0277
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "setBackground decodeFile fail, bm is null, path = "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            ck3.b r0 = r1.f215752d
            android.content.res.Resources r0 = r0.mo91572m()
            int r0 = r0.getColor(r6)
            r1.mo70149a6(r0)
            goto L_0x02ac
        L_0x0277:
            android.widget.ImageView r0 = r1.f121682f
            if (r0 != 0) goto L_0x0285
            ck3.b r0 = r1.f215752d
            android.view.View r0 = r0.mo91562c(r8)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.f121682f = r0
        L_0x0285:
            android.widget.ImageView r0 = r1.f121683g
            if (r0 != 0) goto L_0x0293
            ck3.b r0 = r1.f215752d
            android.view.View r0 = r0.mo91562c(r7)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.f121683g = r0
        L_0x0293:
            android.widget.ImageView r0 = r1.f121682f
            if (r0 == 0) goto L_0x029c
            android.graphics.Bitmap r2 = r1.f121681e
            r0.setImageBitmap(r2)
        L_0x029c:
            android.widget.ImageView r0 = r1.f121683g
            if (r0 == 0) goto L_0x02ac
            boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r2 == 0) goto L_0x02a7
            goto L_0x02a9
        L_0x02a7:
            r9 = 8
        L_0x02a9:
            r0.setVisibility(r9)
        L_0x02ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C44848z.mo70148Z5():void");
    }

    /* renamed from: a6 */
    public final void mo70149a6(int i) {
        mo70147Y5();
        ImageView imageView = this.f121682f;
        if (imageView == null) {
            View c = this.f215752d.mo91562c(C0966R.C0970id.f357668b43);
            if (c != null) {
                c.setBackgroundColor(i);
                return;
            }
            return;
        }
        imageView.setImageDrawable(new ColorDrawable(i));
    }

    /* renamed from: b6 */
    public final boolean mo70150b6(Context context, String str) {
        if (f121680n.containsKey(str)) {
            this.f121686j = f121680n.get(str);
            return true;
        }
        try {
            String convertStreamToString = Util.convertStreamToString(context.getAssets().open(str));
            if (!Util.isNullOrNil(convertStreamToString)) {
                C78404m mVar = new C78404m(convertStreamToString, this.f215752d.mo91565f());
                this.f121686j = mVar;
                f121680n.put(str, mVar);
            }
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ChattingUI.ChattingBackgroundComponent", e, "", new Object[0]);
            return false;
        }
    }

    /* renamed from: e */
    public void mo70065e() {
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        C52517f0.vx0().add(this.f121685i);
        C52517f0.xx0().add(this.f121685i);
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        Log.m105924i("MicroMsg.ChattingUI.ChattingBackgroundComponent", "[onChattingExitAnimEnd]");
        if (C97625j3.m125811a()) {
            C52517f0.vx0().remove(this.f121685i);
            C52517f0.xx0().remove(this.f121685i);
        }
        mo70147Y5();
    }
}
