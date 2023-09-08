package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86737h0;
import java.util.HashMap;
import pj3.C47511g;
import qo3.C101218e0;

@C86737h0
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgFlavorBlue */
public class SettingsAboutMicroMsgFlavorBlue extends MMPreference {

    /* renamed from: d */
    public C47511g f20793d;

    /* renamed from: e */
    public String[] f20794e = {"7.0.21", "7.0.20", "7.0.19", "7.0.18"};

    /* renamed from: f */
    public String[] f20795f = {"小程序\n   1.connectWifi Android 10适配\n   2.视频相关bug修改\n   3.音视频编辑组件网络流添加断点续传功能，能对网络资源进行缓存;网络流添加seek支持;硬编码改成兼容性更好的VBR（动态码率）模式，编解码速度更快\n   4.websocket细分返回的错误信息\n小游戏\n   1.connectWifi Android 10适配\n   2.视频相关bug修改\n   3.音视频编辑组件网络流添加断点续传功能，能对网络资源进行缓存;网络流添加seek支持;硬编码改成兼容性更好的VBR（动态码率）模式，编解码速度更快\n   4.websocket细分返回的错误信息\n   5.小游戏性能优化方案渲染层更新\n", "小程序\n   1.优化小程序进程分配策略\n   2.优化小程序js注入耗时\n   3.修复全屏相关bug\n小游戏\n   1.启动阶段功能模块懒加载，进程加载优化，优化启动速度\n   2.性能面板增加js注入耗时、首屏渲染耗时\n   3.优化从朋友圈分享的卡片点开跳转速度\n", "小程序\n   1.优化识别二维码打开小程序的速度\n   2.worker 支持 CPU Profile\n   3.修复蓝牙线程安全问题\n   4.WebSocket切后台时支持主动断开连接\n   5.音频延迟以及CPU占用优化\n小游戏\n   1.worker 支持 CPU Profile\n   2.修复蓝牙线程安全问题\n   3.WebSocket切后台时支持主动断开连接\n   4.音频延迟以及CPU占用优化\n", "小程序\n   1.小程序正式版,拥有体验版权限的开发者能打开菜单中的开发调试\n   2.小程序webiew与service通信优化\n   3.小程序界面层级优化\n   4.小程序界面显示重构\n小游戏\n   1.小游戏正式版,拥有体验版权限的开发者能打开菜单中的开发调试\n   2.修复相同图片重复解码时内存泄漏问题\n"};

    /* renamed from: g */
    public HashMap<String, String> f20796g = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgFlavorBlue$a */
    public class C5257a implements MenuItem.OnMenuItemClickListener {
        public C5257a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsAboutMicroMsgFlavorBlue.this.hideVKB();
            SettingsAboutMicroMsgFlavorBlue.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo6222H7() {
        C47511g preferenceScreen = getPreferenceScreen();
        this.f20793d = preferenceScreen;
        preferenceScreen.removeAll();
        for (int i = 0; i < this.f20794e.length; i++) {
            IconPreference iconPreference = new IconPreference(this);
            this.f20793d.mo72527k(iconPreference);
            iconPreference.mo26273A(this.f20794e[i]);
            iconPreference.mo69924H(this.f20794e[i]);
        }
        this.f20793d.notifyDataSetChanged();
    }

    public int getResourceId() {
        return C0966R.xml.f8951c8;
    }

    public void initView() {
        setMMTitle(getResources().getString(C0966R.string.f4h));
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f2929c));
        setBackGroundColorResource(C0966R.color.al6);
        setBackBtn(new C5257a());
        if (getListView() != null) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3743cv);
            getListView().setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            getListView().setBackgroundColor(getContext().getResources().getColor(C0966R.color.f2929c));
        }
        mo6222H7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hideActionbarLine();
        int i = 0;
        while (true) {
            String[] strArr = this.f20794e;
            if (i < strArr.length) {
                this.f20796g.put(strArr[i], this.f20795f[i]);
                i++;
            } else {
                initView();
                return;
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        Log.m105924i("MicroMsg.SettingsAboutMicroMsgFlavorBlue", str + " item has been clicked!");
        C101218e0 e0Var = new C101218e0(getContext(), 2, 2);
        e0Var.mo140677w(getResources().getString(C0966R.string.f8028zq));
        e0Var.mo140676v(0);
        e0Var.f296375F = new C5410y0(this, e0Var);
        e0Var.mo140671q(str);
        TextView textView = new TextView(this);
        textView.setText(this.f20796g.get(str));
        e0Var.mo140663j(textView);
        e0Var.mo140655A();
        return true;
    }

    public void onResume() {
        super.onResume();
        mo6222H7();
    }
}
