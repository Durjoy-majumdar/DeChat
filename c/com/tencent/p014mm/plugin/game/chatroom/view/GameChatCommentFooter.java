package com.tencent.p014mm.plugin.game.chatroom.view;

import a14.C53895h;
import a14.C53934p0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.InputFilter;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39629l0;
import androidx.lifecycle.C54208j0;
import androidx.lifecycle.C54209k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMClearEditText;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Channel;
import com.tencent.p014mm.plugin.game.chatroom.p060ui.C41725h;
import com.tencent.p014mm.plugin.game.chatroom.p060ui.C41726i;
import com.tencent.p014mm.plugin.game.chatroom.p060ui.C41727j;
import com.tencent.p014mm.plugin.game.chatroom.p060ui.C41728k;
import com.tencent.p014mm.plugin.game.chatroom.p060ui.C41730m;
import com.tencent.p014mm.plugin.game.chatroom.p060ui.C4435g;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C30699x0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72806l1;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72834u0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72843y1;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dx1.C45488d;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mx1.C47127f;
import mx1.C47134j;
import p008bq.C67306k1;
import p192l4.C10462b;
import p206nj.C76865k;
import p629ny.C76979h;
import qo3.C101218e0;
import wq3.C111847h;
import wx3.C15601d;
import wx3.C66212f;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter */
public class GameChatCommentFooter extends InputPanelLinearLayout implements C111847h {

    /* renamed from: N */
    public static final /* synthetic */ int f112455N = 0;

    /* renamed from: A */
    public boolean f112456A = false;

    /* renamed from: B */
    public boolean f112457B = false;

    /* renamed from: C */
    public GameChatCommentFooter$$o f112458C;

    /* renamed from: D */
    public Map<String, List<String>> f112459D = new HashMap();

    /* renamed from: E */
    public String f112460E = "";

    /* renamed from: F */
    public String f112461F = "";

    /* renamed from: G */
    public GameChatCommentFooter$$n f112462G = new GameChatCommentFooter$$n(this);

    /* renamed from: H */
    public boolean f112463H = false;

    /* renamed from: I */
    public Channel f112464I;

    /* renamed from: J */
    public boolean f112465J = false;

    /* renamed from: K */
    public C101218e0 f112466K;

    /* renamed from: L */
    public boolean f112467L = false;

    /* renamed from: M */
    public C72806l1.C44611a f112468M = new GameChatCommentFooter$$m(this);

    /* renamed from: f */
    public MMActivity f112469f;

    /* renamed from: g */
    public ViewGroup f112470g;

    /* renamed from: h */
    public TextView f112471h;

    /* renamed from: i */
    public ImageView f112472i;

    /* renamed from: j */
    public MMEditText f112473j;

    /* renamed from: n */
    public TextView f112474n;

    /* renamed from: o */
    public ImageView f112475o;

    /* renamed from: p */
    public TextView f112476p;

    /* renamed from: q */
    public boolean f112477q = false;

    /* renamed from: r */
    public ChatFooterPanel f112478r;

    /* renamed from: s */
    public C72806l1 f112479s;

    /* renamed from: t */
    public int f112480t = -1;

    /* renamed from: u */
    public int f112481u = -1;

    /* renamed from: v */
    public int f112482v = -1;

    /* renamed from: w */
    public int f112483w = 0;

    /* renamed from: x */
    public int f112484x = 0;

    /* renamed from: y */
    public boolean f112485y = false;

    /* renamed from: z */
    public int f112486z = 0;

