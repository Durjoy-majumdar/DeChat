package com.tencent.p014mm.p136ui.vas;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.C112958r;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C39630m0;
import ao3.C113067b;
import bo3.C113202f;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.base.preference.MMPreferenceFragment;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.component.UIComponentActivity;
import com.tencent.p014mm.p136ui.vas.launcher.VASLauncher;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import do3.C75441a;
import fy3.C32224a;
import go3.C76019y;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C76912y0;
import rx3.C13601g;
import rx3.C13605o;
import rx3.C36568h;
import tf3.C110979n;
import vn3.C111559c;
import vn3.C111561d;
import vn3.C111562e;
import vn3.C118691k;
import vn3.C118692l;
import vn3.C118694m;
import wn3.C15568a;
import xn3.C112162a;
import z04.C66713a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 ð\u00012\u00020\u00012\u00020\u0002:\u0004ñ\u0001ò\u0001B\t¢\u0006\u0006\bî\u0001\u0010ï\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0003J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0003J\b\u0010\b\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0003J\b\u0010\n\u001a\u00020\u0003H\u0003J\b\u0010\u000b\u001a\u00020\u0003H\u0003J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0017J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0013\u001a\u00020\u0003H\u0017J\b\u0010\u0014\u001a\u00020\u0003H\u0015J\b\u0010\u0015\u001a\u00020\u0003H\u0015J\b\u0010\u0016\u001a\u00020\u0003H\u0015J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0015J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u0003H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020#H\u0016J\b\u0010&\u001a\u00020%H\u0016J\f\u0010(\u001a\u00060'R\u00020#H\u0016J\b\u0010)\u001a\u00020\u0003H\u0016J\u0006\u0010*\u001a\u00020\u0003J\b\u0010,\u001a\u00020+H\u0014J#\u00101\u001a\u00028\u0000\"\n\b\u0000\u0010.*\u0004\u0018\u00010-2\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u00020\u00032\u0006\u00103\u001a\u00020/H\u0016J\b\u00105\u001a\u00020\u0003H\u0016J\u0012\u00108\u001a\u00020\u00032\b\u00107\u001a\u0004\u0018\u000106H\u0016J\b\u00109\u001a\u00020/H\u0016J\u0010\u0010;\u001a\u00020\u00032\u0006\u0010:\u001a\u00020/H\u0016J\u0010\u0010<\u001a\u00020\u00032\u0006\u0010:\u001a\u00020/H\u0016J\b\u0010=\u001a\u00020\u0003H\u0016J\u0010\u0010?\u001a\u00020\u00032\u0006\u0010>\u001a\u00020/H\u0016J\u0012\u0010?\u001a\u00020\u00032\b\u0010A\u001a\u0004\u0018\u00010@H\u0016J\u0012\u0010?\u001a\u00020\u00032\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010C\u001a\u00020\u0003H\u0016J\u0012\u0010C\u001a\u00020\u00032\b\u0010D\u001a\u0004\u0018\u00010-H\u0016J\b\u0010E\u001a\u00020\u0003H\u0016J\b\u0010G\u001a\u00020FH\u0016J\b\u0010H\u001a\u00020/H\u0014J\b\u0010I\u001a\u00020+H\u0016J\b\u0010J\u001a\u00020\u0003H\u0016J\b\u0010K\u001a\u00020+H\u0016J\b\u0010M\u001a\u00020LH\u0016J\b\u0010N\u001a\u00020\u0003H\u0016J\u0010\u0010P\u001a\u00020\u00032\u0006\u0010O\u001a\u00020+H\u0016J\b\u0010Q\u001a\u00020/H\u0014J\u0006\u0010R\u001a\u00020/J\b\u0010S\u001a\u00020/H\u0016J\u0010\u0010U\u001a\u00020\u00032\u0006\u0010T\u001a\u00020/H\u0016J$\u0010Y\u001a\u00020\u00032\b\u0010V\u001a\u0004\u0018\u00010!2\u0006\u0010W\u001a\u00020/2\b\u0010X\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010[\u001a\u00020+2\u0006\u0010Z\u001a\u00020/H\u0016J\n\u0010]\u001a\u0004\u0018\u00010\\H\u0016J\b\u0010_\u001a\u00020^H\u0016J\u0012\u0010b\u001a\u0004\u0018\u00010a2\u0006\u0010`\u001a\u00020BH\u0016J\u0012\u0010c\u001a\u00020\u00032\b\u0010D\u001a\u0004\u0018\u00010-H\u0016J\b\u0010d\u001a\u00020\u0003H\u0016J\u0018\u0010g\u001a\u00020\u00032\u0006\u0010e\u001a\u00020/2\u0006\u0010f\u001a\u00020/H\u0016J%\u0010j\u001a\u00020+2\u000e\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0h2\u0006\u0010W\u001a\u00020/¢\u0006\u0004\bj\u0010kJ\b\u0010m\u001a\u00020lH\u0016J\u0010\u0010p\u001a\u00020+2\u0006\u0010o\u001a\u00020nH\u0016J\u0010\u0010q\u001a\u00020+2\u0006\u0010o\u001a\u00020nH\u0016J\n\u0010s\u001a\u0004\u0018\u00010rH\u0016J\b\u0010t\u001a\u00020+H\u0016J\b\u0010u\u001a\u00020+H\u0016J\b\u0010v\u001a\u00020\u0003H\u0016J\b\u0010w\u001a\u00020\u0003H\u0016J\b\u0010x\u001a\u00020+H\u0016J\u0006\u0010y\u001a\u00020/J\u0006\u0010z\u001a\u00020/J\b\u0010{\u001a\u0004\u0018\u00010!J\u0006\u0010|\u001a\u00020\u0003J\u0006\u0010}\u001a\u00020/J\u0006\u0010~\u001a\u00020\u0003J\u0011\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u001a\u00020\u000fH\u0016J%\u0010\u0001\u001a\u00020\u00032\u0006\u0010W\u001a\u00020/2\u0007\u0010\u0001\u001a\u00020/2\t\u0010\u0001\u001a\u0004\u0018\u00010!H\u0016J\u0007\u0010\u0001\u001a\u00020\u0003J\u0007\u0010\u0001\u001a\u00020\u0003J\u0007\u0010\u0001\u001a\u00020\u0003J\u0007\u0010\u0001\u001a\u00020+J-\u0010\u0001\u001a\u00020\u00032\u0007\u0010e\u001a\u00030\u00012\u0007\u0010f\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001J\b\u0010\u0001\u001a\u00030\u0001R)\u0010\u0001\u001a\u00020B8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010 \u0001R+\u0010¡\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R+\u0010§\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010¢\u0001\u001a\u0006\b¨\u0001\u0010¤\u0001\"\u0006\b©\u0001\u0010¦\u0001R)\u0010ª\u0001\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010­\u0001\"\u0006\b®\u0001\u0010¯\u0001R)\u0010°\u0001\u001a\u00020+8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b°\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R2\u0010¶\u0001\u001a\u000b\u0012\u0004\u0012\u00020+\u0018\u00010µ\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R)\u0010¼\u0001\u001a\u00020/8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R)\u0010Â\u0001\u001a\u00020+8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\bÂ\u0001\u0010±\u0001\u001a\u0006\bÃ\u0001\u0010²\u0001\"\u0006\bÄ\u0001\u0010´\u0001R)\u0010Å\u0001\u001a\u00020+8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\bÅ\u0001\u0010±\u0001\u001a\u0006\bÅ\u0001\u0010²\u0001\"\u0006\bÆ\u0001\u0010´\u0001R(\u0010Í\u0001\u001a\n\u0012\u0005\u0012\u00030È\u00010Ç\u00018FX\u0002¢\u0006\u0010\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001R)\u0010Î\u0001\u001a\u00020+8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\bÎ\u0001\u0010±\u0001\u001a\u0006\bÏ\u0001\u0010²\u0001\"\u0006\bÐ\u0001\u0010´\u0001R)\u0010Ñ\u0001\u001a\u00020+8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\bÑ\u0001\u0010±\u0001\u001a\u0006\bÒ\u0001\u0010²\u0001\"\u0006\bÓ\u0001\u0010´\u0001R!\u0010Ø\u0001\u001a\u00030Ô\u00018FX\u0002¢\u0006\u0010\n\u0006\bÕ\u0001\u0010Ê\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001R \u0010Ü\u0001\u001a\u00020\\8FX\u0002¢\u0006\u0010\n\u0006\bÙ\u0001\u0010Ê\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001R*\u0010Þ\u0001\u001a\u00030Ý\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R\u0014\u0010ä\u0001\u001a\u00020+8F¢\u0006\b\u001a\u0006\bä\u0001\u0010²\u0001R\u0014\u0010æ\u0001\u001a\u00020+8F¢\u0006\b\u001a\u0006\bå\u0001\u0010²\u0001R\u0014\u0010ç\u0001\u001a\u00020+8F¢\u0006\b\u001a\u0006\bç\u0001\u0010²\u0001R+\u0010í\u0001\u001a\u0016\u0012\u0005\u0012\u00030é\u00010è\u0001j\n\u0012\u0005\u0012\u00030é\u0001`ê\u00018TX\u0004¢\u0006\b\u001a\u0006\bë\u0001\u0010ì\u0001¨\u0006ó\u0001"}, mo182094d2 = {"Lcom/tencent/mm/ui/vas/VASActivity;", "Lcom/tencent/mm/ui/vas/VASActivityJava;", "Landroidx/lifecycle/r;", "Lrx3/b0;", "_callOnCreate", "_callOnStart", "callOnVasResume", "_callOnResume", "_callOnResumeInner", "_callOnPause", "_callOnStop", "_callOnDestroy", "Lcom/tencent/mm/ui/vas/VASCommonFragment;", "getFirstFragment", "handleActivityFinish", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onPostCreate", "onStart", "onResume", "onPause", "onStop", "Landroid/app/Activity;", "getParentActivity", "onPreDestroyed", "onDestroy", "onPostDestroyed", "Landroidx/lifecycle/j;", "getLifecycle", "Landroidx/fragment/app/FragmentManager;", "getSupportFragmentManager", "registerActivityDetailedLifecycleCallbacks", "Landroid/content/Intent;", "getIntent", "Landroid/content/res/Resources;", "getResources", "Landroid/content/pm/ApplicationInfo;", "getApplicationInfo", "Landroid/content/res/Resources$Theme;", "getTheme", "finish", "finishInner", "", "isCallFindViewSuper", "Landroid/view/View;", "T", "", "id", "findViewByIdInner", "(I)Landroid/view/View;", "resid", "setTheme", "onEnterAnimationComplete", "Landroid/view/MenuItem$OnMenuItemClickListener;", "listener", "setBackBtn", "getActionbarColor", "color", "setActionbarColor", "setNavigationbarColor", "hideActionbarLine", "resId", "setMMTitle", "", "text", "", "hideVKB", "view", "showVKB", "Lcom/tencent/mm/ui/MMActivityController;", "getController", "getForceOrientation", "onVasBackPressed", "onBackPressed", "isFinishing", "Landroid/view/Window;", "getWindow", "hideActionBarOperationArea", "hasFocus", "onWindowFocusChanged", "getCustomBounceId", "_getCustomBounceId", "getRequestedOrientation", "requestedOrientation", "setRequestedOrientation", "intent", "requestCode", "options", "startActivityForResult", "featureId", "supportRequestWindowFeature", "Landroidx/appcompat/app/ActionBar;", "getSupportActionBar", "Landroidx/lifecycle/m0;", "getViewModelStore", "name", "", "getSystemService", "setContentView", "supportInvalidateOptionsMenu", "enterAnim", "exitAnim", "overridePendingTransition", "", "permissions", "handleRequestPermissions", "([Ljava/lang/String;I)Z", "Landroid/view/WindowManager;", "getWindowManager", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "onPrepareOptionsMenu", "Landroid/content/ComponentName;", "getComponentName", "isContentAtTop", "onClickDialogSpaceOnHalfScreenMode", "onPageEnterAnimStart", "onPageEnterAnimEnd", "isFullScreen", "getCurLayoutId", "getResultCode", "getResultData", "finishWithNoAnim", "getBackStackCnt", "onInited", "argument", "onNewBundle", "resultCode", "data", "callOnActivityResult", "initVasController", "_showActionBar", "_hideActionBar", "isTabMode", "Lbo3/f;", "popEnterAnim", "popExitAnim", "setPageAnim", "Lwn3/a;", "getActionBarData", "_TAG", "Ljava/lang/String;", "get_TAG", "()Ljava/lang/String;", "set_TAG", "(Ljava/lang/String;)V", "_activity", "Landroid/app/Activity;", "get_activity", "()Landroid/app/Activity;", "set_activity", "(Landroid/app/Activity;)V", "Landroid/content/Context;", "innerContext", "Landroid/content/Context;", "getInnerContext", "()Landroid/content/Context;", "setInnerContext", "(Landroid/content/Context;)V", "_parentFragmentManager", "Landroidx/fragment/app/FragmentManager;", "get_parentFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "set_parentFragmentManager", "(Landroidx/fragment/app/FragmentManager;)V", "_childFragmentManager", "get_childFragmentManager", "set_childFragmentManager", "_fragment", "Lcom/tencent/mm/ui/vas/VASCommonFragment;", "get_fragment", "()Lcom/tencent/mm/ui/vas/VASCommonFragment;", "set_fragment", "(Lcom/tencent/mm/ui/vas/VASCommonFragment;)V", "isInitFinished", "Z", "()Z", "setInitFinished", "(Z)V", "Lkotlin/Function0;", "vasFinishInterceptor", "Lfy3/a;", "getVasFinishInterceptor", "()Lfy3/a;", "setVasFinishInterceptor", "(Lfy3/a;)V", "backStackCount", "I", "getBackStackCount", "()I", "setBackStackCount", "(I)V", "_isFinishing", "get_isFinishing", "set_isFinishing", "isIgnoreOnResumeCalledFirst", "setIgnoreOnResumeCalledFirst", "Landroidx/fragment/app/r;", "Landroidx/fragment/app/FragmentActivity;", "_hostCallback$delegate", "Lrx3/g;", "get_hostCallback", "()Landroidx/fragment/app/r;", "_hostCallback", "hasCalledOnVASResume", "getHasCalledOnVASResume", "setHasCalledOnVASResume", "hasCalledOnStart", "getHasCalledOnStart", "setHasCalledOnStart", "Lvn3/l;", "vasWindow$delegate", "getVasWindow", "()Lvn3/l;", "vasWindow", "mActionBar$delegate", "getMActionBar", "()Landroidx/appcompat/app/ActionBar;", "mActionBar", "Lcom/tencent/mm/ui/vas/VASActivity$b;", "tempPageAnim", "Lcom/tencent/mm/ui/vas/VASActivity$b;", "getTempPageAnim", "()Lcom/tencent/mm/ui/vas/VASActivity$b;", "setTempPageAnim", "(Lcom/tencent/mm/ui/vas/VASActivity$b;)V", "isVASValid", "getDisableCommonAreaControl", "disableCommonAreaControl", "isFragmentMode", "Ljava/util/HashSet;", "Lcom/tencent/mm/ui/component/UIComponent;", "Lkotlin/collections/HashSet;", "getUiComponents", "()Ljava/util/HashSet;", "uiComponents", "<init>", "()V", "Companion", "a", "b", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.vas.VASActivity */
public abstract class VASActivity extends VASActivityJava implements C0124r {
    public static final C45097a Companion = new C45097a((C8480h) null);
    public static final String KEY_CLS = "VAS_CLASS";
    public static final String KEY_DISABLE_ACTIVITY_SWIPE_BACK = "KEY_DISABLE_ACTIVITY_SWIPE_BACK";
    public static final String KEY_DISABLE_COMMON_AREA_CONTROL = "KEY_DISABLE_COMMON_AREA_CONTROL";
    public static final String KEY_IS_FRAGMENT_MODE = "KEY_GET_FRAGMENT";
    public static final String KEY_LAUNCH_MODE = "KEY_LAUNCH_MODE";
    public static final String KEY_VAS_LAUNCHER_ENTER_PAGE = "KEY_VAS_LAUNCHER_ENTER_PAGE";
    public static final String KEY_VAS_START_MODE = "KEY_VAS_START_MODE";
    public static final int LAUNCH_MODE_SINGLEINSTANCE = 3;
    public static final int LAUNCH_MODE_SINGLETASK = 2;
    public static final int LAUNCH_MODE_SINGLETOP = 1;
    public static final int LAUNCH_MODE_STANDARD = 0;
    public static final int VAS_START_MODE_COMMON_ACTIVITY = 1;
    public static final int VAS_START_MODE_COMMON_LAUNCHER = 2;
    public static final int VAS_START_MODE_DEFAULT = 3;
    public static final int VAS_START_MODE_NORMAL_ACTIVITY = 0;
    /* access modifiers changed from: private */
    public static Intent protectIntent = new Intent();
    /* access modifiers changed from: private */
    public static C112162a vasController = C112162a.C112163a.f335849a;
    private String _TAG = ("MicroMsg.VAS.VASActivity." + getClass().getSimpleName() + '@' + Integer.toHexString(hashCode()));
    public Activity _activity;
    private FragmentManager _childFragmentManager;
    public VASCommonFragment _fragment;
    private byte _hellAccFlag_;
    private final C13601g _hostCallback$delegate = C36568h.m40985a(new C116165c(this));
    private boolean _isFinishing;
    private FragmentManager _parentFragmentManager;
    private int backStackCount;
    private boolean hasCalledOnStart;
    private boolean hasCalledOnVASResume;
    public Context innerContext;
    private boolean isIgnoreOnResumeCalledFirst;
    private boolean isInitFinished;
    private final C13601g mActionBar$delegate = C36568h.m40985a(new C106760d(this));
    private C116164b tempPageAnim = new C116164b();
    private C32224a<Boolean> vasFinishInterceptor;
    private final C13601g vasWindow$delegate = C36568h.m40985a(new C116166e(this));

