package com.tencent.p014mm.plugin.flash.action;

import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import au1.C0222b;
import bu1.C0381a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.facedetectaction.p046ui.C2292b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import kg3.C76577a;
import org.json.JSONException;
import org.json.JSONObject;
import p629ny.C76978g;

/* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionUI$$b */
public class FaceFlashActionUI$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FaceFlashActionUI f18991d;

    public FaceFlashActionUI$$b(FaceFlashActionUI faceFlashActionUI) {
        this.f18991d = faceFlashActionUI;
    }

    public void run() {
        FaceFlashActionUI faceFlashActionUI = this.f18991d;
        faceFlashActionUI.mo5277N7(C76577a.m92153d(faceFlashActionUI.getContext(), C0966R.color.BW_0));
        this.f18991d.f18980d.setVisibility(8);
        if (C0381a.m328e()) {
            this.f18991d.mo5279P7("fail");
        } else {
            this.f18991d.f18981e.setVisibility(0);
        }
        FaceFlashActionUI faceFlashActionUI2 = this.f18991d;
        faceFlashActionUI2.f18981e.setCircleY(faceFlashActionUI2.f18980d.getCircleY());
        FaceFlashActionUI faceFlashActionUI3 = this.f18991d;
        faceFlashActionUI3.f18981e.f18976p = faceFlashActionUI3.f18980d.f18928f.getVisibility() == 0;
        FaceFlashActionUI faceFlashActionUI4 = this.f18991d;
        FaceFlashActionProcessLayout faceFlashActionProcessLayout = faceFlashActionUI4.f18981e;
        String str = faceFlashActionUI4.f18984h;
        int height = faceFlashActionUI4.getContentView().getHeight();
        faceFlashActionProcessLayout.getClass();
        Log.m105924i("MicroMsg.FaceFlashActionProcessLayout", "showFailedAnimation");
        try {
            if (faceFlashActionProcessLayout.f18976p) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) faceFlashActionProcessLayout.f18974n.getLayoutParams();
                layoutParams.removeRule(3);
                int o = height - C85875k4.m106198o(faceFlashActionProcessLayout.getContext());
                int i = (int) faceFlashActionProcessLayout.f18975o;
                double d = ((double) o) * 0.5d;
                if (((double) i) > d) {
                    layoutParams.topMargin = ((int) d) - C76577a.m92151b(MMApplicationContext.getContext(), 100);
                } else {
                    layoutParams.topMargin = i - C76577a.m92151b(MMApplicationContext.getContext(), 100);
                }
                faceFlashActionProcessLayout.f18974n.setLayoutParams(layoutParams);
            } else {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) faceFlashActionProcessLayout.f18974n.getLayoutParams();
                layoutParams2.addRule(3, C0966R.C0970id.cq4);
                layoutParams2.topMargin = C76577a.m92151b(MMApplicationContext.getContext(), 48);
                faceFlashActionProcessLayout.f18974n.setLayoutParams(layoutParams2);
            }
            faceFlashActionProcessLayout.f18970g.setImageResource(C0966R.C0969drawable.f4962sj);
            faceFlashActionProcessLayout.f18970g.startAnimation(faceFlashActionProcessLayout.f18977q);
            faceFlashActionProcessLayout.f18969f.setImageDrawable(C76577a.m92158i(faceFlashActionProcessLayout.getContext(), C0966R.raw.icons_filled_error3));
            faceFlashActionProcessLayout.f18969f.startAnimation(faceFlashActionProcessLayout.f18979s);
            JSONObject jSONObject = new JSONObject(str);
            faceFlashActionProcessLayout.f18968e.setText(C0381a.m325b(jSONObject, C76577a.m92166q(faceFlashActionProcessLayout.getContext(), C0966R.string.ci8)));
            String optString = jSONObject.optString("otherVerifyTitle");
            Log.m105925i("MicroMsg.FaceFlashActionProcessLayout", "otherVerifyTitle is :%s", optString);
            if (TextUtils.isEmpty(optString)) {
                faceFlashActionProcessLayout.f18972i.setVisibility(4);
                faceFlashActionProcessLayout.f18971h.setBackgroundResource(C0966R.C0969drawable.f4970sr);
                faceFlashActionProcessLayout.f18971h.setTextColor(faceFlashActionProcessLayout.getContext().getResources().getColor(C0966R.color.f3364pz));
            } else {
                faceFlashActionProcessLayout.f18971h.setBackgroundResource(C0966R.C0969drawable.f4966sn);
                faceFlashActionProcessLayout.f18971h.setTextColor(faceFlashActionProcessLayout.getContext().getResources().getColor(C0966R.color.f3358pe));
                faceFlashActionProcessLayout.f18972i.setVisibility(0);
                faceFlashActionProcessLayout.f18972i.setText(optString);
                faceFlashActionProcessLayout.f18972i.setOnClickListener(new C4376h(faceFlashActionProcessLayout, jSONObject));
            }
            String optString2 = jSONObject.optString("err_feedback", "");
            faceFlashActionProcessLayout.f18973j.setVisibility(TextUtils.isEmpty(optString2) ? 4 : 0);
            C85875k4.m106189j0(faceFlashActionProcessLayout.f18973j.getPaint(), 0.8f);
            String string = faceFlashActionProcessLayout.getContext().getResources().getString(C0966R.string.f360403cj2);
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new C2292b(string, faceFlashActionProcessLayout.getContext().getResources().getColor(C0966R.color.a1d), faceFlashActionProcessLayout.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_2), true, new C4377i(faceFlashActionProcessLayout, jSONObject, optString2)), 0, spannableString.length(), 17);
            faceFlashActionProcessLayout.f18973j.setClickable(true);
            faceFlashActionProcessLayout.f18973j.setOnTouchListener(((C76978g) C86312j.m106911c(C76978g.class)).y40(faceFlashActionProcessLayout.getContext()));
            faceFlashActionProcessLayout.f18973j.setText(spannableString);
            boolean z = jSONObject.optInt("err_retry", 1) == 1;
            faceFlashActionProcessLayout.f18971h.setVisibility(0);
            faceFlashActionProcessLayout.f18971h.setText(z ? C76577a.m92166q(faceFlashActionProcessLayout.getContext(), C0966R.string.ckn) : C76577a.m92166q(faceFlashActionProcessLayout.getContext(), C0966R.string.cki));
            faceFlashActionProcessLayout.f18971h.setOnClickListener(new C4378j(faceFlashActionProcessLayout, z, jSONObject, optString));
            if (faceFlashActionProcessLayout.f18972i.getVisibility() == 0 && faceFlashActionProcessLayout.f18973j.getVisibility() == 0) {
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) faceFlashActionProcessLayout.f18972i.getLayoutParams();
                layoutParams3.bottomMargin = C76577a.m92151b(faceFlashActionProcessLayout.getContext(), 108);
                faceFlashActionProcessLayout.f18972i.setLayoutParams(layoutParams3);
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) faceFlashActionProcessLayout.f18971h.getLayoutParams();
                layoutParams4.removeRule(12);
                layoutParams4.addRule(2, C0966R.C0970id.cpv);
                layoutParams4.bottomMargin = C76577a.m92151b(faceFlashActionProcessLayout.getContext(), 16);
                faceFlashActionProcessLayout.f18971h.setLayoutParams(layoutParams4);
            }
            if (!(faceFlashActionProcessLayout.f18972i.getVisibility() == 0 || faceFlashActionProcessLayout.f18973j.getVisibility() == 0)) {
                RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) faceFlashActionProcessLayout.f18971h.getLayoutParams();
                layoutParams5.addRule(12);
                layoutParams5.removeRule(2);
                layoutParams5.bottomMargin = C76577a.m92151b(faceFlashActionProcessLayout.getContext(), 96);
                faceFlashActionProcessLayout.f18971h.setLayoutParams(layoutParams5);
            }
            if (faceFlashActionProcessLayout.f18972i.getVisibility() == 0 && faceFlashActionProcessLayout.f18973j.getVisibility() != 0) {
                RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) faceFlashActionProcessLayout.f18972i.getLayoutParams();
                layoutParams6.bottomMargin = C76577a.m92151b(faceFlashActionProcessLayout.getContext(), 96);
                faceFlashActionProcessLayout.f18972i.setLayoutParams(layoutParams6);
                RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) faceFlashActionProcessLayout.f18971h.getLayoutParams();
                layoutParams7.removeRule(12);
                layoutParams7.addRule(2, C0966R.C0970id.cpv);
                layoutParams7.bottomMargin = C76577a.m92151b(faceFlashActionProcessLayout.getContext(), 16);
                faceFlashActionProcessLayout.f18971h.setLayoutParams(layoutParams7);
            }
            if (faceFlashActionProcessLayout.f18972i.getVisibility() != 0 && faceFlashActionProcessLayout.f18973j.getVisibility() == 0) {
                RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) faceFlashActionProcessLayout.f18971h.getLayoutParams();
                layoutParams8.addRule(12);
                layoutParams8.removeRule(2);
                layoutParams8.bottomMargin = C76577a.m92151b(faceFlashActionProcessLayout.getContext(), 108);
                faceFlashActionProcessLayout.f18971h.setLayoutParams(layoutParams8);
            }
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e, "parse face failed result error.%s", str);
            faceFlashActionProcessLayout.f18968e.setText(str);
            faceFlashActionProcessLayout.f18973j.setVisibility(4);
            faceFlashActionProcessLayout.f18971h.setVisibility(0);
            faceFlashActionProcessLayout.f18971h.setText(C76577a.m92166q(faceFlashActionProcessLayout.getContext(), C0966R.string.ckn));
            faceFlashActionProcessLayout.f18971h.setOnClickListener(new C4379k(faceFlashActionProcessLayout));
        }
        C0222b.m170i(this.f18991d.f18984h, 1);
    }
}
