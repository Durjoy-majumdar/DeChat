package com.tencent.p014mm.plugin.record.p094ui;

import android.content.Context;
import android.widget.BaseAdapter;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.TranslateMessageEvent;
import com.tencent.p014mm.autogen.events.TranslateMessageResultEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;
import pe3.C89349b;
import qg2.C62617u0;
import qg2.C62618v0;

/* renamed from: com.tencent.mm.plugin.record.ui.TranslateHelper */
public class TranslateHelper {

    /* renamed from: a */
    public Context f272690a;

    /* renamed from: b */
    public BaseAdapter f272691b;

    /* renamed from: c */
    public C94346a f272692c;

    /* renamed from: d */
    public boolean f272693d;

    /* renamed from: e */
    public IListener f272694e = new IListener<TranslateMessageResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1739498572;
        }

        public boolean callback(IEvent iEvent) {
            TranslateMessageResultEvent translateMessageResultEvent = (TranslateMessageResultEvent) iEvent;
            if (translateMessageResultEvent instanceof TranslateMessageResultEvent) {
                TranslateMessageResultEvent.C92608a aVar = translateMessageResultEvent.f265243d;
                String str = aVar.f265247d;
                int i = aVar.f265244a;
                new MMHandler().postDelayed(new C94370o(this, str, i, translateMessageResultEvent), (long) (i == 5 ? 2000 : 0));
            }
            return false;
        }
    };

    /* renamed from: f */
    public Pattern f272695f = Pattern.compile("[a-zA-z]");

    /* renamed from: g */
    public Pattern f272696g = Pattern.compile("[一-龥]");

    public TranslateHelper(Context context, BaseAdapter baseAdapter, C94346a aVar) {
        this.f272690a = context;
        this.f272691b = baseAdapter;
        this.f272692c = aVar;
        this.f272694e.alive();
    }

    /* renamed from: a */
    public C62617u0 mo129732a(int i) {
        Iterator<C62617u0> it = this.f272692c.f272699b.f177828d.iterator();
        while (it.hasNext()) {
            C62617u0 next = it.next();
            if (i == next.f177822d) {
                return next;
            }
        }
        C62617u0 u0Var = new C62617u0();
        u0Var.f177822d = i;
        u0Var.f177823e = 0;
        this.f272692c.f272699b.f177828d.add(u0Var);
        return u0Var;
    }

    /* renamed from: b */
    public byte[] mo129733b() {
        C62618v0 v0Var;
        LinkedList<C62617u0> linkedList;
        this.f272694e.dead();
        C62618v0 v0Var2 = new C62618v0();
        C94346a aVar = this.f272692c;
        if (!(aVar == null || (v0Var = aVar.f272699b) == null || (linkedList = v0Var.f177828d) == null)) {
            Iterator<C62617u0> it = linkedList.iterator();
            while (it.hasNext()) {
                C62617u0 next = it.next();
                if (!Util.isNullOrNil(next.f177824f)) {
                    v0Var2.f177828d.add(next);
                }
            }
        }
        this.f272691b = null;
        this.f272692c = null;
        this.f272690a = null;
        try {
            return v0Var2.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public void mo129734c(int i, boolean z) {
        C62617u0 a = mo129732a(i);
        if (!Util.isNullOrNil(a.f177824f) && !z) {
            a.f177823e = 2;
            this.f272691b.notifyDataSetChanged();
        } else if (i < this.f272692c.f272698a.size()) {
            TranslateMessageEvent translateMessageEvent = new TranslateMessageEvent();
            TranslateMessageEvent.C67800a aVar = translateMessageEvent.f193961d;
            aVar.getClass();
            aVar.f193963b = "" + i;
            translateMessageEvent.f193961d.f193962a = this.f272692c.f272698a.get(i).f299301f;
            TranslateMessageEvent.C67800a aVar2 = translateMessageEvent.f193961d;
            C89349b bVar = a.f177826h;
            aVar2.f193966e = bVar != null ? bVar.f257327a : null;
            aVar2.f193964c = 4;
            translateMessageEvent.publish();
            a.f177823e = 1;
            this.f272691b.notifyDataSetChanged();
            this.f272693d = true;
        }
    }
}
