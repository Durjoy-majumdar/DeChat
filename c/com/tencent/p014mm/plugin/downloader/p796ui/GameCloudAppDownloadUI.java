package com.tencent.p014mm.plugin.downloader.p796ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import b51.C0247i;
import b51.C39727b;
import b51.C39728c;
import b51.C39729d;
import b51.C39730e;
import b51.C39731f;
import b51.C39732g;
import b51.C39733h;
import b51.C39734j;
import c51.C39896e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.wx_extension.IPCRunCgi;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader.model.CloudGameAppInfoWrapper;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.util.Arrays;
import k60.C99099a;
import k60.C99101e;
import ke3.C88144b;
import kotlin.Metadata;
import n60.C100075f;
import nj3.C88989a;
import ob0.C47350c;
import p192l4.C10462b;
import p385u2.C111105a;
import qo3.C101218e0;
import rx3.C13604l;
import t41.C48536a;
import u41.C52443w;
import u41.C52444x;
import vo3.C90852c;
import z41.C53736a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-downloader_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI */
public final class GameCloudAppDownloadUI extends MMActivity {

    /* renamed from: f */
    public static final /* synthetic */ int f110279f = 0;

    /* renamed from: d */
    public boolean f110280d;

    /* renamed from: e */
    public boolean f110281e;

