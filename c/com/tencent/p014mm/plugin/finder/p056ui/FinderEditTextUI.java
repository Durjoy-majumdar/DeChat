package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputConnection;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.finder.widget.edit.FinderEditFooter;
import com.tencent.p014mm.plugin.finder.widget.edit.FinderEditTextView;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import er1.C58684b;
import er1.C58741j5;
import f40.C86709a0;
import ft3.C45807d;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;
import nj3.C76879j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderEditTextUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderEditTextUI */
public final class FinderEditTextUI extends MMFinderUI {

    /* renamed from: r */
    public static final /* synthetic */ int f161038r = 0;

    /* renamed from: o */
    public FinderEditTextView f161039o;

    /* renamed from: p */
    public FinderEditFooter f161040p;

    /* renamed from: q */
    public final String f161041q = "Finder.FinderEditTextUI";

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderEditTextUI$a */
    public static final class C56336a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderEditTextUI f161042d;

        public C56336a(FinderEditTextUI finderEditTextUI) {
            this.f161042d = finderEditTextUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Parcel obtain = Parcel.obtain();
            C87412m.m108593f(obtain, "obtain()");
            FinderEditTextUI finderEditTextUI = this.f161042d;
            int i2 = FinderEditTextUI.f161038r;
            Intent intent = finderEditTextUI.getIntent();
            FinderEditTextView finderEditTextView = finderEditTextUI.f161039o;
            if (finderEditTextView != null) {
                intent.putExtra("saveText", finderEditTextView.getText());
                this.f161042d.getIntent().writeToParcel(obtain, 0);
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_OPEN_UPLOAD_DRAFT_STRING_SYNC, C45807d.m51084a(obtain.marshall()));
                this.f161042d.finish();
                return;
            }
            C87412m.m108603p("editView");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderEditTextUI$b */
    public static final class C56337b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderEditTextUI f161043d;

        public C56337b(FinderEditTextUI finderEditTextUI) {
            this.f161043d = finderEditTextUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_OPEN_UPLOAD_DRAFT_STRING_SYNC, "");
            this.f161043d.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderEditTextUI$c */
    public static final class C56338c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderEditTextUI f161044d;

