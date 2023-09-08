package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.content.DialogInterface;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct;
import com.tencent.p014mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecvInfo;
import com.tencent.p014mm.plugin.remittance.mobile.p097ui.MobileRemitHistoryRecodUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import nj3.C11184p0;
import nj3.C76879j;
import te3.C77947ig2;
import uo3.C78253a;
import wi2.C53180c;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.b */
public class C70555b implements MobileRemitHistoryRecodUI.C70532h {

    /* renamed from: a */
    public final /* synthetic */ MobileRemitHistoryRecodUI f204015a;

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.b$a */
    public class C70556a implements View.OnCreateContextMenuListener {
        public C70556a(C70555b bVar) {
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(0, 0, 0, C0966R.string.f7944x1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.b$b */
    public class C70557b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C77947ig2 f204016d;

        public C70557b(C77947ig2 ig22) {
            this.f204016d = ig22;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem != null && menuItem.getItemId() == 0) {
                Log.m105925i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "delete HisRcvr id:%s", this.f204016d.f227615d);
                C70555b.this.f204015a.doSceneProgress(new C53180c(this.f204016d.f227615d), false);
                ((ArrayList) C70555b.this.f204015a.f203848i).remove(this.f204016d);
                C70555b.this.f204015a.f203850n.notifyDataSetChanged();
                C70555b.this.f204015a.getClass();
                WCPayTransferToPhoneActionReportStruct wCPayTransferToPhoneActionReportStruct = new WCPayTransferToPhoneActionReportStruct();
                wCPayTransferToPhoneActionReportStruct.f194684d = (long) 14;
                wCPayTransferToPhoneActionReportStruct.mo86054n();
            }
        }
    }

    public C70555b(MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI) {
        this.f204015a = mobileRemitHistoryRecodUI;
    }

    public void onClick(View view) {
        Log.m105924i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "mHistroyRecordRv click!");
        C77947ig2 ig22 = (C77947ig2) view.getTag();
        if (ig22.f227620i != 0) {
            C76879j.m92711E(this.f204015a.getContext(), this.f204015a.getResources().getString(C0966R.string.gu6), "", this.f204015a.getResources().getString(C0966R.string.f361038gu1), false, (DialogInterface.OnClickListener) null).show();
        } else {
            this.f204015a.doSceneProgress(new NetSceneMobileRemitGetRecvInfo("", ig22.f227615d, this.f204015a.f203845f, 2), true);
        }
        MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI = this.f204015a;
        int i = MobileRemitHistoryRecodUI.f203842r;
        mobileRemitHistoryRecodUI.getClass();
        WCPayTransferToPhoneActionReportStruct wCPayTransferToPhoneActionReportStruct = new WCPayTransferToPhoneActionReportStruct();
        wCPayTransferToPhoneActionReportStruct.f194684d = (long) 13;
        wCPayTransferToPhoneActionReportStruct.mo86054n();
    }

    public boolean onLongClick(View view) {
        Log.m105924i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "mHistroyRecordRv longclick!");
        C78253a aVar = new C78253a(this.f204015a, view);
        C70556a aVar2 = new C70556a(this);
        C70557b bVar = new C70557b((C77947ig2) view.getTag());
        int[] iArr = this.f204015a.f203852p;
        aVar.mo108273h(view, aVar2, bVar, iArr[0], iArr[1]);
        return true;
    }
}