    /* renamed from: com.tencent.mm.ui.vas.VASActivity$a */
    public static final class C45097a {
        public C45097a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.ui.vas.VASActivity$d */
    public static final class C106760d extends C87413o implements C32224a<C111561d> {

        /* renamed from: d */
        public final /* synthetic */ VASActivity f319161d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106760d(VASActivity vASActivity) {
            super(0);
            this.f319161d = vASActivity;
        }

        public Object invoke() {
            return new C111561d(this.f319161d);
        }
    }

    /* renamed from: com.tencent.mm.ui.vas.VASActivity$b */
    public static final class C116164b {

        /* renamed from: a */
        public C113202f f348618a;

        /* renamed from: b */
        public C113202f f348619b;

        /* renamed from: c */
        public C113202f f348620c;

        /* renamed from: d */
        public C113202f f348621d;
    }

    /* renamed from: com.tencent.mm.ui.vas.VASActivity$c */
    public static final class C116165c extends C87413o implements C32224a<C116172a> {

        /* renamed from: d */
        public final /* synthetic */ VASActivity f348622d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C116165c(VASActivity vASActivity) {
            super(0);
            this.f348622d = vASActivity;
        }

        public Object invoke() {
            return new C116172a(this.f348622d, new Handler());
        }
    }

    /* renamed from: com.tencent.mm.ui.vas.VASActivity$e */
    public static final class C116166e extends C87413o implements C32224a<C118692l> {

