package com.nullgr.dynamicadapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * author a.komarovskyi
 */
open class BaseViewHolder(parent: ViewGroup, layoutId: Int)
    : RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(layoutId, parent, false))