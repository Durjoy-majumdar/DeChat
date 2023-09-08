package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.emoji.view.EmojiStatusView;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.sns.p106ui.C43155u8;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCommentPreloadTextView;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import de3.C75360c0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import os2.C100417r0;
import vr2.C102236a0;
import wc3.C78538u;

/* renamed from: com.tencent.mm.plugin.sns.ui.t */
public class C43151t implements C75360c0.C75361a {

    /* renamed from: a */
    public C43104d1 f116732a;

    public C43151t(C43104d1 d1Var) {
        this.f116732a = d1Var;
    }

    /* renamed from: a */
    public void mo67369a(View view, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        char c;
        int i;
        int i2;
        int i3;
        int i4;
        View view2 = view;
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.CommentClickCallback");
        if (this.f116732a.mo67328z6() != null) {
            this.f116732a.mo67328z6().mo67390c();
        }
        if (this.f116732a.mo67325b7() != null) {
            this.f116732a.mo67325b7().mo133177c();
        }
        if (this.f116732a.mo67326h4() != null) {
            this.f116732a.mo67326h4().mo133671d();
        }
        if (this.f116732a.mo67327w2() != null) {
            this.f116732a.mo67327w2().mo67375b();
            C43155u8 w2 = this.f116732a.mo67327w2();
            w2.getClass();
            SnsMethodCalculate.markStartTimeMs("setIsFullScreen", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
            w2.f116744h = true;
            SnsMethodCalculate.markEndTimeMs("setIsFullScreen", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
            C43155u8 w25 = this.f116732a.mo67327w2();
            w25.getClass();
            SnsMethodCalculate.markStartTimeMs("addEmojiInfoView", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
            if (w25.f116743g || !(view2 instanceof SnsCommentPreloadTextView)) {
                str4 = "onClick";
                str3 = "com.tencent.mm.plugin.sns.ui.CommentClickCallback";
                SnsMethodCalculate.markEndTimeMs("addEmojiInfoView", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
            } else {
                SnsCommentPreloadTextView snsCommentPreloadTextView = (SnsCommentPreloadTextView) view2;
                AbsoluteLayout absoluteLayout = w25.f116740d;
                if (absoluteLayout != null) {
                    if (absoluteLayout.getTag() instanceof C43155u8.C43156a) {
                        View view3 = ((C43155u8.C43156a) w25.f116740d.getTag()).f116746a;
                        SnsMethodCalculate.markStartTimeMs("closeAdUnLikeView", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
                        w25.f116743g = true;
                        view3.startAnimation(w25.f116742f);
                        w25.f116742f.setAnimationListener(new C43153t8(w25, view3));
                        SnsMethodCalculate.markEndTimeMs("closeAdUnLikeView", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
                    } else {
                        w25.mo67375b();
                    }
                    SnsMethodCalculate.markEndTimeMs("addEmojiInfoView", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
                    str4 = "onClick";
                    str3 = "com.tencent.mm.plugin.sns.ui.CommentClickCallback";
                } else if (view.getTag() == null || !(view.getTag() instanceof C96230u)) {
                    str4 = "onClick";
                    str3 = "com.tencent.mm.plugin.sns.ui.CommentClickCallback";
                    SnsMethodCalculate.markEndTimeMs("addEmojiInfoView", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
                } else {
                    C96230u uVar = (C96230u) view.getTag();
                    if (Util.isNullOrNil((List) uVar.f281195e.f299717u) || uVar.f281195e.f299717u.get(0) == null || Util.isNullOrNil(uVar.f281195e.f299717u.get(0).f131560d)) {
                        str4 = "onClick";
                        str3 = "com.tencent.mm.plugin.sns.ui.CommentClickCallback";
                        Log.m105928w("MicroMsg.AdNotLikeHelper", "skip show emoji dialog. md5 is null");
                        SnsMethodCalculate.markEndTimeMs("addEmojiInfoView", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
                    } else {
                        AbsoluteLayout absoluteLayout2 = new AbsoluteLayout(w25.f116737a);
                        w25.f116740d = absoluteLayout2;
                        absoluteLayout2.setId(C0966R.C0970id.f5608jp);
                        w25.f116740d.setOnClickListener(new C43146q8(w25));
                        w25.f116739c.addView(w25.f116740d);
                        int a = C74942w4.m89784a(w25.f116737a, 28);
                        int a2 = C74942w4.m89784a(w25.f116737a, 2);
                        int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(w25.f116737a, 160.0f);
                        int fromDPToPix2 = BackwardSupportUtil.BitmapFactory.fromDPToPix(w25.f116737a, 160.0f);
                        C75044y4.m89990b(w25.f116737a);
                        int i5 = C75044y4.m89990b(w25.f116737a).x;
                        str4 = "onClick";
                        View inflate = C85868k2.m106137b(w25.f116737a).inflate(C0966R.C0971layout.c2w, (ViewGroup) null);
                        inflate.setOnClickListener(w25.f116738b.f280360P);
                        inflate.setTag(uVar);
                        str3 = "com.tencent.mm.plugin.sns.ui.CommentClickCallback";
                        EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(uVar.f281195e.f299717u.get(0).f131560d);
                        if (TO == null) {
                            Log.m105928w("MicroMsg.AdNotLikeHelper", "skip show emoji dialog. emojiInfo is null");
                            SnsMethodCalculate.markEndTimeMs("addEmojiInfoView", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
                        } else {
                            ((EmojiStatusView) inflate.findViewById(C0966R.C0970id.f359251jt1)).setEmojiInfo(TO);
                            int[] iArr = new int[2];
                            int b = C78538u.m94866b(w25.f116737a);
                            view2.getLocationInWindow(iArr);
                            StringBuilder sb = new StringBuilder();
                            String str5 = "addEmojiInfoView";
                            sb.append("addCommentView getLocationInWindow ");
                            C96230u uVar2 = uVar;
                            sb.append(iArr[0]);
                            sb.append("  ");
                            sb.append(iArr[1]);
                            sb.append(" height: ");
                            sb.append(b);
                            Log.m105918d("MicroMsg.AdNotLikeHelper", sb.toString());
                            if (w25.f116744h) {
                                b = C76577a.m92151b(w25.f116737a, 2);
                                c = 0;
                                w25.f116745i = 0;
                            } else {
                                c = 0;
                            }
                            if (snsCommentPreloadTextView.getLineCount() > 1) {
                                i = ((iArr[c] + ((int) snsCommentPreloadTextView.getTvLayout().getLineWidth(snsCommentPreloadTextView.getLineCount() - 1))) - (a / 2)) - (fromDPToPix / 2);
                                i2 = snsCommentPreloadTextView.getHeight() - a;
                            } else {
                                i = ((iArr[c] + view.getMeasuredWidth()) - (a / 2)) - (fromDPToPix / 2);
                                i2 = 0;
                            }
                            if (iArr[1] < C75044y4.m89994f(w25.f116737a) + fromDPToPix2 + C75044y4.m89989a(w25.f116737a)) {
                                i3 = Math.max(Math.min(i, (i5 - fromDPToPix) - a2), a2);
                                i4 = ((iArr[1] - w25.f116745i) - b) + i2 + a + a2;
                            } else {
                                int max = Math.max(Math.min(i, (i5 - fromDPToPix) - a2), a2);
                                i4 = ((((iArr[1] - w25.f116745i) - b) + i2) - fromDPToPix2) - a2;
                                i3 = max;
                            }
                            Context context = w25.f116737a;
                            SnsMethodCalculate.markStartTimeMs("getStatusBarHeight", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
                            int p = C85875k4.m106200p(context);
                            SnsMethodCalculate.markEndTimeMs("getStatusBarHeight", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
                            w25.f116745i = p;
                            AbsoluteLayout.LayoutParams layoutParams = new AbsoluteLayout.LayoutParams(-2, -2, i3, i4);
                            w25.f116740d.setTag(new C43155u8.C43156a(w25, inflate));
                            w25.f116740d.addView(inflate, layoutParams);
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(8);
                            View view4 = inflate;
                            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/TimelineEmojiInfoHelper", "addEmojiInfoView", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/TimelineEmojiInfoHelper", "addEmojiInfoView", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            w25.f116743g = true;
                            new MMHandler().post(new C43147r8(w25, view2, inflate));
                            SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
                            C96230u uVar3 = uVar2;
                            long n = C100417r0.m131425n(uVar3.f281192b);
                            String valueOf = String.valueOf(uVar3.f281195e.f299709j);
                            snsReportHelper.getClass();
                            SnsMethodCalculate.markStartTimeMs("exposeSnsEmojiIconClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                            SnsReportHelper.C94986b bVar = (SnsReportHelper.C94986b) ((HashMap) snsReportHelper.f275561r).get(C102236a0.m134765q0(n));
                            if (bVar != null && !((ArrayList) bVar.f275576c).contains(valueOf)) {
                                ((ArrayList) bVar.f275576c).add(valueOf);
                            }
                            SnsMethodCalculate.markEndTimeMs("exposeSnsEmojiIconClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                            SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
                        }
                    }
                }
            }
            str = str4;
            str2 = str3;
        } else {
            str = "onClick";
            str2 = "com.tencent.mm.plugin.sns.ui.CommentClickCallback";
        }
        SnsMethodCalculate.markEndTimeMs(str, str2);
    }
}
