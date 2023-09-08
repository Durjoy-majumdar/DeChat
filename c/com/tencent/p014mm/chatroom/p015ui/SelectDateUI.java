package com.tencent.p014mm.chatroom.p015ui;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.Collection;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import p1123ii.C108463a;
import p203mi.C109628a;

/* renamed from: com.tencent.mm.chatroom.ui.SelectDateUI */
public class SelectDateUI extends MMActivity implements C108463a {

    /* renamed from: j */
    public static final /* synthetic */ int f310579j = 0;

    /* renamed from: d */
    public DayPickerView f310580d;

    /* renamed from: e */
    public String f310581e;

    /* renamed from: f */
    public HashMap<String, C109628a> f310582f;

    /* renamed from: g */
    public long f310583g = -1;

    /* renamed from: h */
    public MMHandler f310584h;

    /* renamed from: i */
    public TextView f310585i;

    /* renamed from: com.tencent.mm.chatroom.ui.SelectDateUI$a */
    public class C104605a implements Runnable {

        /* renamed from: com.tencent.mm.chatroom.ui.SelectDateUI$a$a */
        public class C104606a implements Runnable {
            public C104606a() {
            }

            public void run() {
                SelectDateUI selectDateUI = SelectDateUI.this;
                DayPickerView dayPickerView = selectDateUI.f310580d;
                long j = selectDateUI.f310583g;
                if (j == -1) {
                    j = System.currentTimeMillis() * 1000;
                }
                dayPickerView.setBeginDate(j);
                SelectDateUI selectDateUI2 = SelectDateUI.this;
                DayPickerView dayPickerView2 = selectDateUI2.f310580d;
                Collection<C109628a> values = selectDateUI2.f310582f.values();
                dayPickerView2.f310575D1 = values;
                dayPickerView2.f310572A1 = selectDateUI2;
                dayPickerView2.setUpAdapter(values);
                dayPickerView2.setAdapter(dayPickerView2.f310578z1);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(dayPickerView2.f310578z1.getItemCount() - 1));
                C117292a.m165358d(dayPickerView2, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/DayPickerView", "setController", "(Lcom/tencent/mm/chatroom/adapter/DatePickerController;Ljava/util/Collection;)V", "Undefined", "scrollToPosition", "(I)V");
                dayPickerView2.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(dayPickerView2, "com/tencent/mm/chatroom/ui/DayPickerView", "setController", "(Lcom/tencent/mm/chatroom/adapter/DatePickerController;Ljava/util/Collection;)V", "Undefined", "scrollToPosition", "(I)V");
                dayPickerView2.f310578z1.notifyDataSetChanged();
                if (SelectDateUI.this.f310582f.size() == 0) {
                    SelectDateUI.this.f310585i.setVisibility(0);
                    SelectDateUI.this.f310580d.setVisibility(8);
                    SelectDateUI selectDateUI3 = SelectDateUI.this;
                    selectDateUI3.f310585i.setText(selectDateUI3.getString(C0966R.string.bav));
                    return;
                }
                SelectDateUI.this.f310585i.setVisibility(8);
                SelectDateUI.this.f310580d.setVisibility(0);
            }
        }

        public C104605a() {
        }

        public void run() {
            SelectDateUI selectDateUI = SelectDateUI.this;
            int i = SelectDateUI.f310579j;
            selectDateUI.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Cursor r502 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).r50(selectDateUI.f310581e);
            try {
                if (r502.moveToFirst()) {
                    while (!r502.isAfterLast()) {
                        if (-1 == selectDateUI.f310583g) {
                            selectDateUI.f310583g = r502.getLong(0);
                        }
                        C109628a aVar = new C109628a(r502.getLong(0));
                        aVar.f328203f = r502.getLong(1);
                        String aVar2 = aVar.toString();
                        if (!selectDateUI.f310582f.containsKey(aVar2)) {
                            selectDateUI.f310582f.put(aVar2, aVar);
                        }
                        r502.moveToNext();
                    }
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.SelectDateUI", e.toString());
            } catch (Throwable th) {
                r502.close();
                throw th;
            }
            r502.close();
            Log.m105925i("MicroMsg.SelectDateUI", "[prepareData] time:%s", (System.currentTimeMillis() - currentTimeMillis) + "");
            SelectDateUI.this.f310584h.post(new C104606a());
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SelectDateUI$b */
    public class C104607b implements MenuItem.OnMenuItemClickListener {
        public C104607b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SelectDateUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public void mo148174H7(C109628a aVar) {
        if (aVar == null) {
            Log.m105920e("MicroMsg.SelectDateUI", "null == calendarDay");
            return;
        }
        Log.m105925i("MicroMsg.SelectDateUI", "Day Selected timestamp:%s day:%s month:%s year:%s", Long.valueOf(aVar.f328202e), Integer.valueOf(aVar.f328199b), Integer.valueOf(aVar.f328200c), Integer.valueOf(aVar.f328201d));
        long j = aVar.f328203f;
        Log.m105925i("MicroMsg.SelectDateUI", "[goToChattingUI] msgLocalId:%s", Long.valueOf(j));
        C88144b.m109801s(this, ".ui.chatting.ChattingUI", new Intent().putExtra("Chat_User", this.f310581e).putExtra("finish_direct", true).putExtra("from_date_search", true).putExtra("msg_local_id", j), (Bundle) null);
        if (C72996z1.m85822V5(this.f310581e)) {
            C115669n.INSTANCE.mo160131h(27229, 1, 4, "", 0, 0, Long.valueOf(aVar.f328202e / 1000));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bvz;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760258);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(C0966R.C0970id.f5383do), true);
        inflateTransition.excludeTarget(16908335, true);
        getWindow().setEnterTransition(inflateTransition);
        setMMTitle((int) C0966R.string.mzp);
        this.f310580d = (DayPickerView) findViewById(C0966R.C0970id.hwg);
        this.f310585i = (TextView) findViewById(C0966R.C0970id.j6m);
        this.f310582f = new HashMap<>();
        this.f310584h = new MMHandler(getMainLooper());
        this.f310581e = getIntent().getStringExtra("detail_username");
        ThreadPool.post(new C104605a(), "prepare_data");
        setBackBtn(new C104607b());
    }
}
