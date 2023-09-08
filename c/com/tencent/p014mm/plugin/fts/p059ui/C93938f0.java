package com.tencent.p014mm.plugin.fts.p059ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.C93827d;
import com.tencent.p014mm.plugin.fts.C93829e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.Comparator;
import k20.C60958c;
import k20.C9556a;
import kv1.C99260q;
import ky2.C10432i;
import lv1.C99671h;
import ov1.C77041h;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.plugin.fts.ui.f0 */
public class C93938f0 {

    /* renamed from: com.tencent.mm.plugin.fts.ui.f0$a */
    public class C93939a implements Comparator<String> {

        /* renamed from: d */
        public final /* synthetic */ C99260q f271074d;

        public C93939a(C99260q qVar) {
            this.f271074d = qVar;
        }

        public int compare(Object obj, Object obj2) {
            return this.f271074d.mo128755eu((String) obj, (String) obj2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.f0$b */
    public class C93940b implements Comparator<C99671h> {
        public int compare(Object obj, Object obj2) {
            return ((C99671h) obj2).f292116h - ((C99671h) obj).f292116h;
        }
    }

    /* renamed from: a */
    public static boolean m118693a(CharSequence charSequence, TextView textView) {
        if (charSequence == null || charSequence.length() == 0) {
            textView.setVisibility(8);
            return false;
        }
        textView.setText(charSequence, TextView.BufferType.SPANNABLE);
        textView.setVisibility(0);
        return true;
    }

    /* renamed from: b */
    public static boolean m118694b(String str, TextView textView) {
        if (textView == null) {
            return false;
        }
        if (str == null || str.length() == 0) {
            textView.setVisibility(8);
            return false;
        }
        textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(textView.getContext(), str, textView.getTextSize()));
        textView.setVisibility(0);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006f, code lost:
        r4.f292117i = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0071, code lost:
        r4.f292114f = r6.getNickname();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007f, code lost:
        if (r6.getNickname().equals(r8) != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0081, code lost:
        r4.f292115g = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0094, code lost:
        r4.f292117i = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0096, code lost:
        r4.f292114f = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r4.f292114f) == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a9, code lost:
        if (r4.f292114f.contains(r13.f292120a) == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        r4.f292116h += 10;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence m118695c(android.content.Context r10, java.util.List<lv1.C99671h> r11, java.lang.String[] r12, lv1.C99672i r13, android.text.TextPaint r14) {
        /*
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            java.lang.Class<kv1.q> r1 = kv1.C99260q.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            kv1.q r1 = (kv1.C99260q) r1
            com.tencent.mm.plugin.fts.ui.f0$a r2 = new com.tencent.mm.plugin.fts.ui.f0$a
            r2.<init>(r1)
            java.util.Arrays.sort(r12, r2)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            r2 = 0
            r3 = 0
        L_0x0019:
            int r4 = r11.size()
            r5 = 1
            if (r3 >= r4) goto L_0x00b5
            java.lang.Object r4 = r11.get(r3)
            lv1.h r4 = (lv1.C99671h) r4
            int r6 = r4.f292109a
            int r7 = r12.length
            if (r6 < r7) goto L_0x002d
            goto L_0x00b1
        L_0x002d:
            r6 = r12[r6]
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r7 == 0) goto L_0x0037
            goto L_0x00b1
        L_0x0037:
            java.lang.Class<f62.k0> r7 = f62.C75700k0.class
            k40.a r7 = f40.C86709a0.m107533q(r7)
            f62.k0 r7 = (f62.C75700k0) r7
            com.tencent.mm.storage.u3 r7 = r7.mo96097Ni()
            com.tencent.mm.storage.z1 r6 = r7.get(r6)
            if (r6 != 0) goto L_0x004a
            goto L_0x00b1
        L_0x004a:
            java.lang.String r7 = r6.getUsername()
            java.lang.Class<d62.i> r8 = d62.C75339i.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            d62.i r8 = (d62.C75339i) r8
            java.lang.String r8 = r8.pv0(r6, r7)
            int r9 = r4.f292110b
            switch(r9) {
                case 29: goto L_0x0096;
                case 30: goto L_0x0094;
                case 31: goto L_0x0092;
                case 32: goto L_0x008b;
                case 33: goto L_0x0084;
                case 34: goto L_0x0071;
                case 35: goto L_0x006f;
                case 36: goto L_0x006d;
                case 37: goto L_0x0060;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x0098
        L_0x0060:
            java.lang.String r5 = r6.mo62913l2()
            java.lang.String r5 = kv1.C99251g.m129285f(r7, r5)
            r4.f292114f = r5
            r4.f292115g = r8
            goto L_0x0098
        L_0x006d:
            r4.f292118j = r5
        L_0x006f:
            r4.f292117i = r5
        L_0x0071:
            java.lang.String r5 = r6.getNickname()
            r4.f292114f = r5
            java.lang.String r5 = r6.getNickname()
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L_0x0098
            r4.f292115g = r8
            goto L_0x0098
        L_0x0084:
            java.lang.String r5 = r4.f292111c
            r4.f292114f = r5
            r4.f292115g = r8
            goto L_0x0098
        L_0x008b:
            java.lang.String r5 = r6.f149513S0
            r4.f292114f = r5
            r4.f292115g = r8
            goto L_0x0098
        L_0x0092:
            r4.f292118j = r5
        L_0x0094:
            r4.f292117i = r5
        L_0x0096:
            r4.f292114f = r8
        L_0x0098:
            java.lang.String r5 = r4.f292114f
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x00a1
            goto L_0x00b1
        L_0x00a1:
            java.lang.String r5 = r4.f292114f
            java.lang.String r6 = r13.f292120a
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x00b1
            int r5 = r4.f292116h
            int r5 = r5 + 10
            r4.f292116h = r5
        L_0x00b1:
            int r3 = r3 + 1
            goto L_0x0019
        L_0x00b5:
            com.tencent.mm.plugin.fts.ui.f0$b r12 = new com.tencent.mm.plugin.fts.ui.f0$b
            r12.<init>()
            java.util.Collections.sort(r11, r12)
            r12 = 0
            r3 = 0
        L_0x00bf:
            int r4 = r11.size()
            if (r3 >= r4) goto L_0x014d
            java.lang.String[] r4 = r13.f292122c
            int r4 = r4.length
            if (r3 >= r4) goto L_0x014d
            int r4 = com.tencent.p014mm.plugin.fts.p059ui.C56781b.f162736a
            int r4 = r4 + -100
            float r4 = (float) r4
            float r4 = r4 - r12
            r12 = 1120403456(0x42c80000, float:100.0)
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 > 0) goto L_0x00d7
            goto L_0x014d
        L_0x00d7:
            java.lang.Object r12 = r11.get(r3)
            lv1.h r12 = (lv1.C99671h) r12
            di3.d r6 = di3.C86312j.m106911c(r0)
            ny.h r6 = (p629ny.C76979h) r6
            java.lang.String r7 = r12.f292114f
            float r8 = r14.getTextSize()
            android.text.SpannableString r6 = r6.yp0(r10, r7, r8)
            int r7 = r1.length()
            if (r7 <= 0) goto L_0x00f8
            java.lang.String r7 = ", "
            r1.append(r7)
        L_0x00f8:
            lv1.f r7 = new lv1.f
            r7.<init>()
            r7.f292088a = r6
            r7.f292089b = r13
            boolean r6 = r12.f292117i
            r7.f292090c = r6
            boolean r6 = r12.f292118j
            r7.f292091d = r6
            r7.f292094g = r4
            r7.f292095h = r14
            java.lang.String r4 = r12.f292115g
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0138
            di3.d r4 = di3.C86312j.m106911c(r0)
            ny.h r4 = (p629ny.C76979h) r4
            java.lang.String r12 = r12.f292115g
            float r6 = r14.getTextSize()
            android.text.SpannableString r12 = r4.yp0(r10, r12, r6)
            r4 = 2
            java.lang.CharSequence[] r4 = new java.lang.CharSequence[r4]
            r4[r2] = r12
            java.lang.String r12 = "("
            r4[r5] = r12
            java.lang.CharSequence r12 = android.text.TextUtils.concat(r4)
            r7.f292096i = r12
            java.lang.String r12 = ")"
            r7.f292097j = r12
        L_0x0138:
            lv1.g r12 = kv1.C99254i.m129308e(r7)
            java.lang.CharSequence r12 = r12.f292107a
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            float r12 = r14.measureText(r12)
            int r3 = r3 + 1
            goto L_0x00bf
        L_0x014d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.p059ui.C93938f0.m118695c(android.content.Context, java.util.List, java.lang.String[], lv1.i, android.text.TextPaint):java.lang.CharSequence");
    }

    /* renamed from: d */
    public static String m118696d(int i) {
        int i2;
        if (i == -23) {
            i2 = C0966R.string.f2x;
        } else if (i == -15) {
            i2 = C0966R.string.f360823f30;
        } else if (i == -13) {
            i2 = C0966R.string.f39;
        } else if (i == -11) {
            i2 = C0966R.string.f360824f31;
        } else if (i == -21) {
            i2 = C0966R.string.ihz;
        } else if (i != -20) {
            switch (i) {
                case -8:
                    i2 = C0966R.string.f38;
                    break;
                case -7:
                    i2 = C0966R.string.f2w;
                    break;
                case -6:
                    i2 = C0966R.string.f2v;
                    break;
                case -5:
                    i2 = C0966R.string.f2y;
                    break;
                case -4:
                    i2 = C0966R.string.f2r;
                    break;
                case -3:
                    i2 = C0966R.string.f2q;
                    break;
                case -2:
                    i2 = C0966R.string.f2z;
                    break;
                case -1:
                    i2 = C0966R.string.f2u;
                    break;
                default:
                    i2 = 0;
                    break;
            }
        } else {
            i2 = C0966R.string.f3_;
        }
        if (i2 == 0) {
            return null;
        }
        return MMApplicationContext.getContext().getString(i2);
    }

    /* renamed from: e */
    public static boolean m118697e() {
        boolean e = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
        Log.m105925i("MicroMsg.FTS.FTSUIApiLogic", "isOpenFTSHotSearch isTeenModeAndNothing:%s", Boolean.valueOf(e));
        return !e;
    }

    /* renamed from: f */
    public static final void m118698f(View view, boolean z) {
        if (z) {
            view.setBackgroundResource(C0966R.C0969drawable.f4855pa);
        } else {
            view.setBackgroundResource(C0966R.C0969drawable.a74);
        }
    }

    /* renamed from: g */
    public static final void m118699g(View view, boolean z) {
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSUIApiLogic", "setDivider", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSUIApiLogic", "setDivider", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSUIApiLogic", "setDivider", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSUIApiLogic", "setDivider", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: h */
    public static void m118700h(Context context, ImageView imageView, String str, String str2, int i, boolean z, int i2, int i3) {
        ImageView imageView2 = imageView;
        int i4 = i;
        Class cls = C99260q.class;
        ((C93829e) ((C99260q) C86312j.m106911c(cls)).mo128746Ta()).mo128782j(imageView, str, str2, z, i2, i3);
        if (!Util.isNullOrNil(str) || !Util.isNullOrNil(str2)) {
            C93829e eVar = (C93829e) ((C99260q) C86312j.m106911c(cls)).mo128746Ta();
            Bitmap e = eVar.mo128777e(eVar.mo128776d(str, str2, z, i2, i3));
            if (e == null || e.isRecycled()) {
                if (i4 > 0) {
                    imageView2.setImageResource(i4);
                } else {
                    imageView2.setImageResource(C0966R.color.ahf);
                }
                C93829e eVar2 = (C93829e) ((C99260q) C86312j.m106911c(cls)).mo128746Ta();
                String j = eVar2.mo128782j(imageView, str, str2, z, i2, i3);
                if (eVar2.f270801c) {
                    C93829e.C93831b bVar = new C93829e.C93831b(j, str, str2, z, i2, i3, new C93827d(eVar2, imageView2, context));
                    if (eVar2.f270808j.add(j)) {
                        int i5 = eVar2.f270802d + 1;
                        eVar2.f270802d = i5;
                        int i6 = i5 % 2;
                        eVar2.f270802d = i6;
                        eVar2.f270804f[i6].post(bVar);
                    } else {
                        Log.m105927v("MicroMsg.FTS.FTSImageLoader", "cacheKey: %s | runningJobTask: %s", j, eVar2.f270808j.toString());
                    }
                }
            } else {
                imageView2.setImageDrawable(new C77041h(context.getResources(), e));
                imageView.postInvalidate();
            }
            imageView2.setVisibility(0);
        } else if (i4 <= 0 || (Util.isNullOrNil(str) && Util.isNullOrNil(str2))) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setImageResource(i4);
        }
    }
}
