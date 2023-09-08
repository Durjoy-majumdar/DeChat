package ce1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import bl3.C54492n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import er1.C58684b;
import er1.C58741j5;
import f40.C86709a0;
import gy3.C87412m;
import hh2.C8532a;
import ht1.C60200t1;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import l60.C99342a;
import l60.C99344b;
import nj3.C76912y0;
import o40.C61926c;
import p140cw.C7138g;
import p599lr.C61381b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C11991t;
import qo3.C89779i0;
import r60.C101350i;
import t60.C64207e;
import x60.C102564a;

/* renamed from: ce1.e0 */
public final class C0461e0 extends UIComponent {

    /* renamed from: d */
    public C89779i0 f1096d;

    /* renamed from: e */
    public View f1097e;

    /* renamed from: f */
    public View f1098f;

    /* renamed from: g */
    public TextView f1099g;

    /* renamed from: h */
    public View f1100h;

    /* renamed from: i */
    public ImageView f1101i;

    /* renamed from: j */
    public ImageView f1102j;

    /* renamed from: n */
    public View f1103n;

    /* renamed from: o */
    public WeImageView f1104o;

    /* renamed from: p */
    public String f1105p = "";

    /* renamed from: q */
    public boolean f1106q;

    /* renamed from: r */
    public boolean f1107r;

    /* renamed from: ce1.e0$a */
    public static final class C0462a<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ String f1108a;

        /* renamed from: b */
        public final /* synthetic */ C0461e0 f1109b;

