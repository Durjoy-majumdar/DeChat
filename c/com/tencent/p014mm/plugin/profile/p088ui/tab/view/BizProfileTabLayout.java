package com.tencent.p014mm.plugin.profile.p088ui.tab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.tools.C7007c1;
import com.tencent.p014mm.plugin.profile.p088ui.C5023y;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy0.C8219i;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'B#\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010(\u001a\u00020\u0017¢\u0006\u0004\b&\u0010)J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR0\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010!\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006*"}, mo182094d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "text", "Lrx3/b0;", "setVideoTabText", "Lkotlin/Function0;", "C", "Lfy3/a;", "getOnServiceTabSelected", "()Lfy3/a;", "setOnServiceTabSelected", "(Lfy3/a;)V", "onServiceTabSelected", "D", "getOnMsgTabSelected", "setOnMsgTabSelected", "onMsgTabSelected", "E", "getOnVideoTabSelected", "setOnVideoTabSelected", "onVideoTabSelected", "Lkotlin/Function1;", "", "F", "Lfy3/l;", "getOnTabSelected", "()Lfy3/l;", "setOnTabSelected", "(Lfy3/l;)V", "onTabSelected", "getTabCount", "()I", "tabCount", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout */
public final class BizProfileTabLayout extends ConstraintLayout {

    /* renamed from: A */
    public View f115796A;

    /* renamed from: B */
    public View f115797B;

    /* renamed from: C */
    public C32224a<C13598b0> f115798C;

    /* renamed from: D */
    public C32224a<C13598b0> f115799D;

    /* renamed from: E */
    public C32224a<C13598b0> f115800E;

    /* renamed from: F */
    public C32226l<? super Integer, C13598b0> f115801F;

    /* renamed from: v */
    public TextView f115802v;

    /* renamed from: w */
    public TextView f115803w;

    /* renamed from: x */
    public ViewGroup f115804x;

    /* renamed from: y */
    public ViewGroup f115805y;

    /* renamed from: z */
    public ViewGroup f115806z;

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout$a */
    public static final class C42771a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BizProfileTabLayout f115807d;

