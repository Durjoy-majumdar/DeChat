package com.tencent.p014mm.plugin.game.luggage.p801ui.circle;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.C74965a;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.game.api.GameInputConfig;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C30699x0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72834u0;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import iy1.C46385l;
import iy1.C46386m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kotlin.Metadata;
import nj3.C88989a;
import org.json.JSONObject;
import p206nj.C11171e;
import p248ug.C78160t0;
import p385u2.C111105a;
import qo3.C47883u;
import qo3.C77426q;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import sw1.C48472k;
import sw1.C48473l;
import sx3.C90364q0;
import vl3.C102226d;
import vo3.C90852c;
import z04.C112550d0;
import z04.C112551y;
import zp3.C79406f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "a", "c", "d", "e", "f", "luggage-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI */
public final class PostCommentDialogUI extends MMActivity {

    /* renamed from: G */
    public static final /* synthetic */ int f113134G = 0;

    /* renamed from: A */
    public boolean f113135A;

    /* renamed from: B */
    public boolean f113136B = true;

    /* renamed from: C */
    public int f113137C;

    /* renamed from: D */
    public final C42003a f113138D = new C42003a();

    /* renamed from: E */
    public boolean f113139E = true;

    /* renamed from: F */
    public int f113140F = 1000;

    /* renamed from: d */
    public ChatFooterPanel f113141d;

    /* renamed from: e */
    public MMEditText f113142e;

    /* renamed from: f */
    public ImageView f113143f;

    /* renamed from: g */
    public InputPanelLinearLayout f113144g;

    /* renamed from: h */
    public ImageView f113145h;

    /* renamed from: i */
    public LinearLayout f113146i;

    /* renamed from: j */
    public Button f113147j;

    /* renamed from: n */
    public ImageView f113148n;

    /* renamed from: o */
    public View f113149o;

    /* renamed from: p */
    public View f113150p;

    /* renamed from: q */
    public GameEmojiPickView f113151q;

    /* renamed from: r */
    public AtSomeoneView f113152r;

    /* renamed from: s */
    public GameInputConfig f113153s;

    /* renamed from: t */
    public IEmojiInfo f113154t;

    /* renamed from: u */
    public String f113155u;

    /* renamed from: v */
    public final C13601g f113156v = C36568h.m40985a(new C42009g(this));

    /* renamed from: w */
    public final C13601g f113157w = C36568h.m40985a(new C42004b(this));

    /* renamed from: x */
    public boolean f113158x;

    /* renamed from: y */
    public boolean f113159y;

    /* renamed from: z */
    public boolean f113160z;

    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$a */
    public static final class C42003a {

        /* renamed from: a */
        public boolean f113161a;

        /* renamed from: b */
        public String f113162b = "";

        /* renamed from: c */
        public List<String> f113163c = new ArrayList();

        /* renamed from: d */
        public HashMap<String, Integer> f113164d = new HashMap<>();

        /* renamed from: e */
        public HashMap<String, C13604l<Integer, Integer>> f113165e = new HashMap<>();
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$b */
    public static final class C42004b extends C87413o implements C32224a<Map<String, ? extends String>> {

        /* renamed from: d */
        public final /* synthetic */ PostCommentDialogUI f113166d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42004b(PostCommentDialogUI postCommentDialogUI) {
            super(0);
            this.f113166d = postCommentDialogUI;
        }

