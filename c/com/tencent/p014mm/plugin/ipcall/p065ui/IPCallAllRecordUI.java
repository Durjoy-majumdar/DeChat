package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.sdk.platformtools.Util;
import s12.C13612c;
import s12.C13614k;
import s12.C13615l;
import t12.C110899d;
import t12.C13818a;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallAllRecordUI */
public class IPCallAllRecordUI extends MMActivity {

    /* renamed from: d */
    public String f19443d;

    /* renamed from: e */
    public String f19444e;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallAllRecordUI$a */
    public class C4625a implements MenuItem.OnMenuItemClickListener {
        public C4625a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            IPCallAllRecordUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallAllRecordUI$b */
    public class C4626b extends C6975i1<C13614k> {

        /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallAllRecordUI$b$a */
        public class C4627a {

            /* renamed from: a */
            public TextView f19447a;

            /* renamed from: b */
            public TextView f19448b;

            /* renamed from: c */
            public TextView f19449c;

            public C4627a(C4626b bVar) {
            }
        }

        public C4626b(Context context) {
            super(context, null);
            mo7997q(true);
        }

        /* renamed from: d */
        public Object mo1330d(Object obj, Cursor cursor) {
            C13614k kVar = (C13614k) obj;
            if (kVar == null) {
                kVar = new C13614k();
            }
            kVar.convertFrom(cursor);
            return kVar;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = IPCallAllRecordUI.this.getLayoutInflater().inflate(C0966R.C0971layout.b2g, viewGroup, false);
                C4627a aVar = new C4627a(this);
                aVar.f19447a = (TextView) view.findViewById(C0966R.C0970id.i6g);
                aVar.f19448b = (TextView) view.findViewById(C0966R.C0970id.i6i);
                aVar.f19449c = (TextView) view.findViewById(C0966R.C0970id.i6j);
                view.setTag(aVar);
            }
            C13614k kVar = (C13614k) getItem(i);
            C4627a aVar2 = (C4627a) view.getTag();
            aVar2.f19448b.setText(C13818a.m13108d(kVar.field_phonenumber));
            long j = kVar.field_duration;
            if (j > 0) {
                aVar2.f19449c.setText(C110899d.m151187a(j));
            } else {
                aVar2.f19449c.setText(C110899d.m151195i(kVar.field_status));
            }
            aVar2.f19447a.setText(C110899d.m151188b(kVar.field_calltime));
            return view;
        }

        /* renamed from: l */
        public void mo1332l() {
            mo5580b();
            mo1333o();
        }

        /* renamed from: o */
        public void mo1333o() {
            Cursor cursor;
            C13612c qq;
            if (!Util.isNullOrNil(IPCallAllRecordUI.this.f19444e)) {
                String str = IPCallAllRecordUI.this.f19444e;
                if (!Util.isNullOrNil(str) && (qq = C105385g.vx0().mo13010qq(str)) != null) {
                    long j = qq.systemRowid;
                    if (j != -1) {
                        cursor = C105385g.Cx0().mo13012jo(j);
                        mo7998r(cursor);
                    }
                }
            } else if (!Util.isNullOrNil(IPCallAllRecordUI.this.f19443d)) {
                C13615l Cx0 = C105385g.Cx0();
                String str2 = IPCallAllRecordUI.this.f19443d;
                cursor = Cx0.f38583d.query("IPCallRecord", C13615l.f38582f, "phonenumber=?", new String[]{str2}, (String) null, (String) null, "calltime desc");
                mo7998r(cursor);
            }
            cursor = null;
            mo7998r(cursor);
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359837b24;
    }

    public final void init() {
        ((ListView) findViewById(C0966R.C0970id.f5792or)).setAdapter(new C4626b(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f19443d = getIntent().getStringExtra("IPCallAllRecordUI_phoneNumber");
        this.f19444e = getIntent().getStringExtra("IPCallAllRecordUI_contactId");
        getIntent().getBooleanExtra("IPCallAllRecordUI_isSinglePhoneNumber", false);
        setMMTitle((int) C0966R.string.fv6);
        setBackBtn(new C4625a());
        init();
    }
}
