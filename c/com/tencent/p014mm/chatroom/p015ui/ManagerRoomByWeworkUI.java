package com.tencent.p014mm.chatroom.p015ui;

import a11.C39479c;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi3.C0289a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.GroupUpgradeGuideFlowStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.GroupUpgradeResultStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.GroupUpgradeSelectGroupStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C45058g1;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C45612m0;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kv1.C99251g;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import p196ln.C76705f;
import p203mi.C47045p;
import p203mi.C47054z;
import p629ny.C76979h;
import p740wo.C53193b;
import qo3.C89779i0;
import te3.C48911bv1;
import te3.pm4;

/* renamed from: com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI */
public class ManagerRoomByWeworkUI extends MMActivity implements C11385n {

    /* renamed from: I */
    public static final /* synthetic */ int f108085I = 0;

    /* renamed from: A */
    public LinearLayout f108086A;

    /* renamed from: B */
    public RecyclerView f108087B;

    /* renamed from: C */
    public LinearLayout f108088C;

    /* renamed from: D */
    public ImageView f108089D;

    /* renamed from: E */
    public LinearLayoutManager f108090E;

    /* renamed from: F */
    public C40205c f108091F;

    /* renamed from: G */
    public int f108092G = 0;

    /* renamed from: H */
    public int f108093H = 0;

    /* renamed from: d */
    public String f108094d;

    /* renamed from: e */
    public int f108095e;

    /* renamed from: f */
    public String f108096f;

    /* renamed from: g */
    public List<String> f108097g = new ArrayList();

    /* renamed from: h */
    public List<C72996z1> f108098h = new ArrayList();

    /* renamed from: i */
    public List<String> f108099i = new ArrayList();

    /* renamed from: j */
    public HashMap<String, Boolean> f108100j = new HashMap<>();

    /* renamed from: n */
    public HashMap<String, Boolean> f108101n = new HashMap<>();

    /* renamed from: o */
    public int f108102o = 0;

    /* renamed from: p */
    public int f108103p = 0;

    /* renamed from: q */
    public int f108104q = 0;

    /* renamed from: r */
    public C89779i0 f108105r = null;

    /* renamed from: s */
    public Button f108106s;

    /* renamed from: t */
    public Button f108107t;

    /* renamed from: u */
    public TextView f108108u;

    /* renamed from: v */
    public CdnImageView f108109v;

    /* renamed from: w */
    public TextView f108110w;

    /* renamed from: x */
    public TextView f108111x;

    /* renamed from: y */
    public LinearLayout f108112y;

    /* renamed from: z */
    public LinearLayout f108113z;

    /* renamed from: com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI$d */
    public static class C1180d extends RecyclerView.C0129l {

        /* renamed from: d */
        public Paint f10142d;

        /* renamed from: e */
        public Paint f10143e;

        /* renamed from: f */
        public int f10144f;

        /* renamed from: g */
        public int f10145g;

        public C1180d(Context context, float f, float f2) {
            this.f10144f = C76577a.m92150a(context, f);
            this.f10145g = C76577a.m92150a(context, f2);
            Paint paint = new Paint();
            this.f10142d = paint;
            paint.setColor(context.getResources().getColor(C0966R.color.BW_0_Alpha_0_1));
            Paint paint2 = new Paint();
            this.f10143e = paint2;
            paint2.setColor(context.getResources().getColor(C0966R.color.BW_93));
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            super.mo21g(rect, view, recyclerView, wVar);
            rect.bottom = this.f10144f;
        }