        /* renamed from: d */
        public final /* synthetic */ VASActivity f348623d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C116166e(VASActivity vASActivity) {
            super(0);
            this.f348623d = vASActivity;
        }

        public Object invoke() {
            return new C118692l(this.f348623d.get_activity(), this.f348623d.get_fragment());
        }
    }

    static {
        int i = C112162a.f335848a;
    }

    @C112974b0(C39623j.C39625b.ON_CREATE)
    private final void _callOnCreate() {
        C113067b bVar = C113067b.f338452d;
        bVar.onActivityPreCreated(this, (Bundle) null);
        onCreate((Bundle) null);
        onPostCreate((Bundle) null);
        bVar.onActivityPostCreated(this, (Bundle) null);
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    private final void _callOnDestroy() {
        C113067b bVar = C113067b.f338452d;
        bVar.onActivityPreDestroyed(this);
        onDestroy();
        bVar.onActivityPostDestroyed(this);
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    private final void _callOnPause() {
        C113067b bVar = C113067b.f338452d;
        bVar.onActivityPrePaused(this);
        onPause();
        bVar.onActivityPostPaused(this);
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    private final void _callOnResume() {
        if (this.isIgnoreOnResumeCalledFirst) {
            this.isIgnoreOnResumeCalledFirst = false;
        } else {
            _callOnResumeInner();
        }
    }

    private final void _callOnResumeInner() {
        C113067b bVar = C113067b.f338452d;
        bVar.onActivityPreResumed(this);
        onResume();
        bVar.onActivityPostResumed(this);
    }

    @C112974b0(C39623j.C39625b.ON_START)
    private final void _callOnStart() {
        if (!this._isFinishing) {
            C113067b bVar = C113067b.f338452d;
            bVar.onActivityPreStarted(this);
            onStart();
            this.hasCalledOnStart = true;
            bVar.onActivityPostStarted(this);
            C13605o oVar = null;
            if (C75441a.f221748d) {
                C13605o oVar2 = new C13605o(Integer.valueOf(C75441a.f221745a), C75441a.f221746b, Integer.valueOf(C75441a.f221747c));
                C75441a.f221745a = 0;
                C75441a.f221746b = null;
                C75441a.f221747c = -1;
                C75441a.f221748d = false;
                oVar = oVar2;
            }
            if (oVar != null) {
                onActivityResult(((Number) oVar.f38559f).intValue(), ((Number) oVar.f38557d).intValue(), (Intent) oVar.f38558e);
            }
            callOnVasResume();
        }
    }

    @C112974b0(C39623j.C39625b.ON_STOP)
    private final void _callOnStop() {
        if (this.hasCalledOnStart) {
            C113067b bVar = C113067b.f338452d;
            bVar.onActivityPreStopped(this);
            onStop();
            bVar.onActivityPostStopped(this);
        }
    }

    private final void callOnVasResume() {
        if (!this.hasCalledOnVASResume) {
            this.hasCalledOnVASResume = true;
            _callOnResume();
            this.isIgnoreOnResumeCalledFirst = true;
        }
    }

    private final VASCommonFragment getFirstFragment() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        C87412m.m108593f(fragments, "supportFragmentManager.fragments");
        for (Fragment fragment : fragments) {
            if (fragment instanceof VASCommonFragment) {
                return (VASCommonFragment) fragment;
            }
        }
        return null;
    }

    private final void handleActivityFinish() {
        Activity activity = get_activity();
        if (activity instanceof VASLauncher) {
            VASLauncher vASLauncher = (VASLauncher) activity;
            if (!vASLauncher.mo101368H7()) {
                vASLauncher.finish();
                return;
            }
            View findViewById = vASLauncher.findViewById(C0966R.C0970id.mfj);
            if (findViewById == null || findViewById.getVisibility() != 0) {
                vASLauncher.finish();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("finishVasContainer curSystemUIVisibility:");
            int systemUiVisibility = vASLauncher.getWindow().getDecorView().getSystemUiVisibility();
            C66713a.m78712a(16);
            String num = Integer.toString(systemUiVisibility, 16);
            C87412m.m108593f(num, "toString(this, checkRadix(radix))");
            sb.append(num);
            sb.append(",curWindowFlags:");
            int i = vASLauncher.getWindow().getAttributes().flags;
            C66713a.m78712a(16);
            String num2 = Integer.toString(i, 16);
            C87412m.m108593f(num2, "toString(this, checkRadix(radix))");
            sb.append(num2);
            sb.append(",curStatusBarColor:");
            sb.append(vASLauncher.getWindow().getStatusBarColor());
            sb.append("lastSystemUIVisibility:");
            int i2 = vASLauncher.f348661d;
            C66713a.m78712a(16);
            String num3 = Integer.toString(i2, 16);
            C87412m.m108593f(num3, "toString(this, checkRadix(radix))");
            sb.append(num3);
            sb.append(",lastWindowFlags:");
            int i3 = vASLauncher.f348662e;
            C66713a.m78712a(16);
            String num4 = Integer.toString(i3, 16);
            C87412m.m108593f(num4, "toString(this, checkRadix(radix))");
            sb.append(num4);
            sb.append(",lastStatusBarColor:");
            sb.append(vASLauncher.f348663f);
            Log.m105924i("MicroMsg.VAS.VASLauncher", sb.toString());
            vASLauncher.getWindow().getDecorView().setSystemUiVisibility(vASLauncher.f348661d);
            Window window = vASLauncher.getWindow();
            int i4 = vASLauncher.f348662e;
            window.setFlags(i4, i4);
            vASLauncher.getWindow().setStatusBarColor(vASLauncher.f348663f);
            vASLauncher.getWindow().setNavigationBarColor(vASLauncher.f348664g);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/ui/vas/launcher/VASLauncher", "finishVasContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/ui/vas/launcher/VASLauncher", "finishVasContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C13605o oVar = null;
            if (C75441a.f221748d) {
                C13605o oVar2 = new C13605o(Integer.valueOf(C75441a.f221745a), C75441a.f221746b, Integer.valueOf(C75441a.f221747c));
                C75441a.f221745a = 0;
                C75441a.f221746b = null;
                C75441a.f221747c = -1;
                C75441a.f221748d = false;
                oVar = oVar2;
            }
            if (oVar != null) {
                vASLauncher.onActivityResult(((Number) oVar.f38559f).intValue(), ((Number) oVar.f38557d).intValue(), (Intent) oVar.f38558e);
            }
            C76019y.m91315c(vASLauncher);
            MMPreferenceFragment.m86269K();
            vASLauncher.f348665h = false;
            C113067b.f338452d.mo33187jo(vASLauncher);
            vASLauncher.mo101372L7();
            return;
        }
        activity.finish();
    }

    public final int _getCustomBounceId() {
        return getCustomBounceId();
    }

    public final void _hideActionBar() {
        VASCommonFragment vASCommonFragment = get_fragment();
        FrameLayout frameLayout = vASCommonFragment.f348640J;
        ViewGroup viewGroup = null;
        ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = 0;
        }
        VASActivity vASActivity = vASCommonFragment.f348642o;
        ActionBar mActionBar = vASActivity != null ? vASActivity.getMActionBar() : null;
        C111561d dVar = mActionBar instanceof C111561d ? (C111561d) mActionBar : null;
        if (dVar != null) {
            viewGroup = dVar.f333980b;
        }
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    public final void _showActionBar() {
        VASCommonFragment vASCommonFragment = get_fragment();
        FrameLayout frameLayout = vASCommonFragment.f348640J;
        ViewGroup viewGroup = null;
        ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = C76577a.m92157h(vASCommonFragment.getActivity(), C0966R.dimen.f3679b9);
        }
        VASActivity vASActivity = vASCommonFragment.f348642o;
        ActionBar mActionBar = vASActivity != null ? vASActivity.getMActionBar() : null;
        C111561d dVar = mActionBar instanceof C111561d ? (C111561d) mActionBar : null;
        if (dVar != null) {
            viewGroup = dVar.f333980b;
        }
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }

    public void callOnActivityResult(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }

    public <T extends View> T findViewByIdInner(int i) {
        T findViewById = getController().mo177094s().findViewById(i);
        return findViewById != null ? findViewById : get_activity().findViewById(i);
    }

    public void finish() {
        if (!isVASValid()) {
            super.finish();
            return;
        }
        boolean z = true;
        this._isFinishing = true;
        C32224a<Boolean> aVar = this.vasFinishInterceptor;
        if (aVar == null || !aVar.invoke().booleanValue()) {
            z = false;
        }
        if (!z) {
            finishInner();
        }
    }

    public final void finishInner() {
        int resultCode = getResultCode();
        Intent resultData = getResultData();
        int targetRequestCode = get_fragment().getTargetRequestCode();
        C75441a.f221745a = resultCode;
        C75441a.f221746b = resultData;
        C75441a.f221747c = targetRequestCode;
        C75441a.f221748d = true;
        int backStackCnt = getBackStackCnt();
        String str = this._TAG;
        Log.m105918d(str, "finish backStackCnt:" + backStackCnt);
        if (backStackCnt > 0) {
            try {
                FragmentManager fragmentManager = this._parentFragmentManager;
                if (fragmentManager != null) {
                    fragmentManager.popBackStackImmediate();
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.VAS.VasNavigator", th, "finish popBackStack", new Object[0]);
            }
        } else {
            handleActivityFinish();
        }
    }

    public final void finishWithNoAnim() {
        if (getBackStackCnt() > 0) {
            C118691k.f355162a = true;
            C118691k.f355163b = true;
        }
        finish();
    }

    public final C15568a getActionBarData() {
        CharSequence mMTitle = getMMTitle();
        WeImageView weImageView = getController().f348069J;
        int iconColor = weImageView != null ? weImageView.getIconColor() : 0;
        int q = getController().mo177091q();
        TextView textView = getController().f348066G;
        int currentTextColor = textView != null ? textView.getCurrentTextColor() : 0;
        TextView textView2 = getController().f348066G;
        return new C15568a(mMTitle, iconColor, q, currentTextColor, textView2 != null ? textView2.getTextSize() : 0.0f);
    }

    public int getActionbarColor() {
        return !isVASValid() ? super.getActionbarColor() : getController().mo177091q();
    }

    public ApplicationInfo getApplicationInfo() {
        if (!isVASValid()) {
            ApplicationInfo applicationInfo = super.getApplicationInfo();
            C87412m.m108593f(applicationInfo, "super.getApplicationInfo()");
            return applicationInfo;
        }
        ApplicationInfo applicationInfo2 = getInnerContext().getApplicationInfo();
        C87412m.m108593f(applicationInfo2, "innerContext.applicationInfo");
        return applicationInfo2;
    }

    public final int getBackStackCnt() {
        FragmentManager fragmentManager = this._parentFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager.getBackStackEntryCount();
        }
        return 0;
    }

    public final int getBackStackCount() {
        return this.backStackCount;
    }

    public ComponentName getComponentName() {
        return !isVASValid() ? super.getComponentName() : getIntent().getComponent();
    }

    public MMActivityController getController() {
        if (isVASValid()) {
            return get_fragment().f348638H;
        }
        MMActivityController controller = super.getController();
        C87412m.m108593f(controller, "super.getController()");
        return controller;
    }

    public final int getCurLayoutId() {
        return getLayoutId();
    }

    public int getCustomBounceId() {
        if (!isVASValid()) {
            return super.getCustomBounceId();
        }
        return -1;
    }

    public final boolean getDisableCommonAreaControl() {
        return getIntent().getBooleanExtra(KEY_DISABLE_COMMON_AREA_CONTROL, false);
    }

    public int getForceOrientation() {
        if (!isVASValid()) {
            return super.getForceOrientation();
        }
        return -1;
    }

    public final boolean getHasCalledOnStart() {
        return this.hasCalledOnStart;
    }

    public final boolean getHasCalledOnVASResume() {
        return this.hasCalledOnVASResume;
    }

    public final Context getInnerContext() {
        Context context = this.innerContext;
        if (context != null) {
            return context;
        }
        C87412m.m108603p("innerContext");
        throw null;
    }

    public Intent getIntent() {
        Intent intent;
        if (!isVASValid()) {
            intent = super.getIntent();
            if (intent == null) {
                intent = protectIntent;
            }
        } else {
            intent = get_fragment().f348653z;
        }
        C111559c.f333976a.mo163251d(intent);
        return intent;
    }

    public C39623j getLifecycle() {
        if (!isVASValid()) {
            C39623j lifecycle = super.getLifecycle();
            C87412m.m108593f(lifecycle, "super.getLifecycle()");
            return lifecycle;
        }
        C39623j lifecycle2 = get_fragment().getLifecycle();
        C87412m.m108593f(lifecycle2, "_fragment.lifecycle");
        return lifecycle2;
    }

    public final ActionBar getMActionBar() {
        return (ActionBar) this.mActionBar$delegate.getValue();
    }

    public final Activity getParentActivity() {
        if (this._activity != null) {
            return get_activity();
        }
        return null;
    }

    public int getRequestedOrientation() {
        return !isVASValid() ? super.getRequestedOrientation() : get_activity().getRequestedOrientation();
    }

    public Resources getResources() {
        if (!isVASValid()) {
            Resources resources = super.getResources();
            C87412m.m108593f(resources, "super.getResources()");
            return resources;
        }
        Resources resources2 = getInnerContext().getResources();
        C87412m.m108593f(resources2, "innerContext.resources");
        return resources2;
    }

    public final int getResultCode() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mResultCode");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) obj).intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final Intent getResultData() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mResultData");
            declaredField.setAccessible(true);
            return (Intent) declaredField.get(this);
        } catch (Throwable unused) {
            return null;
        }
    }

