package com.tencent.wework.api.model;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.wework.api.model.WWMediaMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WWMediaMergedConvs extends WWMediaMessage.WWMediaObject {

    /* renamed from: f */
    public List<WWMediaConversation> f285816f = new ArrayList();

    /* renamed from: g */
    public int f285817g = 0;

    /* renamed from: a */
    public void mo136615a(Intent intent, String str) {
        Iterator it = ((ArrayList) this.f285816f).iterator();
        while (it.hasNext()) {
            ((BaseMessage) it.next()).mo136615a(intent, str);
        }
    }

    /* renamed from: b */
    public boolean mo136616b() {
        List<WWMediaConversation> list;
        if (!super.mo136616b() || (list = this.f285816f) == null || ((ArrayList) list).size() == 0) {
            return false;
        }
        Iterator it = ((ArrayList) this.f285816f).iterator();
        while (it.hasNext()) {
            if (!((BaseMessage) it.next()).mo136616b()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public void mo136617d(Context context) {
        this.f285800a = context;
        Iterator it = ((ArrayList) this.f285816f).iterator();
        while (it.hasNext()) {
            ((BaseMessage) it.next()).mo136617d(context);
        }
    }

    /* renamed from: e */
    public void mo136618e(String str) {
        this.f285801b = str;
        Iterator it = ((ArrayList) this.f285816f).iterator();
        while (it.hasNext()) {
            ((BaseMessage) it.next()).mo136618e(str);
        }
    }

    /* renamed from: f */
    public void mo136619f(Bundle bundle) {
        bundle.putInt("_wwmergedconvobject_messageslen", ((ArrayList) this.f285816f).size());
        for (int i = 0; i < ((ArrayList) this.f285816f).size(); i++) {
            bundle.putBundle("_wwmergedconvobject_messages" + i, BaseMessage.m125331c((BaseMessage) ((ArrayList) this.f285816f).get(i)));
        }
        bundle.putInt("_wwmergedconvobject_forwardtype", this.f285817g);
        super.mo136619f(bundle);
    }

    /* renamed from: g */
    public boolean mo136620g(WWMediaConversation wWMediaConversation) {
        if (wWMediaConversation == null || !wWMediaConversation.mo136616b()) {
            return false;
        }
        ((ArrayList) this.f285816f).add(wWMediaConversation);
        return true;
    }
}
