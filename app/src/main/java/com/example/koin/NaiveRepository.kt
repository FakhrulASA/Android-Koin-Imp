package com.example.koin

class NaiveRepository:DomainRepository {
    override fun createDomain(): String = "NAIVEDOMAIN"
}