        public C56338c(FinderEditTextUI finderEditTextUI) {
            this.f161044d = finderEditTextUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            FinderEditTextView finderEditTextView = this.f161044d.f161039o;
            if (finderEditTextView != null) {
                finderEditTextView.setTextCursorVisible(false);
                FinderEditTextView finderEditTextView2 = this.f161044d.f161039o;
                if (finderEditTextView2 != null) {
                    Bitmap bitmapFromView = BitmapUtil.getBitmapFromView(finderEditTextView2);
                    if (bitmapFromView != null) {
                        C58741j5 j5Var = C58741j5.f168184a;
                        String str = C58741j5.f168195l + "text_" + System.nanoTime() + ".tmp";
                        BitmapUtil.saveBitmapToImage(bitmapFromView, 80, Bitmap.CompressFormat.JPEG, str, true);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(str);
                        Intent intent = new Intent();
                        intent.putExtra("postType", 7);
                        intent.putExtra("hideDescEdit", true);
                        intent.putExtra("postMediaList", arrayList);
                        ((C58684b) C86312j.m106911c(C58684b.class)).Vx0(this.f161044d, intent);
                        this.f161044d.finish();
                    }
                    return true;
                }
                C87412m.m108603p("editView");
                throw null;
            }
            C87412m.m108603p("editView");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderEditTextUI$d */
    public static final class C56339d implements FinderEditFooter.C56753a {

        /* renamed from: a */
        public final /* synthetic */ FinderEditTextUI f161045a;

        public C56339d(FinderEditTextUI finderEditTextUI) {
            this.f161045a = finderEditTextUI;
        }

        /* renamed from: a */
        public void mo79088a(int i) {
            String str = this.f161045a.f161041q;
            Log.m105924i(str, "alignMode changed to " + i);
            this.f161045a.mo79084O7(i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderEditTextUI$e */
    public static final class C56340e implements ChatFooterPanel.C72719a {

        /* renamed from: a */
        public final /* synthetic */ FinderEditTextUI f161046a;

        public C56340e(FinderEditTextUI finderEditTextUI) {
            this.f161046a = finderEditTextUI;
        }

        /* renamed from: a */
        public void mo64626a() {
        }

        /* renamed from: b */
        public void mo64627b(String str) {
            if (!Util.isNullOrNil(str)) {
                FinderEditTextView finderEditTextView = this.f161046a.f161039o;
                if (finderEditTextView != null) {
                    C87412m.m108591d(str);
                    MMEditText mMEditText = finderEditTextView.f162680e;
                    if (mMEditText != null) {
                        mMEditText.mo98046o(str);
                    } else {
                        C87412m.m108603p("editText");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("editView");
                    throw null;
                }
            }
        }

        /* renamed from: c */
        public void mo64628c() {
            FinderEditTextView finderEditTextView = this.f161046a.f161039o;
            if (finderEditTextView != null) {
                MMEditText mMEditText = finderEditTextView.f162680e;
                if (mMEditText != null) {
                    InputConnection inputConnection = mMEditText.getInputConnection();
                    if (inputConnection != null) {
                        inputConnection.sendKeyEvent(new KeyEvent(0, 67));
                        inputConnection.sendKeyEvent(new KeyEvent(1, 67));
                        return;
                    }
                    return;
                }
                C87412m.m108603p("editText");
                throw null;
            }
            C87412m.m108603p("editView");
            throw null;
        }

        /* renamed from: d */
        public void mo64629d(boolean z) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderEditTextUI$f */
    public static final class C56341f implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderEditTextUI f161047d;

        public C56341f(FinderEditTextUI finderEditTextUI) {
            this.f161047d = finderEditTextUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            FinderEditTextUI finderEditTextUI = this.f161047d;
            int i = FinderEditTextUI.f161038r;
            finderEditTextUI.mo79083N7();
            return true;
        }
    }

    /* renamed from: N7 */
    public final void mo79083N7() {
        FinderEditTextView finderEditTextView = this.f161039o;
        if (finderEditTextView == null) {
            C87412m.m108603p("editView");
            throw null;
        } else if (Util.isNullOrNil(finderEditTextView.getText().toString())) {
            finish();
        } else {
            C76879j.m92741l(this, C0966R.string.et_, 0, C0966R.string.etd, C0966R.string.etc, true, new C56336a(this), new C56337b(this), C0966R.color.f3040d0);
        }
    }

    /* renamed from: O7 */
    public final void mo79084O7(int i) {
        int i2 = FinderEditFooter.f162669p;
        if (i == 101) {
            FinderEditTextView finderEditTextView = this.f161039o;
            if (finderEditTextView != null) {
                finderEditTextView.setTextGravity(8388611);
            } else {
                C87412m.m108603p("editView");
                throw null;
            }
        } else if (i == 102) {
            FinderEditTextView finderEditTextView2 = this.f161039o;
            if (finderEditTextView2 != null) {
                finderEditTextView2.setTextGravity(1);
            } else {
                C87412m.m108603p("editView");
                throw null;
            }
        }
        getIntent().putExtra("saveAlign", i);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a_a;
    }

    public void initView() {
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        addTextOptionMenu(1, getString(C0966R.string.f360089a13), new C56338c(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        View findViewById = findViewById(C0966R.C0970id.cbi);
        C87412m.m108593f(findViewById, "findViewById(R.id.edit_view)");
        this.f161039o = (FinderEditTextView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.cau);
        C87412m.m108593f(findViewById2, "findViewById(R.id.edit_footer)");
        this.f161040p = (FinderEditFooter) findViewById2;
        FinderEditTextView finderEditTextView = this.f161039o;
        if (finderEditTextView != null) {
            finderEditTextView.setTextMaxLines(10);
            FinderEditTextView finderEditTextView2 = this.f161039o;
            if (finderEditTextView2 != null) {
                finderEditTextView2.setTextCursorDrawable(C0966R.C0969drawable.a8h);
                FinderEditTextView finderEditTextView3 = this.f161039o;
                if (finderEditTextView3 != null) {
                    finderEditTextView3.setTextGravity(8388611);
                    FinderEditTextView finderEditTextView4 = this.f161039o;
                    if (finderEditTextView4 != null) {
                        finderEditTextView4.setTextInputType(147457);
                        FinderEditTextView finderEditTextView5 = this.f161039o;
                        if (finderEditTextView5 != null) {
                            String string = getString(C0966R.string.eik);
                            C87412m.m108593f(string, "getString(R.string.finder_post_text_hint)");
                            finderEditTextView5.setTextHint(string);
                            FinderEditTextView finderEditTextView6 = this.f161039o;
                            if (finderEditTextView6 != null) {
                                MMEditText mMEditText = finderEditTextView6.f162680e;
                                if (mMEditText != null) {
                                    mMEditText.requestFocus();
                                    String stringExtra = getIntent().getStringExtra("saveText");
                                    if (!Util.isNullOrNil(stringExtra)) {
                                        FinderEditTextView finderEditTextView7 = this.f161039o;
                                        if (finderEditTextView7 != null) {
                                            C87412m.m108591d(stringExtra);
                                            MMEditText mMEditText2 = finderEditTextView7.f162680e;
                                            if (mMEditText2 != null) {
                                                mMEditText2.mo98046o(stringExtra);
                                            } else {
                                                C87412m.m108603p("editText");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("editView");
                                            throw null;
                                        }
                                    }
                                    int intExtra = getIntent().getIntExtra("saveAlign", -1);
                                    if (intExtra > 0) {
                                        mo79084O7(intExtra);
                                    }
                                    showVKB();
                                    FinderEditFooter finderEditFooter = this.f161040p;
                                    if (finderEditFooter != null) {
                                        finderEditFooter.setAlignModeChangeListener(new C56339d(this));
                                        FinderEditFooter finderEditFooter2 = this.f161040p;
                                        if (finderEditFooter2 != null) {
                                            finderEditFooter2.setSmileyTextOperationListener(new C56340e(this));
                                            setBackBtn(new C56341f(this));
                                            return;
                                        }
                                        C87412m.m108603p("editFooter");
                                        throw null;
                                    }
                                    C87412m.m108603p("editFooter");
                                    throw null;
                                }
                                C87412m.m108603p("editText");
                                throw null;
                            }
                            C87412m.m108603p("editView");
                            throw null;
                        }
                        C87412m.m108603p("editView");
                        throw null;
                    }
                    C87412m.m108603p("editView");
                    throw null;
                }
                C87412m.m108603p("editView");
                throw null;
            }
            C87412m.m108603p("editView");
            throw null;
        }
        C87412m.m108603p("editView");
        throw null;
    }

    public void onBackPressed() {
        mo79083N7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }
}