        public C0462a(String str, C0461e0 e0Var) {
            this.f1108a = str;
            this.f1109b = e0Var;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                String str = this.f1108a;
                C61926c.m72668M(new C0459d0(this.f1109b));
                Log.m105924i(C54492n.TAG, "[handleActivityProfileCover] [" + bitmap.getWidth() + XVFSFile.PATH_SEPARATOR_CHAR + bitmap.getHeight() + "] allocationByteCount=" + Util.getSizeKB((long) bitmap.getAllocationByteCount()) + " coverUrl=" + str);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0461e0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public static final void m394c3(C0461e0 e0Var) {
        e0Var.getClass();
        if (!C86709a0.m107535s().mo121147n()) {
            C76912y0.m92772k(e0Var.getActivity());
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("album_min_ratio_limit", 0.33333334f);
        intent.putExtra("album_max_ratio_limit", 3.0f);
        ((C7138g) C86312j.m106911c(C7138g.class)).mo8329zT(e0Var.getActivity(), 20000, intent);
    }

    /* renamed from: d3 */
    public final void mo502d3() {
        this.f1107r = true;
        int color = getResources().getColor(C0966R.color.f3388r3);
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).getController().mo177049H0(true);
        ImageView imageView = this.f1101i;
        if (imageView != null) {
            imageView.setVisibility(0);
            ImageView imageView2 = this.f1102j;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
                View view = this.f1103n;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/activity/uic/FinderActivitySelectCoverUIC", "onCoverSet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/activity/uic/FinderActivitySelectCoverUIC", "onCoverSet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    TextView textView = this.f1099g;
                    if (textView != null) {
                        textView.setText(getResources().getString(C0966R.string.cye));
                    }
                    TextView textView2 = this.f1099g;
                    if (textView2 != null) {
                        textView2.setTextColor(color);
                    }
                    WeImageView weImageView = this.f1104o;
                    if (weImageView != null) {
                        weImageView.setIconColor(color);
                        WeImageView weImageView2 = this.f1104o;
                        if (weImageView2 != null) {
                            weImageView2.setImageResource(C0966R.raw.icons_filled_delete);
                            View view3 = this.f1098f;
                            if (view3 != null) {
                                view3.setBackgroundResource(C0966R.C0969drawable.f5029um);
                            }
                            C0479p pVar = (C0479p) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C0479p.class);
                            int color2 = pVar.getResources().getColor(C0966R.color.f3390r5);
                            TextView textView3 = pVar.f1185g;
                            if (textView3 != null) {
                                textView3.setTextColor(pVar.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                                pVar.mo534g3(color2);
                                MMEditText mMEditText = pVar.f1183e;
                                if (mMEditText != null) {
                                    mMEditText.setBackgroundResource(C0966R.C0969drawable.a3l);
                                    MMEditText mMEditText2 = pVar.f1184f;
                                    if (mMEditText2 != null) {
                                        mMEditText2.setBackgroundResource(C0966R.C0969drawable.a3l);
                                        TextView textView4 = pVar.f1189n;
                                        if (textView4 != null) {
                                            textView4.setBackgroundResource(C0966R.C0969drawable.a3l);
                                            MMEditText mMEditText3 = pVar.f1183e;
                                            if (mMEditText3 != null) {
                                                mMEditText3.setHintTextColor(pVar.getResources().getColor(C0966R.color.f3392r8));
                                                MMEditText mMEditText4 = pVar.f1184f;
                                                if (mMEditText4 != null) {
                                                    mMEditText4.setHintTextColor(pVar.getResources().getColor(C0966R.color.f3392r8));
                                                    TextView textView5 = pVar.f1189n;
                                                    if (textView5 != null) {
                                                        textView5.setHintTextColor(pVar.getResources().getColor(C0966R.color.f3392r8));
                                                        pVar.mo533f3(true);
                                                        return;
                                                    }
                                                    C87412m.m108603p("selectTimeText");
                                                    throw null;
                                                }
                                                C87412m.m108603p("descEdit");
                                                throw null;
                                            }
                                            C87412m.m108603p("nameEdit");
                                            throw null;
                                        }
                                        C87412m.m108603p("selectTimeText");
                                        throw null;
                                    }
                                    C87412m.m108603p("descEdit");
                                    throw null;
                                }
                                C87412m.m108603p("nameEdit");
                                throw null;
                            }
                            C87412m.m108603p("nickNameText");
                            throw null;
                        }
                        C87412m.m108603p("addCoverIcon");
                        throw null;
                    }
                    C87412m.m108603p("addCoverIcon");
                    throw null;
                }
                C87412m.m108603p("coverMaskContainer");
                throw null;
            }
            C87412m.m108603p("coverMaskImageView");
            throw null;
        }
        C87412m.m108603p("coverImageView");
        throw null;
    }

    /* renamed from: e3 */
    public final void mo503e3() {
        this.f1107r = false;
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).getController().mo177049H0(C85875k4.m106211z());
        ImageView imageView = this.f1101i;
        if (imageView != null) {
            imageView.setVisibility(8);
            ImageView imageView2 = this.f1102j;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                View view = this.f1103n;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/activity/uic/FinderActivitySelectCoverUIC", "onCoverUnset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/activity/uic/FinderActivitySelectCoverUIC", "onCoverUnset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int color = getResources().getColor(C0966R.color.FG_0);
                    TextView textView = this.f1099g;
                    if (textView != null) {
                        textView.setTextColor(color);
                    }
                    WeImageView weImageView = this.f1104o;
                    if (weImageView != null) {
                        weImageView.setIconColor(color);
                        WeImageView weImageView2 = this.f1104o;
                        if (weImageView2 != null) {
                            weImageView2.setImageResource(C0966R.raw.icon_filled_add);
                            View view3 = this.f1098f;
                            if (view3 != null) {
                                view3.setBackgroundResource(C0966R.C0969drawable.f5028ul);
                            }
                            TextView textView2 = this.f1099g;
                            if (textView2 != null) {
                                textView2.setText(getResources().getString(C0966R.string.cy5));
                            }
                            C0479p pVar = (C0479p) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C0479p.class);
                            pVar.mo534g3(pVar.getResources().getColor(C0966R.color.f3133gi));
                            TextView textView3 = pVar.f1185g;
                            if (textView3 != null) {
                                textView3.setTextColor(pVar.getResources().getColor(C0966R.color.FG_0));
                                MMEditText mMEditText = pVar.f1183e;
                                if (mMEditText != null) {
                                    mMEditText.setBackgroundResource(C0966R.C0969drawable.a3k);
                                    MMEditText mMEditText2 = pVar.f1183e;
                                    if (mMEditText2 != null) {
                                        mMEditText2.setHintTextColor(pVar.getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
                                        MMEditText mMEditText3 = pVar.f1184f;
                                        if (mMEditText3 != null) {
                                            mMEditText3.setBackgroundResource(C0966R.C0969drawable.a3k);
                                            MMEditText mMEditText4 = pVar.f1184f;
                                            if (mMEditText4 != null) {
                                                mMEditText4.setHintTextColor(pVar.getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
                                                TextView textView4 = pVar.f1189n;
                                                if (textView4 != null) {
                                                    textView4.setHintTextColor(pVar.getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
                                                    TextView textView5 = pVar.f1189n;
                                                    if (textView5 != null) {
                                                        textView5.setBackgroundResource(C0966R.C0969drawable.a3k);
                                                        pVar.mo533f3(false);
                                                        return;
                                                    }
                                                    C87412m.m108603p("selectTimeText");
                                                    throw null;
                                                }
                                                C87412m.m108603p("selectTimeText");
                                                throw null;
                                            }
                                            C87412m.m108603p("descEdit");
                                            throw null;
                                        }
                                        C87412m.m108603p("descEdit");
                                        throw null;
                                    }
                                    C87412m.m108603p("nameEdit");
                                    throw null;
                                }
                                C87412m.m108603p("nameEdit");
                                throw null;
                            }
                            C87412m.m108603p("nickNameText");
                            throw null;
                        }
                        C87412m.m108603p("addCoverIcon");
                        throw null;
                    }
                    C87412m.m108603p("addCoverIcon");
                    throw null;
                }
                C87412m.m108603p("coverMaskContainer");
                throw null;
            }
            C87412m.m108603p("coverMaskImageView");
            throw null;
        }
        C87412m.m108603p("coverImageView");
        throw null;
    }

    /* renamed from: f3 */
    public final void mo504f3(String str) {
        if (Util.isNullOrNil(str) || !C86013q1.m106450k(str)) {
            C76912y0.makeText((Context) getActivity(), (int) C0966R.string.cyc, 0).show();
            Log.m105920e(C54492n.TAG, "ERROR! filePath=" + str);
            return;
        }
        Log.m105918d(C54492n.TAG, "onCropImageSuccess " + str);
        C89779i0 i0Var = this.f1096d;
        if (i0Var != null && !i0Var.isShowing()) {
            i0Var.show();
        }
        this.f1106q = true;
        this.f1105p = str == null ? "" : str;
        mo505g3(str);
        mo502d3();
    }

    /* renamed from: g3 */
    public final void mo505g3(String str) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85955a(new C11991t(str == null ? "" : str));
        a.mo138758f(((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.PROFILE_COVER));
        a.f291320d = new C0462a(str, this);
        ImageView imageView = this.f1101i;
        if (imageView != null) {
            ((C99342a) a).mo85954d(imageView);
        } else {
            C87412m.m108603p("coverImageView");
            throw null;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null && i2 == -1) {
            boolean z = false;
            String str = null;
            switch (i) {
                case 20000:
                    Uri data = intent.getData();
                    String path = data != null ? data.getPath() : null;
                    if (path == null || path.length() == 0) {
                        Log.m105928w(C54492n.TAG, "filePath is null.try to getResultPhotoPath.");
                        AppCompatActivity activity = getActivity();
                        C58741j5 j5Var = C58741j5.f168184a;
                        path = ((C7138g) C86312j.m106911c(C7138g.class)).mo8319g6(activity, intent, C58741j5.f168192i);
                    }
                    Log.m105924i(C54492n.TAG, "filePath[" + path + "] " + intent);
                    if (path == null || path.length() == 0) {
                        z = true;
                    }
                    if (z) {
                        Log.m105920e(C54492n.TAG, "filePath is null.");
                        return;
                    }
                    AppCompatActivity activity2 = getActivity();
                    ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
                    C87412m.m108594g(activity2, "context");
                    C87412m.m108594g(path, "inputPath");
                    RecordConfigProvider b = RecordConfigProvider.m119432b(path, "");
                    b.f272905F = 11;
                    Bundle bundle = new Bundle();
                    bundle.putFloat("crop_fix_ratio", 0.75f);
                    b.f272912M = bundle;
                    b.mo129804a(1, ((C61381b) C86312j.m106911c(C61381b.class)).pa0().mo12424e());
                    CaptureDataManager.f272890c.f272891a = null;
                    C8532a.f27585a.mo9446e(activity2, 20002, C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y, b, 1, 1);
                    return;
                case 20001:
                    Log.m105918d(C54492n.TAG, "onActivityResult REQUEST_CODE_IMAGE_BROUND_SEND_COMFIRM");
                    mo504f3(intent.getStringExtra("key_result_img_path"));
                    return;
                case 20002:
                    CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel = (CaptureDataManager.CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO");
                    StringBuilder sb = new StringBuilder();
                    sb.append("REQUEST_CODE_CROP_FIX_IMAGE model: ");
                    if (captureVideoNormalModel != null) {
                        str = captureVideoNormalModel.f272895f;
                    }
                    sb.append(str);
                    Log.m105924i(C54492n.TAG, sb.toString());
                    if (captureVideoNormalModel != null) {
                        Boolean bool = captureVideoNormalModel.f272897h;
                        C87412m.m108593f(bool, "photo");
                        if (!bool.booleanValue() || Util.isNullOrNil(captureVideoNormalModel.f272895f)) {
                            C76912y0.makeText((Context) getActivity(), (int) C0966R.string.cyc, 0).show();
                            return;
                        } else {
                            mo504f3(captureVideoNormalModel.f272895f);
                            return;
                        }
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        View findViewById = getActivity().findViewById(C0966R.C0970id.f5492gm);
        C87412m.m108593f(findViewById, "activity.findViewById(R.id.activity_post_cover)");
        this.f1101i = (ImageView) findViewById;
        View findViewById2 = getActivity().findViewById(C0966R.C0970id.d6g);
        C87412m.m108593f(findViewById2, "activity.findViewById(R.…vity_post_add_cover_icon)");
        this.f1104o = (WeImageView) findViewById2;
        View findViewById3 = getActivity().findViewById(C0966R.C0970id.f5495gp);
        C87412m.m108593f(findViewById3, "activity.findViewById(R.…activity_post_cover_mask)");
        this.f1102j = (ImageView) findViewById3;
        View findViewById4 = getActivity().findViewById(C0966R.C0970id.f5494go);
        C87412m.m108593f(findViewById4, "activity.findViewById(R.…ity_post_cover_container)");
        this.f1103n = findViewById4;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type android.app.Activity");
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f = ((float) displayMetrics.widthPixels) / 0.75f;
        ImageView imageView = this.f1102j;
        View view = null;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.height = (int) f;
            ImageView imageView2 = this.f1102j;
            if (imageView2 != null) {
                imageView2.setLayoutParams(layoutParams);
                this.f1098f = getActivity().findViewById(C0966R.C0970id.d6f);
                this.f1099g = (TextView) getActivity().findViewById(C0966R.C0970id.d6h);
                this.f1096d = C89779i0.m112246c(getActivity(), getString(C0966R.string.a4d), false, 0, (DialogInterface.OnCancelListener) null);
                this.f1097e = getActivity().findViewById(C0966R.C0970id.d5m);
                View findViewById5 = getActivity().findViewById(C0966R.C0970id.d5q);
                if (findViewById5 != null) {
                    findViewById5.setOnClickListener(new C0455b0(this));
                    view = findViewById5;
                }
                this.f1100h = view;
                String stringExtra = getIntent().getStringExtra("key_activity_local_cover_url");
                if (!Util.isNullOrNil(stringExtra)) {
                    mo505g3(stringExtra);
                    mo502d3();
                } else {
                    mo503e3();
                }
                View view2 = this.f1098f;
                if (view2 != null) {
                    view2.setOnClickListener(new C0457c0(this));
                    return;
                }
                return;
            }
            C87412m.m108603p("coverMaskImageView");
            throw null;
        }
        C87412m.m108603p("coverMaskImageView");
        throw null;
    }
}
