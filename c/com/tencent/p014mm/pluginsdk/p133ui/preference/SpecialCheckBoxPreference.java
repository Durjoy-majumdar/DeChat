package com.tencent.p014mm.pluginsdk.p133ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import eb0.C97625j3;
import nj3.C76879j;
import p818oi.C47380a;
import tc0.C77885p;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.SpecialCheckBoxPreference */
public class SpecialCheckBoxPreference extends Preference {

    /* renamed from: J */
    public ToggleButton f120978J;

    /* renamed from: K */
    public ToggleButton f120979K;

    /* renamed from: L */
    public ToggleButton f120980L;

    /* renamed from: M */
    public C72996z1 f120981M;

    /* renamed from: N */
    public Context f120982N;

    /* renamed from: P */
    public String f120983P;

    /* renamed from: Q */
    public boolean f120984Q;

    /* renamed from: R */
    public boolean f120985R;

    /* renamed from: S */
    public CompoundButton.OnCheckedChangeListener f120986S = new C44616a();

    /* renamed from: T */
    public boolean f120987T = false;

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.SpecialCheckBoxPreference$a */
    public class C44616a implements CompoundButton.OnCheckedChangeListener {
        public C44616a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SpecialCheckBoxPreference specialCheckBoxPreference;
            C72996z1 z1Var;
            int id = compoundButton.getId();
            if (id == C0966R.C0970id.f359107iw0) {
                SpecialCheckBoxPreference specialCheckBoxPreference2 = SpecialCheckBoxPreference.this;
                if (specialCheckBoxPreference2.f120981M != null) {
                    if (((C44660i2) C97625j3.m125812b().mo105908w()).mo69755a0(specialCheckBoxPreference2.f120981M.getUsername())) {
                        C45628s0.m50803u0(specialCheckBoxPreference2.f120981M.getUsername(), true);
                    } else {
                        C45628s0.m50787m0(specialCheckBoxPreference2.f120981M.getUsername(), true, true);
                    }
                }
            } else if (id == C0966R.C0970id.ivz) {
                SpecialCheckBoxPreference specialCheckBoxPreference3 = SpecialCheckBoxPreference.this;
                boolean z2 = !specialCheckBoxPreference3.f120987T;
                specialCheckBoxPreference3.f120987T = z2;
                if (specialCheckBoxPreference3.f120984Q) {
                    boolean z3 = true ^ z2;
                    ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C47380a(specialCheckBoxPreference3.f120983P, z3));
                    specialCheckBoxPreference3.f120981M.mo62861K3(z3 ? 1 : 0);
                    C97625j3.m125812b().mo105907v().mo69719p3(specialCheckBoxPreference3.f120983P, specialCheckBoxPreference3.f120981M);
                }
                specialCheckBoxPreference3.mo69406I();
            } else if (id == C0966R.C0970id.f359108iw3 && (z1Var = specialCheckBoxPreference.f120981M) != null) {
                if (z1Var.mo62927s3()) {
                    specialCheckBoxPreference.f120981M.mo62935u4();
                    C45628s0.m50761Z(specialCheckBoxPreference.f120981M, true);
                    Context context = specialCheckBoxPreference.f120982N;
                    C76879j.m92726T(context, context.getString(C0966R.string.i8g));
                    return;
                }
                C45628s0.m50758W((specialCheckBoxPreference = SpecialCheckBoxPreference.this).f120981M);
                Context context2 = specialCheckBoxPreference.f120982N;
                C76879j.m92726T(context2, context2.getString(C0966R.string.i8w));
            }
        }
    }

    public SpecialCheckBoxPreference(Context context) {
        super(context);
        this.f120982N = context;
    }

    /* renamed from: I */
    public final boolean mo69406I() {
        if (this.f120984Q) {
            this.f120987T = this.f120981M.f149512S == 0;
        } else if (!this.f120985R) {
            this.f120987T = C45628s0.m50746K(this.f120981M);
        }
        Context context = this.f120982N;
        if (context instanceof MMActivity) {
            if (this.f120987T) {
                ((MMActivity) context).setTitleMuteIconVisibility(0);
                return true;
            }
            ((MMActivity) context).setTitleMuteIconVisibility(8);
        }
        return false;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f120978J = (ToggleButton) view.findViewById(C0966R.C0970id.f359107iw0);
        this.f120979K = (ToggleButton) view.findViewById(C0966R.C0970id.ivz);
        this.f120980L = (ToggleButton) view.findViewById(C0966R.C0970id.f359108iw3);
        this.f120983P = ((MMActivity) this.f120982N).getIntent().getStringExtra("RoomInfo_Id");
        this.f120984Q = ((MMActivity) this.f120982N).getIntent().getBooleanExtra("Is_Chatroom", true);
        this.f120985R = ((MMActivity) this.f120982N).getIntent().getBooleanExtra("Is_Lbsroom", false);
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f120983P);
        this.f120981M = z1Var;
        if (z1Var != null) {
            this.f120978J.setChecked(((C44660i2) C97625j3.m125812b().mo105908w()).mo69755a0(this.f120981M.getUsername()));
            this.f120980L.setChecked(this.f120981M.mo62927s3());
            this.f120979K.setChecked(mo69406I());
        }
        this.f120978J.setOnCheckedChangeListener(this.f120986S);
        this.f120979K.setOnCheckedChangeListener(this.f120986S);
        this.f120980L.setOnCheckedChangeListener(this.f120986S);
    }

    public SpecialCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f120982N = context;
    }

    public SpecialCheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f120982N = context;
    }
}