        /* renamed from: h */
        public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            int childCount = recyclerView.getChildCount();
            int paddingLeft = recyclerView.getPaddingLeft();
            int i = this.f10145g + paddingLeft;
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                float bottom = (float) childAt.getBottom();
                float bottom2 = (float) (childAt.getBottom() + this.f10144f);
                if (i2 == childCount - 1) {
                    canvas.drawRect((float) paddingLeft, bottom, (float) width, bottom2, this.f10143e);
                } else {
                    canvas.drawRect((float) i, bottom, (float) width, bottom2, this.f10142d);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI$a */
    public class C40203a implements MenuItem.OnMenuItemClickListener {
        public C40203a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i("MicroMsg.ManagerRoomByWeworkUI", "onMenuItemClick click");
            WeworkRoomUpgradeResultUI.m1342H7(ManagerRoomByWeworkUI.this);
            ManagerRoomByWeworkUI.this.finish();
            ManagerRoomByWeworkUI managerRoomByWeworkUI = ManagerRoomByWeworkUI.this;
            int i = managerRoomByWeworkUI.f108095e;
            if (i != 3) {
                ManagerRoomByWeworkUI.m43242H7(managerRoomByWeworkUI.f108094d, i, 0, 0);
                return true;
            }
            managerRoomByWeworkUI.mo62743J7(0);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI$b */
    public class C40204b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C117747y f108115d;

        public C40204b(C117747y yVar) {
            this.f108115d = yVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C117747y yVar = this.f108115d;
            if (yVar == null) {
                Log.m105924i("MicroMsg.ManagerRoomByWeworkUI", "dialog onCancel scene is null");
                return;
            }
            Log.m105925i("MicroMsg.ManagerRoomByWeworkUI", "dialog onCancel scene:%s", Integer.valueOf(yVar.getType()));
            C86709a0.m107524d().mo123458d(this.f108115d);
            if (this.f108115d instanceof C47045p) {
                ManagerRoomByWeworkUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI$c */
    public static class C40205c extends RecyclerView.C16613e {

        /* renamed from: d */
        public Context f108117d;

        /* renamed from: e */
        public List<C72996z1> f108118e;

        /* renamed from: f */
        public List<String> f108119f;

        /* renamed from: g */
        public HashMap<String, Boolean> f108120g;

        /* renamed from: h */
        public int f108121h = 0;

        /* renamed from: i */
        public C40207e f108122i;

        /* renamed from: j */
        public int f108123j = 0;

        /* renamed from: n */
        public int f108124n = 0;

        /* renamed from: com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI$c$a */
        public class C40206a implements View.OnClickListener {
            public C40206a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$ChatroomAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C72996z1 z1Var = (C72996z1) view.getTag();
                if (z1Var == null) {
                    Log.m105920e("MicroMsg.ManagerRoomByWeworkUI", "click:contact is nul");
                    C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$ChatroomAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                Boolean bool = C40205c.this.f108120g.get(z1Var.getUsername());
                boolean z = false;
                if (!bool.booleanValue()) {
                    C40205c cVar = C40205c.this;
                    if (cVar.f108121h == 5) {
                        C76912y0.makeText(cVar.f108117d, (int) C0966R.string.k8k, 0).show();
                        C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$ChatroomAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                }
                HashMap<String, Boolean> hashMap = C40205c.this.f108120g;
                String username = z1Var.getUsername();
                if (!bool.booleanValue()) {
                    z = true;
                }
                hashMap.put(username, Boolean.valueOf(z));
                if (!bool.booleanValue()) {
                    C40205c cVar2 = C40205c.this;
                    cVar2.f108121h++;
                    if (cVar2.f108119f.contains(z1Var.getUsername())) {
                        C40205c.this.f108123j++;
                    } else {
                        C40205c.this.f108124n++;
                    }
                } else {
                    C40205c cVar3 = C40205c.this;
                    cVar3.f108121h--;
                    if (cVar3.f108119f.contains(z1Var.getUsername())) {
                        C40205c cVar4 = C40205c.this;
                        cVar4.f108123j--;
                    } else {
                        C40205c cVar5 = C40205c.this;
                        cVar5.f108124n--;
                    }
                }
                C40205c.this.notifyDataSetChanged();
                C40207e eVar = C40205c.this.f108122i;
                if (eVar != null) {
                    ManagerRoomByWeworkUI managerRoomByWeworkUI = ((C40261f1) eVar).f108272a;
                    int i = ManagerRoomByWeworkUI.f108085I;
                    managerRoomByWeworkUI.mo62746N7();
                }
                C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$ChatroomAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C40205c(Context context, List<C72996z1> list, HashMap<String, Boolean> hashMap, List<String> list2, C40207e eVar) {
            this.f108117d = context;
            this.f108118e = list;
            this.f108120g = hashMap;
            this.f108119f = list2;
            this.f108122i = eVar;
            for (C72996z1 username : list) {
                hashMap.put(username.getUsername(), Boolean.FALSE);
            }
        }

        public int getItemCount() {
            return this.f108118e.size();
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            int i2 = i;
            boolean z = false;
            Log.m105919d("MicroMsg.ManagerRoomByWeworkUI", "onBindViewHolder() count:%s i:%s ", Integer.valueOf(this.f108118e.size()), Integer.valueOf(i));
            List<C72996z1> list = this.f108118e;
            if (list != null && i2 >= 0 && i2 < list.size()) {
                C40208f fVar = (C40208f) zVar;
                C72996z1 z1Var = this.f108118e.get(i2);
                Log.m105919d("MicroMsg.ManagerRoomByWeworkUI", "onBindViewHolder() count:%s i:%s username:%s", Integer.valueOf(this.f108118e.size()), Integer.valueOf(i), z1Var.getUsername());
                View view = fVar.f108130z;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$ChatroomAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$ChatroomAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ManagerRoomByWeworkUI.m43243I7(z1Var.getUsername(), fVar.f108127B);
                ManagerRoomByWeworkUI.m43244L7(this.f108117d, z1Var.getUsername(), fVar.f108128C, fVar.f108129D, false);
                Boolean bool = this.f108120g.get(z1Var.getUsername());
                fVar.f108126A.setEnabled(true);
                CheckBox checkBox = fVar.f108126A;
                if (bool != null) {
                    z = bool.booleanValue();
                }
                checkBox.setChecked(z);
                fVar.f108130z.setTag(z1Var);
                fVar.f108130z.setOnClickListener(new C40206a());
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C40208f(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6815pa, viewGroup, false));
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI$e */
    public interface C40207e {
    }

    /* renamed from: com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI$f */
    public static class C40208f extends RecyclerView.C16631z {

        /* renamed from: A */
        public CheckBox f108126A;

        /* renamed from: B */
        public CdnImageView f108127B;

        /* renamed from: C */
        public TextView f108128C;

        /* renamed from: D */
        public TextView f108129D;

        /* renamed from: z */
        public View f108130z;

        public C40208f(View view) {
            super(view);
            this.f108130z = view;
            this.f108126A = (CheckBox) view.findViewById(C0966R.C0970id.j9g);
            this.f108127B = (CdnImageView) view.findViewById(C0966R.C0970id.f357651b11);
            this.f108128C = (TextView) view.findViewById(C0966R.C0970id.b1b);
            this.f108129D = (TextView) view.findViewById(C0966R.C0970id.b1d);
        }
    }

    /* renamed from: H7 */
    public static void m43242H7(String str, int i, int i2, int i3) {
        GroupUpgradeGuideFlowStruct groupUpgradeGuideFlowStruct = new GroupUpgradeGuideFlowStruct();
        groupUpgradeGuideFlowStruct.f107945d = groupUpgradeGuideFlowStruct.mo86045b("Roomid", str, true);
        groupUpgradeGuideFlowStruct.f107946e = (long) i;
        groupUpgradeGuideFlowStruct.f107947f = (long) i2;
        groupUpgradeGuideFlowStruct.f107948g = (long) i3;
        groupUpgradeGuideFlowStruct.mo86054n();
    }

    /* renamed from: I7 */
    public static void m43243I7(String str, CdnImageView cdnImageView) {
        if (Util.isNullOrNil(str) || cdnImageView == null) {
            Log.m105920e("MicroMsg.ManagerRoomByWeworkUI", "username or avatarIv null");
        } else {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(cdnImageView, str);
        }
    }

    /* renamed from: L7 */
    public static void m43244L7(Context context, String str, TextView textView, TextView textView2, boolean z) {
        Class cls = C76979h.class;
        CharSequence op02 = ((C76979h) C86312j.m106911c(cls)).op0(context, ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str), C76577a.m92157h(context, C0966R.dimen.f3927j7));
        if (z) {
            op02 = ((C76979h) C86312j.m106911c(cls)).D60(context, op02, C0966R.raw.open_im_title_logo);
        }
        textView.setText(op02);
        int p1 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str).getUsername());
        if (p1 == 0) {
            textView2.setVisibility(8);
            return;
        }
        textView2.setVisibility(0);
        textView2.setText(context.getString(C0966R.string.k8m, new Object[]{p1 + ""}));
    }

    /* renamed from: J7 */
    public void mo62743J7(int i) {
        GroupUpgradeSelectGroupStruct groupUpgradeSelectGroupStruct = new GroupUpgradeSelectGroupStruct();
        groupUpgradeSelectGroupStruct.f107957d = (long) this.f108092G;
        groupUpgradeSelectGroupStruct.f107958e = (long) this.f108093H;
        C40205c cVar = this.f108091F;
        long j = 0;
        groupUpgradeSelectGroupStruct.f107959f = cVar == null ? 0 : (long) cVar.f108123j;
        if (cVar != null) {
            j = (long) cVar.f108124n;
        }
        groupUpgradeSelectGroupStruct.f107960g = j;
        groupUpgradeSelectGroupStruct.f107961h = (long) i;
        groupUpgradeSelectGroupStruct.f107962i = groupUpgradeSelectGroupStruct.mo86045b("TicketId", Util.nullAs(this.f108096f, ""), true);
        groupUpgradeSelectGroupStruct.f107963j = (long) this.f108104q;
        groupUpgradeSelectGroupStruct.mo86054n();
    }

    /* renamed from: K7 */
    public final boolean mo62744K7() {
        List<String> kD = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69808kD(C45612m0.m50699p());
        HashSet hashSet = new HashSet(this.f108099i);
        Iterator it = ((ArrayList) kD).iterator();
        while (it.hasNext()) {
            if (!hashSet.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: M7 */
    public final void mo62745M7(C117747y yVar, boolean z) {
        C89779i0 i0Var = this.f108105r;
        if (i0Var == null) {
            this.f108105r = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.f360085a04), true, z, new C40204b(yVar));
        } else if (!i0Var.isShowing()) {
            this.f108105r.show();
        }
    }

    /* renamed from: N7 */
    public final void mo62746N7() {
        if (this.f108095e == 3) {
            if (!(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_wework_select_other_room_switch, 1) == 1) || !mo62744K7() || ((ArrayList) this.f108097g).size() != 0 || ((ArrayList) this.f108099i).size() != 0) {
                this.f108106s.setVisibility(0);
                this.f108107t.setVisibility(8);
                C40205c cVar = this.f108091F;
                if (cVar == null || cVar.f108121h <= 0) {
                    this.f108106s.setEnabled(false);
                } else {
                    this.f108106s.setEnabled(true);
                }
            } else {
                this.f108106s.setVisibility(8);
                this.f108107t.setVisibility(0);
            }
        } else {
            this.f108106s.setVisibility(0);
            this.f108107t.setVisibility(8);
        }
    }

    /* renamed from: O7 */
    public final boolean mo62747O7() {
        if (!(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_wework_select_other_room_switch, 1) == 1) || !mo62744K7()) {
            this.f108088C.setVisibility(8);
            this.f108089D.setVisibility(8);
            return false;
        }
        if (((ArrayList) this.f108097g).size() == 0 && ((ArrayList) this.f108099i).size() == 0) {
            this.f108088C.setVisibility(8);
        } else {
            this.f108088C.setVisibility(0);
        }
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6814p_;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105925i("MicroMsg.ManagerRoomByWeworkUI", "requestCode=%d | resultCode=%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 == -1 && i == 0) {
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            Iterator it = ((ArrayList) this.f108098h).iterator();
            while (it.hasNext()) {
                if (Util.isEqual(((C72996z1) it.next()).getUsername(), stringExtra)) {
                    Log.m105924i("MicroMsg.ManagerRoomByWeworkUI", "onActivityResult contain");
                    return;
                }
            }
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(stringExtra);
            ((ArrayList) this.f108098h).add(z1Var);
            ((ArrayList) this.f108099i).add(stringExtra);
            this.f108100j.put(z1Var.getUsername(), Boolean.TRUE);
            this.f108091F.notifyDataSetChanged();
            mo62747O7();
            C40205c cVar = this.f108091F;
            cVar.f108124n++;
            cVar.f108121h++;
            NestedScrollView nestedScrollView = (NestedScrollView) findViewById(C0966R.C0970id.iwq);
            View findViewById = findViewById(C0966R.C0970id.br5);
            View findViewById2 = findViewById(C0966R.C0970id.l0h);
            View findViewById3 = findViewById(C0966R.C0970id.f357558ah2);
            if (nestedScrollView != null) {
                nestedScrollView.post(new C45058g1(findViewById, findViewById3, this, 48, findViewById2, 0.0f, nestedScrollView, false));
            }
            mo62746N7();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            java.lang.String r7 = ""
            r6.setMMTitle((java.lang.String) r7)
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = "RoomInfo_Id"
            java.lang.String r0 = r0.getStringExtra(r1)
            r6.f108094d = r0
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = "upgrade_openim_room_from_scene"
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            r6.f108095e = r0
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = "ticket"
            java.lang.String r0 = r0.getStringExtra(r1)
            r6.f108096f = r0
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r3 = r6.f108095e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r3 = "MicroMsg.ManagerRoomByWeworkUI"
            java.lang.String r4 = "mFromScene:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r1)
            int r1 = r6.f108095e
            r4 = 3
            if (r1 != r4) goto L_0x0055
            java.lang.String r1 = r6.f108096f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = "mTicket is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
            r6.finish()
            goto L_0x0065
        L_0x0055:
            java.lang.String r1 = r6.f108094d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = "mRoomId is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
            r6.finish()
        L_0x0065:
            r1 = 0
            goto L_0x0068
        L_0x0067:
            r1 = 1
        L_0x0068:
            if (r1 != 0) goto L_0x006b
            return
        L_0x006b:
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r5 = 3553(0xde1, float:4.979E-42)
            r1.mo123455a(r5, r6)
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r5 = 3927(0xf57, float:5.503E-42)
            r1.mo123455a(r5, r6)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r5 = r6.f108094d
            r1[r2] = r5
            java.lang.String r5 = "doFetchCollectPubFill() roomId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r1)
            int r1 = r6.f108095e
            if (r1 != r4) goto L_0x0094
            mi.p r1 = new mi.p
            java.lang.String r3 = r6.f108096f
            r1.<init>(r3, r0)
            goto L_0x009b
        L_0x0094:
            mi.p r1 = new mi.p
            java.lang.String r3 = r6.f108094d
            r1.<init>(r3)
        L_0x009b:
            ob0.b0 r3 = f40.C86709a0.m107524d()
            r3.mo123460f(r1)
            int r3 = r6.f108095e
            if (r3 == r4) goto L_0x00a7
            r2 = 1
        L_0x00a7:
            r6.mo62745M7(r1, r2)
            r6.setMMTitle((java.lang.String) r7)
            r6.hideActionbarLine()
            android.content.res.Resources r7 = r6.getResources()
            r0 = 2131099650(0x7f060002, float:1.781166E38)
            int r7 = r7.getColor(r0)
            r6.setActionbarColor(r7)
            r6.setBackGroundColorResource(r0)
            com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI$a r7 = new com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI$a
            r7.<init>()
            r6.setBackBtn(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.chatroom.p015ui.ManagerRoomByWeworkUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(3553, this);
        C86709a0.m107524d().mo123470p(3927, this);
        super.onDestroy();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        int i2 = this.f108095e;
        if (i2 != 3) {
            m43242H7(this.f108094d, i2, 0, 0);
        } else {
            mo62743J7(0);
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        C89779i0 i0Var;
        C117747y yVar2 = yVar;
        Class<WeworkRoomUpgradeResultUI> cls = WeworkRoomUpgradeResultUI.class;
        int i3 = 0;
        Log.m105925i("MicroMsg.ManagerRoomByWeworkUI", "onSceneEnd errType = %d, errCode = %d, errMsg = %s, scenetype:%s", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(yVar.getType()));
        if (this.f108095e != 3 || (yVar2 instanceof C47045p)) {
            C89779i0 i0Var2 = this.f108105r;
            if (i0Var2 != null && i0Var2.isShowing()) {
                this.f108105r.dismiss();
            }
        } else {
            try {
                Log.m105925i("MicroMsg.ManagerRoomByWeworkUI", "NetSceneUpgradeAssociateChatRoom %s", ((C47054z) yVar2).f126462g);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ManagerRoomByWeworkUI", "NetSceneUpgradeAssociateChatRoom Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
            int i4 = this.f108102o + 1;
            this.f108102o = i4;
            if (i4 == this.f108103p && (i0Var = this.f108105r) != null && i0Var.isShowing()) {
                this.f108105r.dismiss();
            }
        }
        if (i == 0 && i2 == 0) {
            if (yVar2 instanceof C47045p) {
                C48911bv1 bv12 = ((C47045p) yVar2).f126422f;
                if (bv12 == null) {
                    bv12 = null;
                }
                if (bv12 != null) {
                    Class cls2 = C76979h.class;
                    super.initView();
                    this.f108106s = (Button) findViewById(C0966R.C0970id.l1j);
                    this.f108107t = (Button) findViewById(C0966R.C0970id.j_1);
                    this.f108108u = (TextView) findViewById(C0966R.C0970id.b1i);
                    this.f108109v = (CdnImageView) findViewById(C0966R.C0970id.b0v);
                    this.f108110w = (TextView) findViewById(C0966R.C0970id.b1c);
                    this.f108111x = (TextView) findViewById(C0966R.C0970id.bsj);
                    this.f108112y = (LinearLayout) findViewById(C0966R.C0970id.bs4);
                    this.f108113z = (LinearLayout) findViewById(C0966R.C0970id.erb);
                    this.f108086A = (LinearLayout) findViewById(C0966R.C0970id.f357650b10);
                    this.f108087B = (RecyclerView) findViewById(C0966R.C0970id.f6159yz);
                    this.f108088C = (LinearLayout) findViewById(C0966R.C0970id.j_3);
                    TextView textView = (TextView) findViewById(C0966R.C0970id.j_4);
                    this.f108089D = (ImageView) findViewById(C0966R.C0970id.j_2);
                    View findViewById = findViewById(C0966R.C0970id.br5);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f108106s.setOnClickListener(new C40258d1(this));
                    int i5 = this.f108095e;
                    if (i5 == 1 || i5 == 2) {
                        this.f108086A.setVisibility(0);
                        this.f108113z.setVisibility(8);
                        m43243I7(this.f108094d, this.f108109v);
                        String str2 = this.f108094d;
                        TextView textView2 = this.f108110w;
                        Class cls3 = C53193b.class;
                        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str2);
                        textView2.setText(((C76979h) C86312j.m106911c(cls2)).D60(this, ((C76979h) C86312j.m106911c(cls2)).op0(this, Util.isNullOrNil(z1Var.getNickname()) ? ((C53193b) C86312j.m106911c(cls3)).mo73729p1(z1Var.getUsername()) == 0 ? getString(C0966R.string.gp9) : getString(C0966R.string.eyf, new Object[]{getString(C0966R.string.gp9), Integer.valueOf(((C53193b) C86312j.m106911c(cls3)).mo73729p1(z1Var.getUsername()))}) : getString(C0966R.string.eyf, new Object[]{z1Var.mo62909j3(), Integer.valueOf(((C53193b) C86312j.m106911c(cls3)).mo73729p1(z1Var.getUsername()))}), C76577a.m92157h(this, C0966R.dimen.f3628l)), C0966R.raw.open_im_title_logo));
                    } else if (i5 == 3) {
                        this.f108086A.setVisibility(8);
                        this.f108113z.setVisibility(0);
                        C1214e1 e1Var = new C1214e1(this);
                        this.f108088C.setOnClickListener(e1Var);
                        this.f108107t.setOnClickListener(e1Var);
                        Class cls4 = C39479c.class;
                        ArrayList arrayList = (ArrayList) C45628s0.m50778i();
                        if (arrayList.size() != 0) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                C72996z1 z1Var2 = (C72996z1) it.next();
                                if (C45628s0.m50737B(z1Var2.getUsername())) {
                                    C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(cls4)).mo62084mr()).mo69799Lo(z1Var2.getUsername());
                                    if (Lo == null) {
                                        Log.m105921e("MicroMsg.ManagerRoomByWeworkUI", "initContactList %s member is null", z1Var2.getUsername());
                                    } else if (Lo.field_memberCount < C45612m0.m50699p() && Util.isEqual(Lo.field_roomowner, C75592q0.m90789s())) {
                                        ((ArrayList) this.f108098h).add(z1Var2);
                                        ((ArrayList) this.f108099i).add(z1Var2.getUsername());
                                        ((ArrayList) this.f108097g).add(z1Var2.getUsername());
                                    }
                                }
                            }
                            int size = ((ArrayList) this.f108098h).size();
                            this.f108092G = size;
                            if (size == 0) {
                                List<String> c = C99251g.m129282c();
                                HashSet hashSet = new HashSet(((C44662n1) ((C39479c) C86709a0.m107533q(cls4)).mo62084mr()).mo69808kD(C45612m0.m50699p()));
                                LinkedList linkedList = new LinkedList();
                                for (String next : c) {
                                    if (linkedList.size() >= 5) {
                                        break;
                                    } else if (hashSet.contains(next) && !C45628s0.m50735A(next)) {
                                        linkedList.add(next);
                                    }
                                }
                                Iterator it4 = ((ArrayList) C0289a.f857a.mo338c(linkedList)).iterator();
                                while (it4.hasNext()) {
                                    C72996z1 z1Var3 = (C72996z1) it4.next();
                                    ((ArrayList) this.f108098h).add(z1Var3);
                                    ((ArrayList) this.f108099i).add(z1Var3.getUsername());
                                    ((ArrayList) this.f108097g).add(z1Var3.getUsername());
                                }
                                this.f108092G = ((ArrayList) this.f108098h).size();
                            }
                            this.f108104q = ((ArrayList) ((C44662n1) ((C39479c) C86709a0.m107533q(cls4)).mo62084mr()).mo69808kD(C45612m0.m50699p())).size() - this.f108092G;
                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
                            this.f108090E = linearLayoutManager;
                            linearLayoutManager.mo16974W(1);
                            this.f108087B.setLayoutManager(this.f108090E);
                            this.f108087B.mo17085h0(new C1180d(getContext(), 0.5f, 96.0f));
                            C40205c cVar = new C40205c(getContext(), this.f108098h, this.f108100j, this.f108097g, new C40261f1(this));
                            this.f108091F = cVar;
                            this.f108087B.setAdapter(cVar);
                            this.f108087B.setNestedScrollingEnabled(false);
                            this.f108091F.notifyDataSetChanged();
                            if (((ArrayList) this.f108098h).size() != 0) {
                                z = true;
                                if (!z && !mo62747O7()) {
                                    View findViewById2 = findViewById(C0966R.C0970id.cjf);
                                    C9556a aVar2 = new C9556a();
                                    aVar2.mo10233c(0);
                                    View view2 = findViewById2;
                                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                    C117292a.m165359e(view2, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    View findViewById3 = findViewById(C0966R.C0970id.l1j);
                                    C9556a aVar3 = new C9556a();
                                    aVar3.mo10233c(8);
                                    View view3 = findViewById3;
                                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                    C117292a.m165359e(view3, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    this.f108113z.setVisibility(8);
                                }
                            }
                        }
                        z = false;
                        View findViewById22 = findViewById(C0966R.C0970id.cjf);
                        C9556a aVar22 = new C9556a();
                        aVar22.mo10233c(0);
                        View view22 = findViewById22;
                        C117292a.m165358d(view22, aVar22.mo10232b(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById22.setVisibility(((Integer) aVar22.mo10231a(0)).intValue());
                        C117292a.m165359e(view22, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View findViewById32 = findViewById(C0966R.C0970id.l1j);
                        C9556a aVar32 = new C9556a();
                        aVar32.mo10233c(8);
                        View view32 = findViewById32;
                        C117292a.m165358d(view32, aVar32.mo10232b(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById32.setVisibility(((Integer) aVar32.mo10231a(0)).intValue());
                        C117292a.m165359e(view32, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "initView", "(Lcom/tencent/mm/protocal/protobuf/GetAssociateChatRoomManageInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f108113z.setVisibility(8);
                    }
                    mo62746N7();
                    this.f108108u.setText(bv12.f131328g);
                    this.f108111x.setText(((C76979h) C86312j.m106911c(cls2)).mo107050Jo(getContext(), Util.nullAsNil(bv12.f131325d), (int) this.f108111x.getTextSize(), 1, (Object) null));
                    LinkedList<String> linkedList2 = bv12.f131326e;
                    if (linkedList2 != null && linkedList2.size() > 0) {
                        this.f108112y.removeAllViews();
                        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
                        Iterator<String> it5 = bv12.f131326e.iterator();
                        int i6 = 0;
                        while (it5.hasNext()) {
                            View inflate = layoutInflater.inflate(C0966R.C0971layout.f6816pb, this.f108112y, false);
                            i6++;
                            ((TextView) inflate.findViewById(C0966R.C0970id.how)).setText(i6 + ".");
                            ((TextView) inflate.findViewById(C0966R.C0970id.c2h)).setText(it5.next());
                            this.f108112y.addView(inflate);
                        }
                    }
                    NestedScrollView nestedScrollView = (NestedScrollView) findViewById(C0966R.C0970id.iwq);
                    View findViewById4 = findViewById(C0966R.C0970id.br5);
                    View findViewById5 = findViewById(C0966R.C0970id.l0h);
                    View findViewById6 = findViewById(C0966R.C0970id.f357558ah2);
                    if (nestedScrollView != null) {
                        nestedScrollView.post(new C45058g1(findViewById4, findViewById6, this, 48, findViewById5, 0.0f, nestedScrollView, false));
                        return;
                    }
                    return;
                }
                C76912y0.makeText((Context) getContext(), (CharSequence) Util.isNullOrNil(str) ? getString(C0966R.string.k8i) : str, 0).show();
                finish();
                return;
            } else if (yVar2 instanceof C47054z) {
                C47054z zVar = (C47054z) yVar2;
                pm4 pm4 = zVar.f126461f;
                if (pm4 == null) {
                    pm4 = null;
                }
                int i7 = this.f108095e;
                if (i7 == 3) {
                    if (pm4 != null) {
                        this.f108101n.put(zVar.f126462g, Boolean.TRUE);
                    } else {
                        this.f108101n.put(zVar.f126462g, Boolean.FALSE);
                    }
                } else if (pm4 != null) {
                    m43242H7(this.f108094d, i7, 1, 0);
                    Intent intent = new Intent();
                    intent.setClass(this, cls);
                    intent.putExtra("RoomInfo_Id", this.f108094d);
                    intent.putExtra("popup_wording", Util.nullAs(pm4.f139837d, ""));
                    intent.putExtra("upgrade_openim_room_from_scene", this.f108095e);
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(intent);
                    C117292a.m165358d(this, aVar4.mo10232b(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar4.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    finish();
                    super.overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
                    return;
                } else {
                    C76912y0.makeText((Context) getContext(), (CharSequence) Util.isNullOrNil(str) ? getString(C0966R.string.k8i) : str, 0).show();
                    m43242H7(this.f108094d, this.f108095e, 2, 4);
                    finish();
                    return;
                }
            }
        } else if (yVar2 instanceof C47045p) {
            C76912y0.makeText((Context) getContext(), (CharSequence) Util.isNullOrNil(str) ? getString(C0966R.string.k8i) : str, 0).show();
            finish();
            return;
        } else if (yVar2 instanceof C47054z) {
            int i8 = this.f108095e;
            if (i8 == 3) {
                this.f108101n.put(((C47054z) yVar2).f126462g, Boolean.FALSE);
            } else {
                m43242H7(this.f108094d, i8, 2, 4);
                C76912y0.makeText((Context) getContext(), (CharSequence) Util.isNullOrNil(str) ? getString(C0966R.string.k8i) : str, 0).show();
                return;
            }
        }
        if (this.f108095e == 3 && (yVar2 instanceof C47054z) && this.f108102o == this.f108103p) {
            Log.m105924i("MicroMsg.ManagerRoomByWeworkUI", "NetSceneUpgradeAssociateChatRoom finish");
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry next2 : this.f108101n.entrySet()) {
                if (((Boolean) next2.getValue()).booleanValue()) {
                    arrayList2.add((String) next2.getKey());
                } else {
                    arrayList3.add((String) next2.getKey());
                }
            }
            Intent intent2 = new Intent();
            intent2.setClass(this, cls);
            intent2.putExtra("upgrade_openim_room_from_scene", this.f108095e);
            intent2.putExtra("wework_upgrade_success_list", arrayList2);
            intent2.putExtra("wework_upgrade_fail_list", arrayList3);
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(intent2);
            C117292a.m165358d(this, aVar5.mo10232b(), "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar5.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            super.overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
            StringBuilder sb = new StringBuilder();
            Iterator it6 = arrayList2.iterator();
            int i9 = 0;
            while (it6.hasNext()) {
                String str3 = (String) it6.next();
                if (((ArrayList) this.f108097g).contains(str3)) {
                    i3++;
                } else {
                    i9++;
                }
                sb.append(str3);
                sb.append("|");
            }
            if (sb.length() - 1 >= 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            GroupUpgradeResultStruct groupUpgradeResultStruct = new GroupUpgradeResultStruct();
            groupUpgradeResultStruct.f107951d = (long) i3;
            C40205c cVar2 = this.f108091F;
            long j = 0;
            groupUpgradeResultStruct.f107952e = cVar2 == null ? 0 : (long) (cVar2.f108123j - i3);
            groupUpgradeResultStruct.f107953f = (long) i9;
            if (cVar2 != null) {
                j = (long) (cVar2.f108124n - i9);
            }
            groupUpgradeResultStruct.f107954g = j;
            groupUpgradeResultStruct.f107955h = groupUpgradeResultStruct.mo86045b("sucRoomList", sb.toString(), true);
            groupUpgradeResultStruct.f107956i = groupUpgradeResultStruct.mo86045b("ticketId", Util.nullAs(this.f108096f, ""), true);
            groupUpgradeResultStruct.mo86054n();
        }
    }
}
