package com.tencent.p014mm.chatroom.p015ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.ManagerRoomByWeworkUI;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;

/* renamed from: com.tencent.mm.chatroom.ui.WeworkRoomUpgradeResultUI */
public class WeworkRoomUpgradeResultUI extends MMActivity {

    /* renamed from: d */
    public String f10204d;

    /* renamed from: e */
    public int f10205e;

    /* renamed from: f */
    public String f10206f;

    /* renamed from: g */
    public ArrayList<String> f10207g;

    /* renamed from: h */
    public ArrayList<String> f10208h;

    /* renamed from: i */
    public ImageView f10209i;

    /* renamed from: j */
    public TextView f10210j;

    /* renamed from: n */
    public RecyclerView f10211n;

    /* renamed from: o */
    public Button f10212o;

    /* renamed from: p */
    public Button f10213p;

    /* renamed from: q */
    public LinearLayoutManager f10214q;

    /* renamed from: r */
    public C1198c f10215r;

    /* renamed from: com.tencent.mm.chatroom.ui.WeworkRoomUpgradeResultUI$a */
    public class C1196a implements View.OnClickListener {
        public C1196a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.WeworkRoomUpgradeResultUI", "click return wework");
            WeworkRoomUpgradeResultUI.m1342H7(WeworkRoomUpgradeResultUI.this);
            WeworkRoomUpgradeResultUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.WeworkRoomUpgradeResultUI$b */
    public class C1197b implements View.OnClickListener {
        public C1197b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105925i("MicroMsg.WeworkRoomUpgradeResultUI", "[goToChattingUI] username:%s", WeworkRoomUpgradeResultUI.this.f10204d);
            Intent putExtra = new Intent().putExtra("Main_User", WeworkRoomUpgradeResultUI.this.f10204d);
            putExtra.putExtra("From_fail_notify", true);
            putExtra.addFlags(67108864);
            putExtra.addFlags(536870912);
            C88144b.m109801s(WeworkRoomUpgradeResultUI.this, "com.tencent.mm.ui.LauncherUI", putExtra, (Bundle) null);
            WeworkRoomUpgradeResultUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.WeworkRoomUpgradeResultUI$c */
    public static class C1198c extends RecyclerView.C16613e {

        /* renamed from: d */
        public Context f10218d;

        /* renamed from: e */
        public List<C72996z1> f10219e = new ArrayList();

        /* renamed from: f */
        public ArrayList<String> f10220f;

        /* renamed from: g */
        public ArrayList<String> f10221g;

