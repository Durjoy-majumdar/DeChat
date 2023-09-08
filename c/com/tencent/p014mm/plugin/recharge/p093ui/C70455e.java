package com.tencent.p014mm.plugin.recharge.p093ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import y43.C79037y;

/* renamed from: com.tencent.mm.plugin.recharge.ui.e */
public class C70455e extends BaseAdapter {

    /* renamed from: d */
    public ArrayList<C79037y> f203608d = null;

    /* renamed from: e */
    public C70457b f203609e = null;

    /* renamed from: f */
    public List<String> f203610f = new ArrayList(Util.stringToList((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_PHONE_RECHARGE_RECOMMENDED_LIST_STRING_SYNC, ""), ","));

    /* renamed from: com.tencent.mm.plugin.recharge.ui.e$a */
    public class C70456a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C79037y f203611d;

        /* renamed from: e */
        public final /* synthetic */ C70458c f203612e;

        public C70456a(C79037y yVar, C70458c cVar) {
            this.f203611d = yVar;
            this.f203612e = cVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/PhoneRechargeAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C70455e eVar = C70455e.this;
            if (eVar.f203609e != null) {
                if (!((ArrayList) eVar.f203610f).contains(this.f203611d.f232115u)) {
                    Log.m105925i("MicroMsg.PhoneRechargeAdapter", "mark recommendid: %s", this.f203611d.f232115u);
                    String str = this.f203611d.f232115u;
                    if (str != null) {
                        ((ArrayList) C70455e.this.f203610f).add(str);
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_PHONE_RECHARGE_RECOMMENDED_LIST_STRING_SYNC, Util.listToString(C70455e.this.f203610f, ","));
                        this.f203612e.f203617d.setVisibility(8);
                    }
                }
                C70455e.this.f203609e.mo97088a(this.f203611d);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/PhoneRechargeAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.e$b */
    public interface C70457b {
        /* renamed from: a */
        void mo97088a(C79037y yVar);
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.e$c */
    public class C70458c {

        /* renamed from: a */
        public TextView f203614a;

        /* renamed from: b */
        public TextView f203615b;

        /* renamed from: c */
        public TextView f203616c;

        /* renamed from: d */
        public ImageView f203617d;

        public C70458c(C70455e eVar, C70456a aVar) {
        }
    }

    public int getCount() {
        ArrayList<C79037y> arrayList = this.f203608d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public Object getItem(int i) {
        return this.f203608d.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C70458c cVar;
        C79037y yVar = (C79037y) getItem(i);
        if (view == null) {
            view = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.bq_, viewGroup, false);
            cVar = new C70458c(this, (C70456a) null);
            cVar.f203615b = (TextView) view.findViewById(C0966R.C0970id.f357845c22);
            cVar.f203614a = (TextView) view.findViewById(C0966R.C0970id.h_1);
            cVar.f203616c = (TextView) view.findViewById(C0966R.C0970id.i3a);
            cVar.f203617d = (ImageView) view.findViewById(C0966R.C0970id.f359035ih1);
            view.setTag(cVar);
        } else {
            cVar = (C70458c) view.getTag();
        }
        cVar.f203614a.setText(yVar.f232102e);
        if (!Util.isNullOrNil(yVar.f232103f)) {
            cVar.f203615b.setVisibility(0);
            cVar.f203615b.setText(yVar.f232103f);
        } else {
            cVar.f203615b.setVisibility(8);
        }
        if (!Util.isNullOrNil(yVar.f232108n)) {
            cVar.f203616c.setVisibility(0);
            cVar.f203616c.setText(yVar.f232108n);
        } else {
            cVar.f203616c.setVisibility(8);
        }
        if (yVar.f232104g == 1) {
            view.setEnabled(true);
            cVar.f203615b.setEnabled(true);
            cVar.f203614a.setEnabled(true);
        } else {
            view.setEnabled(false);
            cVar.f203615b.setEnabled(false);
            cVar.f203614a.setEnabled(false);
        }
        if (yVar.f232114t == 1) {
            if (!((ArrayList) this.f203610f).contains(yVar.f232115u)) {
                Log.m105919d("MicroMsg.PhoneRechargeAdapter", "show recommendid: %s", yVar.f232115u);
                cVar.f203617d.setVisibility(0);
                if (yVar.f232106i == 1 && yVar.f232109o.equals("1") && !yVar.f232110p.equals("0")) {
                    Context context = viewGroup.getContext();
                    int b = C43423i0.m46931b(yVar.f232110p, false);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius((float) C76577a.m92151b(context, 2));
                    gradientDrawable.setColor(b);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setCornerRadius((float) C76577a.m92151b(context, 2));
                    gradientDrawable2.setStroke(2, C76577a.m92153d(context, C0966R.color.BW_0_Alpha_0_2));
                    GradientDrawable gradientDrawable3 = new GradientDrawable();
                    gradientDrawable3.setShape(0);
                    gradientDrawable3.setCornerRadius((float) C76577a.m92151b(context, 2));
                    gradientDrawable3.setColor(C76577a.m92153d(context, C0966R.color.a9q));
                    gradientDrawable3.setStroke(2, b);
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    stateListDrawable.addState(new int[]{16842919}, gradientDrawable);
                    stateListDrawable.addState(new int[]{-16842910}, gradientDrawable2);
                    stateListDrawable.addState(new int[0], gradientDrawable3);
                    Context context2 = viewGroup.getContext();
                    ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{16842919}, new int[]{-16842910}, new int[0]}, new int[]{C76577a.m92153d(context2, C0966R.color.al6), C76577a.m92153d(context2, C0966R.color.a9o), C43423i0.m46931b(yVar.f232110p, false)});
                    cVar.f203615b.setTextColor(colorStateList);
                    cVar.f203614a.setTextColor(colorStateList);
                    view.setBackground(stateListDrawable);
                }
                view.setOnClickListener(new C70456a(yVar, cVar));
                return view;
            }
        }
        cVar.f203617d.setVisibility(8);
        Context context3 = viewGroup.getContext();
        int b2 = C43423i0.m46931b(yVar.f232110p, false);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setShape(0);
        gradientDrawable4.setCornerRadius((float) C76577a.m92151b(context3, 2));
        gradientDrawable4.setColor(b2);
        GradientDrawable gradientDrawable22 = new GradientDrawable();
        gradientDrawable22.setShape(0);
        gradientDrawable22.setCornerRadius((float) C76577a.m92151b(context3, 2));
        gradientDrawable22.setStroke(2, C76577a.m92153d(context3, C0966R.color.BW_0_Alpha_0_2));
        GradientDrawable gradientDrawable32 = new GradientDrawable();
        gradientDrawable32.setShape(0);
        gradientDrawable32.setCornerRadius((float) C76577a.m92151b(context3, 2));
        gradientDrawable32.setColor(C76577a.m92153d(context3, C0966R.color.a9q));
        gradientDrawable32.setStroke(2, b2);
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(new int[]{16842919}, gradientDrawable4);
        stateListDrawable2.addState(new int[]{-16842910}, gradientDrawable22);
        stateListDrawable2.addState(new int[0], gradientDrawable32);
        Context context22 = viewGroup.getContext();
        ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{16842919}, new int[]{-16842910}, new int[0]}, new int[]{C76577a.m92153d(context22, C0966R.color.al6), C76577a.m92153d(context22, C0966R.color.a9o), C43423i0.m46931b(yVar.f232110p, false)});
        cVar.f203615b.setTextColor(colorStateList2);
        cVar.f203614a.setTextColor(colorStateList2);
        view.setBackground(stateListDrawable2);
        view.setOnClickListener(new C70456a(yVar, cVar));
        return view;
    }
}
