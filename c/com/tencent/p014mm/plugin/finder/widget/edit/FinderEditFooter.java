package com.tencent.p014mm.plugin.finder.widget.edit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C30699x0;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B%\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\t¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/widget/edit/FinderEditFooter;", "Lcom/tencent/mm/ui/widget/InputPanelLinearLayout;", "Lcom/tencent/mm/plugin/finder/widget/edit/FinderEditFooter$a;", "alignModeChangeListener", "Lrx3/b0;", "setAlignModeChangeListener", "Lcom/tencent/mm/pluginsdk/ui/ChatFooterPanel$a;", "smileyTextListener", "setSmileyTextOperationListener", "", "getCurrentAlignMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.widget.edit.FinderEditFooter */
public final class FinderEditFooter extends InputPanelLinearLayout {

    /* renamed from: p */
    public static final /* synthetic */ int f162669p = 0;

    /* renamed from: f */
    public String f162670f = "Finder.FinderEditFooter";

    /* renamed from: g */
    public ImageButton f162671g;

    /* renamed from: h */
    public ImageButton f162672h;

    /* renamed from: i */
    public ChatFooterPanel f162673i;

    /* renamed from: j */
    public int f162674j = 101;

    /* renamed from: n */
    public C56753a f162675n;

    /* renamed from: o */
    public int f162676o = 201;

    /* renamed from: com.tencent.mm.plugin.finder.widget.edit.FinderEditFooter$a */
    public interface C56753a {
        /* renamed from: a */
        void mo79088a(int i);
    }

    /* renamed from: com.tencent.mm.plugin.finder.widget.edit.FinderEditFooter$b */
    public static final class C56754b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderEditFooter f162677d;

