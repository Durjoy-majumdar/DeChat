package cv0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.backup.backupmoveui.BackupMoveChooseUI;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PLong;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import java.util.HashSet;
import java.util.LinkedList;
import p196ln.C76705f;
import p629ny.C76979h;
import qv0.C101304e;
import yu0.C102912i;
import yu0.C102913k;

/* renamed from: cv0.c */
public class C20365c extends BaseAdapter {

    /* renamed from: d */
    public BackupMoveChooseUI f57044d;

    /* renamed from: e */
    public HashSet<Integer> f57045e = new HashSet<>();

    /* renamed from: f */
    public C101304e f57046f;

    /* renamed from: g */
    public int f57047g;

    public C20365c(BackupMoveChooseUI backupMoveChooseUI) {
        this.f57044d = backupMoveChooseUI;
    }

    /* renamed from: a */
    public LinkedList<C102912i> mo31847a(PLong pLong, PInt pInt) {
        LinkedList<C102912i> linkedList = new LinkedList<>();
        if (this.f57045e.size() <= 0) {
            return linkedList;
        }
        if (pLong == null) {
            pLong = new PLong();
        }
        pLong.value = 0;
        if (pInt == null) {
            pInt = new PInt();
        }
        pInt.value = 0;
        mo31848b();
        for (int i = 0; i < getCount(); i++) {
            if (this.f57045e.contains(Integer.valueOf(i))) {
                C102912i iVar = mo31848b().get(i);
                linkedList.add(iVar);
                pLong.value += iVar.f303762g;
                pInt.value = (int) (((long) pInt.value) + iVar.f303763h);
            }
        }
        Log.m105925i("MicroMsg.BackupMoveChooseAdapter", "finishSelected usernameSize:%d, convSize:%d, convMsgCount:%d", Integer.valueOf(linkedList.size()), Long.valueOf(pLong.value), Integer.valueOf(pInt.value));
        return linkedList;
    }

    /* renamed from: b */
    public LinkedList<C102912i> mo31848b() {
        return this.f57046f.mo140770g();
    }

    public int getCount() {
        mo31848b();
        return mo31848b().size();
    }

    public Object getItem(int i) {
        return mo31848b().get(i);
    }

    public long getItemId(int i) {
        return -1;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        c$$c c__c;
        String str;
        Class cls = C75339i.class;
        if (view == null) {
            view = this.f57044d.getLayoutInflater().inflate(C0966R.C0971layout.f6539hn, viewGroup, false);
            c__c = new c$$c(this);
            c__c.f57052a = (ImageView) view.findViewById(C0966R.C0970id.a27);
            c__c.f57053b = (TextView) view.findViewById(C0966R.C0970id.kpm);
            c__c.f57054c = (TextView) view.findViewById(C0966R.C0970id.c2h);
            c__c.f57055d = (CheckBox) view.findViewById(C0966R.C0970id.j9g);
            c__c.f57056e = (RelativeLayout) view.findViewById(C0966R.C0970id.j9h);
            c__c.f57057f = (ProgressBar) view.findViewById(C0966R.C0970id.g3h);
            view.setTag(c__c);
        } else {
            c__c = (c$$c) view.getTag();
        }
        view.setOnClickListener(new c$$a(this, i));
        if (i >= getCount()) {
            Log.m105921e("MicroMsg.BackupMoveChooseAdapter", "getView error, position:%d, count:%d", Integer.valueOf(i), Integer.valueOf(getCount()));
            return view;
        }
        C102912i iVar = mo31848b().get(i);
        c__c.f57056e.setOnClickListener(new c$$b(this, i));
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(c__c.f57052a, iVar.f303759d);
        if (this.f57044d.f49979E) {
            long j = iVar.f303762g;
            if (j >= 0) {
                if (this.f57047g == 1) {
                    c__c.f57054c.setText(C102913k.m136058w((float) iVar.f303761f[1]));
                } else {
                    c__c.f57054c.setText(C102913k.m136058w((float) j));
                }
                c__c.f57054c.setVisibility(0);
                c__c.f57057f.setVisibility(8);
            } else {
                c__c.f57054c.setVisibility(8);
                c__c.f57057f.setVisibility(0);
            }
        } else {
            c__c.f57054c.setVisibility(8);
            c__c.f57057f.setVisibility(8);
        }
        if (C72996z1.m85820U5(iVar.f303759d)) {
            String str2 = iVar.f303759d;
            str = ((C75339i) C86312j.m106911c(cls)).mo62519pb(str2, str2);
        } else {
            str = ((C75339i) C86312j.m106911c(cls)).getDisplayName(iVar.f303759d);
        }
        TextView textView = c__c.f57053b;
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        BackupMoveChooseUI backupMoveChooseUI = this.f57044d;
        if (str == null) {
            str = "群聊";
        }
        textView.setText(hVar.yp0(backupMoveChooseUI, str, c__c.f57053b.getTextSize()));
        if (this.f57045e.contains(Integer.valueOf(i))) {
            c__c.f57055d.setChecked(true);
        } else {
            c__c.f57055d.setChecked(false);
        }
        return view;
    }
}
