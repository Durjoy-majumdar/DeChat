package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.search.FinderContactSearchIncludeFollowUI;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C58684b;
import er1.C58775t;
import er1.C58784w3;
import f40.C86709a0;
import fe1.C58960c;
import fe1.C58969q;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp1.C8703w0;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;
import je1.C9319i3;
import kj2.C117407d;
import kotlin.Metadata;
import lp3.C88643g;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import p629ny.C76979h;
import pe3.C47465a;
import pe3.C89349b;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C49026cn0;
import te3.C49169dn0;
import te3.C64589nq2;
import up1.C27696y;
import vp1.C14930g;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderPostAtUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lob0/n;", "<init>", "()V", "a", "b", "c", "d", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderPostAtUI */
public final class FinderPostAtUI extends MMFinderUI implements C11385n {

    /* renamed from: w */
    public static final /* synthetic */ int f17001w = 0;

    /* renamed from: o */
    public ArrayList<C58969q> f17002o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<C58969q> f17003p = new ArrayList<>();

    /* renamed from: q */
    public final C14930g f17004q = new C14930g("followList.fp");

    /* renamed from: r */
    public C89349b f17005r;

    /* renamed from: s */
    public boolean f17006s = true;

    /* renamed from: t */
    public int f17007t;

    /* renamed from: u */
    public RefreshLoadMoreLayout f17008u;

    /* renamed from: v */
    public RecyclerView f17009v;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderPostAtUI$a */
    public final class C3702a extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f17010A;

        /* renamed from: B */
        public ImageView f17011B;

        /* renamed from: C */
        public TextView f17012C;