    public ActionBar getSupportActionBar() {
        return !isVASValid() ? super.getSupportActionBar() : getMActionBar();
    }

    public FragmentManager getSupportFragmentManager() {
        if (!isVASValid()) {
            FragmentManager supportFragmentManager = super.getSupportFragmentManager();
            C87412m.m108593f(supportFragmentManager, "super.getSupportFragmentManager()");
            return supportFragmentManager;
        }
        FragmentManager fragmentManager = this._childFragmentManager;
        C87412m.m108591d(fragmentManager);
        return fragmentManager;
    }

    public Object getSystemService(String str) {
        C87412m.m108594g(str, "name");
        if (!isVASValid()) {
            return super.getSystemService(str);
        }
        Object systemService = getInnerContext().getSystemService(str);
        return (!C87412m.m108589b("layout_inflater", str) || !(systemService instanceof LayoutInflater)) ? systemService : C85868k2.m106136a((LayoutInflater) systemService, this);
    }

    public final C116164b getTempPageAnim() {
        return this.tempPageAnim;
    }

    public Resources.Theme getTheme() {
        if (!isVASValid()) {
            Resources.Theme theme = super.getTheme();
            C87412m.m108593f(theme, "super.getTheme()");
            return theme;
        }
        Resources.Theme theme2 = getInnerContext().getTheme();
        C87412m.m108593f(theme2, "innerContext.theme");
        return theme2;
    }

