package com.tencent.p014mm.plugin.sns.lucky.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import as2.C92086h;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.C96077n;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.TouchImageView;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p196ln.C76705f;
import te3.h84;
import te3.j74;

/* renamed from: com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader */
public class SnsDetailLuckyHeader extends LinearLayout {

    /* renamed from: d */
    public View f274674d = null;

    /* renamed from: e */
    public TextView f274675e;

    /* renamed from: f */
    public LinearLayout f274676f;

    /* renamed from: g */
    public LinearLayout f274677g;

    public SnsDetailLuckyHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo130697a();
    }

    /* renamed from: a */
    public final void mo130697a() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
        View inflate = View.inflate(getContext(), C0966R.C0971layout.b_h, this);
        this.f274674d = inflate.findViewById(C0966R.C0970id.f5736n8);
        this.f274675e = (TextView) inflate.findViewById(C0966R.C0970id.f5718mq);
        this.f274676f = (LinearLayout) inflate.findViewById(C0966R.C0970id.f5719mr);
        this.f274677g = getLinearSeparator();
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
    }

    /* renamed from: b */
    public void mo130698b(SnsInfo snsInfo, TimelineClickListener timelineClickListener) {
        String str;
        int i;
        SnsInfo snsInfo2 = snsInfo;
        TimelineClickListener timelineClickListener2 = timelineClickListener;
        SnsMethodCalculate.markStartTimeMs("setContent", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
        SnsObject e = C94897n1.m120367e(snsInfo);
        h84 h84 = e.SnsRedEnvelops;
        if (h84 == null || h84.f134505e.size() == 0) {
            setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("setContent", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
            return;
        }
        setVisibility(0);
        this.f274675e.setText(getContext().getString(C0966R.string.jeu, new Object[]{Integer.valueOf(e.SnsRedEnvelops.f134504d), Util.formatMoney2f((((double) C92086h.m115758e(snsInfo2, e)) * 1.0d) / 100.0d)}));
        this.f274674d.setTag(snsInfo2);
        this.f274674d.setOnClickListener(timelineClickListener2.f280393w);
        LinkedList<j74> linkedList = h84.f134505e;
        boolean isEmpty = linkedList.isEmpty();
        SnsMethodCalculate.markStartTimeMs("setRewardList", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
        int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 32.0f);
        int fromDPToPix2 = BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 6.0f);
        int fromDPToPix3 = BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 10.0f);
        int fromDPToPix4 = BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 17.0f);
        if (this.f274676f == null) {
            SnsMethodCalculate.markEndTimeMs("setRewardList", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
            str = "setContent";
        } else {
            SnsMethodCalculate.markStartTimeMs("guessWidth", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
            int width = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getWidth();
            float dimension = getResources().getDimension(C0966R.dimen.f3926j6);
            str = "setContent";
            Log.m105919d("MicroMsg.SnsDetailLuckyHeader", "guess size %d %f", Integer.valueOf(width), Float.valueOf(dimension));
            float f = ((float) width) - (dimension * 2.0f);
            SnsMethodCalculate.markEndTimeMs("guessWidth", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
            if (linkedList.size() <= 0) {
                if (this.f274676f.getParent() != null) {
                    i = 8;
                    this.f274676f.setVisibility(8);
                } else {
                    i = 8;
                }
                this.f274676f.removeAllViews();
                this.f274676f.setVisibility(i);
                this.f274676f.setVisibility(i);
                SnsMethodCalculate.markEndTimeMs("setRewardList", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
            } else {
                this.f274676f.getParent();
                this.f274676f.removeAllViews();
                this.f274676f.setVisibility(0);
                this.f274676f.setPadding(0, fromDPToPix2, 0, fromDPToPix2);
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(C0966R.raw.friendactivity_luckymoney_icon);
                imageView.setPadding(fromDPToPix3, fromDPToPix4, fromDPToPix3, 0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 49;
                imageView.setLayoutParams(layoutParams);
                imageView.setClickable(false);
                imageView.setFocusable(false);
                this.f274676f.addView(imageView);
                Context context = getContext();
                int i2 = SnsCommentDetailUI.f277824M1;
                int b = (int) (f - ((float) C76577a.m92151b(context, 34)));
                int i3 = fromDPToPix2 + fromDPToPix;
                int i4 = b / i3;
                if (b % i3 > fromDPToPix) {
                    i4++;
                }
                Log.m105919d("MicroMsg.SnsDetailLuckyHeader", "guess size %d", Integer.valueOf(i4));
                C96077n nVar = new C96077n(getContext());
                nVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                nVar.setLineMaxCounte(i4);
                for (int i5 = 0; i5 < linkedList.size(); i5++) {
                    j74 j74 = linkedList.get(i5);
                    TouchImageView touchImageView = new TouchImageView(getContext());
                    touchImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    touchImageView.setImageResource(C0966R.C0969drawable.a6u);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(fromDPToPix, fromDPToPix);
                    layoutParams2.setMargins(0, fromDPToPix2, fromDPToPix2, 0);
                    touchImageView.setLayoutParams(layoutParams2);
                    touchImageView.setTag(j74.f135912d);
                    ((C76705f) C86312j.m106911c(C76705f.class)).mo106841jW(touchImageView, j74.f135912d, true);
                    touchImageView.setOnClickListener(timelineClickListener2.f280382l);
                    nVar.addView(touchImageView);
                }
                this.f274676f.addView(nVar);
                this.f274677g.setVisibility(isEmpty ? 8 : 0);
                SnsMethodCalculate.markEndTimeMs("setRewardList", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
            }
        }
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
    }

    public LinearLayout getLinearSeparator() {
        SnsMethodCalculate.markStartTimeMs("getLinearSeparator", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
        BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 2.0f);
        AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(-1, 1);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setBackgroundResource(C0966R.C0969drawable.ate);
        linearLayout.setLayoutParams(layoutParams);
        SnsMethodCalculate.markEndTimeMs("getLinearSeparator", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
        return linearLayout;
    }

    public void setVisibility(int i) {
        SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
        super.setVisibility(i);
        View view = this.f274674d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/lucky/view/SnsDetailLuckyHeader", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/lucky/view/SnsDetailLuckyHeader", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader");
    }

    public SnsDetailLuckyHeader(Context context) {
        super(context);
        mo130697a();
    }

    public SnsDetailLuckyHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo130697a();
    }
}