        public C56754b(FinderEditFooter finderEditFooter) {
            this.f162677d = finderEditFooter;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/widget/edit/FinderEditFooter$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderEditFooter finderEditFooter = this.f162677d;
            int i = finderEditFooter.f162676o;
            int i2 = FinderEditFooter.f162669p;
            if (i == 202) {
                ImageButton imageButton = finderEditFooter.f162671g;
                if (imageButton != null) {
                    imageButton.setImageResource(C0966R.raw.icons_outlined_emoji);
                    ChatFooterPanel chatFooterPanel = finderEditFooter.f162673i;
                    if (chatFooterPanel != null) {
                        chatFooterPanel.mo100196h();
                        Context context = this.f162677d.getContext();
                        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                        ((MMActivity) context).showVKB();
                        this.f162677d.f162676o = 201;
                    } else {
                        C87412m.m108603p("smileyPanel");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("emojiBtn");
                    throw null;
                }
            } else {
                Context context2 = finderEditFooter.getContext();
                C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((MMActivity) context2).hideVKB();
                FinderEditFooter finderEditFooter2 = this.f162677d;
                ImageButton imageButton2 = finderEditFooter2.f162671g;
                if (imageButton2 != null) {
                    imageButton2.setImageResource(C0966R.raw.icons_outlined_keyboard);
                    ChatFooterPanel chatFooterPanel2 = finderEditFooter2.f162673i;
                    if (chatFooterPanel2 != null) {
                        chatFooterPanel2.setVisibility(0);
                        ChatFooterPanel chatFooterPanel3 = finderEditFooter2.f162673i;
                        if (chatFooterPanel3 != null) {
                            chatFooterPanel3.mo100197i();
                            this.f162677d.f162676o = 202;
                        } else {
                            C87412m.m108603p("smileyPanel");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("smileyPanel");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("emojiBtn");
                    throw null;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/widget/edit/FinderEditFooter$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.widget.edit.FinderEditFooter$c */
    public static final class C56755c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderEditFooter f162678d;

        public C56755c(FinderEditFooter finderEditFooter) {
            this.f162678d = finderEditFooter;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/widget/edit/FinderEditFooter$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderEditFooter finderEditFooter = this.f162678d;
            int i = finderEditFooter.f162674j;
            if (i == 102) {
                finderEditFooter.f162674j = 101;
                ImageButton imageButton = finderEditFooter.f162672h;
                if (imageButton != null) {
                    imageButton.setImageResource(C0966R.raw.icons_outlined_alignment_left);
                } else {
                    C87412m.m108603p("alignBtn");
                    throw null;
                }
            } else if (i == 101) {
                finderEditFooter.f162674j = 102;
                ImageButton imageButton2 = finderEditFooter.f162672h;
                if (imageButton2 != null) {
                    imageButton2.setImageResource(C0966R.raw.icons_outlined_alignment_center);
                } else {
                    C87412m.m108603p("alignBtn");
                    throw null;
                }
            }
            FinderEditFooter finderEditFooter2 = this.f162678d;
            C56753a aVar = finderEditFooter2.f162675n;
            if (aVar != null) {
                aVar.mo79088a(finderEditFooter2.f162674j);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/widget/edit/FinderEditFooter$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public FinderEditFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo80118b();
    }

    /* renamed from: b */
    public final void mo80118b() {
        View.inflate(getContext(), C0966R.C0971layout.a__, this);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.iwk);
        View findViewById = findViewById(C0966R.C0970id.ce8);
        C87412m.m108593f(findViewById, "findViewById(R.id.emoji_btn)");
        ImageButton imageButton = (ImageButton) findViewById;
        this.f162671g = imageButton;
        imageButton.setOnClickListener(new C56754b(this));
        View findViewById2 = findViewById(C0966R.C0970id.f5788on);
        C87412m.m108593f(findViewById2, "findViewById(R.id.alignment_btn)");
        ImageButton imageButton2 = (ImageButton) findViewById2;
        this.f162672h = imageButton2;
        imageButton2.setOnClickListener(new C56755c(this));
        ChatFooterPanel si02 = C30699x0.m39154a().si0(getContext());
        C87412m.m108593f(si02, "getSmileyPanel().getSmileyPanel(context)");
        this.f162673i = si02;
        si02.setEntranceScene(13);
        ChatFooterPanel chatFooterPanel = this.f162673i;
        if (chatFooterPanel != null) {
            chatFooterPanel.setVisibility(8);
            ChatFooterPanel chatFooterPanel2 = this.f162673i;
            if (chatFooterPanel2 != null) {
                chatFooterPanel2.setBackgroundResource(C0966R.C0969drawable.f4728l7);
                ChatFooterPanel chatFooterPanel3 = this.f162673i;
                if (chatFooterPanel3 != null) {
                    chatFooterPanel3.mo100191d();
                    int validPanelHeight = KeyBoardUtil.getValidPanelHeight(getContext());
                    ChatFooterPanel chatFooterPanel4 = this.f162673i;
                    if (chatFooterPanel4 != null) {
                        linearLayout.addView(chatFooterPanel4, -1, validPanelHeight);
                    } else {
                        C87412m.m108603p("smileyPanel");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("smileyPanel");
                    throw null;
                }
            } else {
                C87412m.m108603p("smileyPanel");
                throw null;
            }
        } else {
            C87412m.m108603p("smileyPanel");
            throw null;
        }
    }

    public final int getCurrentAlignMode() {
        return this.f162674j;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        super.mo1072i0(z, i);
        String str = this.f162670f;
        Log.m105918d(str, "isKeyboardShow " + z + " keyboardHeight " + i);
        if (z) {
            this.f162676o = 201;
            ImageButton imageButton = this.f162671g;
            if (imageButton != null) {
                imageButton.setImageResource(C0966R.raw.icons_outlined_emoji);
                ChatFooterPanel chatFooterPanel = this.f162673i;
                if (chatFooterPanel != null) {
                    chatFooterPanel.setVisibility(0);
                } else {
                    C87412m.m108603p("smileyPanel");
                    throw null;
                }
            } else {
                C87412m.m108603p("emojiBtn");
                throw null;
            }
        } else if (this.f162676o == 201) {
            ChatFooterPanel chatFooterPanel2 = this.f162673i;
            if (chatFooterPanel2 != null) {
                chatFooterPanel2.setVisibility(8);
            } else {
                C87412m.m108603p("smileyPanel");
                throw null;
            }
        }
    }

    public final void setAlignModeChangeListener(C56753a aVar) {
        C87412m.m108594g(aVar, "alignModeChangeListener");
        this.f162675n = aVar;
    }

    public final void setSmileyTextOperationListener(ChatFooterPanel.C72719a aVar) {
        C87412m.m108594g(aVar, "smileyTextListener");
        ChatFooterPanel chatFooterPanel = this.f162673i;
        if (chatFooterPanel != null) {
            chatFooterPanel.setOnTextOperationListener(aVar);
        } else {
            C87412m.m108603p("smileyPanel");
            throw null;
        }
    }

    public FinderEditFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo80118b();
    }
}