    public GameChatCommentFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f112469f = (MMActivity) context;
    }

    /* renamed from: c */
    public static void m45263c(GameChatCommentFooter gameChatCommentFooter, String str) {
        GameChatCommentFooter gameChatCommentFooter2;
        GameChatCommentFooter gameChatCommentFooter3 = gameChatCommentFooter;
        String str2 = str;
        if (!gameChatCommentFooter3.f112467L) {
            if ((gameChatCommentFooter3.f112460E + "@").equals(str2)) {
                gameChatCommentFooter3.mo65497j(8, 1);
                C101218e0 e0Var = new C101218e0(gameChatCommentFooter.getContext(), 0, 0, true, true);
                gameChatCommentFooter3.f112466K = e0Var;
                e0Var.mo140665l(new GameChatCommentFooter$$b(gameChatCommentFooter3));
                C101218e0 e0Var2 = gameChatCommentFooter3.f112466K;
                Context context = gameChatCommentFooter.getContext();
                MMActivity mMActivity = gameChatCommentFooter3.f112469f;
                C41790a0 a0Var = new C41790a0(gameChatCommentFooter3);
                C87412m.m108594g(e0Var2, "mentionSomeoneDialog");
                C87412m.m108594g(context, "context");
                C87412m.m108594g(mMActivity, "fragmentActivity");
                C39622i0 a = C39629l0.m42233a(mMActivity, (C54209k0.C54210b) null).mo75002a(C47127f.class);
                C87412m.m108593f(a, "of(fragmentActivity).get…del::class.java\n        )");
                C47127f fVar = (C47127f) a;
                long longExtra = mMActivity.getIntent().getLongExtra("game_report_ssid", 0);
                long longExtra2 = mMActivity.getIntent().getLongExtra("game_report_sourceid", 0);
                View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.clv, (ViewGroup) null, false);
                int i = C0966R.C0970id.lyp;
                MMClearEditText mMClearEditText = (MMClearEditText) C10462b.m10395a(inflate, C0966R.C0970id.lyp);
                if (mMClearEditText != null) {
                    i = C0966R.C0970id.m1l;
                    FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(inflate, C0966R.C0970id.m1l);
                    if (frameLayout != null) {
                        i = C0966R.C0970id.m2d;
                        ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.m2d);
                        if (imageView != null) {
                            i = C0966R.C0970id.m2u;
                            LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.m2u);
                            if (linearLayout != null) {
                                i = C0966R.C0970id.m3k;
                                LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.m3k);
                                if (linearLayout2 != null) {
                                    RecyclerView recyclerView = (RecyclerView) C10462b.m10395a(inflate, C0966R.C0970id.m6m);
                                    if (recyclerView != null) {
                                        LinearLayout linearLayout3 = (LinearLayout) inflate;
                                        C45488d dVar = new C45488d(linearLayout3, mMClearEditText, frameLayout, imageView, linearLayout, linearLayout2, recyclerView);
                                        imageView.setOnClickListener(new C4435g(e0Var2));
                                        C41725h hVar = r12;
                                        MMClearEditText mMClearEditText2 = mMClearEditText;
                                        C41725h hVar2 = new C41725h(dVar, longExtra, longExtra2);
                                        frameLayout.setOnClickListener(hVar);
                                        C40308d.C40309a aVar = C40308d.f108375a;
                                        aVar.mo62995e(700, 1, longExtra, longExtra2, (String) null);
                                        String str3 = fVar.f126629f;
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        C41730m mVar = new C41730m(str3, longExtra, longExtra2);
                                        mMClearEditText2.addTextChangedListener(new C41726i(fVar, mVar));
                                        mVar.f112314h = a0Var;
                                        recyclerView.setLayoutManager(new LinearLayoutManager(context));
                                        recyclerView.setAdapter(mVar);
                                        C53895h.m60466d(C54208j0.m60899a(fVar), (C66212f) fVar.f126634n.getValue(), (C53934p0) null, new C47134j(fVar, (C15601d<? super C47134j>) null), 2, (Object) null);
                                        fVar.f126627d.observe(mMActivity, new C41727j(mVar));
                                        fVar.f126628e.observe(mMActivity, new C41728k(mVar));
                                        e0Var2.mo140664k(linearLayout3, 0, 0);
                                        ViewGroup.LayoutParams layoutParams = linearLayout3.getLayoutParams();
                                        layoutParams.height = (C74783i3.m89537a(context).f24705b * 3) / 4;
                                        linearLayout3.setLayoutParams(layoutParams);
                                        gameChatCommentFooter2 = gameChatCommentFooter;
                                        gameChatCommentFooter2.postDelayed(new GameChatCommentFooter$$a(gameChatCommentFooter2), 100);
                                        aVar.mo62995e(0, 1, gameChatCommentFooter.getSsid(), gameChatCommentFooter.getSourceId(), (String) null);
                                    } else {
                                        i = C0966R.C0970id.m6m;
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            }
            gameChatCommentFooter2 = gameChatCommentFooter3;
            gameChatCommentFooter2.f112460E = str;
        }
    }

    private String getLastText() {
        MMEditText mMEditText = this.f112473j;
        return mMEditText == null ? "" : mMEditText.getText().toString();
    }

    private int getSelectionStart() {
        return this.f112473j.getSelectionStart();
    }

    private long getSourceId() {
        return this.f112469f.getIntent().getLongExtra("game_report_sourceid", 0);
    }

    private long getSsid() {
        return this.f112469f.getIntent().getLongExtra("game_report_ssid", 0);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        if ((r0.channel_id == 0) == false) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFooterVisibilityImpl(int r5) {
        /*
            r4 = this;
            super.setVisibility(r5)
            if (r5 != 0) goto L_0x00ad
            android.view.ViewGroup r5 = r4.f112470g
            if (r5 == 0) goto L_0x00ad
            com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$n r0 = r4.f112462G
            boolean r0 = r0.f112503a
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x0014
            r0 = 0
            goto L_0x0016
        L_0x0014:
            r0 = 8
        L_0x0016:
            r5.setVisibility(r0)
            android.view.ViewGroup r5 = r4.f112470g
            com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$n r0 = r4.f112462G
            com.tencent.mm.plugin.game.autogen.chatroom.Channel r0 = r0.f112505c
            r5.setTag(r0)
            android.widget.TextView r5 = r4.f112471h
            com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$n r0 = r4.f112462G
            com.tencent.mm.plugin.game.autogen.chatroom.Channel r0 = r0.f112505c
            if (r0 == 0) goto L_0x0043
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "话题："
            r0.append(r3)
            com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$n r3 = r4.f112462G
            com.tencent.mm.plugin.game.autogen.chatroom.Channel r3 = r3.f112505c
            java.lang.String r3 = r3.name
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            goto L_0x0045
        L_0x0043:
            java.lang.String r0 = ""
        L_0x0045:
            r5.setText(r0)
            com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$n r5 = r4.f112462G
            boolean r5 = r5.f112504b
            if (r5 == 0) goto L_0x0050
            r5 = 0
            goto L_0x0052
        L_0x0050:
            r5 = 8
        L_0x0052:
            com.tencent.mm.plugin.game.autogen.chatroom.Channel r0 = r4.f112464I
            r3 = 1
            if (r0 == 0) goto L_0x0061
            int r0 = r0.channel_id
            if (r0 != 0) goto L_0x005d
            r0 = 1
            goto L_0x005e
        L_0x005d:
            r0 = 0
        L_0x005e:
            if (r0 != 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r1 = r5
        L_0x0062:
            android.widget.ImageView r5 = r4.f112472i
            r5.setVisibility(r1)
            com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$n r5 = r4.f112462G
            boolean r5 = r5.f112503a
            if (r5 == 0) goto L_0x008a
            com.tencent.mm.plugin.game.autogen.chatroom.Channel r5 = r4.f112464I
            if (r5 == 0) goto L_0x008a
            int r5 = r5.channel_id
            if (r5 != 0) goto L_0x0077
            r5 = 1
            goto L_0x0078
        L_0x0077:
            r5 = 0
        L_0x0078:
            if (r5 != 0) goto L_0x008a
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r5 = r4.f112478r
            r5.mo100204p(r2, r2)
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r5 = r4.f112478r
            r5.setShowStore(r2)
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r5 = r4.f112478r
            r5.setShowSearch(r2)
            goto L_0x009d
        L_0x008a:
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r5 = r4.f112478r
            r5.setShowStore(r3)
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r5 = r4.f112478r
            r5.setShowSearch(r3)
            boolean r5 = r4.f112463H
            if (r5 == 0) goto L_0x009d
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r5 = r4.f112478r
            r5.mo100204p(r3, r2)
        L_0x009d:
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r5 = r4.f112478r
            r5.mo100197i()
            if (r1 != 0) goto L_0x00ad
            com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$n r5 = r4.f112462G
            r0 = 0
            r5.f112503a = r2
            r5.f112505c = r0
            r5.f112504b = r2
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.GameChatCommentFooter.setFooterVisibilityImpl(int):void");
    }

    private void setLastText(String str) {
        this.f112473j.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), str, this.f112473j.getTextSize()));
        MMEditText mMEditText = this.f112473j;
        mMEditText.setSelection(mMEditText.getText().length());
    }

    /* renamed from: d */
    public final void mo65490d(String str, String str2, boolean z) {
        String str3;
        if (z) {
            str3 = "@" + str2 + 8197;
        } else {
            str3 = str2 + 8197;
        }
        List list = (List) ((HashMap) this.f112459D).get(str);
        if (list == null) {
            list = new ArrayList();
        }
        list.add(str2);
        ((HashMap) this.f112459D).put(str, list);
        mo65491e(str3, (Channel) null);
    }

    /* renamed from: e */
    public void mo65491e(String str, Channel channel) {
        if (channel != null) {
            GameChatCommentFooter$$n gameChatCommentFooter$$n = this.f112462G;
            gameChatCommentFooter$$n.f112503a = true;
            gameChatCommentFooter$$n.f112505c = channel;
            gameChatCommentFooter$$n.f112504b = true;
        }
        if (C45078p0.m49926e(this.f112473j.getText().toString() + str, C45078p0.C45079a.MODE_CHINESE_AS_2) <= 1000) {
            this.f112473j.mo98046o(str);
        }
    }

    /* renamed from: f */
    public boolean mo65492f(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 67) {
            if (keyEvent.getAction() == 0) {
                if (getCharAtCursor() == 8197) {
                    this.f112457B = true;
                } else {
                    this.f112457B = false;
                }
            }
            if (keyEvent.getAction() == 1 && this.f112457B) {
                this.f112457B = false;
                int selectionStart = getSelectionStart();
                String lastText = getLastText();
                String substring = lastText.substring(0, selectionStart);
                int lastIndexOf = substring.lastIndexOf(64);
                if (lastIndexOf < substring.length() && lastIndexOf >= 0) {
                    String substring2 = substring.substring(0, lastIndexOf);
                    String substring3 = lastText.substring(selectionStart);
                    setLastText(substring2 + substring3);
                    this.f112473j.setSelection(lastIndexOf);
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void mo65493g() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{this.f112484x, 0});
        valueAnimator.addUpdateListener(new GameChatCommentFooter$$f(this));
        valueAnimator.setDuration(200);
        valueAnimator.addListener(new GameChatCommentFooter$$g(this));
        valueAnimator.start();
    }

    public char getCharAtCursor() {
        int selectionStart = getSelectionStart();
        if (selectionStart <= 0) {
            return 'x';
        }
        return getLastText().charAt(selectionStart - 1);
    }

    /* renamed from: h */
    public final void mo65495h(boolean z) {
        this.f112478r.mo100196h();
        if (KeyBoardUtil.isPortOrientation(getContext())) {
            getInputPanelHelper().mo104363f(new GameChatCommentFooter$$l(this, z));
        } else if (z) {
            mo65493g();
        }
    }

    /* renamed from: i */
    public final void mo65496i() {
        this.f112484x = Math.max(getResources().getDimensionPixelSize(C0966R.dimen.f3835g8), this.f112483w);
        Log.printDebugStack("GameChatRoom.GameChatCommentFooter", "keyboardHeight:%d, smileyPanelHeight:%d", Integer.valueOf(this.f112483w), Integer.valueOf(this.f112484x));
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        ViewGroup.LayoutParams layoutParams;
        super.mo1072i0(z, i);
        Log.m105925i("GameChatRoom.GameChatCommentFooter", "onInputPanelChange, isKeyboardShow:%b, keyboardHeight:%d", Boolean.valueOf(z), Integer.valueOf(i));
        this.f112473j.mo104245f(z);
        if (!(this.f112483w == i || i == 0)) {
            this.f112483w = i;
            mo65496i();
            C76865k.m92671b(getContext(), i);
            ChatFooterPanel chatFooterPanel = this.f112478r;
            if (!(chatFooterPanel == null || (layoutParams = chatFooterPanel.getLayoutParams()) == null)) {
                layoutParams.height = this.f112484x;
            }
        }
        if (z && this.f112478r.getVisibility() == 8) {
            ViewGroup.LayoutParams layoutParams2 = this.f112478r.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = this.f112483w;
            }
            C119179t tVar = C119157j.f356862d;
            GameChatCommentFooter$$h gameChatCommentFooter$$h = new GameChatCommentFooter$$h(this);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(gameChatCommentFooter$$h, 50, false);
        } else if (this.f112478r.getVisibility() != 8 && !this.f112465J) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{z ? this.f112484x : this.f112483w, z ? this.f112483w : this.f112484x});
            valueAnimator.addUpdateListener(new GameChatCommentFooter$$j(this));
            valueAnimator.setDuration(200);
            valueAnimator.addListener(new GameChatCommentFooter$$k(this));
            valueAnimator.start();
        }
        if (this.f112485y && !z) {
            setVisibility(8);
        }
    }

    /* renamed from: j */
    public void mo65497j(int i, int i2) {
        this.f112480t = i2;
        boolean z = i == 0;
        this.f112477q = false;
        if (i2 == 0 && z) {
            this.f112477q = true;
        } else if (i2 == 1 && !z) {
            this.f112477q = true;
        }
        if (this.f112478r != null) {
            Log.printInfoStack("GameChatRoom.GameChatCommentFooter", "showState " + z, new Object[0]);
            if (!z) {
                mo65495h(this.f112477q);
                this.f112485y = false;
                this.f112469f.hideVKB();
                requestLayout();
            } else {
                this.f112475o.performClick();
                this.f112477q = false;
            }
        }
        postDelayed(new GameChatCommentFooter$$i(this, i, z), 100);
    }

    /* renamed from: k */
    public final void mo65498k() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, this.f112484x});
        valueAnimator.addUpdateListener(new GameChatCommentFooter$$d(this));
        valueAnimator.setDuration(200);
        valueAnimator.addListener(new GameChatCommentFooter$$e(this));
        valueAnimator.start();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f112470g = (ViewGroup) findViewById(C0966R.C0970id.el5);
        this.f112471h = (TextView) findViewById(C0966R.C0970id.el6);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.el4);
        this.f112472i = imageView;
        imageView.setOnClickListener(new C41792c0(this));
        this.f112473j = (MMEditText) findViewById(C0966R.C0970id.el_);
        this.f112474n = (TextView) findViewById(C0966R.C0970id.el8);
        this.f112475o = (ImageView) findViewById(C0966R.C0970id.el7);
        TextView textView = (TextView) ((ViewGroup) View.inflate(this.f112469f, C0966R.C0971layout.auz, this)).findViewById(C0966R.C0970id.enn);
        this.f112476p = textView;
        textView.setOnClickListener(new C41793d0(this));
        int desiredWidth = ((int) Layout.getDesiredWidth(this.f112476p.getText(), this.f112476p.getPaint())) + this.f112476p.getPaddingStart() + this.f112476p.getPaddingEnd();
        this.f112486z = desiredWidth;
        if (desiredWidth < C74942w4.m89786c(this.f112469f, C0966R.dimen.f3758d_)) {
            this.f112486z = C74942w4.m89786c(this.f112469f, C0966R.dimen.f3758d_);
        }
        this.f112473j.setFilters(new InputFilter[]{new C41842v(this, 1000, C45078p0.C45079a.MODE_CHINESE_AS_2)});
        this.f112473j.addTextChangedListener(new C41844w(this));
        this.f112473j.setOnTouchListener(new C41850x(this));
        this.f112475o.setOnClickListener(new C41794e0(this));
        if (C30699x0.m39154a() == null) {
            this.f112478r = new C72834u0(this.f112469f);
            return;
        }
        ChatFooterPanel si02 = C30699x0.m39154a().si0(getContext());
        this.f112478r = si02;
        si02.setVisibility(8);
        this.f112483w = KeyBoardUtil.getValidPanelHeight(getContext());
        mo65496i();
        ((LinearLayout) findViewById(C0966R.C0970id.iwc)).addView(this.f112478r, -1, this.f112484x);
        this.f112478r.setShowGame(false);
        this.f112478r.mo100203o(false, false);
        this.f112478r.mo100204p(false, false);
        this.f112478r.setShowSmiley(true);
        this.f112478r.setShowSearch(true);
        this.f112478r.setEntranceScene(16);
        this.f112478r.setTalkerName(this.f112461F);
        this.f112478r.setToSendText(this.f112473j.getText().toString());
        this.f112478r.mo100197i();
        this.f112478r.setOnTextOperationListener(new C41795f0(this));
        Context context = getContext();
        View rootView = getRootView();
        MMEditText mMEditText = this.f112473j;
        mMEditText.getClass();
        C72806l1 mA = ((C67306k1) C86312j.m106911c(C67306k1.class)).mo91186mA(context, rootView, this, mMEditText);
        this.f112479s = mA;
        C72843y1 y1Var = (C72843y1) mA;
        y1Var.f212284h = this.f112468M;
        y1Var.f212282f = this.f112475o;
        C41797g0 g0Var = new C41797g0(this);
        this.f112478r.setCallback(g0Var);
        ((C72843y1) this.f112479s).f212283g = g0Var;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.f112481u;
        if (i5 < i4) {
            i5 = i4;
        }
        this.f112481u = i5;
        this.f112482v = i4;
        Log.m105919d("GameChatRoom.GameChatCommentFooter", "onLayout, changed:%b, top:%d, bottom:%d", Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i4));
    }

    public void setCanAtAll(boolean z) {
    }

    public void setChannelInfo(Channel channel) {
        this.f112464I = channel;
    }

    public void setFooterActionListener(GameChatCommentFooter$$o gameChatCommentFooter$$o) {
        this.f112458C = gameChatCommentFooter$$o;
    }

    public void setHostUserName(String str) {
        this.f112461F = str;
        ChatFooterPanel chatFooterPanel = this.f112478r;
        if (chatFooterPanel != null) {
            chatFooterPanel.setTalkerName(str);
        }
    }

    public void setIsRealTimeRoom(boolean z) {
        this.f112467L = z;
    }

    public void setRobotUserName(String str) {
    }

    public void setShowCustom(boolean z) {
        this.f112463H = z;
        ChatFooterPanel chatFooterPanel = this.f112478r;
        if (chatFooterPanel != null) {
            chatFooterPanel.mo100204p(z, false);
            this.f112478r.setShowGame(false);
        }
    }

    public void setVisibility(int i) {
        mo65497j(i, 1);
    }
}
