package com.tencent.p014mm.p136ui.contact;

import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import rb0.C47976j;
import rb0.C48009v0;

/* renamed from: com.tencent.mm.ui.contact.s0 */
public class C74558s0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74562t0 f219158d;

    /* renamed from: com.tencent.mm.ui.contact.s0$a */
    public class C74559a implements Runnable {
        public C74559a() {
        }

        public void run() {
            List<String> list = C74558s0.this.f219158d.f219175h;
            if (list != null && list.contains("wework")) {
                C74558s0.this.f219158d.f219175h.clear();
                C74558s0.this.f219158d.f219175h.add("wework");
            }
            if (C74558s0.this.f219158d.f219173f.size() > 0 || C74558s0.this.f219158d.f219175h.size() > 0) {
                Log.m105925i("MicroMsg.EnterpriseBizView", "biz list size = %s", Integer.valueOf(C74558s0.this.f219158d.f219173f.size()));
                C74562t0 t0Var = C74558s0.this.f219158d;
                if (t0Var.f219172e == null) {
                    View.inflate(t0Var.getContext(), C0966R.C0971layout.a3h, C74558s0.this.f219158d);
                    C74562t0 t0Var2 = C74558s0.this.f219158d;
                    t0Var2.f219172e = (LinearLayout) t0Var2.findViewById(C0966R.C0970id.f357785br0);
                }
                C74558s0.this.f219158d.f219172e.removeAllViews();
                if (C74558s0.this.f219158d.f219175h.size() > 0) {
                    for (int i = 0; i < C74558s0.this.f219158d.f219175h.size(); i++) {
                        C6880b3 b3Var = new C6880b3(C74558s0.this.f219158d.getContext(), C74558s0.this.f219158d.f219175h.get(i));
                        C74558s0.this.f219158d.f219172e.addView(b3Var);
                        if (i == C74558s0.this.f219158d.f219175h.size() - 1 && C74558s0.this.f219158d.f219173f.size() == 0) {
                            View findViewById = b3Var.findViewById(C0966R.C0970id.ckb);
                            int paddingLeft = findViewById.getPaddingLeft();
                            findViewById.setBackground(C74942w4.m89785b(C74558s0.this.f219158d.f219171d, C0966R.attr.f2868u6));
                            findViewById.findViewById(C0966R.C0970id.ckd).setBackground((Drawable) null);
                            findViewById.setPadding(paddingLeft, 0, 0, 0);
                        } else {
                            b3Var.findViewById(C0966R.C0970id.ckb).setBackground((Drawable) null);
                            b3Var.findViewById(C0966R.C0970id.ckb).findViewById(C0966R.C0970id.ckd).setBackground(C74942w4.m89785b(C74558s0.this.f219158d.f219171d, C0966R.attr.f2868u6));
                        }
                    }
                }
                if (C74558s0.this.f219158d.f219173f.size() > 0) {
                    C74558s0.this.f219158d.f219174g = new HashMap();
                    for (int i2 = 0; i2 < C74558s0.this.f219158d.f219173f.size(); i2++) {
                        String str = C74558s0.this.f219158d.f219173f.get(i2);
                        C6939w0 w0Var = new C6939w0(C74558s0.this.f219158d.getContext(), str);
                        C74558s0.this.f219158d.f219172e.addView(w0Var);
                        C74558s0.this.f219158d.f219174g.put(str, w0Var);
                        if (i2 == C74558s0.this.f219158d.f219173f.size() - 1) {
                            View findViewById2 = w0Var.findViewById(C0966R.C0970id.ckb);
                            int paddingLeft2 = findViewById2.getPaddingLeft();
                            findViewById2.setBackgroundResource(C0966R.C0969drawable.bcr);
                            findViewById2.findViewById(C0966R.C0970id.ckc).setBackground((Drawable) null);
                            findViewById2.setPadding(paddingLeft2, 0, 0, 0);
                        } else {
                            w0Var.findViewById(C0966R.C0970id.ckb).setBackground((Drawable) null);
                            View findViewById3 = w0Var.findViewById(C0966R.C0970id.ckb).findViewById(C0966R.C0970id.ckc);
                            int paddingRight = findViewById3.getPaddingRight();
                            findViewById3.setBackgroundResource(C0966R.C0969drawable.bcr);
                            findViewById3.setPadding(0, 0, paddingRight, 0);
                        }
                    }
                }
                C74562t0 t0Var3 = C74558s0.this.f219158d;
                t0Var3.f219176i.mo103526a(t0Var3.getEnterpriseFriendCount());
            }
        }
    }

    public C74558s0(C74562t0 t0Var) {
        this.f219158d = t0Var;
    }

    public void run() {
        C74562t0 t0Var = this.f219158d;
        C47976j Fx0 = C48009v0.Fx0();
        Fx0.getClass();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        Fx0.mo72752CP(sb);
        Fx0.mo72766kD(sb);
        sb.append(" and ");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("type");
        sb.append(" = ");
        sb.append(2);
        sb.append(" ");
        sb.append(" order by ");
        sb.append("rcontact.showHead asc,  case when length(rcontact.conRemarkPYFull) > 0 then upper(rcontact.conRemarkPYFull)  else upper(rcontact.quanPin) end asc,  case when length(rcontact.conRemark) > 0 then upper(rcontact.conRemark)  else upper(rcontact.quanPin) end asc,  upper(rcontact.quanPin) asc,  upper(rcontact.nickname) asc,  upper(rcontact.username) asc ");
        String sb4 = sb.toString();
        Log.m105925i("MicroMsg.BizInfoStorage", "getEnterpriseFatherBizLst sql %s", sb4);
        Cursor rawQuery = Fx0.rawQuery(sb4, new String[0]);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                    arrayList.add(rawQuery.getString(0));
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        }
        t0Var.f219173f = arrayList;
        this.f219158d.f219175h = C97625j3.m125812b().mo105907v().mo69722q4();
        this.f219158d.post(new C74559a());
    }
}