    public HashSet<UIComponent> getUiComponents() {
        return !isVASValid() ? super.getUiComponents() : get_fragment().f165491e;
    }

    public final C32224a<Boolean> getVasFinishInterceptor() {
        return this.vasFinishInterceptor;
    }

    public final C118692l getVasWindow() {
        return (C118692l) this.vasWindow$delegate.getValue();
    }

    public C39630m0 getViewModelStore() {
        return !isVASValid() ? super.getViewModelStore() : get_fragment().getViewModelStore();
    }

    public Window getWindow() {
        if (!isVASValid()) {
            Window window = super.getWindow();
            C87412m.m108593f(window, "super.getWindow()");
            return window;
        } else if (isFragmentMode()) {
            return getVasWindow();
        } else {
            Window window2 = get_activity().getWindow();
            C87412m.m108593f(window2, "_activity.window");
            return window2;
        }
    }

    public WindowManager getWindowManager() {
        if (!isVASValid()) {
            WindowManager windowManager = super.getWindowManager();
            C87412m.m108593f(windowManager, "super.getWindowManager()");
            return windowManager;
        }
        WindowManager windowManager2 = get_activity().getWindowManager();
        C87412m.m108593f(windowManager2, "_activity.windowManager");
        return windowManager2;
    }

    public final String get_TAG() {
        return this._TAG;
    }