    /* renamed from: H7 */
    public static final void m44405H7(GameCloudAppDownloadUI gameCloudAppDownloadUI, Context context, String str) {
        gameCloudAppDownloadUI.getClass();
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", false);
        intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
        intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
        intent.putExtra("convertActivityFromTranslucent", true);
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: I7 */
    public static final void m44406I7(GameCloudAppDownloadUI gameCloudAppDownloadUI, int i, String str, String str2, boolean z) {
        if (!gameCloudAppDownloadUI.f110280d) {
            int i2 = 1;
            gameCloudAppDownloadUI.f110280d = true;
            C52443w wVar = new C52443w();
            wVar.f146556d = i;
            if (i == 1) {
                wVar.f146557e = str;
            } else {
                wVar.f146558f = str2;
            }
            if (!z) {
                i2 = 2;
            }
            wVar.f146560h = i2;
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = wVar;
            bVar.f127067b = new C52444x();
            bVar.f127068c = "/cgi-bin/mmgame-bin/setretainrecord";
            bVar.f127069d = 4904;
            IPCRunCgi.m98794a(bVar.mo72403a(), C0247i.f785a);
        }
    }

    public void finish() {
        if (this.f110281e) {
            setResult(-1);
        } else {
            setResult(0);
        }
        super.finish();
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        C13604l lVar;
        LinearLayout linearLayout;
        setTransparentTheme(true);
        customfixStatusbar(true);
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        CloudGameAppInfoWrapper cloudGameAppInfoWrapper = (CloudGameAppInfoWrapper) getIntent().getParcelableExtra("appInfoWrapper");
        if (cloudGameAppInfoWrapper == null) {
            Log.m105920e("GameDetainManager.GameCloudAppDownloadUI", "gamelog.download, download, detain ,appInfoWrapper is null ");
            finish();
            return;
        }
        C41864d.m45384a(this);
        C101218e0 e0Var = new C101218e0(getContext(), 0, 0, false, false);
        e0Var.mo140665l(new C39734j(this, cloudGameAppInfoWrapper));
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f359805cw0, (ViewGroup) null, false);
        int i = C0966R.C0970id.feh;
        Button button = (Button) C10462b.m10395a(inflate, C0966R.C0970id.feh);
        if (button != null) {
            i = C0966R.C0970id.hqq;
            Button button2 = (Button) C10462b.m10395a(inflate, C0966R.C0970id.hqq);
            if (button2 != null) {
                i = C0966R.C0970id.n1m;
                ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.n1m);
                if (imageView != null) {
                    i = C0966R.C0970id.n1n;
                    MMRoundCornerImageView mMRoundCornerImageView = (MMRoundCornerImageView) C10462b.m10395a(inflate, C0966R.C0970id.n1n);
                    if (mMRoundCornerImageView != null) {
                        i = C0966R.C0970id.n_g;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C10462b.m10395a(inflate, C0966R.C0970id.n_g);
                        if (constraintLayout != null) {
                            LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.n1y);
                            if (linearLayout2 != null) {
                                LinearLayout linearLayout3 = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.n1z);
                                if (linearLayout3 != null) {
                                    TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.kvf);
                                    if (textView != null) {
                                        TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.n4k);
                                        if (textView2 != null) {
                                            TextView textView3 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.n4m);
                                            if (textView3 != null) {
                                                TextView textView4 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.n4o);
                                                if (textView4 != null) {
                                                    TextView textView5 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.n4p);
                                                    if (textView5 != null) {
                                                        LinearLayout linearLayout4 = (LinearLayout) inflate;
                                                        ConstraintLayout constraintLayout2 = constraintLayout;
                                                        C48536a aVar = new C48536a(linearLayout4, button, button2, imageView, mMRoundCornerImageView, constraintLayout2, linearLayout2, linearLayout3, textView, textView2, textView3, textView4, textView5);
                                                        textView.setText(cloudGameAppInfoWrapper.f110079h.f110061d);
                                                        String str = cloudGameAppInfoWrapper.f110079h.f110062e;
                                                        if (str == null) {
                                                            str = "";
                                                        }
                                                        C99099a aVar2 = C99101e.f290571b;
                                                        LinearLayout linearLayout5 = linearLayout4;
                                                        C100075f.C100076a aVar3 = new C100075f.C100076a();
                                                        LinearLayout linearLayout6 = linearLayout3;
                                                        aVar3.f293176b = true;
                                                        aVar3.f293175a = true;
                                                        aVar2.mo85957c(str, mMRoundCornerImageView, aVar3.mo139398a());
                                                        if (cloudGameAppInfoWrapper.f110078g == 2) {
                                                            button2.setVisibility(8);
                                                        } else {
                                                            button2.setOnClickListener(new C39727b(this, cloudGameAppInfoWrapper, e0Var));
                                                        }
                                                        imageView.setOnClickListener(new C39728c(this, cloudGameAppInfoWrapper, e0Var));
                                                        Drawable drawable = imageView.getDrawable();
                                                        if (drawable != null) {
                                                            C74933u4.m89769f(drawable, C85875k4.m106211z() ? C111105a.m151500b(this, C0966R.color.al9) : C111105a.m151500b(this, C0966R.color.f3135ap));
                                                            imageView.setImageDrawable(drawable);
                                                        }
                                                        button.post(new C39729d(aVar));
                                                        String str2 = cloudGameAppInfoWrapper.f110075d;
                                                        if (!(str2 == null || str2.length() == 0)) {
                                                            constraintLayout2.setVisibility(8);
                                                            button.setText(getString(C0966R.string.mpb));
                                                            button.setOnClickListener(new C39730e(this, cloudGameAppInfoWrapper, e0Var));
                                                            linearLayout = linearLayout5;
                                                        } else {
                                                            constraintLayout2.setVisibility(0);
                                                            textView3.setText(getString(C0966R.string.mhp) + cloudGameAppInfoWrapper.f110079h.f110065h);
                                                            textView5.setText(getString(C0966R.string.mhq) + cloudGameAppInfoWrapper.f110079h.f110066i);
                                                            textView2.setText(cloudGameAppInfoWrapper.f110079h.f110061d + ' ' + cloudGameAppInfoWrapper.f110079h.f110067j);
                                                            linearLayout2.setOnClickListener(new C39731f(this, cloudGameAppInfoWrapper));
                                                            linearLayout6.setOnClickListener(new C39732g(this, cloudGameAppInfoWrapper));
                                                            String str3 = cloudGameAppInfoWrapper.f110079h.f110063f;
                                                            if (str3 == null || str3.length() == 0) {
                                                                lVar = new C13604l(Boolean.FALSE, null);
                                                            } else {
                                                                C53736a d = C40933j.m44315d(str3);
                                                                if (d == null) {
                                                                    lVar = new C13604l(Boolean.FALSE, null);
                                                                } else {
                                                                    lVar = C86013q1.m106450k(d.field_filePath) ? new C13604l(Boolean.TRUE, d) : new C13604l(Boolean.FALSE, d);
                                                                }
                                                            }
                                                            boolean booleanValue = ((Boolean) lVar.f38555d).booleanValue();
                                                            C53736a aVar4 = (C53736a) lVar.f38556e;
                                                            if (booleanValue) {
                                                                button.setText(getString(C0966R.string.mhr));
                                                            } else {
                                                                float f = ((float) cloudGameAppInfoWrapper.f110079h.f110070p) / ((float) 1048576);
                                                                StringBuilder sb = new StringBuilder();
                                                                sb.append(getString(C0966R.string.mhs));
                                                                String format = String.format("(%.1fMB)", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                                                                C87412m.m108593f(format, "format(format, *args)");
                                                                sb.append(format);
                                                                button.setText(sb.toString());
                                                            }
                                                            linearLayout = linearLayout5;
                                                            button.setOnClickListener(new C39733h(booleanValue, aVar4, cloudGameAppInfoWrapper, this, e0Var));
                                                        }
                                                        e0Var.mo140664k(linearLayout, 0, 0);
                                                        e0Var.mo140655A();
                                                        C39896e.f106968a.mo62506d(1, cloudGameAppInfoWrapper.f110076e, cloudGameAppInfoWrapper.f110079h.f110063f, cloudGameAppInfoWrapper.f110077f);
                                                        return;
                                                    }
                                                    i = C0966R.C0970id.n4p;
                                                } else {
                                                    i = C0966R.C0970id.n4o;
                                                }
                                            } else {
                                                i = C0966R.C0970id.n4m;
                                            }
                                        } else {
                                            i = C0966R.C0970id.n4k;
                                        }
                                    } else {
                                        i = C0966R.C0970id.kvf;
                                    }
                                } else {
                                    i = C0966R.C0970id.n1z;
                                }
                            } else {
                                i = C0966R.C0970id.n1y;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public void onDestroy() {
        super.onDestroy();
        C41864d.m45388e(this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        return false;
    }
}
