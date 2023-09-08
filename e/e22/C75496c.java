package e22;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.label.p067ui.ContactEditLabel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import gl3.C75922b;
import gl3.C75939h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import nj3.C11184p0;
import uo3.C78253a;

/* renamed from: e22.c */
public final class C75496c implements AdapterView.OnItemLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactEditLabel f221866d;

    /* renamed from: e22.c$a */
    public static final class C75497a implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final /* synthetic */ int f221867d;

        public C75497a(int i) {
            this.f221867d = i;
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            C87412m.m108591d(contextMenu);
            contextMenu.add(this.f221867d, 0, 0, C0966R.string.f360335by3);
        }
    }

    /* renamed from: e22.c$b */
    public static final class C75498b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ ContactEditLabel f221868d;

        /* renamed from: e */
        public final /* synthetic */ String f221869e;

        public C75498b(ContactEditLabel contactEditLabel, String str) {
            this.f221868d = contactEditLabel;
            this.f221869e = str;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            ContactEditLabel contactEditLabel = this.f221868d;
            String str = this.f221869e;
            C87412m.m108593f(str, "username");
            Log.m105924i(contactEditLabel.f198452d, "cpan[dealRemoveContact]");
            ArrayList<String> arrayList = contactEditLabel.f198462q;
            if (arrayList != null && arrayList.contains(str)) {
                contactEditLabel.f198462q.remove(str);
            }
            ArrayList<String> arrayList2 = contactEditLabel.f198463r;
            if (arrayList2 != null && arrayList2.contains(str)) {
                contactEditLabel.f198466u.add(str);
            }
            HashSet<String> hashSet = contactEditLabel.f198464s;
            if (hashSet != null && hashSet.contains(str)) {
                contactEditLabel.f198464s.remove(str);
                contactEditLabel.f198465t.remove(str);
            }
            if (!Util.isNullOrNil(contactEditLabel.f198456h)) {
                contactEditLabel.enableOptionMenu(true);
            }
            MMHandler mMHandler = contactEditLabel.f198451E;
            if (mMHandler != null) {
                mMHandler.sendEmptyMessage(contactEditLabel.f198454f);
            }
        }
    }

    public C75496c(ContactEditLabel contactEditLabel) {
        this.f221866d = contactEditLabel;
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = i;
        ContactEditLabel.C69040a aVar = this.f221866d.f198447A;
        if (aVar != null) {
            C75922b j2 = aVar.getItem(i);
            if (j2 == null || !(j2 instanceof C75939h)) {
                return true;
            }
            String str = ((C75939h) j2).f222602y;
            ContactEditLabel contactEditLabel = this.f221866d;
            ContactEditLabel.C69040a aVar2 = contactEditLabel.f198447A;
            if (aVar2 != null) {
                if (!aVar2.f219057f) {
                    C78253a aVar3 = new C78253a(contactEditLabel.getContext());
                    C75497a aVar4 = new C75497a(i);
                    ContactEditLabel contactEditLabel2 = this.f221866d;
                    aVar3.mo108272g(view, i, j, aVar4, new C75498b(contactEditLabel2, str), contactEditLabel2.f198448B, contactEditLabel2.f198449C);
                }
                return true;
            }
            C87412m.m108603p("adapter");
            throw null;
        }
        C87412m.m108603p("adapter");
        throw null;
    }
}