    public final Activity get_activity() {
        Activity activity = this._activity;
        if (activity != null) {
            return activity;
        }
        C87412m.m108603p("_activity");
        throw null;
    }

    public final FragmentManager get_childFragmentManager() {
        return this._childFragmentManager;
    }

    public final VASCommonFragment get_fragment() {
        VASCommonFragment vASCommonFragment = this._fragment;
        if (vASCommonFragment != null) {
            return vASCommonFragment;
        }
        C87412m.m108603p("_fragment");
        throw null;
    }

    public final C112958r<FragmentActivity> get_hostCallback() {
        return (C112958r) this._hostCallback$delegate.getValue();
    }

    public final boolean get_isFinishing() {
        return this._isFinishing;
    }

    public final FragmentManager get_parentFragmentManager() {
        return this._parentFragmentManager;
    }

    public final boolean handleRequestPermissions(String[] strArr, int i) {
        C87412m.m108594g(strArr, "permissions");
        if (!isVASValid()) {
            return false;
        }
        VASCommonFragment vASCommonFragment = get_fragment();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(strArr);
        VASCommonFragment vASCommonFragment2 = vASCommonFragment;
        C117292a.m165358d(vASCommonFragment2, aVar.mo10232b(), "com/tencent/mm/ui/vas/VASActivity", "handleRequestPermissions", "([Ljava/lang/String;I)Z", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
        vASCommonFragment.requestPermissions((String[]) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
        C117292a.m165359e(vASCommonFragment2, "com/tencent/mm/ui/vas/VASActivity", "handleRequestPermissions", "([Ljava/lang/String;I)Z", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
        return true;
    }

    public void hideActionBarOperationArea() {
        if (!isVASValid()) {
            super.hideActionBarOperationArea();
            return;
        }
        MMActivityController controller = getController();
        if (controller != null) {
            controller.mo177039C();
        }
    }

    public void hideActionbarLine() {
        if (!isVASValid()) {
            super.hideActionbarLine();
        } else if (!getDisableCommonAreaControl()) {
            MMActivityController controller = getController();
            if (controller.mo177037B() != null) {
                controller.mo177037B().mo91089G(0.0f);
            }
        }
    }

    public void hideVKB() {
        if (!isVASValid()) {
            super.hideVKB();
        } else {
            get_fragment().f348638H.mo177045F();
        }
    }

    public final void initVasController() {
        setCurController(getController());
    }

    public boolean isCallFindViewSuper() {
        return !isVASValid();
    }

    public boolean isContentAtTop() {
        return false;
    }

    public boolean isFinishing() {
        return !isVASValid() ? super.isFinishing() : get_fragment().isRemoving();
    }

    public final boolean isFragmentMode() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getBooleanExtra(KEY_IS_FRAGMENT_MODE, false);
        }
        return false;
    }

    public boolean isFullScreen() {
        return false;
    }

    public final boolean isIgnoreOnResumeCalledFirst() {
        return this.isIgnoreOnResumeCalledFirst;
    }

    public final boolean isInitFinished() {
        return this.isInitFinished;
    }

    public final boolean isTabMode() {
        return get_activity() instanceof VASCommonForPadActivity;
    }

    public final boolean isVASValid() {
        return this.isInitFinished;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if ((r0 != null && r0.onVasBackPressed()) == true) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r4 = this;
            boolean r0 = r4.isVASValid()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0025
            com.tencent.mm.ui.vas.VASCommonFragment r0 = r4.getFirstFragment()
            if (r0 == 0) goto L_0x001e
            com.tencent.mm.ui.vas.VASActivity r0 = r0.f348642o
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.onVasBackPressed()
            if (r0 != r1) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 != r1) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            if (r1 != 0) goto L_0x0024
            super.onBackPressed()
        L_0x0024:
            return
        L_0x0025:
            boolean r0 = r4.isTabMode()
            if (r0 == 0) goto L_0x0045
            java.util.HashSet<java.lang.String> r0 = vn3.C37789h.f100098a
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.util.HashSet<java.lang.String> r3 = vn3.C37789h.f100098a
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0045
            android.app.Activity r0 = r4.get_activity()
            r0.finish()
            goto L_0x0064
        L_0x0045:
            r0 = 0
            java.util.List r0 = com.tencent.p014mm.p136ui.component.UIComponentActivity.activeUIComponents$default(r4, r2, r1, r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x004e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0061
            java.lang.Object r1 = r0.next()
            com.tencent.mm.ui.component.UIComponent r1 = (com.tencent.p014mm.p136ui.component.UIComponent) r1
            boolean r1 = r1.onBackPressed()
            if (r1 == 0) goto L_0x004e
            return
        L_0x0061:
            r4.finish()
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.vas.VASActivity.onBackPressed():void");
    }

    public boolean onClickDialogSpaceOnHalfScreenMode() {
        for (UIComponent onClickDialogSpaceOnHalfScreenMode : UIComponentActivity.activeUIComponents$default(this, false, 1, (Object) null)) {
            if (onClickDialogSpaceOnHalfScreenMode.onClickDialogSpaceOnHalfScreenMode()) {
                return true;
            }
        }
        return false;
    }

    public void onCreate(Bundle bundle) {
        if (!isVASValid()) {
            MMFragmentActivity.aReporter.mo146072d(getIntent());
            super.onCreate(bundle);
            return;
        }
        String str = this._TAG;
        Log.m105924i(str, "checktask onCreate " + getClass().getName() + ' ' + hashCode());
        getIntent();
        if (C79758p.f233760a.mo109883f(new C110979n()) == 1) {
            C76912y0.makeText((Context) this, (CharSequence) "VAS-" + getClass().getSimpleName(), 0).show();
        }
        C113067b.f338452d.onActivityCreated(this, bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C87412m.m108594g(menu, "menu");
        return !isVASValid() ? super.onCreateOptionsMenu(menu) : this.mController.mo177066a0(menu);
    }

    public void onDestroy() {
        if (!isVASValid()) {
            super.onDestroy();
            return;
        }
        String str = this._TAG;
        Log.m105924i(str, "checktask onDestroy " + getClass().getName() + ' ' + hashCode());
        C113067b.f338452d.onActivityDestroyed(this);
    }

    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        MMFragmentActivity.aReporter.mo146071c(getIntent(), System.currentTimeMillis() - ((long) 300));
        MMFragmentActivity.aReporter.mo146070b(getIntent());
    }

    public final void onInited() {
        this.isInitFinished = true;
        attachBaseContext(get_activity());
    }

    public void onNewBundle(Bundle bundle) {
        C87412m.m108594g(bundle, "argument");
        String str = this._TAG;
        Log.m105918d(str, "onNewBundle() called with: argument = " + bundle);
    }

    public void onPageEnterAnimEnd() {
        Log.m105918d("MicroMsg.VAS.VasNavigator", "onPageAnimEnd() called");
    }

    public void onPageEnterAnimStart() {
        Log.m105918d("MicroMsg.VAS.VasNavigator", "onPageAnimStart() called");
    }

    public void onPause() {
        if (!isVASValid()) {
            super.onPause();
            return;
        }
        String str = this._TAG;
        Log.m105918d(str, "onPause " + getClass().getName() + ' ' + hashCode());
        C113067b.f338452d.onActivityPaused(this);
    }

    public void onPostCreate(Bundle bundle) {
        if (!isVASValid()) {
            super.onPostCreate(bundle);
        }
    }

    public void onPostDestroyed() {
        if (!isVASValid()) {
            super.onPostDestroyed();
        } else {
            Log.m105918d("MicroMsg.VAS.VasNavigator", "onPostDestroyed() called");
        }
    }

    public void onPreDestroyed() {
        if (!isVASValid()) {
            super.onPreDestroyed();
        } else {
            Log.m105918d("MicroMsg.VAS.VasNavigator", "onPreDestroyed() called");
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        C87412m.m108594g(menu, "menu");
        return !isVASValid() ? super.onPrepareOptionsMenu(menu) : this.mController.mo177072e0(menu);
    }

    public void onResume() {
        if (!isVASValid()) {
            super.onResume();
            return;
        }
        String str = this._TAG;
        Log.m105918d(str, "onResume " + getClass().getName() + ' ' + hashCode());
        C113067b.f338452d.onActivityResumed(this);
    }

    public void onStart() {
        if (!isVASValid()) {
            super.onStart();
            return;
        }
        String str = this._TAG;
        Log.m105918d(str, "onStart " + getClass().getName() + ' ' + hashCode());
        C113067b.f338452d.onActivityStarted(this);
    }

    public void onStop() {
        if (!isVASValid()) {
            super.onStop();
            return;
        }
        String str = this._TAG;
        Log.m105918d(str, "onStop " + getClass().getName() + ' ' + hashCode());
        C113067b.f338452d.onActivityStopped(this);
    }

    public boolean onVasBackPressed() {
        return false;
    }

    public void onWindowFocusChanged(boolean z) {
        if (!isVASValid()) {
            super.onWindowFocusChanged(z);
        }
    }

    public void overridePendingTransition(int i, int i2) {
        if (!isVASValid()) {
            super.overridePendingTransition(i, i2);
        } else {
            get_activity().overridePendingTransition(i, i2);
        }
    }

    public void registerActivityDetailedLifecycleCallbacks() {
        if (!isVASValid()) {
            super.registerActivityDetailedLifecycleCallbacks();
        }
    }

    public void setActionbarColor(int i) {
        if (!isVASValid()) {
            super.setActionbarColor(i);
        } else {
            getController().mo177081j0(i);
        }
    }

    public void setBackBtn(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        if (!isVASValid()) {
            super.setBackBtn(onMenuItemClickListener);
        } else {
            getController().mo177085m0(onMenuItemClickListener, 0);
        }
    }

    public final void setBackStackCount(int i) {
        this.backStackCount = i;
    }

    public void setContentView(View view) {
        if (!isVASValid()) {
            super.setContentView(view);
        } else if (view != null) {
            FrameLayout frameLayout = get_fragment().f348639I;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            FrameLayout frameLayout2 = get_fragment().f348639I;
            if (frameLayout2 != null) {
                frameLayout2.addView(view);
            }
        }
    }

    public final void setHasCalledOnStart(boolean z) {
        this.hasCalledOnStart = z;
    }

    public final void setHasCalledOnVASResume(boolean z) {
        this.hasCalledOnVASResume = z;
    }

    public final void setIgnoreOnResumeCalledFirst(boolean z) {
        this.isIgnoreOnResumeCalledFirst = z;
    }

    public final void setInitFinished(boolean z) {
        this.isInitFinished = z;
    }

    public final void setInnerContext(Context context) {
        C87412m.m108594g(context, "<set-?>");
        this.innerContext = context;
    }

    public void setMMTitle(int i) {
        if (!isVASValid()) {
            super.setMMTitle(i);
            return;
        }
        MMActivityController mMActivityController = get_fragment().f348638H;
        mMActivityController.mo177100v0(mMActivityController.f348120t.getString(i));
    }

    public void setNavigationbarColor(int i) {
        if (!isVASValid()) {
            super.setNavigationbarColor(i);
        } else if (!getDisableCommonAreaControl()) {
            getController().mo177103x0(i);
        }
    }

    public final void setPageAnim(C113202f fVar, C113202f fVar2, C113202f fVar3, C113202f fVar4) {
        C87412m.m108594g(fVar, "enterAnim");
        C87412m.m108594g(fVar2, "exitAnim");
        C87412m.m108594g(fVar3, "popEnterAnim");
        C87412m.m108594g(fVar4, "popExitAnim");
        C116164b bVar = this.tempPageAnim;
        bVar.f348618a = fVar;
        bVar.f348619b = fVar2;
        bVar.f348620c = fVar3;
        bVar.f348621d = fVar4;
    }

    public void setRequestedOrientation(int i) {
        if (!isVASValid()) {
            super.setRequestedOrientation(i);
        } else {
            get_activity().setRequestedOrientation(i);
        }
    }

    public final void setTempPageAnim(C116164b bVar) {
        C87412m.m108594g(bVar, "<set-?>");
        this.tempPageAnim = bVar;
    }

    public void setTheme(int i) {
        if (!isVASValid()) {
            super.setTheme(i);
        } else {
            get_activity().setTheme(i);
        }
    }

    public final void setVasFinishInterceptor(C32224a<Boolean> aVar) {
        this.vasFinishInterceptor = aVar;
    }

    public final void set_TAG(String str) {
        C87412m.m108594g(str, "<set-?>");
        this._TAG = str;
    }

    public final void set_activity(Activity activity) {
        C87412m.m108594g(activity, "<set-?>");
        this._activity = activity;
    }

    public final void set_childFragmentManager(FragmentManager fragmentManager) {
        this._childFragmentManager = fragmentManager;
    }

    public final void set_fragment(VASCommonFragment vASCommonFragment) {
        C87412m.m108594g(vASCommonFragment, "<set-?>");
        this._fragment = vASCommonFragment;
    }

    public final void set_isFinishing(boolean z) {
        this._isFinishing = z;
    }

    public final void set_parentFragmentManager(FragmentManager fragmentManager) {
        this._parentFragmentManager = fragmentManager;
    }

    public void showVKB() {
        if (!isVASValid()) {
            super.showVKB();
            return;
        }
        MMActivityController controller = getController();
        if (controller != null) {
            MMActivityController.m163187F0(controller.f348119s);
        }
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        String str;
        ComponentName component;
        if (!isVASValid()) {
            super.startActivityForResult(intent, i, bundle);
            return;
        }
        if (intent != null) {
            C111559c.f333976a.mo163252e(intent);
        }
        boolean z = true;
        if (intent == null || !C111562e.m152092b(intent, 1)) {
            z = false;
        }
        if (z) {
            if (intent == null || (component = intent.getComponent()) == null || (str = component.getClassName()) == null) {
                str = "";
            }
            C118694m.m167388f(this, Class.forName(str), intent, bundle, i);
        } else {
            try {
                get_fragment().startActivityForResult(intent, i, bundle);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.VAS.VasNavigator", th, "fragment startActivityForResult err", new Object[0]);
            }
        }
        C113067b.f338452d.r50(this, intent);
    }

    public void supportInvalidateOptionsMenu() {
        if (!isVASValid()) {
            super.supportInvalidateOptionsMenu();
        } else {
            getController().mo177047G0();
        }
    }

    public boolean supportRequestWindowFeature(int i) {
        if (!isVASValid()) {
            return super.supportRequestWindowFeature(i);
        }
        return true;
    }

    public void hideVKB(View view) {
        if (!isVASValid()) {
            super.hideVKB(view);
        } else {
            getController().mo177046G(view);
        }
    }

    public void setMMTitle(CharSequence charSequence) {
        if (!isVASValid()) {
            super.setMMTitle(charSequence);
        } else {
            get_fragment().f348638H.mo177098u0(charSequence);
        }
    }

    public void setMMTitle(String str) {
        if (!isVASValid()) {
            super.setMMTitle(str);
        } else {
            get_fragment().f348638H.mo177098u0(str);
        }
    }
}
