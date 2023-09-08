package com.tencent.p014mm.plugin.emoji.p040ui;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gc0.C20828a;
import i61.C98601f;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import te3.C101866x70;
import te3.C49670h80;
import te3.C49811i80;
import te3.C50330lz1;
import te3.C52325zy1;

/* renamed from: com.tencent.mm.plugin.emoji.ui.f */
public class C93170f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CustomSmileyPreviewUI f268691d;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.f$a */
    public class C93171a implements View.OnClickListener {
        public C93171a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$12$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CustomSmileyPreviewUI customSmileyPreviewUI = C93170f.this.f268691d;
            customSmileyPreviewUI.mo127675L7(customSmileyPreviewUI.f268359w);
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$12$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C93170f(CustomSmileyPreviewUI customSmileyPreviewUI) {
        this.f268691d = customSmileyPreviewUI;
    }

    public void run() {
        boolean z;
        C101866x70 x702;
        C49811i80 i802;
        SpannableString spannableString;
        C101866x70 x703;
        C50330lz1 lz12 = this.f268691d.f268330U;
        if (lz12 == null || (x703 = lz12.f137724d) == null || Util.isNullOrNil(x703.f299854f)) {
            z = false;
        } else {
            View view = this.f268691d.f268344f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            CustomSmileyPreviewUI customSmileyPreviewUI = this.f268691d;
            customSmileyPreviewUI.f268346h.setText(customSmileyPreviewUI.f268330U.f137724d.f299852d);
            if (Util.isNullOrNil(this.f268691d.f268330U.f137724d.f299853e)) {
                this.f268691d.f268345g.setVisibility(8);
            } else {
                this.f268691d.f268345g.setVisibility(0);
                C20828a b = C20828a.m22825b();
                CustomSmileyPreviewUI customSmileyPreviewUI2 = this.f268691d;
                String str = customSmileyPreviewUI2.f268330U.f137724d.f299853e;
                b.mo32519h(str, customSmileyPreviewUI2.f268345g, C98601f.m128138c(customSmileyPreviewUI2.f268364z.field_groupId, str));
            }
            this.f268691d.f268347i.setText(C0966R.string.c4d);
            this.f268691d.f268344f.setOnClickListener(new C93171a());
            this.f268691d.f268311E.setVisibility(8);
            this.f268691d.f268342d.setVisibility(8);
            CustomSmileyPreviewUI customSmileyPreviewUI3 = this.f268691d;
            customSmileyPreviewUI3.f268327S0 = CustomSmileyPreviewUI$$l.DESIGNER_EMOJI_ACTIVITY;
            customSmileyPreviewUI3.mo127678O7(customSmileyPreviewUI3.f268358v);
            z = true;
        }
        CustomSmileyPreviewUI customSmileyPreviewUI4 = this.f268691d;
        C50330lz1 lz13 = customSmileyPreviewUI4.f268330U;
        if (!(lz13 == null || (i802 = lz13.f137725e) == null)) {
            int i = i802.f135159d;
            if (i == 1) {
                Log.m105924i("MicroMsg.emoji.CustomSmileyPreviewUI", "showFinderInfo: ");
                if (i802.f135161f == null) {
                    Log.m105924i("MicroMsg.emoji.CustomSmileyPreviewUI", "showFinderInfo: Link is null");
                    customSmileyPreviewUI4.f268313G = false;
                    View view2 = customSmileyPreviewUI4.f268310D;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "showFinderInfo", "(Lcom/tencent/mm/protocal/protobuf/EmotionLink;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "showFinderInfo", "(Lcom/tencent/mm/protocal/protobuf/EmotionLink;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    customSmileyPreviewUI4.f268308B.setVisibility(0);
                } else {
                    customSmileyPreviewUI4.f268313G = true;
                    View view4 = customSmileyPreviewUI4.f268310D;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view5 = view4;
                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "showFinderInfo", "(Lcom/tencent/mm/protocal/protobuf/EmotionLink;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "showFinderInfo", "(Lcom/tencent/mm/protocal/protobuf/EmotionLink;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    customSmileyPreviewUI4.f268308B.setVisibility(8);
                    C49670h80 h802 = i802.f135161f;
                    long P = C61926c.m72671P(h802.f134490d);
                    if (P == 0) {
                        Log.m105925i("MicroMsg.emoji.CustomSmileyPreviewUI", "showFinderInfo: finderId is 0, %s", h802.f134490d);
                        View view6 = customSmileyPreviewUI4.f268310D;
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(8);
                        View view7 = view6;
                        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "showFinderInfo", "(Lcom/tencent/mm/protocal/protobuf/EmotionLink;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view7, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "showFinderInfo", "(Lcom/tencent/mm/protocal/protobuf/EmotionLink;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        customSmileyPreviewUI4.f268308B.setVisibility(0);
                        customSmileyPreviewUI4.f268313G = false;
                    } else {
                        if (Util.isNullOrNil(i802.f135162g)) {
                            spannableString = new SpannableString(customSmileyPreviewUI4.getString(C0966R.string.c5q));
                        } else {
                            spannableString = new SpannableString(customSmileyPreviewUI4.getString(C0966R.string.c5p, new Object[]{customSmileyPreviewUI4.f268330U.f137725e.f135162g}));
                        }
                        customSmileyPreviewUI4.f268310D.setOnClickListener(new C41064g(customSmileyPreviewUI4, P, h802));
                        customSmileyPreviewUI4.f268311E.setText(spannableString);
                    }
                }
            } else if (i == 2) {
                C101866x70 x704 = lz13.f137724d;
                View findViewById = customSmileyPreviewUI4.findViewById(C0966R.C0970id.o6l);
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar5.mo10233c(0);
                View view8 = findViewById;
                C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "showWxAppLink", "(Lcom/tencent/mm/protocal/protobuf/EmotionActivity;Lcom/tencent/mm/protocal/protobuf/EmotionLink;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "showWxAppLink", "(Lcom/tencent/mm/protocal/protobuf/EmotionActivity;Lcom/tencent/mm/protocal/protobuf/EmotionLink;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C20828a b2 = C20828a.m22825b();
                String str2 = x704.f299853e;
                b2.mo32519h(str2, (ImageView) customSmileyPreviewUI4.findViewById(C0966R.C0970id.obh), C98601f.m128138c(customSmileyPreviewUI4.f268364z.field_groupId, str2));
                ((TextView) customSmileyPreviewUI4.findViewById(C0966R.C0970id.obi)).setText(i802.f135162g);
                ((Button) customSmileyPreviewUI4.findViewById(C0966R.C0970id.obg)).setOnClickListener(new CustomSmileyPreviewUI$$c(customSmileyPreviewUI4, i802));
                customSmileyPreviewUI4.setNavigationbarColor(customSmileyPreviewUI4.getResources().getColor(C0966R.color.f2930d));
            } else {
                customSmileyPreviewUI4.f268313G = false;
                View view9 = customSmileyPreviewUI4.f268310D;
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar6.mo10233c(8);
                C117292a.m165358d(view9, aVar6.mo10232b(), "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "showLinks", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "showLinks", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                customSmileyPreviewUI4.f268308B.setVisibility(0);
                View findViewById2 = customSmileyPreviewUI4.findViewById(C0966R.C0970id.o6l);
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(8);
                View view10 = findViewById2;
                C117292a.m165358d(view10, aVar7.mo10232b(), "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "showLinks", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "showLinks", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                customSmileyPreviewUI4.f268339Y0 = 0;
            }
        }
        if (!z) {
            CustomSmileyPreviewUI customSmileyPreviewUI5 = this.f268691d;
            C52325zy1 zy12 = customSmileyPreviewUI5.f268355s;
            if (zy12 == null || zy12.f146279d == null) {
                View view11 = customSmileyPreviewUI5.f268344f;
                C9556a aVar8 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar8.mo10233c(8);
                View view12 = view11;
                C117292a.m165358d(view12, aVar8.mo10232b(), "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view13 = customSmileyPreviewUI5.f268344f;
                C9556a aVar9 = new C9556a();
                ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                aVar9.mo10233c(0);
                View view14 = view13;
                C117292a.m165358d(view14, aVar9.mo10232b(), "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view14, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                CustomSmileyPreviewUI customSmileyPreviewUI6 = this.f268691d;
                customSmileyPreviewUI6.f268346h.setText(customSmileyPreviewUI6.f268355s.f146279d.f136020e);
                C20828a b3 = C20828a.m22825b();
                CustomSmileyPreviewUI customSmileyPreviewUI7 = this.f268691d;
                String str3 = customSmileyPreviewUI7.f268355s.f146279d.f136021f;
                b3.mo32519h(str3, customSmileyPreviewUI7.f268345g, C98601f.m128137b(customSmileyPreviewUI7.f268364z.field_groupId, str3));
                this.f268691d.f268342d.setVisibility(8);
                CustomSmileyPreviewUI customSmileyPreviewUI8 = this.f268691d;
                customSmileyPreviewUI8.f268327S0 = CustomSmileyPreviewUI$$l.DESIGNER_EMOJI;
                customSmileyPreviewUI8.mo127678O7(customSmileyPreviewUI8.f268358v);
            }
            CustomSmileyPreviewUI customSmileyPreviewUI9 = this.f268691d;
            C50330lz1 lz14 = customSmileyPreviewUI9.f268330U;
            if (lz14 != null && (x702 = lz14.f137724d) != null) {
                customSmileyPreviewUI9.getClass();
                if (!TextUtils.isEmpty(x702.f299856h) || x702.f299857i != 0) {
                    customSmileyPreviewUI9.f268353q.setText(x702.f299859n);
                    customSmileyPreviewUI9.f268308B.setVisibility(8);
                    customSmileyPreviewUI9.f268348j.setVisibility(0);
                    if (!TextUtils.isEmpty(x702.f299856h)) {
                        customSmileyPreviewUI9.f268351p.setText(C0966R.string.e7v);
                        C20828a b4 = C20828a.m22825b();
                        String str4 = x702.f299853e;
                        b4.mo32519h(str4, customSmileyPreviewUI9.f268349n, C98601f.m128137b(customSmileyPreviewUI9.f268364z.field_groupId, str4));
                        customSmileyPreviewUI9.f268350o.setText(x702.f299852d);
                        customSmileyPreviewUI9.f268348j.setOnClickListener(new CustomSmileyPreviewUI$$a(customSmileyPreviewUI9, x702));
                        ((CustomSmileyPreviewUI$$d) customSmileyPreviewUI9.f268331U0).run();
                    } else if (x702.f299857i != 0) {
                        customSmileyPreviewUI9.f268351p.setText(C0966R.string.lql);
                        C20828a b5 = C20828a.m22825b();
                        String str5 = x702.f299853e;
                        b5.mo32519h(str5, customSmileyPreviewUI9.f268349n, C98601f.m128137b(customSmileyPreviewUI9.f268364z.field_groupId, str5));
                        customSmileyPreviewUI9.f268350o.setText(x702.f299852d);
                        customSmileyPreviewUI9.f268348j.setOnClickListener(new CustomSmileyPreviewUI$$b(customSmileyPreviewUI9, x702));
                    }
                }
            }
        }
    }
}
