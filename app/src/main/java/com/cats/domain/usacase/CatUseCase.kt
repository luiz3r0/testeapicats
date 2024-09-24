package com.cats.domain.usacase

import com.cats.data.source.local.db.entities.CatEntity
import com.cats.domain.repository.CatRepositoryInterface
import kotlinx.coroutines.flow.Flow

class CatUseCase(private val catRepositoryInterface: CatRepositoryInterface) : CatUseCaseInterface {

    override fun getCats(): Flow<List<CatEntity>>? {
        return catRepositoryInterface.getCats()
    }

    override suspend fun downloadCatsFromApi() {
        return catRepositoryInterface.downloadCatsFromApi()
    }
}