        public Object invoke() {
            return C90364q0.m113147f(new C13604l("done", this.f113166d.getString(C0966R.string.n_n)), new C13604l("continue", this.f113166d.getString(C0966R.string.n_m)), new C13604l("send", this.f113166d.getString(C0966R.string.n_s)), new C13604l("next", this.f113166d.getString(C0966R.string.n_p)), new C13604l("go", this.f113166d.getString(C0966R.string.n_o)), new C13604l("search", this.f113166d.getString(C0966R.string.n_r)), new C13604l("reply", this.f113166d.getString(C0966R.string.n_q)));
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$c;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Landroid/os/Bundle;", "<init>", "()V", "luggage-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$c */
    public static final class C42005c implements C80883e<IPCString, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            if (iPCString != null) {
                C48473l.C48476c.f129682a.mo73119a(iPCString.f10315d, (JSONObject) null);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$d;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "luggage-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$d */
    public static final class C42006d implements C80883e<Bundle, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            if (bundle != null) {
                String string = bundle.getString("identifier");
                String string2 = bundle.getString("jsonData");
                if (string != null && string2 != null) {
                    C48473l.C48476c.f129682a.mo73119a(string, new JSONObject(string2));
                }
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$e;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Landroid/os/Bundle;", "<init>", "()V", "luggage-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$e */
    public static final class C42007e implements C80883e<IPCString, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            if (iPCString != null) {
                C48473l lVar = C48473l.C48476c.f129682a;
                lVar.f129681a.remove(iPCString.f10315d);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$f;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "luggage-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$f */
    public static final class C42008f implements C80883e<Bundle, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            if (bundle != null) {
                String string = bundle.getString("identifier");
                if (!(string == null || string.length() == 0)) {
                    C48473l lVar = C48473l.C48476c.f129682a;
                    C48472k kVar = new C48472k(bundle.getString(MimeTypes.BASE_TYPE_TEXT, ""), 0, bundle.getInt("inputHeight", 0), bundle.getBoolean("isKeyboardShow", false));
                    C48473l.C48475b bVar = lVar.f129681a.get(string);
                    if (bVar != null) {
                        bVar.mo65761b(kVar);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$g */
    public static final class C42009g extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ PostCommentDialogUI f113167d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42009g(PostCommentDialogUI postCommentDialogUI) {
            super(0);
            this.f113167d = postCommentDialogUI;
        }

        public Object invoke() {
            String stringExtra = this.f113167d.getIntent().getStringExtra("game_center_input_view_type");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$h */
    public static final class C42010h implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ PostCommentDialogUI f113168d;

        public C42010h(PostCommentDialogUI postCommentDialogUI) {
            this.f113168d = postCommentDialogUI;
        }

        public void afterTextChanged(Editable editable) {
            PostCommentDialogUI postCommentDialogUI = this.f113168d;
            GameInputConfig gameInputConfig = postCommentDialogUI.f113153s;
            boolean z = true;
            if (gameInputConfig != null && gameInputConfig.canShowAtSomeoneView) {
                if (postCommentDialogUI.f113158x) {
                    MMEditText mMEditText = postCommentDialogUI.f113142e;
                    if (mMEditText != null) {
                        postCommentDialogUI.mo65904J7(mMEditText.getSelectionStart(), false, "");
                        this.f113168d.f113158x = false;
                    } else {
                        C87412m.m108603p("gameCommentInputTxt");
                        throw null;
                    }
                }
                PostCommentDialogUI postCommentDialogUI2 = this.f113168d;
                if (postCommentDialogUI2.f113159y) {
                    postCommentDialogUI2.mo65907M7();
                    this.f113168d.f113159y = false;
                }
                PostCommentDialogUI postCommentDialogUI3 = this.f113168d;
                if (postCommentDialogUI3.f113138D.f113161a) {
                    postCommentDialogUI3.mo65905K7().mo65896D1(this.f113168d.f113138D.f113162b);
                }
            }
            if (editable != null) {
                PostCommentDialogUI postCommentDialogUI4 = this.f113168d;
                if (!(C112550d0.m153799i0(editable.toString()).toString().length() == 0)) {
                    Button button = postCommentDialogUI4.f113147j;
                    if (button != null) {
                        button.setEnabled(true);
                        Button button2 = postCommentDialogUI4.f113147j;
                        if (button2 != null) {
                            button2.setVisibility(0);
                        } else {
                            C87412m.m108603p("btSendComment");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("btSendComment");
                        throw null;
                    }
                } else {
                    GameInputConfig gameInputConfig2 = postCommentDialogUI4.f113153s;
                    if (gameInputConfig2 != null && gameInputConfig2.canShowAtSomeoneView) {
                        postCommentDialogUI4.f113138D.f113164d.clear();
                        ((ArrayList) postCommentDialogUI4.f113138D.f113163c).clear();
                        postCommentDialogUI4.f113138D.f113165e.clear();
                        postCommentDialogUI4.mo65905K7().setSelectedDatas(postCommentDialogUI4.f113138D.f113163c);
                        postCommentDialogUI4.mo65905K7().mo65896D1("");
                        View view = postCommentDialogUI4.f113149o;
                        if (view != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(8);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$init$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$init$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            C87412m.m108603p("atSomeoneLayout");
                            throw null;
                        }
                    }
                    Button button3 = postCommentDialogUI4.f113147j;
                    if (button3 != null) {
                        button3.setEnabled(false);
                        GameInputConfig gameInputConfig3 = postCommentDialogUI4.f113153s;
                        if (gameInputConfig3 == null || !gameInputConfig3.hideImgBtn) {
                            z = false;
                        }
                        if (z) {
                            ImageView imageView = postCommentDialogUI4.f113145h;
                            if (imageView != null) {
                                imageView.setVisibility(8);
                            } else {
                                C87412m.m108603p("ivPicIcon");
                                throw null;
                            }
                        } else {
                            ImageView imageView2 = postCommentDialogUI4.f113145h;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                            } else {
                                C87412m.m108603p("ivPicIcon");
                                throw null;
                            }
                        }
                        Button button4 = postCommentDialogUI4.f113147j;
                        if (button4 != null) {
                            button4.setVisibility(8);
                        } else {
                            C87412m.m108603p("btSendComment");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("btSendComment");
                        throw null;
                    }
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            PostCommentDialogUI postCommentDialogUI = this.f113168d;
            GameInputConfig gameInputConfig = postCommentDialogUI.f113153s;
            boolean z = true;
            if (gameInputConfig == null || !gameInputConfig.canShowAtSomeoneView) {
                z = false;
            }
            if (z) {
                MMEditText mMEditText = postCommentDialogUI.f113142e;
                if (mMEditText != null) {
                    Editable text = mMEditText.getText();
                    C87412m.m108593f(text, "gameCommentInputTxt.text");
                    MMEditText mMEditText2 = this.f113168d.f113142e;
                    if (mMEditText2 != null) {
                        postCommentDialogUI.f113158x = C112550d0.m153804x(text.subSequence(0, mMEditText2.getSelectionStart()).toString(), 8197, false, 2, (Object) null);
                        PostCommentDialogUI postCommentDialogUI2 = this.f113168d;
                        MMEditText mMEditText3 = postCommentDialogUI2.f113142e;
                        if (mMEditText3 != null) {
                            Editable text2 = mMEditText3.getText();
                            C87412m.m108593f(text2, "gameCommentInputTxt.text");
                            MMEditText mMEditText4 = this.f113168d.f113142e;
                            if (mMEditText4 != null) {
                                postCommentDialogUI2.f113159y = C112551y.m153808h(text2.subSequence(0, mMEditText4.getSelectionStart()).toString(), "@", false, 2, (Object) null);
                            } else {
                                C87412m.m108603p("gameCommentInputTxt");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("gameCommentInputTxt");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("gameCommentInputTxt");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("gameCommentInputTxt");
                    throw null;
                }
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = i;
            PostCommentDialogUI postCommentDialogUI = this.f113168d;
            GameInputConfig gameInputConfig = postCommentDialogUI.f113153s;
            if (gameInputConfig != null && gameInputConfig.canShowAtSomeoneView) {
                if (i3 != 0) {
                    postCommentDialogUI.f113158x = false;
                    postCommentDialogUI.f113159y = false;
                    String substring = String.valueOf(charSequence).substring(i4, i4 + i3);
                    C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    if (!C112550d0.m153802v(substring, 8197, false, 2, (Object) null)) {
                        for (Map.Entry next : postCommentDialogUI.f113138D.f113165e.entrySet()) {
                            if (i4 <= ((Number) ((C13604l) next.getValue()).f38555d).intValue()) {
                                next.setValue(new C13604l(Integer.valueOf(((Number) ((C13604l) next.getValue()).f38555d).intValue() + i3), Integer.valueOf(((Number) ((C13604l) next.getValue()).f38556e).intValue() + i3)));
                            }
                        }
                    }
                    if (C87412m.m108589b(substring, " ") || (!postCommentDialogUI.f113138D.f113161a && !C112550d0.m153802v(substring, 8197, false, 2, (Object) null))) {
                        View view = postCommentDialogUI.f113149o;
                        if (view == null) {
                            C87412m.m108603p("atSomeoneLayout");
                            throw null;
                        } else if (view.getVisibility() == 0) {
                            postCommentDialogUI.mo65907M7();
                            return;
                        }
                    }
                    C42003a aVar = postCommentDialogUI.f113138D;
                    if (aVar.f113161a) {
                        String str = aVar.f113162b + substring;
                        C87412m.m108594g(str, "<set-?>");
                        aVar.f113162b = str;
                    }
                    if (C87412m.m108589b(substring, "@")) {
                        View view2 = postCommentDialogUI.f113149o;
                        if (view2 != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view3 = view2;
                            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI", "updateAtPosInfo", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view3, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI", "updateAtPosInfo", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            C42003a aVar3 = postCommentDialogUI.f113138D;
                            aVar3.getClass();
                            aVar3.f113162b = "";
                            postCommentDialogUI.f113138D.f113161a = true;
                            C40314g.m43484c(postCommentDialogUI.getContext(), 101, 1, 0, 1, 0, (String) null);
                            return;
                        }
                        C87412m.m108603p("atSomeoneLayout");
                        throw null;
                    }
                } else if (C87412m.m108589b(postCommentDialogUI.f113138D.f113162b, "")) {
                    Iterator<Map.Entry<String, C13604l<Integer, Integer>>> it = postCommentDialogUI.f113138D.f113165e.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, C13604l<Integer, Integer>> next2 = it.next();
                        C87412m.m108593f(next2, "it.next()");
                        Map.Entry entry = next2;
                        if (((Number) ((C13604l) entry.getValue()).f38555d).intValue() >= i4) {
                            if (((Number) ((C13604l) entry.getValue()).f38555d).intValue() >= i4 + i2) {
                                entry.setValue(new C13604l(Integer.valueOf(((Number) ((C13604l) entry.getValue()).f38555d).intValue() - i2), Integer.valueOf(((Number) ((C13604l) entry.getValue()).f38556e).intValue() - i2)));
                            } else {
                                it.remove();
                                ((ArrayList) postCommentDialogUI.f113138D.f113163c).remove(entry.getKey());
                                Integer num = postCommentDialogUI.f113138D.f113164d.get(entry.getKey());
                                if (num != null) {
                                    postCommentDialogUI.mo65905K7().mo65894B1(num.intValue());
                                }
                                postCommentDialogUI.f113138D.f113164d.remove(entry.getKey());
                            }
                        } else if (((Number) ((C13604l) entry.getValue()).f38556e).intValue() >= i4 + i2) {
                            it.remove();
                            ((ArrayList) postCommentDialogUI.f113138D.f113163c).remove(entry.getKey());
                            Integer num2 = postCommentDialogUI.f113138D.f113164d.get(entry.getKey());
                            if (num2 != null) {
                                postCommentDialogUI.mo65905K7().mo65894B1(num2.intValue());
                            }
                            postCommentDialogUI.f113138D.f113164d.remove(entry.getKey());
                        }
                    }
                    postCommentDialogUI.mo65905K7().setSelectedDatas(postCommentDialogUI.f113138D.f113163c);
                    postCommentDialogUI.f113138D.f113161a = false;
                } else if (postCommentDialogUI.f113138D.f113162b.length() - i2 > 0) {
                    C42003a aVar4 = postCommentDialogUI.f113138D;
                    String str2 = aVar4.f113162b;
                    String substring2 = str2.substring(0, str2.length() - i2);
                    C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    aVar4.f113162b = substring2;
                } else {
                    C42003a aVar5 = postCommentDialogUI.f113138D;
                    aVar5.getClass();
                    aVar5.f113162b = "";
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$i */
    public static final class C42011i implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ PostCommentDialogUI f113169d;

        public C42011i(PostCommentDialogUI postCommentDialogUI) {
            this.f113169d = postCommentDialogUI;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$init$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            PostCommentDialogUI.m45662H7(this.f113169d);
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$init$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$j */
    public static final class C42012j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ PostCommentDialogUI f113170d;

        public C42012j(PostCommentDialogUI postCommentDialogUI) {
            this.f113170d = postCommentDialogUI;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.view.inputmethod.InputMethodManager} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r12) {
            /*
                r11 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r12)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$init$3"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r11
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r12 = r11.f113170d
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel r12 = r12.f113141d
                r0 = 0
                if (r12 == 0) goto L_0x00d5
                int r12 = r12.getVisibility()
                java.lang.String r1 = "input_method"
                java.lang.String r2 = "gameCommentInputTxt"
                r3 = 0
                if (r12 != 0) goto L_0x005d
                com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r12 = r11.f113170d
                com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI.m45662H7(r12)
                com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r12 = r11.f113170d
                com.tencent.mm.ui.widget.MMEditText r12 = r12.f113142e
                if (r12 == 0) goto L_0x0059
                android.content.Context r2 = r12.getContext()
                java.lang.Object r1 = r2.getSystemService(r1)
                boolean r2 = r1 instanceof android.view.inputmethod.InputMethodManager
                if (r2 == 0) goto L_0x0047
                r0 = r1
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            L_0x0047:
                if (r0 == 0) goto L_0x004f
                r12.requestFocus()
                r0.showSoftInput(r12, r3)
            L_0x004f:
                com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r12 = r11.f113170d
                com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView r12 = r12.mo65906L7()
                r12.setVisibility(r3)
                goto L_0x00bf
            L_0x0059:
                gy3.C87412m.m108603p(r2)
                throw r0
            L_0x005d:
                com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r12 = r11.f113170d
                androidx.appcompat.app.AppCompatActivity r4 = r12.getContext()
                r5 = 90
                r6 = 9001(0x2329, float:1.2613E-41)
                r7 = 999(0x3e7, float:1.4E-42)
                r8 = 2
                com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r12 = r11.f113170d
                r12.getClass()
                r9 = 0
                r10 = 0
                com.tencent.p014mm.game.report.C40314g.m43484c(r4, r5, r6, r7, r8, r9, r10)
                com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r12 = r11.f113170d
                com.tencent.mm.ui.widget.MMEditText r4 = r12.f113142e
                if (r4 == 0) goto L_0x00d1
                android.content.Context r2 = r4.getContext()
                java.lang.Object r1 = r2.getSystemService(r1)
                boolean r2 = r1 instanceof android.view.inputmethod.InputMethodManager
                if (r2 == 0) goto L_0x0089
                android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
                goto L_0x008a
            L_0x0089:
                r1 = r0
            L_0x008a:
                if (r1 == 0) goto L_0x0093
                android.os.IBinder r2 = r4.getWindowToken()
                r1.hideSoftInputFromWindow(r2, r3)
            L_0x0093:
                androidx.appcompat.app.AppCompatActivity r4 = r12.getContext()
                r5 = 90
                r6 = 9002(0x232a, float:1.2614E-41)
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                com.tencent.p014mm.game.report.C40314g.m43484c(r4, r5, r6, r7, r8, r9, r10)
                zt3.t r1 = zt3.C119157j.f356862d
                iy1.p r2 = new iy1.p
                r2.<init>(r12)
                r4 = 200(0xc8, double:9.9E-322)
                zt3.j r1 = (zt3.C119157j) r1
                r1.getClass()
                r1.mo183892w(r2, r4, r3)
                android.widget.ImageView r1 = r12.f113143f
                if (r1 == 0) goto L_0x00cb
                r0 = 2131755808(0x7f100320, float:1.9142506E38)
                int r2 = r12.f113137C
                r12.mo65903I7(r1, r0, r2)
            L_0x00bf:
                java.lang.String r12 = "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$init$3"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r11, r12, r0, r1, r2)
                return
            L_0x00cb:
                java.lang.String r12 = "ivSmileyIcon"
                gy3.C87412m.m108603p(r12)
                throw r0
            L_0x00d1:
                gy3.C87412m.m108603p(r2)
                throw r0
            L_0x00d5:
                java.lang.String r12 = "smileyPanel"
                gy3.C87412m.m108603p(r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI.C42012j.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$k */
    public static final class C42013k implements C74965a.C74969d {

        /* renamed from: d */
        public final /* synthetic */ PostCommentDialogUI f113171d;

        public C42013k(PostCommentDialogUI postCommentDialogUI) {
            this.f113171d = postCommentDialogUI;
        }

        /* renamed from: i0 */
        public final void mo1072i0(boolean z, int i) {
            this.f113171d.f113135A = z;
            Log.m105924i("MicroMsg.PostCommentDialogUI", "isKeyboardShow  = " + z + "   keyboardHeight = " + i);
            MMEditText mMEditText = this.f113171d.f113142e;
            if (mMEditText != null) {
                mMEditText.mo104245f(z);
                PostCommentDialogUI postCommentDialogUI = this.f113171d;
                if (postCommentDialogUI.f113136B) {
                    GameInputConfig gameInputConfig = postCommentDialogUI.f113153s;
                    String str = gameInputConfig != null ? gameInputConfig.identifier : null;
                    MMEditText mMEditText2 = postCommentDialogUI.f113142e;
                    if (mMEditText2 != null) {
                        String obj = mMEditText2.getText().toString();
                        InputPanelLinearLayout inputPanelLinearLayout = this.f113171d.f113144g;
                        if (inputPanelLinearLayout != null) {
                            int height = inputPanelLinearLayout.getHeight();
                            InputPanelLinearLayout inputPanelLinearLayout2 = this.f113171d.f113144g;
                            if (inputPanelLinearLayout2 != null) {
                                int paddingBottom = height - inputPanelLinearLayout2.getPaddingBottom();
                                String str2 = WeChatProcess.PROCESS_TOOLS;
                                Bundle bundle = new Bundle();
                                bundle.putString("identifier", str);
                                bundle.putBoolean("isKeyboardShow", z);
                                bundle.putString(MimeTypes.BASE_TYPE_TEXT, obj);
                                bundle.putInt("inputHeight", paddingBottom);
                                C80907o.m98781d(str2, bundle, C42008f.class, (C1256g) null);
                            } else {
                                C87412m.m108603p("linearRoot");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("linearRoot");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("gameCommentInputTxt");
                        throw null;
                    }
                } else {
                    C48473l lVar = C48473l.C48476c.f129682a;
                    GameInputConfig gameInputConfig2 = postCommentDialogUI.f113153s;
                    String str3 = gameInputConfig2 != null ? gameInputConfig2.identifier : null;
                    MMEditText mMEditText3 = postCommentDialogUI.f113142e;
                    if (mMEditText3 != null) {
                        String obj2 = mMEditText3.getText().toString();
                        InputPanelLinearLayout inputPanelLinearLayout3 = this.f113171d.f113144g;
                        if (inputPanelLinearLayout3 != null) {
                            int height2 = inputPanelLinearLayout3.getHeight();
                            InputPanelLinearLayout inputPanelLinearLayout4 = this.f113171d.f113144g;
                            if (inputPanelLinearLayout4 != null) {
                                C48472k kVar = new C48472k(obj2, 0, height2 - inputPanelLinearLayout4.getPaddingBottom(), z);
                                C48473l.C48475b bVar = lVar.f129681a.get(str3);
                                if (bVar != null) {
                                    bVar.mo65761b(kVar);
                                }
                            } else {
                                C87412m.m108603p("linearRoot");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("linearRoot");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("gameCommentInputTxt");
                        throw null;
                    }
                }
                if (z) {
                    this.f113171d.mo65906L7().setVisibility(0);
                    InputPanelLinearLayout inputPanelLinearLayout5 = this.f113171d.f113144g;
                    if (inputPanelLinearLayout5 != null) {
                        inputPanelLinearLayout5.setPadding(0, 0, 0, i);
                    } else {
                        C87412m.m108603p("linearRoot");
                        throw null;
                    }
                } else {
                    this.f113171d.mo65907M7();
                    this.f113171d.mo65906L7().setVisibility(8);
                    InputPanelLinearLayout inputPanelLinearLayout6 = this.f113171d.f113144g;
                    if (inputPanelLinearLayout6 != null) {
                        inputPanelLinearLayout6.setPadding(0, 0, 0, 0);
                    } else {
                        C87412m.m108603p("linearRoot");
                        throw null;
                    }
                }
                PostCommentDialogUI postCommentDialogUI2 = this.f113171d;
                if (postCommentDialogUI2.f113160z) {
                    postCommentDialogUI2.mo65910P7();
                    this.f113171d.f113160z = false;
                    return;
                }
                return;
            }
            C87412m.m108603p("gameCommentInputTxt");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$l */
    public static final class C42014l implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ PostCommentDialogUI f113172a;

        /* renamed from: b */
        public final /* synthetic */ IEmojiInfo f113173b;

        public C42014l(PostCommentDialogUI postCommentDialogUI, IEmojiInfo iEmojiInfo) {
            this.f113172a = postCommentDialogUI;
            this.f113173b = iEmojiInfo;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            String str2 = this.f113172a.f113155u;
            if (str2 == null || str2.length() == 0) {
                this.f113172a.mo65909O7();
            } else {
                this.f113172a.mo65912R7(this.f113173b);
            }
        }
    }

    /* renamed from: H7 */
    public static final void m45662H7(PostCommentDialogUI postCommentDialogUI) {
        ChatFooterPanel chatFooterPanel = postCommentDialogUI.f113141d;
        if (chatFooterPanel != null) {
            chatFooterPanel.mo100196h();
            ChatFooterPanel chatFooterPanel2 = postCommentDialogUI.f113141d;
            if (chatFooterPanel2 != null) {
                chatFooterPanel2.setVisibility(8);
                ImageView imageView = postCommentDialogUI.f113143f;
                if (imageView != null) {
                    postCommentDialogUI.mo65903I7(imageView, C0966R.raw.game_comment_smiley, postCommentDialogUI.f113137C);
                } else {
                    C87412m.m108603p("ivSmileyIcon");
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

    /* renamed from: I7 */
    public final void mo65903I7(ImageView imageView, int i, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == -1) {
                        Drawable drawable = imageView.getDrawable();
                        C74933u4.m89769f(drawable, C111105a.m151500b(this, C0966R.color.al9));
                        imageView.setImageDrawable(drawable);
                        return;
                    }
                    Object obj = C111105a.f332697a;
                    Drawable b = C111105a.C111110c.m151511b(this, i);
                    if (b != null) {
                        C74933u4.m89769f(b, C111105a.m151500b(this, C0966R.color.al9));
                        imageView.setImageDrawable(b);
                    }
                }
            } else if (i == -1) {
                Drawable drawable2 = imageView.getDrawable();
                C74933u4.m89769f(drawable2, C111105a.m151500b(this, C0966R.color.f3135ap));
                imageView.setImageDrawable(drawable2);
            } else {
                Object obj2 = C111105a.f332697a;
                Drawable b2 = C111105a.C111110c.m151511b(this, i);
                if (b2 != null) {
                    C74933u4.m89769f(b2, C111105a.m151500b(this, C0966R.color.f3135ap));
                    imageView.setImageDrawable(b2);
                }
            }
        } else if (i == -1) {
            Drawable drawable3 = imageView.getDrawable();
            C74933u4.m89769f(drawable3, C111105a.m151500b(this, C0966R.color.f3133gi));
            imageView.setImageDrawable(drawable3);
        } else {
            Object obj3 = C111105a.f332697a;
            Drawable b3 = C111105a.C111110c.m151511b(this, i);
            if (b3 != null) {
                C74933u4.m89769f(b3, C111105a.m151500b(this, C0966R.color.f3133gi));
                imageView.setImageDrawable(b3);
            }
        }
    }

    /* renamed from: J7 */
    public final void mo65904J7(int i, boolean z, String str) {
        Integer num;
        C87412m.m108594g(str, "userName");
        MMEditText mMEditText = this.f113142e;
        if (mMEditText != null) {
            Editable text = mMEditText.getText();
            C87412m.m108593f(text, "gameCommentInputTxt.text");
            String obj = text.subSequence(0, i).toString();
            int G = C112550d0.m153771G(obj, '@', 0, false, 6, (Object) null);
            if (G < obj.length() && G >= 0) {
                String substring = obj.substring(0, G);
                C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                MMEditText mMEditText2 = this.f113142e;
                if (mMEditText2 != null) {
                    Editable text2 = mMEditText2.getText();
                    C87412m.m108593f(text2, "gameCommentInputTxt.text");
                    String obj2 = text2.subSequence(i, text2.length()).toString();
                    C42003a aVar = this.f113138D;
                    aVar.getClass();
                    aVar.f113162b = "";
                    this.f113138D.f113161a = false;
                    int i2 = i - G;
                    if (C87412m.m108589b(str, "")) {
                        for (Map.Entry next : this.f113138D.f113165e.entrySet()) {
                            if (((Number) ((C13604l) next.getValue()).f38555d).intValue() == G) {
                                str = (String) next.getKey();
                            }
                        }
                    }
                    ((ArrayList) this.f113138D.f113163c).remove(str);
                    this.f113138D.f113165e.remove(str);
                    if (!z && (num = this.f113138D.f113164d.get(str)) != null) {
                        mo65905K7().mo65894B1(num.intValue());
                    }
                    this.f113138D.f113164d.remove(str);
                    for (Map.Entry next2 : this.f113138D.f113165e.entrySet()) {
                        if (((Number) ((C13604l) next2.getValue()).f38555d).intValue() >= i) {
                            next2.setValue(new C13604l(Integer.valueOf(((Number) ((C13604l) next2.getValue()).f38555d).intValue() - i2), Integer.valueOf(((Number) ((C13604l) next2.getValue()).f38556e).intValue() - i2)));
                        }
                    }
                    SpannableString spannableString = new SpannableString(substring + obj2);
                    try {
                        for (Map.Entry next3 : this.f113138D.f113165e.entrySet()) {
                            spannableString.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(C0966R.color.ao8)), ((Number) ((C13604l) next3.getValue()).f38555d).intValue(), ((Number) ((C13604l) next3.getValue()).f38556e).intValue(), 33);
                        }
                    } catch (IndexOutOfBoundsException unused) {
                    }
                    CharSequence a = C102226d.m134696a(getContext(), spannableString);
                    MMEditText mMEditText3 = this.f113142e;
                    if (mMEditText3 != null) {
                        mMEditText3.setText(a);
                        MMEditText mMEditText4 = this.f113142e;
                        if (mMEditText4 != null) {
                            mMEditText4.setSelection(G);
                            if (((ArrayList) this.f113138D.f113163c).size() == 0) {
                                mo65907M7();
                                return;
                            }
                            return;
                        }
                        C87412m.m108603p("gameCommentInputTxt");
                        throw null;
                    }
                    C87412m.m108603p("gameCommentInputTxt");
                    throw null;
                }
                C87412m.m108603p("gameCommentInputTxt");
                throw null;
            }
            return;
        }
        C87412m.m108603p("gameCommentInputTxt");
        throw null;
    }

    /* renamed from: K7 */
    public final AtSomeoneView mo65905K7() {
        AtSomeoneView atSomeoneView = this.f113152r;
        if (atSomeoneView != null) {
            return atSomeoneView;
        }
        C87412m.m108603p("atSomeoneView");
        throw null;
    }

    /* renamed from: L7 */
    public final GameEmojiPickView mo65906L7() {
        GameEmojiPickView gameEmojiPickView = this.f113151q;
        if (gameEmojiPickView != null) {
            return gameEmojiPickView;
        }
        C87412m.m108603p("quickPickEmoji");
        throw null;
    }

    /* renamed from: M7 */
    public final void mo65907M7() {
        GameInputConfig gameInputConfig = this.f113153s;
        if (gameInputConfig != null && gameInputConfig.canShowAtSomeoneView) {
            View view = this.f113149o;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI", "hideAtSomeoneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI", "hideAtSomeoneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById = findViewById(C0966R.C0970id.f358340l73);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI", "hideAtSomeoneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI", "hideAtSomeoneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f113138D.f113164d.clear();
                mo65905K7().setSelectedDatas(this.f113138D.f113163c);
                C42003a aVar3 = this.f113138D;
                aVar3.getClass();
                aVar3.f113162b = "";
                this.f113139E = true;
                this.f113138D.f113161a = false;
                return;
            }
            C87412m.m108603p("atSomeoneLayout");
            throw null;
        }
    }

    /* renamed from: N7 */
    public final void mo65908N7(String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        AppCompatActivity context = getContext();
        MMEditText mMEditText = this.f113142e;
        if (mMEditText != null) {
            String obj = mMEditText.getText().toString();
            MMEditText mMEditText2 = this.f113142e;
            if (mMEditText2 != null) {
                int b = C102226d.m134697b(context, obj, mMEditText2.getSelectionStart());
                AppCompatActivity context2 = getContext();
                MMEditText mMEditText3 = this.f113142e;
                if (mMEditText3 != null) {
                    String obj2 = mMEditText3.getText().toString();
                    MMEditText mMEditText4 = this.f113142e;
                    if (mMEditText4 != null) {
                        int b2 = C102226d.m134697b(context2, obj2, mMEditText4.getSelectionEnd());
                        MMEditText mMEditText5 = this.f113142e;
                        if (mMEditText5 != null) {
                            StringBuffer stringBuffer = new StringBuffer(mMEditText5.getText());
                            String str2 = stringBuffer.substring(0, b) + str + stringBuffer.substring(b2, stringBuffer.length());
                            int i = -1;
                            if (C11171e.m11046c(21)) {
                                MMEditText mMEditText6 = this.f113142e;
                                if (mMEditText6 != null) {
                                    InputFilter[] filters = mMEditText6.getFilters();
                                    C87412m.m108593f(filters, "gameCommentInputTxt.filters");
                                    for (InputFilter inputFilter : filters) {
                                        if (inputFilter instanceof InputFilter.LengthFilter) {
                                            i = ((InputFilter.LengthFilter) inputFilter).getMax();
                                        }
                                    }
                                } else {
                                    C87412m.m108603p("gameCommentInputTxt");
                                    throw null;
                                }
                            }
                            for (Map.Entry next : this.f113138D.f113165e.entrySet()) {
                                if (b <= ((Number) ((C13604l) next.getValue()).f38555d).intValue()) {
                                    next.setValue(new C13604l(Integer.valueOf(((Number) ((C13604l) next.getValue()).f38555d).intValue() + str.length()), Integer.valueOf(((Number) ((C13604l) next.getValue()).f38556e).intValue() + str.length())));
                                }
                            }
                            int length = b + str.length();
                            if (1 <= i && i < length) {
                                Log.m105919d("MicroMsg.MMEditText", "exceed :%s, %s", Integer.valueOf(i), Integer.valueOf(length));
                                return;
                            }
                            SpannableString spannableString = new SpannableString(str2);
                            try {
                                for (Map.Entry next2 : this.f113138D.f113165e.entrySet()) {
                                    spannableString.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(C0966R.color.ao8)), ((Number) ((C13604l) next2.getValue()).f38555d).intValue(), ((Number) ((C13604l) next2.getValue()).f38556e).intValue(), 33);
                                }
                            } catch (IndexOutOfBoundsException unused) {
                            }
                            MMEditText mMEditText7 = this.f113142e;
                            if (mMEditText7 != null) {
                                mMEditText7.setText(C102226d.m134696a(getContext(), spannableString));
                                MMEditText mMEditText8 = this.f113142e;
                                if (mMEditText8 != null) {
                                    mMEditText8.setSelection(length);
                                } else {
                                    C87412m.m108603p("gameCommentInputTxt");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("gameCommentInputTxt");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("gameCommentInputTxt");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("gameCommentInputTxt");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("gameCommentInputTxt");
                    throw null;
                }
            } else {
                C87412m.m108603p("gameCommentInputTxt");
                throw null;
            }
        } else {
            C87412m.m108603p("gameCommentInputTxt");
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.view.inputmethod.InputMethodManager} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: O7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65909O7() {
        /*
            r4 = this;
            boolean r0 = r4.f113135A
            if (r0 == 0) goto L_0x0031
            r0 = 1
            r4.f113160z = r0
            com.tencent.mm.ui.widget.MMEditText r0 = r4.f113142e
            r1 = 0
            if (r0 == 0) goto L_0x002b
            android.content.Context r2 = r0.getContext()
            java.lang.String r3 = "input_method"
            java.lang.Object r2 = r2.getSystemService(r3)
            boolean r3 = r2 instanceof android.view.inputmethod.InputMethodManager
            if (r3 == 0) goto L_0x001d
            r1 = r2
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
        L_0x001d:
            if (r1 == 0) goto L_0x0027
            android.os.IBinder r0 = r0.getWindowToken()
            r2 = 0
            r1.hideSoftInputFromWindow(r0, r2)
        L_0x0027:
            r4.mo65907M7()
            goto L_0x0034
        L_0x002b:
            java.lang.String r0 = "gameCommentInputTxt"
            gy3.C87412m.m108603p(r0)
            throw r1
        L_0x0031:
            r4.mo65910P7()
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI.mo65909O7():void");
    }

    /* renamed from: P7 */
    public final void mo65910P7() {
        Intent intent = new Intent();
        intent.putExtra("key_can_select_video_and_pic", true);
        intent.putExtra("key_send_raw_image", false);
        intent.putExtra("max_select_count", 1);
        intent.putExtra("query_source_type", 15);
        intent.putExtra("query_media_type", 1);
        intent.putExtra("show_header_view", false);
        intent.putExtra("game_haowan_ignore_video_preview", true);
        intent.addFlags(67108864);
        C88144b.m109795m(getContext(), "game", ".media.GamePublishGalleryUI", intent, CdnLogic.kMediaTypeBeatificFile);
    }

    /* renamed from: Q7 */
    public final void mo65911Q7(IEmojiInfo iEmojiInfo) {
        String str = this.f113155u;
        String string = str == null || str.length() == 0 ? getString(C0966R.string.mhu) : getString(C0966R.string.mht);
        C87412m.m108593f(string, "if (selectedImagePath.is…_replace_image)\n        }");
        String str2 = this.f113155u;
        String string2 = str2 == null || str2.length() == 0 ? getString(C0966R.string.f360851mi0) : getString(C0966R.string.mhz);
        C87412m.m108593f(string2, "if (selectedImagePath.is…g.game_replace)\n        }");
        C77426q qVar = new C77426q(getContext());
        qVar.mo107595g(string);
        qVar.mo107604p(false);
        qVar.mo107589a(true);
        qVar.mo107602n(string2);
        qVar.mo107600l(new C42014l(this, iEmojiInfo));
        qVar.mo107598j(getString(C0966R.string.f7926wf));
        qVar.mo107603o();
    }

    /* renamed from: R7 */
    public final void mo65912R7(IEmojiInfo iEmojiInfo) {
        this.f113154t = iEmojiInfo;
        if (iEmojiInfo == null) {
            ImageView imageView = this.f113148n;
            if (imageView != null) {
                imageView.setVisibility(8);
            } else {
                C87412m.m108603p("ivPicPlaceholder");
                throw null;
            }
        } else {
            ImageView imageView2 = this.f113148n;
            if (imageView2 != null) {
                imageView2.setImageBitmap(iEmojiInfo.mo62698y(this));
                ImageView imageView3 = this.f113148n;
                if (imageView3 != null) {
                    imageView3.setVisibility(0);
                    this.f113155u = null;
                    return;
                }
                C87412m.m108603p("ivPicPlaceholder");
                throw null;
            }
            C87412m.m108603p("ivPicPlaceholder");
            throw null;
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(-1, C0966R.C0968anim.f2461dn);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359806cw1;
    }

    public final void init() {
        ChatFooterPanel chatFooterPanel;
        MMEditText mMEditText = this.f113142e;
        if (mMEditText != null) {
            mMEditText.addTextChangedListener(new C42010h(this));
            if (C30699x0.m39154a() == null) {
                this.f113141d = new C72834u0(this);
            } else {
                if (this.f113137C == 2) {
                    chatFooterPanel = C78160t0.m94372c(this, true);
                    C87412m.m108593f(chatFooterPanel, "getSmileyPanel(this, true)");
                } else {
                    chatFooterPanel = C30699x0.m39154a().si0(this);
                    C87412m.m108593f(chatFooterPanel, "getSmileyPanel().getSmileyPanel(this)");
                }
                this.f113141d = chatFooterPanel;
                chatFooterPanel.setShowGame(false);
                chatFooterPanel.mo100203o(false, false);
                GameInputConfig gameInputConfig = this.f113153s;
                String str = gameInputConfig != null ? gameInputConfig.emoticonBoardViewType : null;
                if (C87412m.m108589b(str, "emojiCustomCommon")) {
                    chatFooterPanel.mo100204p(true, false);
                    chatFooterPanel.setShowStore(true);
                    chatFooterPanel.setShowSearch(true);
                } else if (C87412m.m108589b(str, "emojiNoCustomCommon")) {
                    chatFooterPanel.mo100204p(false, false);
                    chatFooterPanel.setShowStore(true);
                    chatFooterPanel.setShowSearch(true);
                } else {
                    chatFooterPanel.mo100204p(false, false);
                    chatFooterPanel.setShowStore(false);
                    chatFooterPanel.setShowSearch(false);
                }
                chatFooterPanel.setShowSmiley(true);
                chatFooterPanel.setTalkerName("");
                int i = ChatFooterPanel.f211589f;
                chatFooterPanel.setEntranceScene(16);
                MMEditText mMEditText2 = this.f113142e;
                if (mMEditText2 != null) {
                    chatFooterPanel.setToSendText(mMEditText2.getText().toString());
                    chatFooterPanel.setOnTextOperationListener(new C46385l(chatFooterPanel, this));
                    ChatFooterPanel chatFooterPanel2 = this.f113141d;
                    if (chatFooterPanel2 != null) {
                        chatFooterPanel2.setCallback(new C46386m(this));
                        ChatFooterPanel chatFooterPanel3 = this.f113141d;
                        if (chatFooterPanel3 != null) {
                            chatFooterPanel3.setVisibility(8);
                            InputPanelLinearLayout inputPanelLinearLayout = this.f113144g;
                            if (inputPanelLinearLayout != null) {
                                ChatFooterPanel chatFooterPanel4 = this.f113141d;
                                if (chatFooterPanel4 != null) {
                                    inputPanelLinearLayout.addView(chatFooterPanel4, -1, KeyBoardUtil.getValidPanelHeight(getContext()));
                                } else {
                                    C87412m.m108603p("smileyPanel");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("linearRoot");
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
                    C87412m.m108603p("gameCommentInputTxt");
                    throw null;
                }
            }
            MMEditText mMEditText3 = this.f113142e;
            if (mMEditText3 != null) {
                mMEditText3.setOnTouchListener(new C42011i(this));
                ImageView imageView = this.f113143f;
                if (imageView != null) {
                    imageView.setOnClickListener(new C42012j(this));
                } else {
                    C87412m.m108603p("ivSmileyIcon");
                    throw null;
                }
            } else {
                C87412m.m108603p("gameCommentInputTxt");
                throw null;
            }
        } else {
            C87412m.m108603p("gameCommentInputTxt");
            throw null;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10011 && i2 == -1) {
            ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("CropImage_OutputPath_List") : null;
            if (!(stringArrayListExtra == null || stringArrayListExtra.isEmpty())) {
                C87412m.m108591d(stringArrayListExtra);
                String str = stringArrayListExtra.get(0);
                this.f113155u = str;
                this.f113154t = null;
                int a = C79406f.m96347a(this, 32.0f);
                Bitmap createThumbBitmap = BitmapUtil.createThumbBitmap(str, a, a, true, false);
                if (createThumbBitmap != null) {
                    ImageView imageView = this.f113148n;
                    if (imageView != null) {
                        imageView.setImageBitmap(createThumbBitmap);
                        ImageView imageView2 = this.f113148n;
                        if (imageView2 != null) {
                            imageView2.setVisibility(0);
                        } else {
                            C87412m.m108603p("ivPicPlaceholder");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("ivPicPlaceholder");
                        throw null;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.view.inputmethod.InputMethodManager} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            r0 = 1
            r10.setTransparentTheme(r0)
            r10.customfixStatusbar(r0)
            super.onCreate(r11)
            com.tencent.mm.ui.MMActivityController r11 = r10.getController()
            r1 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r1 = p385u2.C111105a.m151500b(r10, r1)
            r11.mo177105z0(r1)
            androidx.appcompat.app.ActionBar r11 = r10.getSupportActionBar()
            if (r11 == 0) goto L_0x0021
            r11.mo91104o()
        L_0x0021:
            android.content.Intent r11 = r10.getIntent()
            java.lang.String r1 = "game_center_input_config"
            android.os.Parcelable r11 = r11.getParcelableExtra(r1)
            com.tencent.mm.plugin.game.api.GameInputConfig r11 = (com.tencent.p014mm.plugin.game.api.GameInputConfig) r11
            r10.f113153s = r11
            r1 = 2
            if (r11 == 0) goto L_0x0040
            boolean r2 = r11.isToolsProcess
            r10.f113136B = r2
            int r2 = r11.forceUserInterfaceStyle
            r10.f113137C = r2
            int r11 = r11.maxInputCharsCount
            int r11 = r11 * 2
            r10.f113140F = r11
        L_0x0040:
            r11 = 2131305558(0x7f092456, float:1.822929E38)
            android.view.View r11 = r10.findViewById(r11)
            java.lang.String r2 = "findViewById(R.id.game_quick_pick_emoji)"
            gy3.C87412m.m108593f(r11, r2)
            com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView r11 = (com.tencent.p014mm.plugin.game.luggage.p801ui.circle.GameEmojiPickView) r11
            r10.f113151q = r11
            r11 = 2131312334(0x7f093ece, float:1.8243034E38)
            android.view.View r11 = r10.findViewById(r11)
            java.lang.String r2 = "findViewById(R.id.reply_box)"
            gy3.C87412m.m108593f(r11, r2)
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r10.f113146i = r11
            r11 = 2131297364(0x7f090454, float:1.821267E38)
            android.view.View r11 = r10.findViewById(r11)
            java.lang.String r2 = "findViewById(R.id.at_someone_layout)"
            gy3.C87412m.m108593f(r11, r2)
            r10.f113149o = r11
            r11 = 2131297365(0x7f090455, float:1.8212673E38)
            android.view.View r11 = r10.findViewById(r11)
            java.lang.String r2 = "findViewById(R.id.at_someone_view)"
            gy3.C87412m.m108593f(r11, r2)
            com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView r11 = (com.tencent.p014mm.plugin.game.luggage.p801ui.circle.AtSomeoneView) r11
            r10.f113152r = r11
            com.tencent.mm.plugin.game.api.GameInputConfig r11 = r10.f113153s
            r2 = 0
            if (r11 == 0) goto L_0x0089
            boolean r11 = r11.canShowAtSomeoneView
            if (r11 != r0) goto L_0x0089
            r11 = 1
            goto L_0x008a
        L_0x0089:
            r11 = 0
        L_0x008a:
            r3 = 0
            if (r11 == 0) goto L_0x00d7
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            com.tencent.mm.plugin.game.api.GameInputConfig r4 = r10.f113153s
            if (r4 == 0) goto L_0x0099
            java.lang.String r4 = r4.atContentId
            goto L_0x009a
        L_0x0099:
            r4 = r3
        L_0x009a:
            java.lang.String r5 = "contentId"
            r11.putString(r5, r4)
            com.tencent.mm.plugin.game.api.GameInputConfig r4 = r10.f113153s
            if (r4 == 0) goto L_0x00b7
            java.lang.String r4 = r4.atContext
            if (r4 == 0) goto L_0x00b7
            java.nio.charset.Charset r5 = z04.C119027c.f356488a
            byte[] r4 = r4.getBytes(r5)
            java.lang.String r5 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r4, r5)
            java.lang.String r5 = "context"
            r11.putByteArray(r5, r4)
        L_0x00b7:
            com.tencent.mm.plugin.game.api.GameInputConfig r4 = r10.f113153s
            if (r4 == 0) goto L_0x00c2
            int r4 = r4.atLimit
            java.lang.String r5 = "limit"
            r11.putInt(r5, r4)
        L_0x00c2:
            com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView r4 = r10.mo65905K7()
            r4.f113114K1 = r11
            r4.mo65895C1(r3)
            com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView r11 = r10.mo65905K7()
            iy1.c r4 = new iy1.c
            r4.<init>(r10)
            r11.setOnItemClickListener(r4)
        L_0x00d7:
            android.widget.LinearLayout r11 = r10.f113146i
            if (r11 == 0) goto L_0x03db
            int r4 = r10.f113137C
            r5 = 2131099794(0x7f060092, float:1.7811951E38)
            r6 = 2131101836(0x7f06088c, float:1.7816093E38)
            if (r4 == r0) goto L_0x00fb
            if (r4 == r1) goto L_0x00e8
            goto L_0x010d
        L_0x00e8:
            android.graphics.drawable.Drawable r11 = r11.getBackground()
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            int r7 = p385u2.C111105a.m151500b(r10, r5)
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.DARKEN
            r4.<init>(r7, r8)
            r11.setColorFilter(r4)
            goto L_0x010d
        L_0x00fb:
            android.graphics.drawable.Drawable r11 = r11.getBackground()
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            int r7 = p385u2.C111105a.m151500b(r10, r6)
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.DARKEN
            r4.<init>(r7, r8)
            r11.setColorFilter(r4)
        L_0x010d:
            r11 = 2131305377(0x7f0923a1, float:1.8228923E38)
            android.view.View r11 = r10.findViewById(r11)
            java.lang.String r4 = "findViewById(R.id.game_comment_input_txt)"
            gy3.C87412m.m108593f(r11, r4)
            com.tencent.mm.ui.widget.MMEditText r11 = (com.tencent.p014mm.p136ui.widget.MMEditText) r11
            r10.f113142e = r11
            r11 = 2131316278(0x7f094e36, float:1.8251033E38)
            android.view.View r11 = r10.findViewById(r11)
            java.lang.String r4 = "findViewById(R.id.view_placeholder_top)"
            gy3.C87412m.m108593f(r11, r4)
            r10.f113150p = r11
            r11 = 2131307316(0x7f092b34, float:1.8232856E38)
            android.view.View r11 = r10.findViewById(r11)
            java.lang.String r4 = "findViewById(R.id.linearRoot)"
            gy3.C87412m.m108593f(r11, r4)
            com.tencent.mm.ui.widget.InputPanelLinearLayout r11 = (com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout) r11
            r10.f113144g = r11
            r11 = 2131306797(0x7f09292d, float:1.8231803E38)
            android.view.View r11 = r10.findViewById(r11)
            java.lang.String r4 = "findViewById(R.id.iv_smiley_icon)"
            gy3.C87412m.m108593f(r11, r4)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r10.f113143f = r11
            int r4 = r10.f113137C
            r7 = -1
            r10.mo65903I7(r11, r7, r4)
            r11 = 2131306773(0x7f092915, float:1.8231755E38)
            android.view.View r11 = r10.findViewById(r11)
            java.lang.String r4 = "findViewById(R.id.iv_pic_icon)"
            gy3.C87412m.m108593f(r11, r4)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r10.f113145h = r11
            int r4 = r10.f113137C
            r10.mo65903I7(r11, r7, r4)
            r11 = 2131298401(0x7f090861, float:1.8214774E38)
            android.view.View r11 = r10.findViewById(r11)
            java.lang.String r4 = "findViewById(R.id.bt_send_comment)"
            gy3.C87412m.m108593f(r11, r4)
            android.widget.Button r11 = (android.widget.Button) r11
            r10.f113147j = r11
            r11 = 2131306726(0x7f0928e6, float:1.823166E38)
            android.view.View r11 = r10.findViewById(r11)
            java.lang.String r4 = "findViewById(R.id.iv_comment_pic)"
            gy3.C87412m.m108593f(r11, r4)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r10.f113148n = r11
            iy1.d r4 = new iy1.d
            r4.<init>(r10)
            r11.setOnClickListener(r4)
            android.widget.ImageView r11 = r10.f113145h
            java.lang.String r4 = "ivPicIcon"
            if (r11 == 0) goto L_0x03d7
            iy1.e r7 = new iy1.e
            r7.<init>(r10)
            r11.setOnClickListener(r7)
            com.tencent.mm.plugin.game.api.GameInputConfig r11 = r10.f113153s
            if (r11 == 0) goto L_0x01a6
            boolean r11 = r11.hideImgBtn
            if (r11 != r0) goto L_0x01a6
            r11 = 1
            goto L_0x01a7
        L_0x01a6:
            r11 = 0
        L_0x01a7:
            r7 = 8
            if (r11 == 0) goto L_0x01b7
            android.widget.ImageView r11 = r10.f113145h
            if (r11 == 0) goto L_0x01b3
            r11.setVisibility(r7)
            goto L_0x01b7
        L_0x01b3:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x01b7:
            android.view.View r11 = r10.f113150p
            if (r11 == 0) goto L_0x03d0
            iy1.f r4 = new iy1.f
            r4.<init>(r10)
            r11.setOnClickListener(r4)
            android.widget.Button r11 = r10.f113147j
            java.lang.String r4 = "btSendComment"
            if (r11 == 0) goto L_0x03cc
            rx3.g r8 = r10.f113157w
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            java.util.Map r8 = (java.util.Map) r8
            com.tencent.mm.plugin.game.api.GameInputConfig r9 = r10.f113153s
            if (r9 == 0) goto L_0x01da
            java.lang.String r9 = r9.returnKeyType
            goto L_0x01db
        L_0x01da:
            r9 = r3
        L_0x01db:
            java.lang.Object r8 = r8.get(r9)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r11.setText(r8)
            android.widget.Button r11 = r10.f113147j
            if (r11 == 0) goto L_0x03c8
            iy1.g r4 = new iy1.g
            r4.<init>(r10)
            r11.setOnClickListener(r4)
            com.tencent.mm.plugin.game.api.GameInputConfig r11 = r10.f113153s
            java.lang.String r4 = "gameCommentInputTxt"
            if (r11 == 0) goto L_0x0234
            java.lang.String r8 = r11.textPlaceHolder
            if (r8 == 0) goto L_0x0206
            com.tencent.mm.ui.widget.MMEditText r9 = r10.f113142e
            if (r9 == 0) goto L_0x0202
            r9.setHint(r8)
            goto L_0x0206
        L_0x0202:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x0206:
            int r8 = r11.maxInputCharsCo
            if (r8 <= 0) goto L_0x0216
            com.tencent.mm.ui.widget.MMEditText r9 = r10.f113142e
            if (r9 == 0) goto L_0x0212
            r9.setMaxEms(r8)
            goto L_0x0216
        L_0x0212:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x0216:
            java.lang.String r8 = r11.contentText
            if (r8 == 0) goto L_0x0223
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0221
            goto L_0x0223
        L_0x0221:
            r8 = 0
            goto L_0x0224
        L_0x0223:
            r8 = 1
        L_0x0224:
            if (r8 != 0) goto L_0x0234
            com.tencent.mm.ui.widget.MMEditText r8 = r10.f113142e
            if (r8 == 0) goto L_0x0230
            java.lang.String r11 = r11.contentText
            r8.mo98046o(r11)
            goto L_0x0234
        L_0x0230:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x0234:
            iy1.k r11 = new iy1.k
            r11.<init>(r10)
            com.tencent.mm.plugin.game.api.GameInputConfig r8 = r10.f113153s
            if (r8 == 0) goto L_0x0243
            boolean r8 = r8.canShowAtSomeoneView
            if (r8 != r0) goto L_0x0243
            r8 = 1
            goto L_0x0244
        L_0x0243:
            r8 = 0
        L_0x0244:
            if (r8 == 0) goto L_0x0267
            com.tencent.mm.ui.widget.MMEditText r8 = r10.f113142e
            if (r8 == 0) goto L_0x0263
            iy1.h r9 = new iy1.h
            r9.<init>(r10)
            r8.setOnClickListener(r9)
            com.tencent.mm.ui.widget.MMEditText r8 = r10.f113142e
            if (r8 == 0) goto L_0x025f
            iy1.i r9 = new iy1.i
            r9.<init>(r10)
            r8.setSelectionChangedListener(r9)
            goto L_0x0267
        L_0x025f:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x0263:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x0267:
            com.tencent.mm.plugin.game.api.GameInputConfig r8 = r10.f113153s
            if (r8 == 0) goto L_0x026e
            java.lang.String r8 = r8.quickEmojiList
            goto L_0x026f
        L_0x026e:
            r8 = r3
        L_0x026f:
            if (r8 == 0) goto L_0x027a
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0278
            goto L_0x027a
        L_0x0278:
            r8 = 0
            goto L_0x027b
        L_0x027a:
            r8 = 1
        L_0x027b:
            if (r8 != 0) goto L_0x0290
            com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView r8 = r10.mo65906L7()
            com.tencent.mm.plugin.game.api.GameInputConfig r9 = r10.f113153s
            if (r9 == 0) goto L_0x0288
            java.lang.String r9 = r9.quickEmojiList
            goto L_0x0289
        L_0x0288:
            r9 = r3
        L_0x0289:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.setEmojiStr(r9)
        L_0x0290:
            com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView r8 = r10.mo65906L7()
            r8.setOnTextOperationListener(r11)
            com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView r11 = r10.mo65906L7()
            il.v r8 = r11.f162831e
            java.util.LinkedList<fl.q0> r9 = r11.f162836j
            r8.mo138125c(r9)
            il.v r11 = r11.f162831e
            r11.notifyDataSetChanged()
            com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView r11 = r10.mo65906L7()
            com.tencent.mm.plugin.game.api.GameInputConfig r8 = r10.f113153s
            if (r8 == 0) goto L_0x02b5
            boolean r8 = r8.showEmojiQuickInputView
            if (r8 != r0) goto L_0x02b5
            r8 = 1
            goto L_0x02b6
        L_0x02b5:
            r8 = 0
        L_0x02b6:
            r11.setCanShowEmoji(r8)
            int r11 = r10.f113137C
            java.lang.String r8 = "linearRoot"
            if (r11 == r0) goto L_0x02fe
            if (r11 == r1) goto L_0x02c2
            goto L_0x0330
        L_0x02c2:
            com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView r11 = r10.mo65906L7()
            r0 = 2131099793(0x7f060091, float:1.781195E38)
            int r1 = p385u2.C111105a.m151500b(r10, r0)
            r11.setBackgroundColor(r1)
            com.tencent.mm.ui.widget.InputPanelLinearLayout r11 = r10.f113144g
            if (r11 == 0) goto L_0x02fa
            int r0 = p385u2.C111105a.m151500b(r10, r0)
            r11.setBackgroundColor(r0)
            com.tencent.mm.ui.widget.MMEditText r11 = r10.f113142e
            if (r11 == 0) goto L_0x02f6
            int r0 = p385u2.C111105a.m151500b(r10, r5)
            r11.setBackgroundColor(r0)
            com.tencent.mm.ui.widget.MMEditText r11 = r10.f113142e
            if (r11 == 0) goto L_0x02f2
            int r0 = p385u2.C111105a.m151500b(r10, r6)
            r11.setTextColor(r0)
            goto L_0x0330
        L_0x02f2:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x02f6:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x02fa:
            gy3.C87412m.m108603p(r8)
            throw r3
        L_0x02fe:
            com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView r11 = r10.mo65906L7()
            r0 = 2131100818(0x7f060492, float:1.7814028E38)
            int r1 = p385u2.C111105a.m151500b(r10, r0)
            r11.setBackgroundColor(r1)
            com.tencent.mm.ui.widget.InputPanelLinearLayout r11 = r10.f113144g
            if (r11 == 0) goto L_0x03c4
            int r0 = p385u2.C111105a.m151500b(r10, r0)
            r11.setBackgroundColor(r0)
            com.tencent.mm.ui.widget.MMEditText r11 = r10.f113142e
            if (r11 == 0) goto L_0x03c0
            int r0 = p385u2.C111105a.m151500b(r10, r6)
            r11.setBackgroundColor(r0)
            com.tencent.mm.ui.widget.MMEditText r11 = r10.f113142e
            if (r11 == 0) goto L_0x03bc
            r0 = 2131100170(0x7f06020a, float:1.7812714E38)
            int r0 = p385u2.C111105a.m151500b(r10, r0)
            r11.setTextColor(r0)
        L_0x0330:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r0 = r10.f113140F
            com.tencent.mm.ui.tools.p0$a r1 = com.tencent.p014mm.p136ui.tools.C45078p0.C45079a.MODE_CHINESE_AS_2
            iy1.j r5 = new iy1.j
            r5.<init>(r10, r0, r1)
            r11.add(r5)
            com.tencent.mm.ui.widget.MMEditText r0 = r10.f113142e
            if (r0 == 0) goto L_0x03b8
            qn3.c r0 = qn3.C77382c.m93286b(r0)
            int r1 = r10.f113140F
            r0.f225611e = r2
            r0.f225610d = r1
            r0.f225613g = r11
            r0.mo107499d(r3)
            r10.init()
            rx3.g r11 = r10.f113156v
            rx3.n r11 = (rx3.C36570n) r11
            java.lang.Object r11 = r11.getValue()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r0 = "defaultViewType"
            gy3.C87412m.m108593f(r11, r0)
            java.lang.String r0 = "image"
            boolean r0 = gy3.C87412m.m108589b(r11, r0)
            if (r0 == 0) goto L_0x0372
            r10.mo65909O7()
            goto L_0x03b3
        L_0x0372:
            java.lang.String r0 = "emoticon"
            boolean r11 = gy3.C87412m.m108589b(r11, r0)
            if (r11 == 0) goto L_0x038f
            android.widget.ImageView r11 = r10.f113143f
            if (r11 == 0) goto L_0x0389
            r11.performClick()
            com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView r11 = r10.mo65906L7()
            r11.setVisibility(r7)
            goto L_0x03b3
        L_0x0389:
            java.lang.String r11 = "ivSmileyIcon"
            gy3.C87412m.m108603p(r11)
            throw r3
        L_0x038f:
            com.tencent.mm.ui.widget.MMEditText r11 = r10.f113142e
            if (r11 == 0) goto L_0x03b4
            android.content.Context r0 = r11.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            boolean r1 = r0 instanceof android.view.inputmethod.InputMethodManager
            if (r1 == 0) goto L_0x03a4
            r3 = r0
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
        L_0x03a4:
            if (r3 == 0) goto L_0x03ac
            r11.requestFocus()
            r3.showSoftInput(r11, r2)
        L_0x03ac:
            com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView r11 = r10.mo65906L7()
            r11.setVisibility(r2)
        L_0x03b3:
            return
        L_0x03b4:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x03b8:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x03bc:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x03c0:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x03c4:
            gy3.C87412m.m108603p(r8)
            throw r3
        L_0x03c8:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x03cc:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x03d0:
            java.lang.String r11 = "viewPlaceHolderTop"
            gy3.C87412m.m108603p(r11)
            throw r3
        L_0x03d7:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x03db:
            java.lang.String r11 = "replyBox"
            gy3.C87412m.m108603p(r11)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        String str;
        super.onDestroy();
        GameInputConfig gameInputConfig = this.f113153s;
        if (gameInputConfig != null && (str = gameInputConfig.identifier) != null) {
            if (this.f113136B) {
                C80907o.m98781d(WeChatProcess.PROCESS_TOOLS, new IPCString(str), C42007e.class, (C1256g) null);
            } else {
                C48473l.C48476c.f129682a.f129681a.remove(str);
            }
        }
    }

    public void onResume() {
        super.onResume();
        InputPanelLinearLayout inputPanelLinearLayout = this.f113144g;
        if (inputPanelLinearLayout != null) {
            inputPanelLinearLayout.mo104200a(new C42013k(this));
        } else {
            C87412m.m108603p("linearRoot");
            throw null;
        }
    }
}