        public C42771a(BizProfileTabLayout bizProfileTabLayout) {
            this.f115807d = bizProfileTabLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> onServiceTabSelected = this.f115807d.getOnServiceTabSelected();
            if (onServiceTabSelected != null) {
                onServiceTabSelected.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout$b */
    public static final class C42772b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BizProfileTabLayout f115808d;

        public C42772b(BizProfileTabLayout bizProfileTabLayout) {
            this.f115808d = bizProfileTabLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> onMsgTabSelected = this.f115808d.getOnMsgTabSelected();
            if (onMsgTabSelected != null) {
                onMsgTabSelected.invoke();
            }
            C32226l<Integer, C13598b0> onTabSelected = this.f115808d.getOnTabSelected();
            if (onTabSelected != null) {
                onTabSelected.invoke(0);
            }
            this.f115808d.mo66920t();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout$c */
    public static final class C42773c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BizProfileTabLayout f115809d;

        public C42773c(BizProfileTabLayout bizProfileTabLayout) {
            this.f115809d = bizProfileTabLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<Integer, C13598b0> onTabSelected = this.f115809d.getOnTabSelected();
            if (onTabSelected != null) {
                ViewGroup viewGroup = this.f115809d.f115804x;
                if (viewGroup != null) {
                    onTabSelected.invoke(Integer.valueOf(viewGroup.getVisibility() == 0 ? 1 : 0));
                } else {
                    C87412m.m108603p("mMsgLayout");
                    throw null;
                }
            }
            C32224a<C13598b0> onVideoTabSelected = this.f115809d.getOnVideoTabSelected();
            if (onVideoTabSelected != null) {
                onVideoTabSelected.invoke();
            }
            this.f115809d.mo66921w();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BizProfileTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo66914s();
    }

    public final C32224a<C13598b0> getOnMsgTabSelected() {
        return this.f115799D;
    }

    public final C32224a<C13598b0> getOnServiceTabSelected() {
        return this.f115798C;
    }

    public final C32226l<Integer, C13598b0> getOnTabSelected() {
        return this.f115801F;
    }

    public final C32224a<C13598b0> getOnVideoTabSelected() {
        return this.f115800E;
    }

    public final int getTabCount() {
        ViewGroup viewGroup = this.f115804x;
        if (viewGroup != null) {
            int i = viewGroup.getVisibility() == 0 ? 1 : 0;
            ViewGroup viewGroup2 = this.f115805y;
            if (viewGroup2 != null) {
                if (viewGroup2.getVisibility() == 0) {
                    i++;
                }
                ViewGroup viewGroup3 = this.f115806z;
                if (viewGroup3 != null) {
                    return viewGroup3.getVisibility() == 0 ? i + 1 : i;
                }
                C87412m.m108603p("mServiceLayout");
                throw null;
            }
            C87412m.m108603p("mVideoLayout");
            throw null;
        }
        C87412m.m108603p("mMsgLayout");
        throw null;
    }

    /* renamed from: r */
    public final void mo66913r() {
        ViewGroup viewGroup = this.f115804x;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            ViewGroup viewGroup2 = this.f115805y;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
                ViewGroup viewGroup3 = this.f115806z;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(8);
                } else {
                    C87412m.m108603p("mServiceLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("mVideoLayout");
                throw null;
            }
        } else {
            C87412m.m108603p("mMsgLayout");
            throw null;
        }
    }

    /* renamed from: s */
    public final void mo66914s() {
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f7065x0, this, true);
        View findViewById = findViewById(C0966R.C0970id.f357528ab0);
        C87412m.m108593f(findViewById, "findViewById(R.id.biz_profile_menu_msg)");
        this.f115802v = (TextView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.ab7);
        C87412m.m108593f(findViewById2, "findViewById(R.id.biz_profile_menu_video)");
        this.f115803w = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.f357531ab3);
        C87412m.m108593f(findViewById3, "findViewById(R.id.biz_profile_menu_service)");
        TextView textView = (TextView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.f357530ab2);
        C87412m.m108593f(findViewById4, "findViewById(R.id.biz_profile_menu_msg_layout)");
        this.f115804x = (ViewGroup) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.ab9);
        C87412m.m108593f(findViewById5, "findViewById(R.id.biz_profile_menu_video_layout)");
        this.f115805y = (ViewGroup) findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.ab4);
        C87412m.m108593f(findViewById6, "findViewById(R.id.biz_profile_menu_service_layout)");
        this.f115806z = (ViewGroup) findViewById6;
        ViewGroup viewGroup = this.f115804x;
        if (viewGroup != null) {
            C7007c1.m7256a(viewGroup);
            ViewGroup viewGroup2 = this.f115805y;
            if (viewGroup2 != null) {
                C7007c1.m7256a(viewGroup2);
                ViewGroup viewGroup3 = this.f115806z;
                if (viewGroup3 != null) {
                    C7007c1.m7256a(viewGroup3);
                    View findViewById7 = findViewById(C0966R.C0970id.f357529ab1);
                    C87412m.m108593f(findViewById7, "findViewById(R.id.biz_profile_menu_msg_indicator)");
                    this.f115796A = findViewById7;
                    View findViewById8 = findViewById(C0966R.C0970id.ab8);
                    C87412m.m108593f(findViewById8, "findViewById(R.id.biz_pr…ile_menu_video_indicator)");
                    this.f115797B = findViewById8;
                    ViewGroup viewGroup4 = this.f115806z;
                    if (viewGroup4 != null) {
                        viewGroup4.setOnClickListener(new C42771a(this));
                        ViewGroup viewGroup5 = this.f115804x;
                        if (viewGroup5 != null) {
                            viewGroup5.setOnClickListener(new C42772b(this));
                            ViewGroup viewGroup6 = this.f115805y;
                            if (viewGroup6 != null) {
                                viewGroup6.setOnClickListener(new C42773c(this));
                            } else {
                                C87412m.m108603p("mVideoLayout");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mMsgLayout");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mServiceLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mServiceLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("mVideoLayout");
                throw null;
            }
        } else {
            C87412m.m108603p("mMsgLayout");
            throw null;
        }
    }

    public final void setOnMsgTabSelected(C32224a<C13598b0> aVar) {
        this.f115799D = aVar;
    }

    public final void setOnServiceTabSelected(C32224a<C13598b0> aVar) {
        this.f115798C = aVar;
    }

    public final void setOnTabSelected(C32226l<? super Integer, C13598b0> lVar) {
        this.f115801F = lVar;
    }

    public final void setOnVideoTabSelected(C32224a<C13598b0> aVar) {
        this.f115800E = aVar;
    }

    public final void setVideoTabText(String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        TextView textView = this.f115803w;
        if (textView != null) {
            textView.setText(str);
        } else {
            C87412m.m108603p("mVideoTextView");
            throw null;
        }
    }

    /* renamed from: t */
    public final void mo66920t() {
        ViewGroup viewGroup = this.f115804x;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            View view = this.f115796A;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout", "selectMsgTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout", "selectMsgTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view2 = this.f115797B;
                if (view2 != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(8);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout", "selectMsgTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout", "selectMsgTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    TextView textView = this.f115802v;
                    if (textView != null) {
                        textView.setTextColor(getContext().getResources().getColor(C0966R.color.a7f));
                        TextView textView2 = this.f115803w;
                        if (textView2 != null) {
                            textView2.setTextColor(getContext().getResources().getColor(C0966R.color.f3287m_));
                            C8219i iVar = C8219i.f27144a;
                            TextView textView3 = this.f115802v;
                            if (textView3 != null) {
                                iVar.mo9271b(textView3);
                                TextView textView4 = this.f115803w;
                                if (textView4 != null) {
                                    iVar.mo9270a(textView4);
                                    String string = getResources().getString(C0966R.string.apw);
                                    C87412m.m108593f(string, "resources.getString(com.…iz_timeline_has_selected)");
                                    Object[] objArr = new Object[1];
                                    TextView textView5 = this.f115802v;
                                    if (textView5 != null) {
                                        objArr[0] = textView5.getText();
                                        String format = String.format(string, Arrays.copyOf(objArr, 1));
                                        C87412m.m108593f(format, "format(format, *args)");
                                        C39818r rVar = C39818r.f106831a;
                                        Context context = getContext();
                                        C87412m.m108593f(context, "context");
                                        ((C5023y) rVar.mo62443b(context).mo75002a(C5023y.class)).setValue("biz_timeline_profile_menu_selected_msg", format);
                                        Context context2 = getContext();
                                        C87412m.m108593f(context2, "context");
                                        C5023y yVar = (C5023y) rVar.mo62443b(context2).mo75002a(C5023y.class);
                                        TextView textView6 = this.f115803w;
                                        if (textView6 != null) {
                                            yVar.setValue("biz_timeline_profile_menu_selected_video", textView6.getText().toString());
                                        } else {
                                            C87412m.m108603p("mVideoTextView");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("mMsgTextView");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("mVideoTextView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mMsgTextView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mVideoTextView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mMsgTextView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mVideoIndicator");
                    throw null;
                }
            } else {
                C87412m.m108603p("mMsgIndicator");
                throw null;
            }
        } else {
            C87412m.m108603p("mMsgLayout");
            throw null;
        }
    }

    /* renamed from: w */
    public final void mo66921w() {
        ViewGroup viewGroup = this.f115805y;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            View view = this.f115797B;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout", "selectVideoTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout", "selectVideoTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view2 = this.f115796A;
                if (view2 != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(8);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout", "selectVideoTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTabLayout", "selectVideoTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    TextView textView = this.f115803w;
                    if (textView != null) {
                        textView.setTextColor(getContext().getResources().getColor(C0966R.color.a7f));
                        TextView textView2 = this.f115802v;
                        if (textView2 != null) {
                            textView2.setTextColor(getContext().getResources().getColor(C0966R.color.f3287m_));
                            C8219i iVar = C8219i.f27144a;
                            TextView textView3 = this.f115803w;
                            if (textView3 != null) {
                                iVar.mo9271b(textView3);
                                TextView textView4 = this.f115802v;
                                if (textView4 != null) {
                                    iVar.mo9270a(textView4);
                                    String string = getResources().getString(C0966R.string.apw);
                                    C87412m.m108593f(string, "resources.getString(com.…iz_timeline_has_selected)");
                                    Object[] objArr = new Object[1];
                                    TextView textView5 = this.f115803w;
                                    if (textView5 != null) {
                                        objArr[0] = textView5.getText();
                                        String format = String.format(string, Arrays.copyOf(objArr, 1));
                                        C87412m.m108593f(format, "format(format, *args)");
                                        C39818r rVar = C39818r.f106831a;
                                        Context context = getContext();
                                        C87412m.m108593f(context, "context");
                                        ((C5023y) rVar.mo62443b(context).mo75002a(C5023y.class)).setValue("biz_timeline_profile_menu_selected_video", format);
                                        Context context2 = getContext();
                                        C87412m.m108593f(context2, "context");
                                        C5023y yVar = (C5023y) rVar.mo62443b(context2).mo75002a(C5023y.class);
                                        TextView textView6 = this.f115802v;
                                        if (textView6 != null) {
                                            yVar.setValue("biz_timeline_profile_menu_selected_msg", textView6.getText().toString());
                                        } else {
                                            C87412m.m108603p("mMsgTextView");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("mVideoTextView");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("mMsgTextView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mVideoTextView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mMsgTextView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mVideoTextView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mMsgIndicator");
                    throw null;
                }
            } else {
                C87412m.m108603p("mVideoIndicator");
                throw null;
            }
        } else {
            C87412m.m108603p("mVideoLayout");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BizProfileTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo66914s();
    }
}