        /* renamed from: z */
        public ImageView f17013z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3702a(FinderPostAtUI finderPostAtUI, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.a27);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.avatar_iv)");
            this.f17013z = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.hg4);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.nickname_tv)");
            this.f17010A = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.a0g);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.auth_icon)");
            this.f17011B = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.a0k);
            C87412m.m108593f(findViewById4, "itemView.findViewById(R.id.auth_job)");
            this.f17012C = (TextView) findViewById4;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderPostAtUI$b */
    public final class C3703b extends RecyclerView.C16631z {

        /* renamed from: z */
        public TextView f17014z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3703b(FinderPostAtUI finderPostAtUI, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.kpm);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.title_tv)");
            this.f17014z = (TextView) findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderPostAtUI$c */
    public final class C3704c extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3704c(FinderPostAtUI finderPostAtUI, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderPostAtUI$d */
    public final class C3705d extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public boolean f17015d = true;

        /* renamed from: com.tencent.mm.plugin.finder.ui.FinderPostAtUI$d$a */
        public static final class C3706a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ RecyclerView.C16631z f17017d;

            /* renamed from: e */
            public final /* synthetic */ FinderPostAtUI f17018e;

            /* renamed from: f */
            public final /* synthetic */ C3705d f17019f;

            /* renamed from: g */
            public final /* synthetic */ int f17020g;

            public C3706a(RecyclerView.C16631z zVar, FinderPostAtUI finderPostAtUI, C3705d dVar, int i) {
                this.f17017d = zVar;
                this.f17018e = finderPostAtUI;
                this.f17019f = dVar;
                this.f17020g = i;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderPostAtUI$SelectAtContactAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C58775t tVar = C58775t.f168276a;
                Object tag = this.f17017d.f44854d.getTag();
                C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.api.LocalFinderContact");
                C58969q qVar = (C58969q) tag;
                C64589nq2 nq22 = new C64589nq2();
                nq22.f184530d = qVar.getUsername();
                nq22.f184532f = qVar.getNickname();
                nq22.f184531e = qVar.getAvatarUrl();
                nq22.f184533g = qVar.field_authInfo;
                this.f17018e.getIntent().putExtra("key_select_contact", nq22.toByteArray());
                if (this.f17019f.getItemViewType(this.f17020g) == 5) {
                    this.f17018e.getIntent().putExtra("key_source", 2);
                } else {
                    this.f17018e.getIntent().putExtra("key_source", 1);
                }
                FinderPostAtUI finderPostAtUI = this.f17018e;
                finderPostAtUI.setResult(-1, finderPostAtUI.getIntent());
                this.f17018e.finish();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$SelectAtContactAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.ui.FinderPostAtUI$d$b */
        public static final class C3707b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ FinderPostAtUI f17021d;

            /* renamed from: e */
            public final /* synthetic */ C3705d f17022e;

            public C3707b(FinderPostAtUI finderPostAtUI, C3705d dVar) {
                this.f17021d = finderPostAtUI;
                this.f17022e = dVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderPostAtUI$SelectAtContactAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f17021d.getIntent().putExtra("from_at_contact", true);
                this.f17021d.getIntent().putExtra("request_type", 6);
                this.f17021d.getIntent().putExtra("need_history", false);
                FinderPostAtUI finderPostAtUI = this.f17021d;
                Intent intent = finderPostAtUI.getIntent();
                ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
                C87412m.m108594g(finderPostAtUI, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C87412m.m108594g(intent, "i");
                C8703w0.f27929c = null;
                C117407d.INSTANCE.idkeyStat(1265, 2, 1, false);
                intent.setClass(finderPostAtUI, FinderContactSearchIncludeFollowUI.class);
                finderPostAtUI.startActivityForResult(intent, 20000);
                C3705d dVar = this.f17022e;
                dVar.f17015d = false;
                dVar.notifyItemRemoved(0);
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$SelectAtContactAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C3705d() {
        }

        public int getItemCount() {
            int i = 0;
            int size = (this.f17015d ? 1 : 0) + (FinderPostAtUI.this.f17003p.size() == 0 ? 0 : FinderPostAtUI.this.f17003p.size() + 1);
            if (FinderPostAtUI.this.f17002o.size() != 0) {
                i = FinderPostAtUI.this.f17002o.size() + 1;
            }
            return size + i;
        }

        public int getItemViewType(int i) {
            if (!this.f17015d) {
                i++;
            }
            if (i == 0) {
                return 1;
            }
            if (FinderPostAtUI.this.f17003p.size() <= 0) {
                return i == 1 ? 4 : 5;
            }
            if (i == 1) {
                return 2;
            }
            if (i == FinderPostAtUI.this.f17003p.size() + 2) {
                return 4;
            }
            return i > FinderPostAtUI.this.f17003p.size() + 2 ? 5 : 3;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C58969q qVar;
            String str;
            RecyclerView.C16631z zVar2 = zVar;
            int i2 = i;
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            C87412m.m108594g(zVar2, "viewHolder");
            if (zVar2 instanceof C3702a) {
                int i3 = this.f17015d ? 2 : 1;
                if (FinderPostAtUI.this.f17003p.size() == 0) {
                    qVar = FinderPostAtUI.this.f17002o.get(i2 - i3);
                } else if (i2 < FinderPostAtUI.this.f17003p.size() + i3) {
                    qVar = FinderPostAtUI.this.f17003p.get(i2 - i3);
                } else {
                    FinderPostAtUI finderPostAtUI = FinderPostAtUI.this;
                    qVar = finderPostAtUI.f17002o.get(((i2 - finderPostAtUI.f17003p.size()) - i3) - 1);
                }
                C87412m.m108593f(qVar, "if (recentAtContactList.…      }\n                }");
                C3702a aVar = (C3702a) zVar2;
                ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(new C62345f(qVar.getAvatarUrl(), (C27696y) null, 2, (C8480h) null), aVar.f17013z, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
                aVar.f17010A.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(FinderPostAtUI.this.getContext(), qVar.getNickname()));
                FinderAuthInfo finderAuthInfo = qVar.field_authInfo;
                int i4 = finderAuthInfo != null ? finderAuthInfo.authIconType : 0;
                aVar.f17012C.setVisibility(8);
                C58784w3.m68429F1(C58784w3.f168295a, aVar.f17011B, qVar.field_authInfo, 0, C58960c.m68830b(qVar, false), 4, (Object) null);
                if (i4 <= 0) {
                    aVar.f17012C.setVisibility(8);
                } else if (i4 == 1) {
                    aVar.f17012C.setVisibility(0);
                    TextView textView = aVar.f17012C;
                    FinderAuthInfo finderAuthInfo2 = qVar.field_authInfo;
                    if (finderAuthInfo2 == null || (str = finderAuthInfo2.authProfession) == null) {
                        str = "";
                    }
                    textView.setText(str);
                } else if (i4 == 100) {
                    aVar.f17012C.setVisibility(8);
                }
                zVar2.f44854d.setTag(qVar);
                zVar2.f44854d.setOnClickListener(new C3706a(zVar2, FinderPostAtUI.this, this, i2));
            } else if (zVar2 instanceof C3704c) {
                zVar2.f44854d.setOnClickListener(new C3707b(FinderPostAtUI.this, this));
            } else if (!(zVar2 instanceof C3703b)) {
            } else {
                if (getItemViewType(i2) == 2) {
                    ((C3703b) zVar2).f17014z.setText(FinderPostAtUI.this.getString(C0966R.string.ehy));
                } else {
                    ((C3703b) zVar2).f17014z.setText(FinderPostAtUI.this.getString(C0966R.string.ehx));
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            if (i == 1) {
                FinderPostAtUI finderPostAtUI = FinderPostAtUI.this;
                AppCompatActivity context = finderPostAtUI.getContext();
                C87412m.m108591d(context);
                View inflate = context.getLayoutInflater().inflate(C0966R.C0971layout.f6247l, viewGroup, false);
                C87412m.m108593f(inflate, "context!!.layoutInflater…arch_item, parent, false)");
                return new C3704c(finderPostAtUI, inflate);
            } else if (i == 2) {
                FinderPostAtUI finderPostAtUI2 = FinderPostAtUI.this;
                AppCompatActivity context2 = finderPostAtUI2.getContext();
                C87412m.m108591d(context2);
                View inflate2 = context2.getLayoutInflater().inflate(C0966R.C0971layout.and, viewGroup, false);
                C87412m.m108593f(inflate2, "context!!.layoutInflater…ader_item, parent, false)");
                return new C3703b(finderPostAtUI2, inflate2);
            } else if (i != 4) {
                FinderPostAtUI finderPostAtUI3 = FinderPostAtUI.this;
                AppCompatActivity context3 = finderPostAtUI3.getContext();
                C87412m.m108591d(context3);
                View inflate3 = context3.getLayoutInflater().inflate(C0966R.C0971layout.a9t, viewGroup, false);
                C87412m.m108593f(inflate3, "context!!.layoutInflater…list_item, parent, false)");
                return new C3702a(finderPostAtUI3, inflate3);
            } else {
                FinderPostAtUI finderPostAtUI4 = FinderPostAtUI.this;
                AppCompatActivity context4 = finderPostAtUI4.getContext();
                C87412m.m108591d(context4);
                View inflate4 = context4.getLayoutInflater().inflate(C0966R.C0971layout.and, viewGroup, false);
                C87412m.m108593f(inflate4, "context!!.layoutInflater…ader_item, parent, false)");
                return new C3703b(finderPostAtUI4, inflate4);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderPostAtUI$e */
    public static final class C3708e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderPostAtUI f17023d;

        public C3708e(FinderPostAtUI finderPostAtUI) {
            this.f17023d = finderPostAtUI;
        }

        public final void run() {
            RecyclerView recyclerView = this.f17023d.f17009v;
            if (recyclerView != null) {
                RecyclerView.C16613e adapter = recyclerView.getAdapter();
                C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderPostAtUI.SelectAtContactAdapter");
                ((C3705d) adapter).notifyDataSetChanged();
                return;
            }
            C87412m.m108603p("recyclerView");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderPostAtUI$f */
    public static final class C3709f extends C87413o implements C32226l<Void, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderPostAtUI f17024d;

        /* renamed from: e */
        public final /* synthetic */ C117747y f17025e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3709f(FinderPostAtUI finderPostAtUI, C117747y yVar) {
            super(1);
            this.f17024d = finderPostAtUI;
            this.f17025e = yVar;
        }

        public Object invoke(Object obj) {
            Void voidR = (Void) obj;
            this.f17024d.f17004q.mo73081a();
            this.f17024d.f17004q.mo73083c(((C9319i3) this.f17025e).mo10070l1());
            return C13598b0.f38549a;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ane;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 20000 && intent != null && i2 == -1) {
            getIntent().putExtra("key_select_contact", intent.getByteArrayExtra("at_select_contact"));
            getIntent().putExtra("key_source", intent.getBooleanExtra("is_follow", false) ? 3 : 4);
            setResult(-1, getIntent());
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(713, this);
        this.f17007t = getIntent().getIntExtra("KEY_ENTER_SCENE", 0);
        LinkedList<C64589nq2> a = C58775t.f168276a.mo83820a();
        if (a != null) {
            Collections.sort(a, C3782d2.f17257d);
            Iterator<C64589nq2> it = a.iterator();
            while (it.hasNext()) {
                C64589nq2 next = it.next();
                C58775t tVar = C58775t.f168276a;
                C87412m.m108593f(next, "contact");
                C58969q qVar = new C58969q();
                qVar.field_username = next.f184530d;
                qVar.field_nickname = next.f184532f;
                String str = next.f184531e;
                if (str == null) {
                    str = "";
                }
                qVar.field_avatarUrl = str;
                qVar.field_authInfo = next.f184533g;
                this.f17003p.add(qVar);
            }
        }
        Pattern pattern = C61926c.f176038a;
        C61926c.m72665J(C61926c.m72701z(C88643g.m110546d(), new C3787e2(this)), new C3794f2(this));
        C86709a0.m107524d().mo123460f(new C9319i3(this.f17005r));
        setResult(0, getIntent());
        if (this.f17007t == 1) {
            setMMTitle(getResources().getString(C0966R.string.f360740ei0));
        } else {
            setMMTitle(getResources().getString(C0966R.string.ehz));
        }
        setBackBtn(new C3773b2(this));
        View findViewById = getContext().findViewById(C0966R.C0970id.ivb);
        C87412m.m108593f(findViewById, "context.findViewById(R.id.rl_layout)");
        RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) findViewById;
        this.f17008u = refreshLoadMoreLayout;
        this.f17009v = refreshLoadMoreLayout.getRecyclerView();
        FinderLinearLayoutManager finderLinearLayoutManager = new FinderLinearLayoutManager(this);
        RecyclerView recyclerView = this.f17009v;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(finderLinearLayoutManager);
            RecyclerView recyclerView2 = this.f17009v;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(new C3705d());
                RecyclerView recyclerView3 = this.f17009v;
                if (recyclerView3 != null) {
                    recyclerView3.setHasFixedSize(true);
                    RecyclerView recyclerView4 = this.f17009v;
                    if (recyclerView4 != null) {
                        recyclerView4.setItemViewCacheSize(5);
                        RecyclerView recyclerView5 = this.f17009v;
                        if (recyclerView5 != null) {
                            RecyclerView.C16613e adapter = recyclerView5.getAdapter();
                            C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderPostAtUI.SelectAtContactAdapter");
                            ((C3705d) adapter).notifyDataSetChanged();
                            RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f17008u;
                            if (refreshLoadMoreLayout2 != null) {
                                refreshLoadMoreLayout2.setEnablePullDownHeader(false);
                                RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f17008u;
                                if (refreshLoadMoreLayout3 != null) {
                                    View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
                                    C87412m.m108593f(inflate, "getInflater(context).inf…t.load_more_footer, null)");
                                    refreshLoadMoreLayout3.setLoadMoreFooter(inflate);
                                    RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f17008u;
                                    if (refreshLoadMoreLayout4 != null) {
                                        refreshLoadMoreLayout4.setActionCallback(new C3777c2(this));
                                    } else {
                                        C87412m.m108603p("rlLayout");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("rlLayout");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("rlLayout");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        } else {
            C87412m.m108603p("recyclerView");
            throw null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(713, this);
    }

    public void onResume() {
        super.onResume();
        RecyclerView recyclerView = this.f17009v;
        if (recyclerView != null) {
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderPostAtUI.SelectAtContactAdapter");
            if (!((C3705d) adapter).f17015d) {
                RecyclerView recyclerView2 = this.f17009v;
                if (recyclerView2 != null) {
                    RecyclerView.C16613e adapter2 = recyclerView2.getAdapter();
                    C87412m.m108592e(adapter2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderPostAtUI.SelectAtContactAdapter");
                    ((C3705d) adapter2).f17015d = true;
                    RecyclerView recyclerView3 = this.f17009v;
                    if (recyclerView3 != null) {
                        RecyclerView.C16613e adapter3 = recyclerView3.getAdapter();
                        C87412m.m108592e(adapter3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderPostAtUI.SelectAtContactAdapter");
                        ((C3705d) adapter3).notifyItemInserted(0);
                        C119179t tVar = C119157j.f356862d;
                        C3708e eVar = new C3708e(this);
                        C119157j jVar = (C119157j) tVar;
                        jVar.getClass();
                        jVar.mo183892w(eVar, 300, false);
                        return;
                    }
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
            return;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("errType ");
        sb.append(i);
        sb.append(", errCode ");
        sb.append(i2);
        sb.append(", errMsg ");
        sb.append(str);
        sb.append(" scene type ");
        sb.append(yVar != null ? Integer.valueOf(yVar.getType()) : null);
        Log.m105924i("Finder.FinderPostAtUI", sb.toString());
        Integer valueOf = yVar != null ? Integer.valueOf(yVar.getType()) : null;
        if (valueOf != null && valueOf.intValue() == 713 && i == 0 && i2 == 0) {
            C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderGetFollowList");
            C9319i3 i3Var = (C9319i3) yVar;
            C47465a aVar = i3Var.f29110g.f127055a.f127080a;
            C49026cn0 cn02 = aVar instanceof C49026cn0 ? (C49026cn0) aVar : null;
            if (!C87412m.m108589b(this.f17005r, cn02 != null ? cn02.f131834d : null)) {
                Log.m105924i("Finder.FinderPostAtUI", "not my buf, ignore!");
                return;
            }
            boolean z2 = true;
            if (this.f17005r == null) {
                Pattern pattern = C61926c.f176038a;
                C61926c.m72701z(C88643g.m110546d(), new C3709f(this, yVar));
                z = true;
            } else {
                z = false;
            }
            C47465a aVar2 = i3Var.f29110g.f127056b.f127083a;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListResponse");
            if (((C49169dn0) aVar2).f132431f == 0) {
                z2 = false;
            }
            this.f17006s = z2;
            this.f17005r = i3Var.mo10071n();
            LinkedList<FinderContact> l1 = i3Var.mo10070l1();
            Log.m105924i("Finder.FinderPostAtUI", "firstPage " + z + ", get follow contact " + l1.size());
            if (z) {
                this.f17002o.clear();
            }
            ArrayList<C58969q> arrayList = this.f17002o;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(l1, 10));
            for (FinderContact f : l1) {
                arrayList2.add(C58960c.m68834f(f, (C58969q) null, false, 3, (Object) null));
            }
            arrayList.addAll(arrayList2);
            RecyclerView recyclerView = this.f17009v;
            if (recyclerView != null) {
                RecyclerView.C16613e adapter = recyclerView.getAdapter();
                C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderPostAtUI.SelectAtContactAdapter");
                ((C3705d) adapter).notifyDataSetChanged();
                return;
            }
            C87412m.m108603p("recyclerView");
            throw null;
        }
    }
}
