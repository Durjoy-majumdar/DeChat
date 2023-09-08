package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bx1.C39855j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GamePBCacheEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomRecInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Color;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ContentBlock;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetCanJoinChatroomRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Lbs;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MyChatroomNotice;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C107029o;
import de3.C75355a0;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jx1.C46577a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p192l4.C10462b;
import ux1.C52637d;
import vy1.C53041a;
import yw1.C53601h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/ui/chat_tab/GameRoomStaggeredListFragment;", "Lcom/tencent/mm/plugin/game/ui/chat_tab/AbsGameRoomFragment;", "Lob0/n;", "plugin-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameRoomStaggeredListFragment */
public final class GameRoomStaggeredListFragment extends AbsGameRoomFragment implements C11385n {

    /* renamed from: d */
    public C52637d f114259d;

    /* renamed from: e */
    public boolean f114260e;

    /* renamed from: K */
    public final void mo66308K(GetCanJoinChatroomResponse getCanJoinChatroomResponse, Lbs lbs) {
        Throwable th;
        GradientDrawable gradientDrawable;
        GetCanJoinChatroomResponse getCanJoinChatroomResponse2 = getCanJoinChatroomResponse;
        if (getCanJoinChatroomResponse2 != null) {
            Log.m105924i("StaggeredChatroom", "onSceneEnd rec Chatroom size  " + getCanJoinChatroomResponse2.chatroom_info_list.size());
            LinkedList<ChatroomRecInfo> linkedList = getCanJoinChatroomResponse2.chatroom_info_list;
            int i = 0;
            if (!(linkedList == null || linkedList.isEmpty())) {
                if (!this.f114260e) {
                    View inflate = LayoutInflater.from(requireContext()).inflate(C0966R.C0971layout.f6803oz, (ViewGroup) null, false);
                    MyChatroomNotice myChatroomNotice = C46577a.f125477h;
                    if (myChatroomNotice != null) {
                        C87412m.m108593f(inflate, "titleView");
                        if (!Util.isNullOrNil((List) myChatroomNotice.content_list) && myChatroomNotice.bg_color != null) {
                            View findViewById = inflate.findViewById(C0966R.C0970id.hub);
                            MMNeat7extView mMNeat7extView = (MMNeat7extView) inflate.findViewById(C0966R.C0970id.hui);
                            mMNeat7extView.setOnTouchListener(new C107029o(mMNeat7extView, new C75355a0(mMNeat7extView.getContext())));
                            View findViewById2 = inflate.findViewById(C0966R.C0970id.hu7);
                            float p = C76577a.m92165p(requireContext());
                            findViewById2.getLayoutParams().height = (int) (((float) findViewById2.getLayoutParams().height) * p);
                            findViewById2.getLayoutParams().width = (int) (((float) findViewById2.getLayoutParams().width) * p);
                            findViewById2.requestLayout();
                            findViewById2.setOnClickListener(new C4570i(findViewById));
                            Integer m = C53601h.m60134m(C85875k4.m106211z() ? myChatroomNotice.bg_color.dark_color : myChatroomNotice.bg_color.light_color);
                            if (!(m == null || (gradientDrawable = (GradientDrawable) findViewById.getBackground()) == null)) {
                                gradientDrawable.setColor(m.intValue());
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(0);
                                View view = findViewById;
                                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/GameRoomStaggeredListFragment", "handleGamePermission", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/MyChatroomNotice;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/game/ui/chat_tab/GameRoomStaggeredListFragment", "handleGamePermission", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/MyChatroomNotice;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                Iterator<ContentBlock> it = myChatroomNotice.content_list.iterator();
                                while (it.hasNext()) {
                                    ContentBlock next = it.next();
                                    if (!Util.isNullOrNil(next.content)) {
                                        Color color = next.color;
                                        Integer m2 = C53601h.m60134m(Util.nullAsNil(color == null ? null : C85875k4.m106211z() ? color.dark_color : color.light_color));
                                        if (m2 != null) {
                                            spannableStringBuilder.append(next.content);
                                            if (next.jump_info == null) {
                                                spannableStringBuilder.setSpan(new ForegroundColorSpan(m2.intValue()), i, next.content.length() + i, 33);
                                            } else {
                                                spannableStringBuilder.setSpan(new C42297j(this, next, findViewById), i, next.content.length() + i, 33);
                                            }
                                            i = spannableStringBuilder.length();
                                        }
                                    }
                                }
                                mMNeat7extView.mo104279b(spannableStringBuilder);
                            }
                        }
                    }
                    ((TextView) inflate.findViewById(C0966R.C0970id.ivo)).setText(getString(C0966R.string.fbg));
                    LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.mfi);
                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    if (layoutParams instanceof LinearLayout.LayoutParams) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.bottomMargin = C76577a.m92151b(requireContext(), 8);
                        layoutParams2.topMargin = C76577a.m92151b(requireContext(), 10);
                        linearLayout.setLayoutParams(layoutParams);
                    }
                    C52637d dVar = this.f114259d;
                    C87412m.m108591d(dVar);
                    dVar.f146970a.addHeaderView(inflate);
                    this.f114260e = true;
                    th = null;
                } else {
                    th = null;
                }
                throw th;
            }
            throw null;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C87412m.m108594g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0966R.C0971layout.cpb, viewGroup, false);
        int i = C0966R.C0970id.med;
        ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.med);
        if (imageView != null) {
            i = C0966R.C0970id.f358517mf0;
            LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.f358517mf0);
            if (linearLayout != null) {
                FrameLayout frameLayout = (FrameLayout) inflate;
                MRecyclerView mRecyclerView = (MRecyclerView) C10462b.m10395a(inflate, C0966R.C0970id.mhd);
                if (mRecyclerView != null) {
                    this.f114259d = new C52637d(frameLayout, imageView, linearLayout, frameLayout, mRecyclerView);
                    C87412m.m108593f(frameLayout, "binding.root");
                    return frameLayout;
                }
                i = C0966R.C0970id.mhd;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public void onDestroyView() {
        super.onDestroyView();
        C86709a0.m107524d().mo123470p(4631, this);
        this.f114259d = null;
    }

    public void onResume() {
        super.onResume();
        throw null;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar != null && yVar.getType() == 4631 && i == 0 && i2 == 0) {
            C47350c cVar = ((C39855j) yVar).f106886e;
            GetCanJoinChatroomResponse getCanJoinChatroomResponse = (GetCanJoinChatroomResponse) cVar.f127056b.f127083a;
            mo66308K(getCanJoinChatroomResponse, ((GetCanJoinChatroomRequest) cVar.f127055a.f127080a).lbs_info);
            if (getCanJoinChatroomResponse != null) {
                GamePBCacheEvent gamePBCacheEvent = new GamePBCacheEvent();
                GamePBCacheEvent.C40109a aVar = gamePBCacheEvent.f107561d;
                aVar.f107562a = 2;
                aVar.f107563b = "cache_chatroom_recommend";
                try {
                    aVar.f107564c = getCanJoinChatroomResponse.toByteArray();
                } catch (IOException unused) {
                }
                gamePBCacheEvent.publish();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        C86709a0.m107524d().mo123455a(4631, this);
        C52637d dVar = this.f114259d;
        C87412m.m108591d(dVar);
        MRecyclerView mRecyclerView = dVar.f146970a;
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        mRecyclerView.mo17085h0(new C53041a(C76577a.m92151b(requireContext(), 8)));
        throw null;
    }
}
