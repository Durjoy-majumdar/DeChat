package p171il;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.manager.SmileyPanelManager;
import com.tencent.p014mm.view.manager.SmileyPanelManager$$e;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import k60.C99101e;
import ke3.C88144b;
import l60.C99342a;
import l60.C99344b;
import n60.C100075f;
import oa1.C117731d;
import p207nl.C11216n;
import p260wk.C102453a;
import p260wk.C102456d;
import p585kl.C76596h;
import p813fl.C97906h;
import p813fl.C97923p;
import p813fl.C97928r;
import p813fl.C97934u0;
import p813fl.C97942y;
import p813fl.C97944z;
import z51.C39315g;

/* renamed from: il.h0 */
public final class C98720h0 extends RecyclerView.C16613e<C98722b> {

    /* renamed from: d */
    public final C97906h f289473d;

    /* renamed from: e */
    public final ArrayList<C97934u0> f289474e = new ArrayList<>();

    /* renamed from: f */
    public C98721a f289475f;

    /* renamed from: g */
    public int f289476g = -1;

    /* renamed from: h */
    public String f289477h;

    /* renamed from: il.h0$a */
    public interface C98721a {
    }

    /* renamed from: il.h0$b */
    public final class C98722b extends RecyclerView.C16631z implements View.OnClickListener {

        /* renamed from: A */
        public ImageView f289478A;

        /* renamed from: B */
        public final /* synthetic */ C98720h0 f289479B;

