package lg2;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recharge.p093ui.form.MallFormView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jg2.C76415b;
import kg2.C76574a;
import kg2.C76575b;

/* renamed from: lg2.j */
public class C76681j {

    /* renamed from: a */
    public List<String[]> f224370a;

    /* renamed from: b */
    public C76574a f224371b = null;

    /* renamed from: c */
    public MallFormView f224372c;

    /* renamed from: d */
    public C76686o f224373d;

    /* renamed from: e */
    public boolean f224374e = false;

    public C76681j(MallFormView mallFormView) {
        this.f224372c = mallFormView;
    }

    /* renamed from: a */
    public void mo106949a(boolean z) {
        ArrayList arrayList;
        List<String[]> list;
        Log.m105919d("MicroMsg.CommonHintViewConfig", "needSetInput: %s", Boolean.valueOf(z));
        List<C76574a> xx02 = C76415b.wx0().xx0();
        if (xx02 == null || xx02.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            C76574a yx02 = C76415b.yx0();
            arrayList = arrayList2;
            if (yx02 != null) {
                arrayList2.add(yx02);
                C76415b.wx0().vx0(yx02);
                arrayList = arrayList2;
            }
        } else {
            String str = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
            for (int i = 0; i < xx02.size(); i++) {
                C76574a aVar = xx02.get(i);
                if (Util.isNullOrNil(aVar.f224103a) || !aVar.f224103a.equals(str)) {
                    if (!Util.isNullOrNil(aVar.f224103a) && Util.isNullOrNil(aVar.f224104b) && (list = this.f224370a) != null) {
                        Iterator<String[]> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String[] next = it.next();
                            if (aVar.f224103a.equals(C76575b.m92141a(next[2]))) {
                                String str2 = next[1];
                                aVar.f224104b = str2;
                                Log.m105925i("MicroMsg.CommonHintViewConfig", "add name: %s", str2);
                                break;
                            }
                        }
                        C76415b.wx0().zx0(xx02);
                    }
                } else if (Util.isNullOrNil(aVar.f224104b) || !aVar.f224104b.equals(this.f224372c.getContext().getString(C0966R.string.l6z))) {
                    aVar.f224104b = this.f224372c.getContext().getString(C0966R.string.l6z);
                    C76415b.wx0().zx0(xx02);
                }
            }
            arrayList = xx02;
        }
        C76686o oVar = this.f224373d;
        synchronized (oVar) {
            oVar.f224378f = arrayList;
            oVar.notifyDataSetChanged();
        }
        if (arrayList.size() > 0 && z) {
            C76574a aVar2 = arrayList.get(0);
            this.f224371b = aVar2;
            mo106950b(aVar2);
        }
    }

    /* renamed from: b */
    public void mo106950b(C76574a aVar) {
        this.f224371b = aVar;
        if (aVar != null) {
            if (Util.isNullOrNil(this.f224372c.getText()) || !this.f224372c.getText().equals(aVar.f224103a)) {
                this.f224372c.getContentEditText().setText(C76575b.m92142b(aVar.f224103a));
            }
            this.f224372c.getContentEditText().setSelection(this.f224372c.getContentEditText().getText().length());
            Log.m105919d("MicroMsg.CommonHintViewConfig", "editTv.setText %s, name: %s, location: %s, type: %s", aVar.f224103a, aVar.f224104b, aVar.f224105c, Integer.valueOf(aVar.f224106d));
            Context context = this.f224372c.getContext();
            C76574a aVar2 = this.f224371b;
            int i = aVar2.f224106d;
            if (i == 3) {
                this.f224372c.getTipsTv().setText(this.f224371b.f224104b);
                this.f224372c.getTipsTv().setTextColor(context.getResources().getColor(C0966R.color.a9r));
            } else if (i == 1) {
                if (!Util.isNullOrNil(aVar2.f224104b)) {
                    C76574a aVar3 = this.f224371b;
                    String str = aVar3.f224104b;
                    if (!Util.isNullOrNil(aVar3.f224105c)) {
                        str = str + context.getString(C0966R.string.l6s, new Object[]{this.f224371b.f224105c});
                    }
                    this.f224372c.getTipsTv().setText(str);
                    this.f224372c.getTipsTv().setTextColor(context.getResources().getColor(C0966R.color.a7f));
                    return;
                }
                String string = context.getString(C0966R.string.f361607l71);
                if (!Util.isNullOrNil(this.f224371b.f224105c)) {
                    string = string + context.getString(C0966R.string.l6s, new Object[]{this.f224371b.f224105c});
                }
                this.f224372c.getTipsTv().setText(string);
                this.f224372c.getTipsTv().setTextColor(context.getResources().getColor(C0966R.color.a9j));
            } else if (i == 2) {
                if (!Util.isNullOrNil(aVar2.f224105c)) {
                    this.f224372c.getTipsTv().setText(this.f224371b.f224105c);
                    this.f224372c.getTipsTv().setTextColor(context.getResources().getColor(C0966R.color.a7f));
                    return;
                }
                this.f224372c.getTipsTv().setText("");
                this.f224372c.getTipsTv().setTextColor(context.getResources().getColor(C0966R.color.a9j));
            } else if (i != 0) {
            } else {
                if (!Util.isNullOrNil(aVar2.f224105c)) {
                    if (!Util.isNullOrNil(this.f224371b.f224104b)) {
                        this.f224372c.getTipsTv().setText(this.f224371b.f224104b + context.getString(C0966R.string.l6s, new Object[]{this.f224371b.f224105c}));
                        this.f224372c.getTipsTv().setTextColor(context.getResources().getColor(C0966R.color.a9j));
                        return;
                    }
                    this.f224372c.getTipsTv().setText(this.f224371b.f224105c);
                    this.f224372c.getTipsTv().setTextColor(context.getResources().getColor(C0966R.color.a7f));
                } else if (!Util.isNullOrNil(this.f224371b.f224104b)) {
                    this.f224372c.getTipsTv().setText(this.f224371b.f224104b);
                    this.f224372c.getTipsTv().setTextColor(context.getResources().getColor(C0966R.color.a9j));
                } else {
                    this.f224372c.getTipsTv().setText("");
                    this.f224372c.getTipsTv().setTextColor(context.getResources().getColor(C0966R.color.a7f));
                }
            }
        } else {
            this.f224372c.getContentEditText().setText("");
            Log.m105918d("MicroMsg.CommonHintViewConfig", "editTv.setText null");
            this.f224372c.getTipsTv().setText("");
        }
    }
}