        public C1198c(Context context, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
            Class cls = C75700k0.class;
            this.f10218d = context;
            this.f10220f = arrayList;
            this.f10221g = arrayList2;
            Iterator<String> it = this.f10220f.iterator();
            while (it.hasNext()) {
                this.f10219e.add(((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(it.next()));
            }
            Iterator<String> it4 = this.f10221g.iterator();
            while (it4.hasNext()) {
                this.f10219e.add(((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(it4.next()));
            }
        }

        public int getItemCount() {
            return ((ArrayList) this.f10219e).size();
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            List<C72996z1> list = this.f10219e;
            if (list != null && i >= 0 && i < ((ArrayList) list).size()) {
                C1199d dVar = (C1199d) zVar;
                C72996z1 z1Var = (C72996z1) ((ArrayList) this.f10219e).get(i);
                Log.m105919d("MicroMsg.WeworkRoomUpgradeResultUI", "onBindViewHolder() i:%s username:%s", Integer.valueOf(i), z1Var.getUsername());
                View view = dVar.f10226z;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI$ChatroomAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI$ChatroomAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ManagerRoomByWeworkUI.m43243I7(z1Var.getUsername(), dVar.f10222A);
                if (this.f10220f.contains(z1Var.getUsername())) {
                    ManagerRoomByWeworkUI.m43244L7(this.f10218d, z1Var.getUsername(), dVar.f10224C, dVar.f10225D, true);
                    dVar.f10223B.setVisibility(8);
                    return;
                }
                ManagerRoomByWeworkUI.m43244L7(this.f10218d, z1Var.getUsername(), dVar.f10224C, dVar.f10225D, false);
                dVar.f10223B.setVisibility(0);
                dVar.f10223B.setText(C0966R.string.k8l);
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C1199d(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cim, viewGroup, false));
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.WeworkRoomUpgradeResultUI$d */
    public static class C1199d extends RecyclerView.C16631z {

        /* renamed from: A */
        public CdnImageView f10222A;

        /* renamed from: B */
        public TextView f10223B;

        /* renamed from: C */
        public TextView f10224C;

        /* renamed from: D */
        public TextView f10225D;

        /* renamed from: z */
        public View f10226z;

        public C1199d(View view) {
            super(view);
            this.f10226z = view;
            this.f10222A = (CdnImageView) view.findViewById(C0966R.C0970id.f357651b11);
            this.f10223B = (TextView) view.findViewById(C0966R.C0970id.b1h);
            this.f10224C = (TextView) view.findViewById(C0966R.C0970id.b1b);
            this.f10225D = (TextView) view.findViewById(C0966R.C0970id.b1d);
        }
    }

    /* renamed from: H7 */
    public static void m1342H7(Context context) {
        if (context == null) {
            Log.m105920e("MicroMsg.WeworkRoomUpgradeResultUI", "gotoWeWork context null");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse("wxwork://jump"));
        intent.setPackage("com.tencent.wework");
        intent.setFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI", "gotoWeWork", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI", "gotoWeWork", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cin;
    }

    @Deprecated
    public void initView() {
        super.initView();
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.f2929c));
        setBackGroundColorResource(C0966R.color.f2929c);
        setMMTitle("");
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo91104o();
        }
        this.f10209i = (ImageView) findViewById(C0966R.C0970id.f15);
        this.f10210j = (TextView) findViewById(C0966R.C0970id.bsj);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.erb);
        this.f10211n = (RecyclerView) findViewById(C0966R.C0970id.f6159yz);
        this.f10212o = (Button) findViewById(C0966R.C0970id.e9s);
        this.f10213p = (Button) findViewById(C0966R.C0970id.eq4);
        if (this.f10205e == 3) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10209i.getLayoutParams();
            layoutParams.topMargin = C76577a.m92151b(this, 48);
            this.f10209i.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f10210j.getLayoutParams();
            layoutParams2.topMargin = C76577a.m92151b(this, 16);
            this.f10210j.setLayoutParams(layoutParams2);
            View findViewById = findViewById(C0966R.C0970id.brp);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f10211n.setVisibility(0);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            this.f10214q = linearLayoutManager;
            linearLayoutManager.mo16974W(1);
            this.f10211n.setLayoutManager(this.f10214q);
            this.f10211n.mo17085h0(new ManagerRoomByWeworkUI.C1180d(getContext(), 0.5f, 56.0f));
            C1198c cVar = new C1198c(getContext(), this.f10207g, this.f10208h);
            this.f10215r = cVar;
            this.f10211n.setAdapter(cVar);
            this.f10215r.notifyDataSetChanged();
            this.f10212o.setVisibility(8);
            this.f10213p.setVisibility(0);
            this.f10213p.setOnClickListener(new C1196a());
            return;
        }
        ((TextView) findViewById(C0966R.C0970id.brp)).setText(this.f10206f);
        this.f10211n.setVisibility(8);
        this.f10212o.setVisibility(0);
        this.f10213p.setVisibility(8);
        this.f10212o.setOnClickListener(new C1197b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        this.f10204d = getIntent().getStringExtra("RoomInfo_Id");
        boolean z = false;
        int intExtra = getIntent().getIntExtra("upgrade_openim_room_from_scene", 0);
        this.f10205e = intExtra;
        Log.m105925i("MicroMsg.WeworkRoomUpgradeResultUI", "mFromScene:%s", Integer.valueOf(intExtra));
        if (this.f10205e == 3 || !Util.isNullOrNil(this.f10204d)) {
            this.f10206f = getIntent().getStringExtra("popup_wording");
            this.f10207g = getIntent().getStringArrayListExtra("wework_upgrade_success_list");
            this.f10208h = getIntent().getStringArrayListExtra("wework_upgrade_fail_list");
            z = true;
        } else {
            Log.m105920e("MicroMsg.WeworkRoomUpgradeResultUI", "mRoomId is null");
            finish();
        }
        if (z) {
            initView();
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
