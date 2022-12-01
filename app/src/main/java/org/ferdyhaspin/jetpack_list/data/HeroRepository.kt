package org.ferdyhaspin.jetpack_list.data

import org.ferdyhaspin.jetpack_list.model.Hero
import org.ferdyhaspin.jetpack_list.model.HeroesData

/**
 * Created by ferdyhaspin on 01/12/22.
 */

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }

    fun searchHeroes(query: String): List<Hero>{
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }
}