        /* renamed from: z */
        public ImageView f289480z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98722b(C98720h0 h0Var, View view) {
            super(view);
            C87412m.m108594g(view, "view");
            this.f289479B = h0Var;
            View findViewById = view.findViewById(C0966R.C0970id.jnm);
            C87412m.m108593f(findViewById, "view.findViewById(R.id.smiley_listview_item_view)");
            this.f289480z = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.jnl);
            C87412m.m108593f(findViewById2, "view.findViewById(R.id.smiley_listview_item_dot)");
            this.f289478A = (ImageView) findViewById2;
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            View view2 = view;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/emoji/panel/adapter/SmileyTabAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view2, "v");
            C98721a aVar = this.f289479B.f289475f;
            if (aVar != null) {
                SmileyPanelManager$$e smileyPanelManager$$e = (SmileyPanelManager$$e) aVar;
                C97934u0 F4 = smileyPanelManager$$e.f285744a.f285724o.mo138115F4(mo17363j());
                if (F4 == null) {
                    Log.m105928w("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "tab is null. ignore click action.");
                } else {
                    C97923p pVar = F4.f287264a;
                    int i = pVar.f287250a;
                    if (i == 2) {
                        SmileyPanelManager smileyPanelManager = smileyPanelManager$$e.f285744a;
                        Context context = view.getContext();
                        smileyPanelManager.getClass();
                        C88144b.m109791i(context, "emoji", ".ui.EmojiMineUI", new Intent(), (Bundle) null);
                    } else if (i == 3) {
                        if (!(Util.getInt(C117731d.m166007c().mo182444f("clicfg_emoji_search_switch", "1", false, true), 1) > 0) || !MMApplicationContext.isMainProcess()) {
                            SmileyPanelManager smileyPanelManager2 = smileyPanelManager$$e.f285744a;
                            Context context2 = view.getContext();
                            smileyPanelManager2.getClass();
                            Intent intent = new Intent();
                            intent.putExtra("preceding_scence", 13);
                            intent.putExtra("download_entrance_scene", 17);
                            intent.putExtra("check_clickflag", false);
                            if (!Util.isNullOrNil(smileyPanelManager2.f285728s)) {
                                intent.putExtra("to_talker_name", smileyPanelManager2.f285728s);
                            }
                            C88144b.m109791i(context2, "emoji", ".ui.v2.EmojiStoreV2UI", intent, (Bundle) null);
                            C115669n nVar = C115669n.INSTANCE;
                            nVar.mo160131h(11594, 2);
                            nVar.mo160131h(12065, 8);
                        } else {
                            smileyPanelManager$$e.f285744a.mo136458j(view.getContext(), (Runnable) null);
                        }
                    } else {
                        C115669n.INSTANCE.mo160131h(18231, Long.valueOf(C76596h.f224194a), Integer.valueOf(C76596h.f224195b), Integer.valueOf(C76596h.f224196c), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(F4.f287265b + 1), pVar.mo137249c());
                        C76596h.f224196c++;
                        smileyPanelManager$$e.f285744a.mo136457i(F4.f287265b);
                        RecyclerView recyclerView = smileyPanelManager$$e.f285744a.f285715f;
                        int i2 = F4.f287265b;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(Integer.valueOf(i2));
                        RecyclerView recyclerView2 = recyclerView;
                        C117292a.m165358d(recyclerView2, aVar2.mo10232b(), "com/tencent/mm/view/manager/SmileyPanelManager$10", "onItemClick", "(ILandroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
                        recyclerView.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(recyclerView2, "com/tencent/mm/view/manager/SmileyPanelManager$10", "onItemClick", "(ILandroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
                        if (F4.f287264a.mo137249c().equals("capture") && smileyPanelManager$$e.f285744a.f285725p.f287210g) {
                            if (C86709a0.m107531m().mo58407a().mo71804b()) {
                                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_CAPTURE_TAB_RED_DOT_BOOLEAN, Boolean.TRUE);
                            }
                            View findViewById = view2.findViewById(C0966R.C0970id.jnl);
                            if (findViewById != null) {
                                C9556a aVar3 = new C9556a();
                                aVar3.mo10233c(8);
                                View view3 = findViewById;
                                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/view/manager/SmileyPanelManager$10", "onItemClick", "(ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(view3, "com/tencent/mm/view/manager/SmileyPanelManager$10", "onItemClick", "(ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        }
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/emoji/panel/adapter/SmileyTabAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C98720h0(C97906h hVar) {
        C87412m.m108594g(hVar, "config");
        this.f289473d = hVar;
    }

    /* renamed from: F4 */
    public final C97934u0 mo138115F4(int i) {
        if (this.f289474e.isEmpty() || this.f289474e.size() < i || i < 0) {
            return null;
        }
        return this.f289474e.get(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        r4 = r4.f287264a;
     */
    /* renamed from: G4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo138116G4(int r4) {
        /*
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "MicroMsg.emoji.SmileyPanel.SmileyTabAdapter"
            java.lang.String r2 = "setSelection: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            int r0 = r3.f289476g
            if (r0 == r4) goto L_0x0032
            r3.notifyItemChanged(r0)
            r3.f289476g = r4
            fl.u0 r4 = r3.mo138115F4(r4)
            if (r4 == 0) goto L_0x002a
            fl.p r4 = r4.f287264a
            if (r4 == 0) goto L_0x002a
            java.lang.String r4 = r4.mo137249c()
            goto L_0x002b
        L_0x002a:
            r4 = 0
        L_0x002b:
            r3.f289477h = r4
            int r4 = r3.f289476g
            r3.notifyItemChanged(r4)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p171il.C98720h0.mo138116G4(int):void");
    }

    public int getItemCount() {
        return this.f289474e.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        C97934u0 F4 = mo138115F4(i);
        C87412m.m108591d(F4);
        return F4.f287264a.f287250a;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C98722b bVar = (C98722b) zVar;
        C87412m.m108594g(bVar, "viewHolder");
        Context context = bVar.f44854d.getContext();
        Resources resources = context.getResources();
        TypedValue typedValue = new TypedValue();
        boolean z = true;
        context.getTheme().resolveAttribute(C0966R.attr.f2809l7, typedValue, true);
        int color = resources.getColor(typedValue.resourceId);
        bVar.f44854d.setSelected(this.f289476g == i);
        C97934u0 F4 = mo138115F4(i);
        if (F4 == null) {
            bVar.f289480z.setVisibility(8);
            bVar.f289480z.setTag("");
            Log.m105925i("MicroMsg.emoji.SmileyPanel.SmileyTabAdapter", "emoji group info is null. position:%d", Integer.valueOf(i));
            return;
        }
        bVar.f289480z.setVisibility(0);
        bVar.f289478A.setVisibility(8);
        int i2 = F4.f287264a.f287250a;
        if (i2 == 2) {
            C11216n.m11073a(bVar.f289480z, C0966R.raw.emoticonstore_manager_icon, color);
            bVar.f289480z.setContentDescription(context.getString(C0966R.string.irm));
        } else if (i2 == 3) {
            if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_emoji_search_switch", "1", false, true), 1) <= 0) {
                z = false;
            }
            if (!z || !MMApplicationContext.isMainProcess()) {
                C11216n.m11073a(bVar.f289480z, C0966R.raw.emoticonstore_add_icon, color);
            } else {
                C11216n.m11073a(bVar.f289480z, C0966R.raw.icons_outlined_search, color);
            }
            bVar.f289480z.setContentDescription(context.getString(C0966R.string.cad));
            if (WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG) {
                bVar.f44854d.setOnLongClickListener(C8928i0.f28234d);
            }
        } else {
            C97934u0 F42 = mo138115F4(i);
            if (F42 != null) {
                C97923p pVar = F42.f287264a;
                SparseArray<C97942y> sparseArray = C97944z.f287281a;
                String c = pVar.mo137249c();
                C87412m.m108594g(c, "groupId");
                if (C97944z.f287282b.get(c) != null) {
                    return;
                }
                if (C87412m.m108589b("smiley", pVar.mo137249c())) {
                    C11216n.m11073a(bVar.f289480z, C0966R.raw.emoticonstore_emoji_icon, color);
                    bVar.f289480z.setContentDescription(context.getString(C0966R.string.c4n));
                } else if (C87412m.m108589b("custom", pVar.mo137249c())) {
                    C11216n.m11073a(bVar.f289480z, C0966R.raw.emoticonstore_custom_icon, color);
                    bVar.f289480z.setContentDescription(context.getString(C0966R.string.cac));
                } else if (C87412m.m108589b("17", pVar.mo137249c())) {
                    bVar.f289480z.setImageResource(C0966R.C0969drawable.bfl);
                    bVar.f289480z.setContentDescription(context.getString(C0966R.string.c_9));
                } else if (C87412m.m108589b("capture", pVar.mo137249c())) {
                    C11216n.m11073a(bVar.f289480z, C0966R.raw.emoticonstore_capture_icon, color);
                    bVar.f289480z.setContentDescription(context.getString(C0966R.string.cab));
                    if (((C39315g) C86312j.m106911c(C39315g.class)).getProvider().mo138035t()) {
                        int i3 = this.f289473d.f287204a;
                        int i4 = ChatFooterPanel.f211589f;
                        if (i3 == 1) {
                            bVar.f289478A.setVisibility(0);
                        }
                    }
                } else {
                    if (pVar instanceof C97928r) {
                        ((C99342a) C102456d.f301711a.mo85955a(new C102453a(((C97928r) pVar).f287256b))).mo85954d(bVar.f289480z);
                    } else {
                        C99344b<String, Bitmap> e = C99101e.f290571b.mo85955a(pVar.mo137250d());
                        C100075f.C100076a aVar = new C100075f.C100076a();
                        aVar.f293176b = true;
                        e.f291319c = aVar.mo139398a();
                        ((C99342a) e).mo85954d(bVar.f289480z);
                    }
                    String e2 = pVar.mo137251e();
                    if (Util.isNullOrNil(e2)) {
                        bVar.f289480z.setContentDescription(context.getString(C0966R.string.c_3));
                        return;
                    }
                    ImageView imageView = bVar.f289480z;
                    imageView.setContentDescription(context.getString(C0966R.string.c7t) + e2);
                }
            }
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c0d, viewGroup, false);
        C87412m.m108593f(inflate, "from(parent.context).inf…view_item, parent, false)");
        return new C98722b(this, inflate);
    }
}
