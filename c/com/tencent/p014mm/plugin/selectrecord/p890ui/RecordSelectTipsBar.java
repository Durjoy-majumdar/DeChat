package com.tencent.p014mm.plugin.selectrecord.p890ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.component.C73658y3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;
import nm2.C76927a;
import zj3.C79368l;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.selectrecord.ui.RecordSelectTipsBar */
public class RecordSelectTipsBar extends LinearLayout {

    /* renamed from: d */
    public TextView f205577d;

    /* renamed from: e */
    public LinearLayout f205578e;

    /* renamed from: f */
    public TextView f205579f;

    /* renamed from: g */
    public TextView f205580g;

    /* renamed from: h */
    public TextView f205581h;

    /* renamed from: i */
    public boolean f205582i = false;

    /* renamed from: j */
    public C71034c f205583j = null;

    /* renamed from: com.tencent.mm.plugin.selectrecord.ui.RecordSelectTipsBar$a */
    public class C71032a implements View.OnClickListener {
        public C71032a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/selectrecord/ui/RecordSelectTipsBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.recordSelect.RecordSelectTipsBar", "clear all select record");
            if (RecordSelectTipsBar.this.f205583j != null) {
                C76927a.m92781a().f224803d++;
                C73658y3 y3Var = (C73658y3) RecordSelectTipsBar.this.f205583j;
                y3Var.getClass();
                Log.m105924i("MicroMsg.recordSelect.RecordSelectComponent", "click cleanAllSelect");
                C79368l lVar = (C79368l) y3Var.f215752d.f193278b.mo102812a(C79368l.class);
                for (Long next : lVar.mo108206p3()) {
                    lVar.mo108183N0(next.longValue());
                    y3Var.f216284v.add(next);
                }
                lVar.mo108192d2();
                y3Var.f216270e.mo97683b(y3Var.mo102694a6(lVar));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/selectrecord/ui/RecordSelectTipsBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.selectrecord.ui.RecordSelectTipsBar$b */
    public class C71033b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f205585d;

        public C71033b(int i) {
            this.f205585d = i;
        }

        public void run() {
            RecordSelectTipsBar.this.f205577d.setVisibility(8);
            RecordSelectTipsBar.this.f205578e.setVisibility(0);
            RecordSelectTipsBar.this.f205579f.setText(MMApplicationContext.getContext().getString(C0966R.string.ijp, new Object[]{Integer.toString(this.f205585d)}));
            if (this.f205585d > 0) {
                RecordSelectTipsBar.this.f205581h.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3230k3));
            } else {
                RecordSelectTipsBar.this.f205581h.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3563xt));
            }
            if (this.f205585d >= 99) {
                RecordSelectTipsBar.this.f205580g.setVisibility(0);
                RecordSelectTipsBar.this.f205582i = true;
            } else {
                RecordSelectTipsBar.this.f205580g.setVisibility(8);
                RecordSelectTipsBar.this.f205582i = false;
            }
            RecordSelectTipsBar recordSelectTipsBar = RecordSelectTipsBar.this;
            C71034c cVar = recordSelectTipsBar.f205583j;
            if (cVar != null) {
                ((C79368l) ((C73658y3) cVar).f215752d.f193278b.mo102812a(C79368l.class)).mo108191d1(recordSelectTipsBar.f205582i);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.selectrecord.ui.RecordSelectTipsBar$c */
    public interface C71034c {
    }

    public RecordSelectTipsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo97682a();
    }

    /* renamed from: a */
    public final void mo97682a() {
        View inflate = View.inflate(getContext(), C0966R.C0971layout.bqq, this);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C0966R.C0970id.iwl);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.ev4);
        this.f205577d = (TextView) inflate.findViewById(C0966R.C0970id.f8k);
        this.f205578e = (LinearLayout) inflate.findViewById(C0966R.C0970id.f359288k13);
        this.f205579f = (TextView) inflate.findViewById(C0966R.C0970id.ii8);
        this.f205580g = (TextView) inflate.findViewById(C0966R.C0970id.gps);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.ii7);
        this.f205581h = textView;
        textView.setOnClickListener(new C71032a());
    }

    /* renamed from: b */
    public void mo97683b(int i) {
        ((C119157j) C119157j.f356862d).mo183895z(new C71033b(i));
    }

    public void setIRecordSelectCallback(C71034c cVar) {
        this.f205583j = cVar;
    }

    public RecordSelectTipsBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo97682a();
    }
}
