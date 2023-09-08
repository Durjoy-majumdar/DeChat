package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.UpdateWxaOptionsEvent;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.msgsubscription.WordingInfo;
import com.tencent.p014mm.msgsubscription.presenter.SubscribeMsgSettingData;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C76912y0;
import sx3.C110818d0;
import sx3.C64197v;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$$q */
public class AppBrandAuthorizeUI$$q extends Handler {

    /* renamed from: a */
    public WeakReference<AppBrandAuthorizeUI> f49811a;

    public AppBrandAuthorizeUI$$q(AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f49811a = new WeakReference<>(appBrandAuthorizeUI);
    }

    public void handleMessage(Message message) {
        AppBrandAuthorizeUI appBrandAuthorizeUI;
        String str;
        int i;
        T t;
        Object obj;
        super.handleMessage(message);
        int i2 = message.what;
        if (i2 != 1) {
            int i3 = 2;
            if (i2 == 2 && (appBrandAuthorizeUI = this.f49811a.get()) != null) {
                SubscribeMsgRequestResult subscribeMsgRequestResult = (SubscribeMsgRequestResult) message.obj;
                AppBrandAuthorizeUI.m18563J7(appBrandAuthorizeUI);
                if (subscribeMsgRequestResult == null) {
                    C76912y0.makeText((Context) appBrandAuthorizeUI, (CharSequence) appBrandAuthorizeUI.getString(C0966R.string.f360087a11), 1).show();
                    return;
                }
                SubscribeMsgSettingData subscribeMsgSettingData = appBrandAuthorizeUI.f49745M;
                subscribeMsgSettingData.getClass();
                subscribeMsgSettingData.f49050d = subscribeMsgRequestResult.f49009p;
                subscribeMsgSettingData.f49051e = subscribeMsgRequestResult.f49008o;
                WordingInfo wordingInfo = subscribeMsgRequestResult.f49007n;
                String str2 = "";
                if (wordingInfo == null || (str = wordingInfo.f49041h) == null) {
                    str = str2;
                }
                subscribeMsgSettingData.f49053g = str;
                ArrayList<SubscribeMsgTmpItem> arrayList = subscribeMsgRequestResult.f49004h;
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    Parcel obtain = Parcel.obtain();
                    C87412m.m108593f(obtain, "obtain()");
                    ((SubscribeMsgTmpItem) it.next()).writeToParcel(obtain, 0);
                    obtain.setDataPosition(0);
                    arrayList2.add(new SubscribeMsgTmpItem(obtain));
                    obtain.recycle();
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(subscribeMsgSettingData.f49052f);
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    int i4 = i + 1;
                    if (i >= 0) {
                        SubscribeMsgTmpItem subscribeMsgTmpItem = (SubscribeMsgTmpItem) next;
                        Iterator it5 = arrayList3.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it5.next();
                            if (TextUtils.equals(((SubscribeMsgTmpItem) obj).f49021f, subscribeMsgTmpItem.f49021f)) {
                                break;
                            }
                        }
                        SubscribeMsgTmpItem subscribeMsgTmpItem2 = (SubscribeMsgTmpItem) obj;
                        if (subscribeMsgTmpItem2 != null) {
                            arrayList3.set(arrayList3.indexOf(subscribeMsgTmpItem2), subscribeMsgTmpItem);
                        }
                        i = i4;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                subscribeMsgSettingData.f49052f = arrayList3;
                for (SubscribeMsgTmpItem subscribeMsgTmpItem3 : subscribeMsgRequestResult.f49004h) {
                    Iterator<T> it6 = subscribeMsgSettingData.f49054h.f49004h.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it6.next();
                        if (TextUtils.equals(subscribeMsgTmpItem3.f49021f, ((SubscribeMsgTmpItem) t).f49021f)) {
                            break;
                        }
                    }
                    ArrayList<SubscribeMsgTmpItem> arrayList4 = subscribeMsgSettingData.f49054h.f49004h;
                    arrayList4.set(C110818d0.m150918P(arrayList4, (SubscribeMsgTmpItem) t), subscribeMsgTmpItem3);
                }
                if (appBrandAuthorizeUI.f49745M.f49050d) {
                    Preference a = appBrandAuthorizeUI.f49761j.mo72519a("preference_key_subscribe_msg");
                    if (a != null) {
                        if (!appBrandAuthorizeUI.f49745M.f49051e) {
                            str2 = appBrandAuthorizeUI.getContext().getString(C0966R.string.a96);
                        }
                        a.mo7741E(str2);
                        appBrandAuthorizeUI.f49761j.notifyDataSetChanged();
                    }
                } else {
                    appBrandAuthorizeUI.f49761j.mo72531o("preference_key_subscribe_msg");
                    appBrandAuthorizeUI.f49761j.notifyDataSetChanged();
                }
                AppBrandAuthorizeUI.m18569P7(appBrandAuthorizeUI.f49757f, appBrandAuthorizeUI.f49755d);
                AppBrandAuthorizeUI.m18568O7(appBrandAuthorizeUI.f49757f, appBrandAuthorizeUI.f49755d);
                UpdateWxaOptionsEvent updateWxaOptionsEvent = new UpdateWxaOptionsEvent();
                UpdateWxaOptionsEvent.C67810a aVar = updateWxaOptionsEvent.f193994d;
                aVar.f193996a = appBrandAuthorizeUI.f49759h;
                if (!appBrandAuthorizeUI.f49745M.f49051e) {
                    i3 = 1;
                }
                aVar.f193997b = i3;
                aVar.f193998c = 1;
                updateWxaOptionsEvent.publish();
                return;
            }
            return;
        }
        AppBrandAuthorizeUI appBrandAuthorizeUI2 = this.f49811a.get();
        if (appBrandAuthorizeUI2 != null) {
            SubscribeMsgSettingData subscribeMsgSettingData2 = (SubscribeMsgSettingData) message.obj;
            appBrandAuthorizeUI2.f49744L = true;
            if (subscribeMsgSettingData2 == null) {
                AppBrandAuthorizeUI.m18561H7(appBrandAuthorizeUI2, appBrandAuthorizeUI2.f49755d, (SubscribeMsgSettingData) null, appBrandAuthorizeUI2.f49756e);
                return;
            }
            appBrandAuthorizeUI2.f49745M = subscribeMsgSettingData2;
            AppBrandAuthorizeUI.m18561H7(appBrandAuthorizeUI2, appBrandAuthorizeUI2.f49755d, subscribeMsgSettingData2, appBrandAuthorizeUI2.f49756e);
        }
    }
}
